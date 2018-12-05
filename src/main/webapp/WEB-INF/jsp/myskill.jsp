<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<base href="<%=basePath%>">
<head>
    <title>特色技能</title>
    <link rel="stylesheet" href="http://at.alicdn.com/t/font_368076_we3l46nomcp7gb9.css">
    <link rel="stylesheet" href="/static/css/features.css">
    <script src="/static/js/demandJS.js" ></script>
</head>
<body>
<!-- 头部开始 -->
<%@include file="./common/header.jsp"%>
<!-- 头部结束 -->

<!-- 导航开始 -->
<%@include file="./common/navigation.jsp"%>
<!-- 导航结束 -->

<!-- 当前位置 开始 -->
<div class="currnt">
    <div class="currnt-content">
        <p><span>当前位置:</span>首页>用户中心>特色技能</p>
    </div>
</div>
<!-- 当前位置 结束 -->

<!-- 大威平台 发布需求 开始 -->
<div class="platSafety">
    <%@include file="common/left.jsp"%>

    <div class="right">
        <div class="right_top">
            特色技能
        </div>
        <p class="p2">
            <input type="text">
            <a href="">添加</a>
        </p>
        <c:forEach items="${skillPOLsit}" var="sp" >
            <div class="div3">
                <p>${sp.skill.skillName}</p>
                <p class="p44">
                    <c:forEach  items="${sp.skillList}" var="skills">
                        <a href="">${skills.skillName}</a>
                    </c:forEach>
                </p>
            </div>
        </c:forEach>
    </div>
</div>
<!-- 大威平台 发布需求 结束 -->

<!-- 底部开始 -->
<%@include file="./common/footer.jsp"%>
<!-- 底部结束 -->
</body>
</html>
