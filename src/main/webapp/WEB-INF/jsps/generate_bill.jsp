<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@include file="menujsp.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Biliing</title>
</head>
<body>
<h2> Billing</h2>
</body>
<form action="SaveBill" method="post">
<pre>
First Name<input type="text" name="firstName" value="${contact.firstName}"/>
Last Name<input type="text" name="lastName"value="${contact.lastName}"/>
Mobile<input type="text" name="mobile"value="${contact.mobile}"/>
Email<input type="text" name="email"value="${contact.email}"/>
Product<input type="text" name="product"/>
Quantity<input type="text" name="quantity"/>
Amount<input type="text" name="amount"/>
<input type="submit" value="Generate"/>






</pre>
</form>
</html>