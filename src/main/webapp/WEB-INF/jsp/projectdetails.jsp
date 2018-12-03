<%--
  Created by IntelliJ IDEA.
  User: 张总
  Date: 2018/12/3
  Time: 08:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>发布需求</title>
    <link rel="stylesheet" href="http://at.alicdn.com/t/font_368076_we3l46nomcp7gb9.css">
    <link rel="stylesheet" href="./static/css/releaseDemand.css">
</head>
<body>
<!-- 头部开始 -->
<div class="head">
    <div class="head-center">
        <div class="head-left">
            您好，12398233
        </div>
        <div class="head-right">
            <i class="iconfont icon-xiaoxi"></i>
            <span>4</span>
        </div>
    </div>
</div>
<!-- 头部结束 -->

<!-- 导航开始 -->
<div class="nav">
    <div class="nav-wrap">
        <div class="nav-left">
            <img src="./static/imgs/logo.png" alt="">
        </div>
        <div class="nav-center">
            <ul>
                <li><a href="#" class="active">首页</a></li>
                <li><a href="#">需求大厅</a></li>
                <li><a href="#">帮助中心</a></li>
                <li><a href="#">用户中心</a></li>
            </ul>
        </div>
        <div class="nav-right">
            <input type="text" placeholder="输入关键字找人/服务">
            <a href="#">发布需求</a>
        </div>
    </div>
</div>
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
            <input type="text" placeholder="电商网站设计">
        </p>
        <p class="p2">所开发项目名称或应用名称，40个字符内</p>
        <p class="p1 p3">
            <span>项目介绍</span>
            <textarea></textarea>
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
<div class="footer">
    <div class="footerCenter">
        <p class="bqsy">版权所有</p>
        <div class="list">
            <ul>
                <li>大威平台</li>
                <li>首页</li>
                <li>关于我们</li>
                <li>公司简介</li>
            </ul>
            <ul>
                <li>联系我们</li>
                <li>顾问邮箱：123456@qq.com</li>
                <li>联系电话：123456@qq.com</li>
            </ul>
            <ul>
                <li>新手指南</li>
                <li>入驻服务商</li>
                <li>免费发布需求</li>
            </ul>
            <ul>
                <li>帮助中心</li>
                <li>需求大厅</li>
                <li>完成需求</li>
                <li>进行需求</li>
            </ul>
            <ul>
                <li>支持</li>
                <li>安全中心</li>
                <li>合同协议</li>
                <li>平台安全条款</li>
            </ul>
            <div class="weinxinqq">
                <p><img src="./static/imgs/weixin.png" alt="">微信</p><br>
                <p><img src="./static/imgs/QQ.png" alt="">QQ</p>
            </div>
        </div>
        <div class="footer-copy">
            2016年logo 京ICP备14023790号-2 京公安网备1101080201180号
        </div>
    </div>
</div>
<!-- 底部结束 -->
</body>
</html>