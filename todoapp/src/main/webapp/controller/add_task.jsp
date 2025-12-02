<%@page import="com.info.todoapp.dao.TaskDAO"%>
<jsp:useBean id="task" class="com.info.todoapp.entity.Task"></jsp:useBean>
<jsp:setProperty name="task" property="*"></jsp:setProperty>
<%
 if(request.getMethod().equalsIgnoreCase("POST")){
  if(TaskDAO.save(task)){%>
	<script>
	  window.alert("Task created successfully...");
	  window.location.href="../add_task.jsp";
	</script>  
  <%}
	else
	  out.print("Something wrong...");
 }
 else
	 out.print("Can handle GET");
 
%>