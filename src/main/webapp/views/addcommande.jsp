<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: merye
  Date: 01/06/2022
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</head>
<body>
<form action="save_commande" method="POST">

    <div class="form-group">
        <label for="count">quantity:</label>
        <input type="number" class="form-control" name="count" id="count">
    </div>
    <div class="form-group">
        <label for="product">price:</label>
        <select name="product" id="product">
            <c:forEach items="${products}" var="pro">
                <option value="${pro.id}">${pro.name}</option>
            </c:forEach>
        </select>
    </div>
    <button type="submit" class="btn btn-success">commander</button>
</form>
</body>
</html>

