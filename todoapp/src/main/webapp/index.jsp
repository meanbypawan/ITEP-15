<%@page import="jakarta.persistence.EntityManagerFactory"%>
<%@page import="com.info.todoapp.util.JPAUtil"%>
<html>
<head>
  <%@include file="__bootstrap_link.jsp" %>
  <style>
     .form-container{
       width: 50%;
       min-height: 30vh;
       box-shadow: 10px 10px 10px 10px grey;
     }
     .form-header{
       width:100%;
       height: 50px;
     }
  </style>
</head>

<body>
     <div class="container d-flex justify-content-center align-items-center" style="height:100vh !important;">
        <div class="form-container">
          <div class="form-header bg-danger d-flex align-items-center justify-content-center">
              <h4 class="text-white text-center">Sign In</h4>
          </div>
          <form action="controller/admin_login.jsp" method="post" class="p-3">
              <div class="form-group">
                <input type="email" name="email" class="form-control" placeholder="Enter email id"/>
              </div>
              <div class="form-group">
                <input type="password" name="password" class="form-control" placeholder="Enter password"/>
              </div>                        
              <div class="mt-2">
                <button type="submit" class="btn btn-secondary text-white">Submit</button>
              </div>
          </form>
        </div>
     </div>
     
</body>
</html>










