<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update</title>
</head>
<body>
${test}

<h1>Update Contact Info</h1>
<form action="updatecust">
	Customer ID: ${cID}
	Your Name: <input type="text" name="name">
	<!--  this is a hidden field a user will only see this if they view the page source
	or open the inspect element -->
	<input type="hidden" name="cID" value="${cID}">
	<input type="submit" value="Update">

</form>

</body>
</html>