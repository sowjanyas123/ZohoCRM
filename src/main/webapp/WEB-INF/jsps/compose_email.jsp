<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@include file="menujsp.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compose</title>
</head>
<body>
<h2>compose Email</h2>
${msg}
<form action="SendEmail" method="post">
<pre>
To<input type="text" name="to" value="${email}"/>
Subject<input type="text" name="sub"/>
<textarea name="msg" rows="10" cols="50"></textarea>

<input type="submit" value="send"/>
</pre>


</form>

</body>
</html>