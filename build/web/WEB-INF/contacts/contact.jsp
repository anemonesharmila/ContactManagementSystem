<%-- 
    Document   : contact
    Created on : Apr 28, 2016, 1:22:47 PM
    Author     : sharmila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Information Page</title>
    </head>
    <body>
        <h1>Contact List page!</h1>
        <table>
            <tr>
                <th>Id</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Address</th>
                <th>Phone number</th>
                <th>Added date</th>
                <th>Modified date</th>
                <th>Status</th>
            </tr>
            <c:forEach var="c" items="${requestScope.contacts}">
                <tr>
                    <td>${c.id}</td>
                    <td>${c.firstName}</td>
                    <td>${c.lastName}</td>
                    <td>${c.email}</td>
                    <td>${c.address}</td>
                    <td>${c.email}</td>
                    <td>${c.phoneNumber}</td>
                    <td>${c.addedDate}</td>
                    <td>${c.modifiedDate}</td>
                    <td>${c.status}</td>
                </tr>
            </c:forEach>

        </table>
    </body>
</html>
