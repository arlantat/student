<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>index</title>
    <style>
        #msg {
            color: red;
        }
    </style>
</head>
<body>
    <p><a href="/show">Xem danh sách sv</a></p>
    <p><a href="add.jsp">Thêm mới</a></p>
    <p><a href="modify.jsp">Cập nhật</a></p>
    <p><a href="delete.jsp">Xóa</a></p>
    <p><a href="sort.jsp">Sắp xếp</a></p>
    <p><a href="/read">Đọc từ file</a></p>
    <p><a href="/write">Ghi vào file</a></p>
    <p><a href="mai.jsp">Thoát</a></p>
    <p id="msg">${msg}</p>
</body>
</html>