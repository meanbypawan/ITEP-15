<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <%@include file="__bootstrap_link.jsp" %>
</head>
<body>
  <%@include file="__header.jsp" %>
  <div class="container mt-3">
    <form action="controller/add_category.jsp" method="post">
      <input type="text" name="categoryName" class="form-control" placeholder="Enter task category"/>
      <button class="mt-3 btn btn-outline-success" type="submit">Add task</button>
    </form>
  </div>
</body>
</html>