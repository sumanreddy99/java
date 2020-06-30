<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome page</title>
</head>
<body>
<%-- <h2>welcome: ${myName}</h2> --%>
<form action="proceedAction">
<div align="center">

<label for="item"> ItemName :
<input type="text" name="ItemName" placeholder="foodType" id="item">
</label>
<input type="submit" value="OrderNow">

</div>
</form>
</body>
</html>



