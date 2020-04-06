<%@ page import="java.text.SimpleDateFormat,java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tag2/jaketag2.tld" prefix="jake" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String name = "jake";
pageContext.setAttribute("name",name);
%>
<jake:if test="${name == 'jake'}">
欢迎管理员进入
</jake:if>
<jake:if test="${name!='jake'} ">
对不起你不是我们的管理员
</jake:if>

<% 
  SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  String dateStr = simpleDateFormat.format(new Date());
%>
欢迎登陆，你的登陆时间是：<%=dateStr %>
<jake:DateTag value="${dateStr}" pattern="yyyy/MM/dd"></jake:DateTag>
</body>
</html>