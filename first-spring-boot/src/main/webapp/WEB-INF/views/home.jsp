<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <h1>Spring boot web app is running</h1>
        <h3>Programmers</h3>
       <ul>
        <c:forEach items="${people}" var="x">
           <li> ${x} </li>
        </c:forEach> 
       </ul>
</body>
</html>