<%@page import="com.info.todoapp.dao.CategoryDAO"%>
<jsp:useBean id="category" class="com.info.todoapp.entity.Category"></jsp:useBean>
<jsp:setProperty name="category" property="*"></jsp:setProperty>
<%
  if(CategoryDAO.update(category)){%>
	 <script>
	   window.alert("Category updated successfully..");
	   window.location.href="../view_category.jsp";
	 </script>  
  <%}
%>