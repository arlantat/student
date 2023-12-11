<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm/Sửa sv</title>
</head>
<body>
    <form action="/add" method="post">
        <h2>Nhập thông tin sv mới:</h2>
        <input type="text" name="id" required placeholder="id">
        <input type="text" name="name" required placeholder="Tên">
        <input type="text" name="age" required placeholder="Tuổi">
        <input type="text" name="gender" required placeholder="Giới tính">
        <input type="text" name="address" required placeholder="Địa chỉ">
        <input type="text" name="avg" required placeholder="Điểm trung bình">
        <button type="submit" name="Gửi">Gửi</button>
    </form>
</body>
</html>
