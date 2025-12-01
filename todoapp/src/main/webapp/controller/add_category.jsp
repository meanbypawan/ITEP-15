<%@page import="com.info.todoapp.dao.CategoryDAO"%>
<jsp:useBean id="category" class="com.info.todoapp.entity.Category"></jsp:useBean>
<jsp:setProperty property="*" name="category"></jsp:setProperty>
<%
  if(request.getMethod().equalsIgnoreCase("POST")){
  try {
	if (CategoryDAO.save(category)) {%>
       <script>
         window.alert("Category saved successfully...");
         window.location.href="../add_category.jsp";
       </script>
<%}
  }catch (Exception e) {
	e.printStackTrace();
  }
  }
  else
	  response.sendRedirect("../error.jsp");
%>