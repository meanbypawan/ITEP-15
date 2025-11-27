
<%
  try {
	String first = request.getParameter("first");
	String second = request.getParameter("second");
	int a=0,b=0;
	if (first != null)
		a = Integer.parseInt(first);
	if (second != null)
		b = Integer.parseInt(second);
    int result = a + b;
   %>
    <h1>Result : <%=result %></h1>      
  <%} 
  catch (Exception e) {
	e.printStackTrace();
  }
%>
