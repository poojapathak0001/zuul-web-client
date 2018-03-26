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
${message }
<form>
<table>
  <tr>
    <th>Title</th>
    <th>Author</th>
    <th>Price</th>
    <th></th>
  </tr>
  <c:forEach var="book" items="${bookList }"> 
  <tr>
    <td>${book.title}</td>
    <td>${book.author}</td>
    <td>${book.price}</td>
    <td><input type=submit value="Order Now" formaction="order/${book.bookId }"/></td>
  </tr>
</c:forEach>
</table>
</form>


</body>
</html>