<%@page import="com.info.todoapp.entity.Category"%>
<%@page import="java.util.List"%>
<%@page import="com.info.todoapp.dao.CategoryDAO"%>
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
    <table class="table table-striped">
      <thead>
        <tr>
          <th>Id</th>
          <th>Category</th>
          <th>Edit</th>
          <th>Delete</th>
        </tr>
      </thead>
      <tbody>
       <%
         List<Category>list =  CategoryDAO.getList();
         int sNo = 1;
         for(Category c:list){%>
        	<tr>
        	  <td><%=sNo++%></td>
        	  <td><%=c.getCategoryName()%></td>
        	  <td>
        	   <a href="edit_category.jsp?id=<%=c.getId()%>">
        	     <button class="btn btn-outline-primary">Edit</button>
        	   </a>
        	  </td>
        	  <td>
        	    <a href="controller/delete_category.jsp?id=<%=c.getId()%>" onclick="return confirm('Are you sure ?')">
        	      <button class="btn btn-outline-danger">Delete</button>
        	    </a>
        	  </td>
        	</tr> 
         <%}
       %>
      </tbody>
    </table>
  </div>
</body>
</html>










