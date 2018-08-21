<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer List</title>
</head>
<body>

<form action="addnewcust">
Customer ID: <input type="text" name="id"> <br>
Your Name: <input type="text" name="contName"> <br>
Company Name: <input type="text" name="compName"> <br>
Your Title: <input type="text" name="title"> <br>
Company Phone: <input type="text" name="phone"> <br>
<input type="submit" value="Add"> <br>
</form>


<table border="1">
	<c:forEach var="cust" items="${customers}">
		<tr>
		<!-- left out title on purpose -->
			<td>${cust.customerID}</td>
			<td>${cust.companyName}</td>
			<td>${cust.contactName}</td>
			<td>${cust.phone}</td>
			<!-- this is url encoding and allows us to pass some data into 
			the link for our controller method -->
			<td><a href="update?id=${cust.customerID}">Update</a></td>
			<td><a href="delete?id=${cust.customerID}">Delete</a></td>
		
		</tr>
	
	</c:forEach>

</table>

</body>
</html>