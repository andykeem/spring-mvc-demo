<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="show-form"><< Back</a>
	<a href="/spring-mvc-demo">Home</a>
	<h4>Registration Confirmation</h4>
	<p>
		First name: ${customer.firstName}
	</p>
	<p>
		Last name: ${customer.lastName}
	</p>
	<p>
		Free passes: ${customer.freePasses}
	</p>
	<p>
		Postal code: ${customer.postalCode}
	</p>
	<p>
		Referral code: ${customer.referralCode}
	</p>
</body>
</html>