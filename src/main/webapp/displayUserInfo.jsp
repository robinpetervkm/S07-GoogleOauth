<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display User Info</title>

</head>
<body>
<img alt="User Info" src="<%=request.getAttribute("pic")%>">
Email : <%=request.getAttribute("email")%>


</body>
</html>