<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<c:if test="${member eq null}">
		<a href="bankMembers/login">로그인</a>
		<a href="bankMembers/join">회원가입</a>
	</c:if>
	
	<c:if test="${member ne null}">
		<h3>${member.name}님 환영합니다</h3>
		<a href="bankMembers/logout">로그아웃</a>	
	</c:if>
	<a href="bankMembers/search">찾기</a>
	<a href="bankbook/list">리스트</a>
</body>
</html>
