<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/todo/insertform.jsp</title>
</head>
<body>
<div class="container">
	<h1>할 일 추가 폼</h1>
	<form action="insert.do" method="post">
		<input type="text" name="content" placeholder="내용 입력..." />
		<button type="submit">추가</button>
	</form>
</div>
</body>
</html>