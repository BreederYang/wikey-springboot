<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>需求列表</title>
</head>
<base href="<%=basePath%>">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet" href="/static/css/index.css">
<link rel="stylesheet" href="/static/css/demand.css">
<link rel="stylesheet" href="/static/css/programme.css">
<link rel="stylesheet" href="/static/css/login.css">
<link rel="stylesheet" href="/static/css/demand-list.css">
<script src="/static/js/jquery.min.js"></script>
<link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">

<%--<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">--%>
<%--<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>--%>
<%--<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>--%>

<body>
<div class="wrap">
    <!-- 头部开始 -->
    <jsp:include page="common/header.jsp" />
    <!-- 头部结束 -->
    <!-- 导航开始 -->
    <jsp:include page="common/navigation.jsp"/>
    <!-- 导航结束 -->
    <!-- 当前位置 开始 -->
    <div class="position programme_position">
        <div class="position_wrap">
            <!-- <div> -->
            <span>当前位置：</span><a href="index.html">首页></a><a href="#">我的需求></a><a href="#">已报名需求></a><a href="#">报名的服务商</a>
            <!-- </div> -->
        </div>
    </div>
    <!-- 当前位置 结束 -->


    <!-- 网站名称 结束 -->

    <!-- 主题内容  开始 -->
    <main id="main">

        <p class="demand-cat">
            <span class="left-bar">任务分类:</span>
            <c:forEach items="${taskList}" var="ta" >
            <a href="/demand/demandList?taskid=${ta.id}&application=${appid}">
                <span <c:if test="${ta.id == taskid}">class="btn-span btn-checked"</c:if>>${ta.task}</span></a>
            </c:forEach>
        </p>
        <p class="demand-cat">
            <span class="left-bar">应用领域:</span>
            <c:forEach items="${appList}" var="app" >
                <a href="/demand/demandList?application=${app.id}&taskid=${taskid}">
                    <span <c:if test="${app.id ==appid }">class="btn-span btn-checked"</c:if>>${app.task}</span></a>
            </c:forEach>
        </p>
        <p class="demand-cat">
            <span class="left-bar">所属地区:</span>
            <span id="provinces" class="btn-span">全国</span>
            <span id="citys" class="btn-span">城市</span>
        </p>

        <div id="province" class="city-hidden">
            <c:forEach items="${provinceList}" var="province" >
                <a class="demand-cat" href="/demand/demandList?cityId=${province.areaId}&taskid=${taskid}&application=${appid}">
                    <span>${fn:substring(province.areaname,0,2)}</span></a>
            </c:forEach>
        </div>
        <div id="city" class="city-hidden">
            <c:forEach items="${citysList}" var="city" >
                <a class="left-city" href="/demand/demandList?cityId=${city.areaId}&taskid=${taskid}&application=${appid}">
                    <span>${city.areaname}</span></a>
            </c:forEach>
        </div>

        <div id="list-content">
            <c:forEach items="${demandlist}" var="demand" >
                <div class="list-item">
                    <p>${demand.demandName}</p>
                    <div style="float:left;">
                        <p>应用领域：
                            <c:forEach items="${appList}" var="ta1" >
                                <c:if test="${ta1.id== demand.application}">${ta1.task}</c:if>
                            </c:forEach>
                        </p>
                        <p>区域：
                            <c:forEach var="provinceList" items="pl">
                                <c:if test="${pl.areaId == demand.demandProvince}">${pl.areaname}</c:if>
                            </c:forEach>
                        </p>
                    </div>
                    <div style="float:right;margin-right:30px;">
                        <span>
                            <c:choose>
                                <c:when test="${demand.demandStatus == 0}">草稿箱</c:when>
                                <c:when test="${demand.demandStatus == 1}">已发布</c:when>
                                <c:when test="${demand.demandStatus == 2}">进行中</c:when>
                                <c:when test="${demand.demandStatus == 3}">点评中</c:when>
                                <c:when test="${demand.demandStatus == 4}">已完成</c:when>
                            </c:choose>
                        </span>
                    </div>
                    <div style="clear: both;"></div>

                    <p><span>项目类型：
                    <c:forEach items="${taskList}" var="ta" >
                        <c:if test="${ta.id== demand.demandType}">${ta.task}</c:if>
                    </c:forEach>
                    </span> <span class="align-right">项目预算：${demand.demandBudget}</span></p>
                    <p><span>发布时间： ${demand.createTime}</span><span class="align-right">截至时间：${demand.cutTime}</span></p>
                </div>
            </c:forEach>
        </div>
    </main>

    <!-- 主题内容  结束 -->

    <!-- 底部开始 -->
    <jsp:include page="common/footer.jsp" />
    <!-- 底部结束 -->
</div>
</div>
</body>

<script>
    $(document).ready(function(){
        $('.btn-span').click(function(){
            console.log($(this).attr("data-id"))
        });

        $('#provinces').click(function(){
            $('#province').toggleClass('city-hidden')
        });
        $('#citys').click(function(){
            $('#city').toggleClass('city-hidden')
        });

    });
</script>
</html>
