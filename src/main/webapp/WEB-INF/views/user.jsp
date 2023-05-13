<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/src/main/resources/static/css/app.css">
    <link rel="stylesheet" href="css/app.css">
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css">

    <title>Form login unitop.vn</title>
</head>
<body>
    <div id="wrapper">
        <form  id="form-login">
            <h1 class="form-heading">Form đăng nhập</h1>
             <div class="form-group">
                <p class="form-heading">User: ${user.username}</p>
               
            </div>
            <div class="form-group">
                <p class="form-heading">Password:${user.password}</p>
               
 				
 
 
 
            </div>
              
        </form>
    </div>
    
</body>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="js/app.js"></script>
</html>