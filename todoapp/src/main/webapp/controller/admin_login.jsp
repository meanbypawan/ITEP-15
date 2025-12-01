<%@page import="com.info.todoapp.dao.AdminDAO"%>
<%@page import="com.info.todoapp.entity.Admin"%>
<jsp:useBean id="admin" class="com.info.todoapp.entity.Admin"></jsp:useBean>
<jsp:setProperty name="admin" property="*"></jsp:setProperty>
<%
String methodType = request.getMethod();
if (methodType.equalsIgnoreCase("POST")) {
	try {
		admin = AdminDAO.authenticate(admin);
		if (admin != null)
      	  response.sendRedirect("../dashboard.jsp");
		else
	      out.print("Login failed...");
	} catch (Exception e) {
		e.printStackTrace();
	}
} else
	out.print("Can not handle GET");
%>




