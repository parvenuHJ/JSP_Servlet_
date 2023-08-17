<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- POST 방식 -> request.get으로 가져오기 전에 request 인코딩 -->
	<%request.setCharacterEncoding("UTF-8");%>

<% 
	int java = Integer.parseInt(request.getParameter("java"));
	int web = Integer.parseInt(request.getParameter("web"));
	int iot = Integer.parseInt(request.getParameter("iot"));
	int android = Integer.parseInt(request.getParameter("android"));
	
	int[] arr = {java,web,iot,android};
	
	int sum = 0;
	
	for(int i = 0; i < arr.length ; i++){
		sum += arr[i];
	}
	
	//     정수 / 정수 = 정수 ( 소수점이 안나옴 )
	float avg = (float)sum/arr.length;
	
%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<fieldset> <!-- HTML요소를 박스로 묶어주는 태그 -->
   <legend>학점확인프로그램</legend> <!-- fieldset에 제목을 달아주는 태그 -->
   
   <table align="center" width="500">
      <tr>
         <td>이름</td>
         <td><%out.print(request.getParameter("name"));%></td>
      </tr>
      <tr>
         <td>JAVA점수</td>
         <td><%out.print(arr[0]);%></td>
      </tr>
      <tr>
         <td>WEB점수</td>
         <td><%out.print(arr[1]);%></td>
      </tr>
      <tr>
         <td>IOT점수</td>
         <td><%out.print(arr[2]);%></td>
      </tr>
      <tr>
         <td>ANDROID점수</td>
         <td><%out.print(arr[3]);%></td>
      </tr>
      <tr>
         <td>평균</td>
         <td>
         <%out.print(avg); %>
         </td>
      </tr>
      <tr>
         <td><strong>학점</strong></td>
         <td style="font-weight: bold;">
         
         <%
         if(95<=avg & avg <=100){
     		out.print("A+");
     	}else if (90<= avg){
     		out.print("A");
     	}else if (85 <= avg){
     		out.print("B+");
     	}else if  (80 <= avg){
     		out.print("B");
     	}else {
     		out.print("F");
     	}
         %>
         
         </td>
      </tr>
      
   </table>
  
</fieldset>



</body>
</html>