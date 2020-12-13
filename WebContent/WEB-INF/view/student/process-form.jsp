<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Confirmation</title>
</head>
<body>
	<h4>Student Registration Confirmation</h4>
	<p>
		Congrats! ${student.firstName} ${student.lastName},
	</p>
	<p>
		Your registration has been processed.
	</p>
	<p>
		Welcome from ${student.country}
	</p>
	<p>
		Your fav. language is: ${student.language}
	</p>
	<p>
		<div>Your fav. Operating System(s):</div>
		<c:forEach var="item" items="${student.operSystems}">
			<span>${item}</span><br />
		</c:forEach>
	</p>
	<p>Course code: ${student.courseCode}</p>
</body>
</html>