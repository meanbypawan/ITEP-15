<%@page import="com.info.todoapp.dao.CategoryDAO"%>
<jsp:useBean id="category" class="com.info.todoapp.entity.Category"></jsp:useBean>
<jsp:setProperty name="category" property="id"></jsp:setProperty>
<%
 if(request.getMethod().equalsIgnoreCase("GET")){
  try{
	if(CategoryDAO.delete(category)){%>
		<script>
		  window.alert("Category removed successfully...");
		  window.location.href="../view_category.jsp";
		</script>
	<%}
  }
  catch(Exception e){
	  e.printStackTrace();
	  
  }
 }
%>