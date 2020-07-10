<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>恭喜你成功注册一下是你的信息请确认</h1>
您的个人信息如下：<br>
用户名：${sessionScope.s_username} <br>
密码：${sessionScope.s_password1} <br>
性别：${sessionScope.s_sex} <br>
爱好：${sessionScope.s_hobbies} <br>
简介：${sessionScope.s_info} <br>


<a href="${pageContext.request.contextPath}/logout"><input type="button" value="注销账户"></a>

<a href="${pageContext.request.contextPath}/index.jsp"><input type="button" value="返回首页"></a>
<a href="${pageContext.request.contextPath}/shop.jsp"><input type="button" value="进入购物"></a>
</body>
</html>
