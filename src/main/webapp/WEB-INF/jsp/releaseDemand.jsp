<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<base href="<%=basePath%>">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>发布需求</title>
    <link rel="stylesheet" href="http://at.alicdn.com/t/font_368076_we3l46nomcp7gb9.css">
    <link rel="stylesheet" href="./static/css/releaseDemand.css">
    <script src="./static/js/jquery.min.js"></script>
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

    <%@include file="common/left.jsp"%>

    <div class="right">
        <form action="/demand/release" method="post" id="saveDemand">
            <div class="right_top">发布需求</div>
            <p class="p1">
                <span>项目名称</span>
                <input type="text" name="demandName" placeholder="电商网站设计">
            </p>
            <p class="p2">所开发项目名称或应用名称，40个字符内</p>
            <p class="p1">
                <span>项目类型</span>
                <select name="demandType">
                    <option value="1">UI 设计</option>
                    <option value="2">网站搭建</option>
                    <option value="3">微信小程序</option>
                </select>
            </p>
            <p class="p1 p3">
                <span>项目介绍</span>
                <span style="margin-left:20px; ">
                <textarea id="editor_id" name="demandContent" style="width: 578px;height:400px;"></textarea>
                </span>
            </p>
            <div class="clear"></div>

            <p class="p1">
                <span>项目周期</span>
                <select name="demandPeriod">
                    <option value="1周-2周">1周-2周</option>
                    <option value="2周-4周">2周-4周</option>
                    <option value="4周-8周">4周-8周</option>
                    <option value="8周-10周">8周-10周</option>
                </select>
            </p>
            <p class="p2">请选择开发的周期</p>
            <p class="p1">
                <span>项目预算</span>
                <select name="demandBudget">
                    <option value="10000">10000RMB</option>
                    <option value="20000">20000RMB</option>
                    <option value="40000">40000RMB</option>
                    <option value="70000">70000RMB</option>
                </select>
            </p>
            <p class="p2">请选择开发的预算</p>
            <p class="p1 p5">
                <span>所在城市</span>
                <%--城市三级联动--%>
                <select id="provinceId" onfocus="cleanCtiys()" onchange="findCity()"></select>
                <select id="cityId" onchange="findDistrict()"></select>
                <select id="districtId"></select>
            </p>
            <p class="p6">
                <input type="button" onclick="saveDemand(1)" value="保存需求">
                <%--<input type="submit" value="发布需求">--%>
                <%--<a href="">保存需求</a>--%>
                <a href="">发布需求</a>
            </p>
        </form>
    </div>
</div>
<!-- 大威平台 发布需求 结束 -->
    <script>

    </script>
    

<!-- 底部开始 -->
<script src="./static/js/demandJS.js" ></script>
<%@include file="./common/footer.jsp"%>
<!-- 底部结束 -->
</body>
</html>

