<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #333;
        color: #fff;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }
    .form-container {
        background-color: #444;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);
        animation: fadeIn 1s ease-in-out;
    }
    .form-container h2 {
        text-align: center;
        margin-bottom: 20px;
    }
    .form-container label {
        display: block;
        margin-bottom: 5px;
        font-weight: bold;
    }
    .form-container input[type="text"],
    .form-container input[type="email"],
    .form-container input[type="password"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 20px;
        border: none;
        border-radius: 5px;
    }
    .form-container input[type="submit"] {
        width: 100%;
        padding: 10px;
        background-color: #00b4d8;
        border: none;
        border-radius: 5px;
        color: #fff;
        font-weight: bold;
        cursor: pointer;
        transition: background-color 0.3s ease;
    }
    .form-container input[type="submit"]:hover {
        background-color: #0077b6;
    }
    .error-message {
        color: red;
        font-weight: bold;
        margin-bottom: 20px;
        text-align: center;
    }
    @keyframes fadeIn {
        from { opacity: 0; }
        to { opacity: 1; }
    }
</style>
</head>
<body>
    <div class="form-container">
        <h2>Registration Form</h2>
        <form action="handleRegister" method="post">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>
            
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
            
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
            
            <input type="submit" value="Register">
        </form>
        
        <% if (Boolean.TRUE.equals(request.getAttribute("email_in_use"))) { %>
            <div class="error-message">
                Email is already in use. Please enter a new email.
            </div>
        <% } %>
    </div>
</body>
</html>
