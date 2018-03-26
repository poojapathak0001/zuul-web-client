<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
<table>
  <tr>
    <th>Name</th>
    <th>City</th>
    <th>Cuisine</th>
  </tr>
  <c:forEach var="hotel" items="${hotelList }"> 
  <tr>
    <td>${hotel.name}</td>
    <td>${hotel.city}</td>
    <td>${hotel.cuisine}</td>
  </tr>
</c:forEach>
</table>
</form>


</body>
</html>