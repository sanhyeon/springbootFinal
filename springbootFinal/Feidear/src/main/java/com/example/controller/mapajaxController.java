//package com.example.controller;
//  
//import java.beans.Statement; 
//import java.sql.Connection; 
//import java.sql.DriverManager; 
//import java.sql.ResultSet;
//  
//import org.springframework.stereotype.Controller;
//  
// * @Controller
//  
//  public class mapajaxController {
//  
//  //커넥션 객체 만들고 Class.forName("org.postgresql.Driver"); 
//String url = "jdbc:postgresql://postgresql-feidear.alwaysdata.net:5432/postgres"; 
//String user = "feidear"; String password = "gungang1229"; 
//Connection conn = DriverManager.getConnection(url, user, password);
//  
//  //db에 접근해서 sql실행하고 java.sql.Statement stmt = conn.createStatement(); String
//  sql = "select * from RESTAURANT union select * from HOTEL union select * from PLAYWITH union select * from PARKING"
//  ; // stmt.executeQuery(sql); ResultSet rs = stmt.executeQuery(sql);
//  
//  //결과값 을 받아서 json object array로 만들어서
//  
//  
// 
//  int i = 0; while (rs.next()) { int id = rs.getInt("lprod_id"); String gu =
//  rs.getString("lprod_gu"); String nm = rs.getString("lprod_nm"); //json object
//  생성 if (i > 0){ System.out.print(","); }
//  
//  { "lprod_id" : "<%=id%>", "lprod_gu" : "<%=gu%>", "lprod_nm" : "<%=nm%>" }
//  
//  i++; } //while end }
//  
// }
 