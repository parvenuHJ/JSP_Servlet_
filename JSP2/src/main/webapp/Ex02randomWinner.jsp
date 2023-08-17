<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<fieldset align = "center">
<legend>랜덤당첨결과</legend>
<% 
	// request.getParameterValues -> 배열  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	String[] num = request.getParameterValues("item");
	Random rd = new Random();
	
	int ran_num = rd.nextInt(num.length);
	
	
	
	
	out.print(request.getParameter("subject"));
	%>
	<br>
	<% 
	out.print(num[ran_num]);
	%>



	
     <%--
     	선생님 코드   
      String topic = request.getParameter("topic");
      String[] values = request.getParameterValues("value");
      
      Random rd = new Random();
      
      String result = values[rd.nextInt(values.length)];
  

   <fieldset>
      <legend>랜덤당첨결과</legend>
      <%=topic %> <br>
      <%=result %>
   </fieldset> 
   --%>
	





</fieldset>

</body>
</html>