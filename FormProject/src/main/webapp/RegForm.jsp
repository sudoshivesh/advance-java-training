<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
</head>
<body>
	<div align="center">
		<h1>Registration Form</h1>
		<form action=Register2 method=post>
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
					<td>Address:</td>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<td>Pin:</td>
					<td><input type="text" name="pin"></td>
				</tr>
				<tr>
					<td>Department Name:</td>
					<td><input type="text" name="deptname"></td>
				</tr>
				<tr>
					<td>Position:</td>
					<td><input type="text" name="position"></td>
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