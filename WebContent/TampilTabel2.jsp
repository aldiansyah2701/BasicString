<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Home Page</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<style>
table,th,td
{
border:1px solid black;
}
</style>
</head>
<body>
<%-- Using JSTL forEach and out to loop a list and display items in table --%>
<table>
<tbody>
<tr><th>No</th><th>Input</th><th>Output</th><th>Tanggal</th><th>Parameter</th></tr>
<c:forEach items="${requestScope.empList}" var="emp">
<tr><td><c:out value="${emp.no}"></c:out></td>
<td><c:out value="${emp.input}"></c:out></td>
<td><c:out value="${emp.output}"></c:out></td>
<td><c:out value="${emp.tanggal}"></c:out></td>
<td><c:out value="${emp.parameter}"></c:out></td></tr>
</c:forEach>
</tbody>
</table>
<br><br>
</body>
</html>