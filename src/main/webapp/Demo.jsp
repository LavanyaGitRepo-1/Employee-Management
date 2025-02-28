<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String id=request.getParameter("id"); %>
<% String name=request.getParameter("name"); %>
<% String age=request.getParameter("age"); %>
<% String email=request.getParameter("email"); %>
<% String salary=request.getParameter("salary"); %>

<h1>Employee id:<%=id %></h1>
<h1>Employee name:<%=name %></h1>
<h1>Employee age:<%=age %></h1>
<h1>Employee email:<%=email%></h1>
<h1>Employee salary:<%=salary%></h1>




</body>
</html>