<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Xem các sv</title>
</head>
<body>
    <p>Các sv được sắp xếp</p>
    <ul>
        <c:forEach var="studentInfo" items="${studentInfoList}">
            <li>${studentInfo}</li>
        </c:forEach>
    </ul>
</body>
</html>
