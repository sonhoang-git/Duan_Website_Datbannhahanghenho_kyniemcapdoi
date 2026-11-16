<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="Services.RestaurantService" %>
<%
    try {
        request.setAttribute("restaurants", new RestaurantService().getAll());
    } catch (SQLException e) {
        application.log("Unable to load restaurants for the index page", e);
        request.setAttribute("restaurantLoadError", true);
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Danh sách nhà hàng</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 32px;
            color: #242424;
        }

        .table-container {
            overflow-x: auto;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            min-width: 900px;
        }

        th, td {
            padding: 12px;
            border: 1px solid #ddd;
            text-align: left;
        }

        th {
            background: #f5f5f5;
        }

        .message {
            padding: 16px;
            background: #f5f5f5;
        }
    </style>
</head>
<body>
<main>
    <h1>Danh sách nhà hàng</h1>
    <c:choose>
        <c:when test="${restaurantLoadError}">
            <p class="message">Không thể tải danh sách nhà hàng. Vui lòng thử lại sau.</p>
        </c:when>
        <c:when test="${empty restaurants}">
            <p class="message">Chưa có nhà hàng nào.</p>
        </c:when>
        <c:otherwise>
            <div class="table-container">
                <table>
                    <thead>
                    <tr>
                        <th>Mã</th>
                        <th>Tên nhà hàng</th>
                        <th>Địa chỉ</th>
                        <th>Quận/Huyện</th>
                        <th>Thành phố</th>
                        <th>Điện thoại</th>
                        <th>Ẩm thực</th>
                        <th>Giá trung bình/cặp</th>
                        <th>Đánh giá lãng mạn</th>
                        <th>Trạng thái</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="restaurant" items="${restaurants}">
                        <tr>
                            <td><c:out value="${restaurant.restaurant_id}"/></td>
                            <td><c:out value="${restaurant.restaurant_name}"/></td>
                            <td><c:out value="${restaurant.address}"/></td>
                            <td><c:out value="${restaurant.district}"/></td>
                            <td><c:out value="${restaurant.city}"/></td>
                            <td><c:out value="${restaurant.phone}"/></td>
                            <td><c:out value="${restaurant.cuisine_type}"/></td>
                            <td><fmt:formatNumber value="${restaurant.avg_price_per_couple}" type="number" groupingUsed="true"/> đ</td>
                            <td><fmt:formatNumber value="${restaurant.romantic_rating}" maxFractionDigits="2"/></td>
                            <td><c:out value="${restaurant.status}"/></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </c:otherwise>
    </c:choose>
</main>
</body>
</html>