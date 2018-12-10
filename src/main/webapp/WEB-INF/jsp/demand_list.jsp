<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="/static/css/index.css">
    <link rel="stylesheet" href="/static/css/demand.css">
    <link rel="stylesheet" href="/static/css/programme.css">
    <link rel="stylesheet" href="/static/css/login.css">
    <script src="/static/js/jquery.min.js"></script>
    <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">

    <%--<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">--%>
    <%--<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>--%>
    <%--<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>--%>
    <title>需求列表</title>
</head>
<body>
<div class="wrap">
    <!-- 头部开始 -->
    <jsp:include page="common/header.jsp" />
    <!-- 头部结束 -->
    <!-- 导航开始 -->
    <nav class="nav">
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
    </nav>
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
            <a href=""><span class="btn-span">全部</span></a>
            <a href=""><span class="btn-span">设计类</span></a>
            <a href=""><span class="btn-span btn-checked">开发类</span></a>
            <a href=""><span class="btn-span">UI类</span></a>
        </p>
        <p class="demand-cat">
            <span class="left-bar">应用领域:</span>
            <a href=""><span class="btn-span">全部</span></a>
            <a href=""><span class="btn-span btn-checked">商业零售</span></a>
            <a href=""><span class="btn-span">公共事业</span></a>
            <a href=""><span class="btn-span">石化行业</span></a>
            <a href=""><span class="btn-span">电力</span></a>
        </p>
        <p class="demand-cat">
            <span class="left-bar">所属地区:</span>
            <span id="province" class="btn-span">全国</span>
        </p>
        <div id="city" class="city-hidden">
            <a><span>北京</span></a>
            <a><span>北京</span></a>
            <a><span>北京</span></a>
            <a><span>北京</span></a>
            <a><span>北京</span></a>
        </div>

        <div id="list-content">
            <div class="list-item">
                <p>项目名称</p>
                <div style="float:left;">
                    <p>应用领域： 汽车电子</p>
                    <p>区域： 北京</p>
                </div>
                <div style="float:right;margin-right:30px;">
                    <span>已报名</span>
                </div>
                <div style="clear: both;"></div>

                <p><span>项目类型： UI设计</span> <span class="align-right">项目预算：10000-12000元</span></p>
                <p><span>发布时间： 2017-10-11</span><span class="align-right">截至时间：2018-12-15</span></p>
            </div>
            <div class="list-item">
                <p>项目名称</p>
                <p>应用领域： 汽车电子</p>
                <p>区域： 北京</p>
                <p>项目类型： UI设计</p>
                <p>发布时间： 2017-10-11</p>
            </div>
            <div class="list-item">
                <p>项目名称</p>
                <p>应用领域： 汽车电子</p>
                <p>区域： 北京</p>
                <p>项目类型： UI设计</p>
                <p>发布时间： 2017-10-11</p>
            </div>

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

        $('#province').click(function(){
            $('#city').toggleClass('city-hidden')
        });


    });
</script>




</html>

