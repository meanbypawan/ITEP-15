<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
</head>
<body class="container mt-3">
  <form action="add.jsp" method="get">
    <div class="form-group">
      <input name="first" type="text" class="form-control" placeholder="Enter first number"/>
    </div>
    <div class="form-group">
      <input name="second" type="text" class="form-control" placeholder="Enter second number"/>
    </div>
    <div class="mt-3">
       <input type="submit" name="submit" value="Add" class="btn btn-success"/>
    </div>
    
  </form>
  <%
     if(request.getParameter("submit")!=null){
     String first = request.getParameter("first");
     String second = request.getParameter("second");
     
     int a = Integer.parseInt(first);
     int b = Integer.parseInt(second);
     
     int result = a + b;
  %>
    <h1>Result : <%=result %></h1>
  
  <%}%>
</body>
</html>

























