<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Registration Form</title>
</head>
<body>
	<div align="center">
		<h1>Employee Registration Form</h1>
		<form action=Register3 method=post>
			<table>
				<tr>
					<td>First Name:</td>
					<td><input type="text" name="firstname"></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><input type="text" name="lastname"></td>
				</tr>
				<tr>
					<td>Email ID:</td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td>User Phone:</td>
					<td><input type="text" name="phone"></td>
				</tr>
				<tr>
					<td>User Name:</td>
					<td><input type="text" name="uname"></td>
				</tr>
				<tr>
					<td>User Password:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" name="register"></td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>