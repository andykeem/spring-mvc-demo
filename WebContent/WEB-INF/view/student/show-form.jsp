<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
<link type="text/css" rel="stylesheet" href="../../css/style.css" />
</head>
<body>
	<a href="/spring-mvc-demo">Home</a>
	<h4>Student Registration Form</h4>
	<form:form action="process-form" method="post" 
				modelAttribute="student">
		<p>
			First name: <form:input path="firstName" />
		</p>
		<p>
			Last name: <form:input path="lastName" />
			<form:errors path="lastName" cssClass="error" />
		</p>
		<p>
			Country: 
			<form:select path="country">
				<form:option value="-" label="--Please Select" />
				<form:options items="${countryList}" itemValue="value" itemLabel="label" />
			</form:select>
		</p>
		<p>
			Favorite Program Languages:
			<div>
				<form:radiobuttons path="language" items="${languages}" />
			</div>			
		</p>
		<p>
			<div>Operating Systems:</div>
			<div>
				<form:checkboxes items="${osList}" path="operSystems" />
			</div>
		</p>
		<p>
			<input type="submit" />
		</p>
	</form:form>
</body>
</html>