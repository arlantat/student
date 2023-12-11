<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Xóa sv</title>
</head>
<body>
    <form action="/delete" method="post">
        <h2>Nhập id sv muốn xóa:</h2>
        <input type="text" name="id" required placeholder="id">
        <button type="submit" name="Gửi">Gửi</button>
    </form>
</body>
</html>
