<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 11/13/2026
  Time: 7:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <thead>
        <th>review_id</th>
        <th>overall_rating</th>
        <th>privacy_rating</th>
        <th>food_rating</th>
        <th>decor_rating</th>
        <th>service_rating</th>
        <th>comment</th>
        <th>created_at</th>
        </thead>
    </tr>
  <c:forEach var="br" items="${listbr}" varStatus="i">
      <tr>
        <td>${i.index+1}</td>
        <td>${br.overall_rating}</td>
        <td>${br.privacy_rating}</td>
        <td>${br.food_rating}</td>
        <td>${br.decor_rating}</td>
        <td>${br.service_rating}</td>
        <td>${br.comment}</td>
        <td>${br.created_at}</td>
        <td>
            <a href=""></a>
        </td>
      </tr>
  </c:forEach>
</table>
</body>
</html>
