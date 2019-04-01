<%--
  Created by IntelliJ IDEA.
  User: liu
  Date: 2019/2/24 0024
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>明细</h1>
<form action="/us" method="post">

    <table>

        <tr>
            <td>编号</td>
            <td><input type="text" name="id" value="${sessionScope.pers.id}"></td>

        </tr>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name" value="${sessionScope.pers.name}"></td>
        </tr>
        <tr>
            <td>生日</td>
            <td><input type="date" name="birthday" value="${sessionScope.pers.birthday}"></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><select name="sexid" >
                <option value="0">--请选择--</option>
                <c:forEach var="sex" items="${sessionScope.sexs}">
                    <option value="${sex.sid}" <c:if test="${pers.sexid==sex.sid}">selected="selected"</c:if> >${sex.sname}</option>
                </c:forEach>
            </select</td>
        </tr>
        <tr>
            <td>职业</td>
            <td><input type="text" name="work" value="${sessionScope.pers.work}"></td>
        </tr>
        <tr>
            <td>住所</td>
            <td><input type="text" name="address" value="${sessionScope.pers.address}"></td>
        </tr>
        <tr>
            <td>电话</td>
            <td><input type="text" name="phone" value="${sessionScope.pers.phone}"></td>
        </tr>


        <tr>
            <td><input type="submit" value="修改"></td>
            <td  ><input type="button" value="返回" onclick="javascript:location.href='/jsp/show.jsp'"></td>
        </tr>

    </table>
</form>


</body>
</html>
