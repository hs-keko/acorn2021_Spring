<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/todo/updateform.jsp</title>
</head>
<body>
<div class="container">
	<h1>회원 정보 수정 폼</h1>
	<form action="update.do" method="post">
		<input type="hidden" name="num" value="${dto.num }" />
		<br />
		<input type="hidden" name="regdate" value="${dto.regdate }" />
		<br />
		<label for="content">내용</label>
		<input type="text" name="content" id="content" value="${dto.content }" />
		<br />
		<button type="submit">수정확인</button>
		<button type="reset">취소</button>
	</form>
</div>
</body>
</html>