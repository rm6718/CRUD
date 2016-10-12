<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>

<%--
  Created by IntelliJ IDEA.
  User: sam
  Date: 9/26/16
  Time: 8:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Restaraunts</title>
</head>
<body>
<h1>Create Your Takeout Entry</h1>
<form method="post" action="/funtime/createtakeout">
    <table>
        <tr><td>Restaraunt Name:</td> <td><input type="text" name="name" value="<c:out value="${selectedtakeout.name}"/>"></td></tr>
        <tr><td>Type of Cuisine:</td> <td><input type="text" name="cuisineType" value="<c:out value="${selectedtakeout.cuisineType}"/>"></td></tr>
        <tr><td>Distance:</td> <td><input type="text" name="distance" value="<c:out value="${selectedtakeout.distance}"/>"></td></tr>
        <tr><td>Takeout ID:</td> <td><input type="text" name="id" value="<c:out value="${selectedtakeout.id}"/>"></td></tr>
    </table>
    <input type="submit" value="Save">
</form>

Your session new takeout looks like this:
<table border="1">
    <tr><th>Edit</th><th>Restaraunt Name</th><th>Cuisine Type</th><th>Distance</th><th>Remove</th></tr>
    <c:forEach items="${thetakeoutlist}" var="thetakeout">
        <tr><td><a href="/funtime/selecttakeout?id=<c:out value="${thetakeout.id}"/>">EDIT</a> </td><td><c:out value="${thetakeout.name}"/></td><td><c:out value="${thetakeout.cuisineType}"/></td><td><c:out value="${thetakeout.distance}"/></td><td><a href="/funtime/deletetakeout?remove=<c:out value="${thetakeout.id}"/>">Remove This Item</a> </td></tr>
    </c:forEach>
</table>

</body>
</html>

