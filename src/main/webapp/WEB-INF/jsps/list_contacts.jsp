<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
          <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@include file="menujsp.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List contacts</title>
</head>
<body>
<h2>All leads contacts</h2>
<table>
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>Mobile</th>
<th>Email</th>
<th>Source</th>
<th>Billing</th>

</tr>
<c:forEach var="contact" items="${contacts}">
<tr>
<td><a href="leadinfo?id=${contact.id}">${contact.firstName}</a></td> 

<td>${contact.lastName}</td> 
<td>${contact.mobile}</td> 
<td>${contact.email}</td> 
<td>${contact.source}</td> 
<td><a href="creatBill?id=${contact.id}">Billing</a></td> 

</tr>
</c:forEach>
</table>
</body>
</html>