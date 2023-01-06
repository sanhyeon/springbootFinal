package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@RestController
public class SmartPageController {


	@GetMapping("/smartPage")
	public String smartPage(Integer idx) {
		System.out.println(">>>>>>>>>>>>> idx : "+idx);
		//실시간 날씨 API 받아오기 (Python(server) - java(client) socket 통신)
		// 소켓을 선언한다.
		try (Socket client = new Socket()) {
			// 소켓에 접속하기 위한 접속 정보를 선언한다.
			InetSocketAddress ipep = new InetSocketAddress("127.0.0.1", 9999);
			// 소켓 접속!
			client.connect(ipep);
			
			// 소켓이 접속이 완료되면 inputstream과 outputstream을 받는다.
			try (OutputStream sender = client.getOutputStream(); InputStream receiver = client.getInputStream();) {
				
				String msg = Integer.toString(idx); 
				// string을 byte배열 형식으로 변환한다.
				byte[] data = msg.getBytes();
				// ByteBuffer를 통해 데이터 길이를 byte형식으로 변환한다.
				ByteBuffer b = ByteBuffer.allocate(4);
				// byte포멧은 little 엔디언이다.
				b.order(ByteOrder.LITTLE_ENDIAN);
				b.putInt(data.length);
				// 데이터 길이 전송
				sender.write(b.array(), 0, 4);
				// 데이터 전송
				sender.write(data);
				
				/* 여기서 오류 !!!!!!!!!!!!!!!!! */
				data = new byte[100000];
				// 데이터 길이를 받는다.
				receiver.read(data, 0, 100000);
				// ByteBuffer를 통해 little 엔디언 형식으로 데이터 길이를 구한다.
				ByteBuffer b2 = ByteBuffer.wrap(data);
				b2.order(ByteOrder.LITTLE_ENDIAN);
				int length = b2.getInt();
				
				// 데이터를 받을 버퍼를 선언한다.
				data = new byte[length];
				
				// 데이터를 받는다.
				receiver.read(data, 0, length);

				// byte형식의 데이터를 string형식으로 변환한다.
				msg = new String(data, "UTF-8");
				// 콘솔에 출력한다.
				System.out.println(msg);
				return msg;
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;

		
	}
}
