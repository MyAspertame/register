<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <script>
        var a = '${sessionScope.wrongPassword}';
        if(a=='yes'){
            alert("两次输入密码不同，请重新输入！");
        }
    </script>
</head>

<body>
<h1>注册</h1>
<form action="${pageContext.request.contextPath}/register" method="post">
    用户名：<input type="text" name="username" required><br>
    密码：<input type="password" name="password" required><br>
    确认密码：<input type="password" name="confirm-password" required><br>
    爱好：<input type="checkbox" name="hobbies" value="学习">学习
    <input type="checkbox" name="hobbies" value="二次元">二次元
    <input type="checkbox" name="hobbies" value="生活">生活
    <input type="checkbox" name="hobbies" value="游戏">游戏
    <br>
    性别：<input type="radio" name="sex" value="男" required>男
    <input type="radio" name="sex" value="女" required>女
    <br>
    个人购物倾向：
    <br>
    <textarea name="info" cols="20" rows="10" placeholder="请写点啥让我们了解你的需求"></textarea><br>
    <input type="submit">
    <input type="reset">
</form>
</body>

</html>
