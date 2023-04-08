<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
          <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
        <%@include file="menujsp.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Leads</title>
</head>
<body>
<h2>All leads</h2>
<table>
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>Mobile</th>
<th>Email</th>
<th>Source</th>
</tr>
<c:forEach var="lead" items="${lead}">
<tr>
<td><a href="leadinfo?id=${lead.id}">${lead.firstName}</a></td> 
<td>${lead.lastName}</td> 
<td>${lead.mobile}</td> 
<td>${lead.email}</td> 
<td>${lead.source}</td> 
</tr>
</c:forEach>
</table>
</body>
</html>