<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead info</title>
</head>
<body>
<h2>Lead Information</h2>
First Name:${lead.firstName }<br/>
Last Name:${lead.lastName }<br/>
Mobile:${lead.mobile }<br/>
Email:${lead.email }<br/>
source:${lead.source }<br/>
<form action="ComposeEmail" method="post">
<input type="hidden" name="email" value="${lead.email}"/>
<input type="submit" value="Email"/>
</form>

<form action="convertLead" method="post">
<input type="hidden" name="id" value="${lead.id}"/>
<input type="submit" value="Convert"/>
</form>


</body>
</html>