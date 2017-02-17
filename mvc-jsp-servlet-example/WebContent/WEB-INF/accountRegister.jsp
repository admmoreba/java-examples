<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Customer Bank Account</title>
</head>
<body>
	<form action="accountRegister" method="post" >
		AccountNumber: <input type="text" name="accountNo"/><br/>
		Name: <input type="text" name="name"/><br/>
		Email: <input type="text" name="email"/><br/>
		Balance: <input type="text" name="balance"/><br/>  
		<input type="submit" value="Save" name="Save"/><br/>
	</form>
</body>
</html>