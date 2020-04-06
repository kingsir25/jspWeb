<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//请求转发：服务器行为，属于一次请求，转发后请求对象会保存，地址栏的URL地址不会改变
//request.getRequestDispatcher("login/login.jsp").forward(request,response);
//请求重定向：客户端行为，等同于2次请求，前1次请求不会保存，地址栏的URL地址会改变。
response.sendRedirect("login/login.jsp");

%>
