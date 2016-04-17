<%--
 description:
 user: mayuan
 QQ:836119679
 date: 2016/3/27
 time: 19:39
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生管理系统</title>
</head>
<body>
<h1>学生登录页面</h1>
<hr>
<form method="post" action="${website}/form">
   <p> 学号:<input type="text" name="stuNum"><br></p>
   <p> 密码:<input type="password" name="pwd"><br></p>
    ${message}
    <p><input type="submit" value="登录"></p>
</form>
</body>
</html>
