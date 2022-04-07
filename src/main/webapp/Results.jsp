<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Результат</title>
</head>
<body>
        <h1>Периметр квадрата</h1>
            <h3>Сторона квадрата: ${first_result}</h3>
            <h3>Результат: ${result}</h3>
        <form action="${pageContext.request.contextPath}/Form.jsp">
            <button type="submit" id="button_form">Назад</button>
        </form>
</body>
</html>