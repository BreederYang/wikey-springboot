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
    <title>个人资料</title>
</head>
<base href="<%=basePath%>">
<link rel="stylesheet" href="http://at.alicdn.com/t/font_368076_we3l46nomcp7gb9.css">
<link rel="stylesheet" href="/static/css/personal.css">
<body>
<jsp:include page="common/header.jsp"/>
<jsp:include page="common/navigation.jsp"/>

<!-- 当前位置 开始 -->
<div class="currnt">
    <div class="currnt-content">
        <p><span>当前位置:</span>首页>用户中心>安全中心>公司名称变更</p>
    </div>
</div>
<!-- 当前位置 结束 -->

<!-- 大威平台 发布需求 开始 -->
<div class="platSafety">
    <jsp:include page="common/left.jsp"/>
    <div class="right">
        <div class="right_top">
            个人资料
            <a href="/login/upPersonal">修改资料</a>
        </div>
        <div class="clear"></div>
        <form action="/login/insertProvider" method="post" enctype="multipart/form-data" >
        <table class="mytable">
            <tr>
                <td>姓名</td>
                <td>${provider.proUserName}</td>
            </tr>
            <tr>
                <td>法人身份证</td>
                <td>${provider.idCard}</td>
            </tr>
            <tr>
                <td>手机号</td>
                <td>${provider.phone}</td>
            </tr>
            <tr>
                <td>邮箱</td>
                <td>${provider.email}</td>
            </tr>
            <tr>
                <td>公司名称</td>
                <td>${provider.proName}</td>
            </tr>
            <tr>
                <td>所在地</td>
                <td>${provider.city}</td>
            </tr>
            <tr>
                <td>详细地址</td>
                <td>${provider.address}</td>
            </tr>
            <tr>
                <td>经营范围</td>
                <td>${provider.eor}</td>
            </tr>
            <tr>
                <td>营业执照</td>
                <td><img src="${provider.blis}" style="width: 150px;height: 100px;" alt="营业执照"></td>
            </tr>
            <tr>
                <td colspan="2">
                    <a href="/skill/toFeatures/2">进一步完善信息</a>
                </td>
            </tr>
        </table>
        </form>
    </div>
</div>
<!-- 大威平台 发布需求 结束 -->

<jsp:include page="common/footer.jsp"/>

</body>
</html>