<%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Show User</title>
</head>
<body>
    ${add}
    ${getUserById}
    <br>
    <c:if test="${!empty listUsers}">
    <table class="tg">
        <tr>
            <th width="40">User ID</th>
            <th width="80">User Name</th>
            <%--<th width="60">Edit</th>
            <th width="60">Delete</th>--%>
        </tr>
        <c:forEach items="${listUsers}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
            </tr>
        </c:forEach>
    </table>
    </c:if>
    ${removeUser}
</body>
</html>