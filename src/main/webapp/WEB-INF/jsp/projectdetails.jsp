<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>项目详情</title>
</head>
<base href="<%=basePath%>">
<link rel="stylesheet" href="http://at.alicdn.com/t/font_368076_we3l46nomcp7gb9.css">
<link rel="stylesheet" href="./static/css/projectdetails.css">

<body>
<jsp:include page="common/header.jsp"/>
<!-- 导航开始 -->
<jsp:include page="common/navigation.jsp"/><!-- 导航结束 -->

<!-- 当前位置 开始 -->
<div class="currnt">
    <div class="currnt-content">
        <p><span>当前位置:</span>首页>用户中心>我的需求>已发布的需求>查看详情</p>
    </div>
</div>
<!-- 当前位置 结束 -->

<!-- 大威平台 安全中心 开始 -->
<div class="platSafety">
    <div class="content_top">
        电商网站设计
        <a class="a1" href="">报名中</a>
        <a class="a2" href="">推荐的服务商（2）</a>
        <a class="a3" href="">报名的服务商（2）</a>
        <a class="a4" href="">我要投标</a>
    </div>
    <div class="content_bottom">
        <p class="p1">项目类型：设计/UI设计</p>
        <p class="p1">发布时间：2017-10-18-15:15:15</p>
        <p class="p2">
            <a class="a1" href="">UI设计</a>
            <a class="a2" href="">LOGO设计</a>
            <a class="a3" href="">图标设计</a>
        </p>
        <div id="demand-detail">
            <p class="p3">
                <span>项目名称</span>
            </p>
            <p class="p44">一、项目名称</p>
            <p class="p5">
                【${demand.demandName}】
            </p>
            <p class="p44">二、项目介绍</p>
            <p class="p5">
                ${demand.demandContent}
            </p>
        </div>

        <div class="yusuan">
            <p>项目预算：${demand.demandBudget}</p>
            <p>项目周期：${demand.demandPeriod}</p>
            <div>
                <p>已推荐</p>
                <p><span class="sp1">0</span>人</p>
            </div>
            <div>
                <p>已申请</p>
                <p><span class="sp2">2</span>人</p>
            </div>
            <div>
                <p>已浏览</p>
                <p><span class="sp3">${demand.viewCount}</span>人</p>
            </div>
        </div>
    </div>
</div>

<!-- 大威平台 安全中心 结束 -->

<jsp:include page="common/footer.jsp"/>

</body>
</html>