<%--
  Created by IntelliJ IDEA.
  User: 青山云水间
  Date: 2019/2/16
  Time: 21:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


    <a href="account/findAll">执行查询所有--------</a>

    <form action="account/saveAccount" method="post">
        姓名:<input type="text" name="name">
        金额:<input type="text" name="money">
        <input type="submit" value="保存">
    </form>

</body>
</html>
