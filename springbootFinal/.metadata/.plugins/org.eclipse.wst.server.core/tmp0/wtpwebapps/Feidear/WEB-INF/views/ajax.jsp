<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
//커넥션 객체 만들고 
Class.forName("org.postgresql.Driver");
String url = "jdbc:postgresql://postgresql-feidear.alwaysdata.net:5432/postgres";
String user = "feidear";
String password = "gungang1229";
Connection conn = DriverManager.getConnection(url, user, password);

//db에 접근해서 sql실행하고 
Statement stmt = conn.createStatement();
String sql = "select * from RESTAURANT union select * from HOTEL union select * from PLAYWITH union select * from PARKING";
// stmt.executeQuery(sql);
ResultSet rs = stmt.executeQuery(sql);

//결과값 을 받아서 json object array로 만들어서
%>
[
<%
int i = 0;
while (rs.next()) {
	int id = rs.getInt("lprod_id");
	String gu = rs.getString("lprod_gu");
	String nm = rs.getString("lprod_nm");
	//json object 생성
	if (i > 0){
		out.print(",");
	}
%>
{ "lprod_id" : "<%=id%>", "lprod_gu" : "<%=gu%>", "lprod_nm" : "<%=nm%>" }
<%
i++;
} //while end
%>
]