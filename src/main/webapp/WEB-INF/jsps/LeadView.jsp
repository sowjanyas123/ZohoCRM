<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@include file="menujsp.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead</title>
</head>
<body>
<h2> Lead | Create</h2>
</body>
<form action="SaveLead" method="post">
<pre>
First Name<input type="text" name="firstName"/>
Last Name<input type="text" name="lastName"/>
Mobile<input type="text" name="mobile"/>
Email<input type="text" name="email"/>
source:
<select name="source">
  <option value="online">Online</option>
  <option value="newspaper">NewsPaper</option>
  <option value="webinar">Webinar</option>
  <option value="radio">Radio</option>
</select>
<input type="submit" value="save"/>






</pre>
</form>
</html>