<%@ page import="java.text.SimpleDateFormat,java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
  SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  String dateStr = simpleDateFormat.format(new Date());
%>
欢迎登陆，你的登陆时间是：<%=dateStr %>

<a href = "http://localhost:8080/jspweb/tag2/demo3.jsp">站内访问</a>
</html>