<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!-- 此页面用于自动登陆 -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
     <form name="f1" id="f1" action="<%=path %>/servlet/LoginServlet" method="post">
      <table>
        <tr>
          <td>Username</td>
          <td><input type="text" name="username" value="${un }"></td>
        </tr>
        <tr>
          <td>Password:</td>
          <td><input type="password" name="password" value="${pw }"></td>
        </tr> 
        <tr>
         <tr>
          <td>Autologin:</td>
          <td><input type="checkbox" name="auto" value = "1" value = "Login"></td>
        </tr> 
        <tr>
          <td colspan="2"><input type="submit"></td>
        </tr>
      </table>
    </form>
  </body>
</html>
