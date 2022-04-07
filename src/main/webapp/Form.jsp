<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculator</title>
</head>
<body>
        <h1>Периметр квадрата</h1>

        <form class="calc" action="${pageContext.request.contextPath}/JavaCalc" method="post">
              <label for="square_side">Сторона квадрата:</label>
              <input type="text" class="form-control form-control-lg" name="square_side" id="square_side" placeholder="Введите число">
            <button type="submit" id="button_form">Вычислить</button>
          </form>
</body>
</html>