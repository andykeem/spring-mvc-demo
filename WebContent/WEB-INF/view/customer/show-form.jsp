<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="/spring-mvc-demo">Home</a>
	<h4>Customer Registration</h4>
	<form:form action="process-form" method="post" modelAttribute="customer">
		<p>
			First name: <form:input path="firstName" />	
		</p>
		<p>
			Last name: <form:input path="lastName" />
		</p>
		<p>
			Free passes: <form:input path="freePasses" />
			<form:errors path="freePasses" cssClass="error" />
		</p>
		<p>
			Postal code: <form:input path="postalCode" />
			<form:errors path="postalCode" cssClass="error" />
		</p>
		<p>
			Referral code: <form:input path="referralCode" />
			<form:errors path="referralCode" />
		</p>
		<input type="submit" />
	</form:form>
</body>
</html>