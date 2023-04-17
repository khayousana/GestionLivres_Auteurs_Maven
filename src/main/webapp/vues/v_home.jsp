<%@page import="domains.Role"%>
<%@page import="domains.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Visiteur Home</title>
<style>
body {
	background: linear-gradient(45deg, #C7C5F4, #776BCC);
  height: 100vh;
  font-family: 'Montserrat', sans-serif;
}
h3 {
	margin-top: 50px;
	text-align: center;
}
a {
	display: block;
	margin: 20px auto;
	text-align: center;
	width: 200px;
	padding: 10px;
	border: 2px solid #776BCC;
	border-radius: 5px;
	color: #fff;
	text-decoration: none;
	font-weight: bold;
	transition: all 0.3s ease;
}
a:hover {
	background-color: #776BCC;
	color: #C7C5F4;
}
</style>
</head>
<body>
	<%
	User u = (User) session.getAttribute("u");
	if (u != null && u.getRole().equals(Role.VISITEUR)) {
	%>
	<h3>
		Welcome,
		<%=u.getLogin().split("@")[0]%></h3>
	<a href="visiteur">Voir la liste des livres diponibles</a>
	<a href="logout">Log out</a>
	<%
	} else {
	response.sendRedirect(request.getContextPath() + "/Atelier_JPA/login.jsp");
	}
	%>
</body>
</html>