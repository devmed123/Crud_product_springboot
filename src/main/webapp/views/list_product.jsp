<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: merye
  Date: 01/06/2022
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="http://cdn.datatables.net/1.11.5/css/jquery.dataTables.min.css"/>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</head>
<body>
<table id="example"  class="table table-bordered">
    <thead>
    <tr>

        <th>product name  </th>
        <th> price </th>
        <th> category </th>
        <th> delete </th>
        <th> edit </th>
    </tr>
    </thead>
    <tbody>


        <c:forEach var="pro" items="${products}">
        <tr>
            <td> ${pro.name} </td>
            <td> ${pro.price}</td>
            <td>${pro.category.title}</td>
            <td> <a href="#" class="btn btn-danger"> delete</a></td>
            <td> <a href="edit_product/${pro.id}" class="btn btn-info"> edit</a></td>


        </tr>
        </c:forEach>


    </tbody>
</table>
<a class="btn btn-info" href="add">add product</a>
</body>
</html>
<script
        src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="http://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js"></script>
<script>
    $(document).ready(function() {
        $('#example').DataTable();
    } );
</script>