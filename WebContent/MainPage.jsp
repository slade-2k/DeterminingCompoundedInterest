<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formular JSP - Determining Compound Interest</title>
</head>
<body bgcolor="#E0E0E0">
<jsp:useBean id="interest" class="model.Interest" scope="page"/>
<form method="POST">
<table border="4">
	<tr>
		<td colspan="2"><h2>Determining Compound Interest</h2></td>
	</tr>
	<tr>
		<td>Principal amount (in $):</td>
		<td><input type="number" name="principalAmount" min="0" size="25" required/></td>
	</tr>
	<tr>
		<td>Rate (in percent):</td>
		<td><input type="number" step="0.01" name="rate" min="0" size="25" required/></td>
	</tr>
	<tr>
		<td>Number of years:</td>
		<td><input type="number" name="years" min="0" size="25" required/></td>
	</tr>
	<tr>
		<td>Times the interest is compounded:</td>
		<td><input type="number" name="compounded" min="0" size="25" required/></td>
	</tr>
	<tr>
		<jsp:setProperty name="interest" property="*"/>
		<!-- <jsp:getProperty name="interest" property="interest"/> ODER ${interest.interest} ODER -->
		<td><b>${interest["interest"]}</b></td>
		<td><input type="submit" value="Calculate"/></td>
	</tr>
</table>
</form>
</body>
</html>