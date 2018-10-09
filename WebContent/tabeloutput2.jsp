<%@page import="java.sql.Connection" %>
<%@page import="paragraf.Output" %>
<%@page import="paragraf.tabel2" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.SQLException" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="2">
	 
	   <tr>
	        <th>NO</th>
	        <th>INPUT</th>
	        <th>OUTPUT</th>
	        <th>TANGGAL PROSES</th>
	   </tr>	   
       <tbody>
		
		<% tabel2 tes = new tabel2();%>
		 
		<p hidden><%=tes.setData(1)%></p>
		 
		
		
		<% 
		int x=1;
		while(x!=tes.count()){ %>
		<tr>
		<td><%=tes.databas1(x) %></td><%x++; %>
		<td><%=tes.databas1(x) %></td><%x++; %>
		<td><%=tes.databas1(x) %></td><%x++; %>
		<td><%=tes.databas1(x) %></td><%x++; %>
		</tr>
		<% 
		
		}%>
		
		</tbody>
	 </table>
 



 
</body>
</html>