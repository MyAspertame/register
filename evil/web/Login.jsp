<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <script>
        var e = '${sessionScope.loginError}';
        if(e=='false'){
            alert("用户名或密码输入错误，请重新输入！");
        }
    </script>
</head>
<body>
<h1>点击登录</h1>
<form action="${pageContext.request.contextPath}/login" method="post">
    用户名：<input type="text" name="username"><br>
    密码：<input type="password" name="password"><br>
    <input type="submit">
</form>
</body>
</html>
