<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Xem các sv</title>
    <style>
        #msg {
            color: red;
        }
    </style>
</head>
<body>
    <p id="msg">${msg}</p>
    <ul>
        <c:forEach var="studentInfo" items="${studentInfoArray}">
            <li>${studentInfo}</li>
        </c:forEach>
    </ul>
    <p><a href="add.jsp">Thêm mới...</a></p>
</body>
</html>
