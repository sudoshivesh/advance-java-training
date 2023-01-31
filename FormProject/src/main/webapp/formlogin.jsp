<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN</title>
</head>
<body>
	<div align=center>
		<h1>USER LOGIN</h1>
	</div>
	<form action=Register2 method=post>
		<table>
			<tr>
				<td>User Name:</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td><input type=submit value=Login></td>
				<td><input type=reset></td>
			</tr>
		</table>
	</form>
</body>
</html>