<%@page import="com.iu.start.bankBook.BankBookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Detail Page</h1>

	<table border="1">
		<tr>
			<th>Num</th>
			<th>Name</th>
			<th>Rate</th>
			<th>Sale</th>
		</tr>
		<tr>
			<td>${requestScope.dto.getBookNum()}</td>
			<td>${requestScope.dto.bookName}</td>
			<td>${dto.bookRate}</td>
			<td>${dto.bookSale}</td>
			<td></td>
		</tr>
	</table>


	<!-- 상대경로 -->
	<a href="../bankmembers/login">Login</a>
	<!-- 절대경로 -->
	<a href="/bankmembers/join">Join</a>

	<a href="./list">리스트보기</a>

	<a href="./update?bookNum=${dto.bookNum}">업데이트</a>

	<a href="./delete?bookNum=${dto.bookNum}">삭제</a>

	<c:if test="${not empty sessionScope.bankmembers}">
		<a href="../bankAccount/add?bookNum=${dto.bookNum}">가입하기</a>
	</c:if>
</body>
</html>