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
 String[] level = {"M","AM","TL","SSE","SE","ASE"};
 pageContext.setAttribute("level", level);
 %>
 <jake:skipPageOrEvalPage/>
   <h3>你是站内访问超链接，可以看到如下内容</h3>
   <ol>
   <li>One</li>
   <li>Two</li>
   <li>Three</li>
   <li>Four</li>
   <li>Five</li>
   <jake:iteration items="${level }" name="name">
   <li>${name }</li>
   </jake:iteration>
   </ol>
 <jake:modifyBodyContent>
  hello world!
 </jake:modifyBodyContent>
</body>
</body>
</html>