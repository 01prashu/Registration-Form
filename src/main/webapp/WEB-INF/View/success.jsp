<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="spring.model.Student" %>
<%@ page import="spring.dao.ImplementInterfaceDao" %>
<%@ page import="org.springframework.context.annotation.AnnotationConfigApplicationContext" %>
<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="spring.dao.SpringConfig" %>
<%@ page import= "java.util.ArrayList" %>
<%@ page import= "java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Success</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #000;
            color: #fff;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .success-container {
            text-align: center;
            border: 2px solid #4CAF50;
            padding: 20px;
            border-radius: 10px;
            background-color: #333;
        }
        .success-symbol {
            font-size: 100px;
            color: #4CAF50;
        }
        .success-message {
            font-size: 24px;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <div class="success-container">
        <div class="success-symbol">&#10003;</div>
  	      
        <%
            ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
            Student stud = (Student)request.getAttribute("user");
            String name = stud.getName();
            
          
        %>
        <%-- Output the result without using System.out.println --%>
        <div class="success-message"><%=name %> you have registered successfully!</div>
    </div>
</body>
</html>
