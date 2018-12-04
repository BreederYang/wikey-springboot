<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html lang="en">
<head>
    <title>发布需求</title>
    <link rel="stylesheet" href="http://at.alicdn.com/t/font_368076_we3l46nomcp7gb9.css">
    <link rel="stylesheet" href="/static/css/releaseDemand.css">
    <script charset="utf-8" src="/static/kindeditor/kindeditor-all-min.js"></script>
    <%--<script charset="utf-8" src="/editor/lang/zh-CN.js"></script>--%>
    <script>
        KindEditor.ready(function(K) {
            window.editor = K.create('#editor_id');
        });
    </script>
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
        <p><span>当前位置:</span>首页>用户中心>我的需求>已发布需求>查看详情</p>
    </div>
</div>
<!-- 当前位置 结束 -->

<!-- 大威平台 发布需求 开始 -->
<div class="platSafety">
    <div class="left">
        <div class="left_top">
            大威平台
        </div>
        <ul>
            <li><a href="#">个人资料</a></li>
            <li><a href="#">特色技能</a></li>
            <li><a href="#">作品案例</a></li>
            <li><a href="#">安全中心</a></li>
            <li class="active"><a href="#">我的需求</a></li>
            <li><a href="#">我的订单</a></li>
            <li><a href="#">消息</a></li>
        </ul>
    </div>
    <div class="right">
        <div class="right_top">发布需求</div>
        <p class="p1">
            <span>项目名称</span>
            <input type="text" placeholder="${demand.demandName}">
        </p>
        <p class="p2">所开发项目名称或应用名称，40个字符内</p>
        <p class="p1 p3">
            <span>项目介绍</span>
            <span style="margin-left:20px; ">
            <textarea id="editor_id" name="demandContent" style="width: 578px;height:400px;">${demand.demandContent}</textarea>
            </span>
        </p>
        <div class="clear"></div>
        <p class="p1">
            <span>项目周期</span>
            <select>
                <option value="">2周-4周</option>
            </select>
        </p>
        <p class="p2">请选择开发的周期</p>
        <p class="p1">
            <span>项目预算</span>
            <select>
                <option value="">2周-4周</option>
            </select>
        </p>
        <p class="p2">请选择开发的预算</p>
        <p class="p1 p5">
            <span>所在城市</span>
            <select></select>
            <select></select>
            <select></select>
        </p>
        <p class="p6">
            <a href="">保存需求</a>
            <a href="">发布需求</a>
        </p>
    </div>
</div>
<!-- 大威平台 发布需求 结束 -->



<!-- 底部开始 -->
<%@include file="./common/footer.jsp"%>
<!-- 底部结束 -->
</body>
</html>