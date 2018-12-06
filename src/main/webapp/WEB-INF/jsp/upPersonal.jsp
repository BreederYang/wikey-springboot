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
<script type="text/javascript" src="/static/js/jquery.min.js"></script>
<script type="text/javascript">
    $(function(){
        $("#subForm").click(function () {
            var form = document.getElementById("updateForm");
            form.submit();
        })
    })

</script>
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
            修改资料
        </div>
        <div class="clear"></div>
        <form id="updateForm" action="/login/insertProvider" method="post" enctype="multipart/form-data" >
        <table class="mytable">
            <tr>
                <td>姓名</td>
                <td><input type="text" name="proUserName" value="${provider.proUserName}"/></td>
            </tr>
            <tr>
                <td>法人身份证</td>
                <td><input type="text" name="idCard" value="${provider.idCard}"/></td>
            </tr>
            <tr>
                <td>手机号</td>
                <td><input type="text" name="phone" value="${provider.phone}"/></td>
            </tr>
            <tr>
                <td>邮箱</td>
                <td><input type="text" name="email" value="${provider.email}"/></td>
            </tr>
            <tr>
                <td>公司名称</td>
                <td><input type="text" name="proName" value="${provider.proName}"/></td>
            </tr>
            <tr>
                <td>所在地</td>
                <td><input type="text" name="city" value="${provider.city}"/></td>
            </tr>
            <tr>
                <td>详细地址</td>
                <td><input type="text" name="address" value="${provider.address}"/></td>
            </tr>
            <tr>
                <td>经营范围</td>
                <td><input type="text" name="eor" value="${provider.eor}"/></td>
            </tr>
            <tr>
                <td>营业执照</td>
                <td><img src="${provider.blis}" style="width: 150px;height: 100px;" alt="营业执照"><input type="file" name="fileName"/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <span id="subForm">提交</span>
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