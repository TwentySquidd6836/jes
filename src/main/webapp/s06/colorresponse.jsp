<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/jes/css/color.css">
<title>iColor</title>

</head>
<body>
	<div>
		<h1>Hello ${param.name}</h1>
		<p>Your favorite colors are:</p>
		<c:forEach var="item" items="${paramValues.color}">
			<c:if test="${item != null}">

				<ul>
					<li>${item}</li>
				</ul>

			</c:if>
		</c:forEach>
	</div>
</body>
</html>