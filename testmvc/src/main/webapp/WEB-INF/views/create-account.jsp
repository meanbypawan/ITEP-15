<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Account Page</title>
<%@include file="__bootstrap_lib.jsp" %>
<style>
  .form-container{
     width:30%;
     min-height:250px;
     box-shadow: 10px 10px 10px grey;
  }
</style>
</head>
<body>
   <div class="form-control d-flex justify-content-center align-items-center vh-100">
      <div class="form-container">
        <h1 class="bg-danger text-white text-center p-2">Sign up</h1>
        <form action="${pageContext.request.contextPath}/admin/sign-up" method="post" class="p-2">
          <div class="form-group">
            <input name="email" type="email" placeholder="Enter email id " class="form-control"/>
          </div>
          <div class="form-group">
            <input name="password" type="password" placeholder="Enter password" class="form-control"/>
          </div>
          <div class="form-group">
            <button type="submit" class="btn btn-secondary">Submit</button>
          </div>
          <div class="form-group">
            <%// http://localhost:8080/testmvc/create-new-account %>
             <a href="${pageContext.request.contextPath}/home">Already have account ?</a>
          </div>
        </form>
      </div>
   </div>
</body>
</html>









