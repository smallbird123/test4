<%--
  Created by IntelliJ IDEA.
  User: liu
  Date: 2019/2/24 0024
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="aqua">
<h1 align="center">人员明细表</h1>
<table align="center" id="" border="1" bgcolor="#d2691e" cellspacing="0" cellpadding="20">
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>生日</td>
        <td>性别</td>
        <td>职业</td>
        <td>住所</td>
        <td>电话</td>
        <td>操作</td>
    </tr>
    <c:if test="${not empty sessionScope.list}">
    <c:forEach var="pers" items="${sessionScope.list}" varStatus="vs">

    <tr <c:if test="${vs.index%2==0}">bgcolor="#a52a2a"</c:if>>
        <td>${pers.id}</td>
        <td>${pers.name}</td>
        <td>${pers.birthday}</td>
        <td>${pers.sex.sname}</td>
        <td>${pers.work}</td>
        <td>${pers.address}</td>
        <td>${pers.phone}</td>
        <td>
            <a href="/as?id=${pers.id}">明细</a>
            <a href="/us?id=${pers.id}">修改</a>
            <a href="">添加</a>
        </td>
    </tr>
    </c:forEach>
    </c:if>
</table>


</body>


</html>
