<%@page import="com.info.todoapp.dao.CategoryDAO"%>
<%@page import="com.info.todoapp.entity.Category"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="category" class="com.info.todoapp.entity.Category"></jsp:useBean>
<jsp:setProperty name="category" property="id"></jsp:setProperty>    
<!DOCTYPE html>
<html>
<head>
  <%@include file="__bootstrap_link.jsp" %>
</head>
<body>
  <%@include file="__header.jsp" %>
  <%
    Category c = CategoryDAO.findById(category);
  %>
  <div class="container mt-3">
    <form action="controller/update_category.jsp" method="post">
      <input type="hidden" name="id" value="<%=c.getId() %>"/>
      <input value="<%=c.getCategoryName() %>" type="text" name="categoryName" class="form-control" placeholder="Enter task category"/>
      <button class="mt-3 btn btn-outline-success" type="submit">Upate</button>
    </form>
  </div>
</body>
</html>





