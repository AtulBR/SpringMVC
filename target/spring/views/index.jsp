<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home Page</title>
    <style type="text/css">
        .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
        .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color: #cccccc;color:#333;background-color:#fff;}
        .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
        .tg .tg-4eph{background-color:#f9f9f9}
    </style>
</head>
<body>
    <h3>Add/Update User</h3>
    <form action="addUser">
        Enter Your Id : <input type="text" name="id"><br>
        Enter Your Name : <input type="text" name="name"><br>
        <br>
        Add User : <input type ="submit">
    </form>
    <hr>
    <h3>Get User based on Id</h3>
    <form action="getUserById" method="get">
        Enter Your Id : <input type="text" name="id"><br>
        Get User : <input type ="submit">
    </form>
    <hr>
    <h3>Get All Users</h3>
    <form action="listUsers" method="get">
        Get Users : <input type="submit">
    </form>
    <hr>
    <h3>Remove User</h3>
    <form action="removeUser" method="get">
        Enter Your Id : <input type="text" name="id"><br>
        Remove User : <input type ="submit">
    </form>
</body>
</html>