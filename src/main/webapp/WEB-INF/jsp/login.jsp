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

    <title>登陆</title>
</head>
<base href="<%=basePath%>">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet" href="./static/css/index.css">
<link rel="stylesheet" href="./static/css/demand.css">
<link rel="stylesheet" href="./static/css/programme.css">
<link rel="stylesheet" href="./static/css/login.css">
<script src="./static/js/jquery.min.js"></script>
<body>
<div class="wrap">
    <!-- 头部开始 -->

    <%@include file="./common/header.jsp"%>
    <!-- 头部结束 -->
    <!-- 导航开始 -->
    <%@include file="./common/navigation.jsp"%>
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

    <!-- 网站名称 开始 -->
    <div class="login_name">
        <div class="name_wrap">
            <span class="lgName">大威平台</span>
            <span class="lgNames">|</span>
            <span class="lgNamedes"><span>安全，真诚</span><span>专业，用心</span></span>
            <span class="lgName">欢迎登录</span>
        </div>
    </div>
    <!-- 网站名称 结束 -->

    <!-- 主题内容  开始 -->
    <main id="login">
        <div class="loginWrap">
            <div class="login_left">
                <h3>xx平台</h3>
                <p>接单外包权威平台</p>
                <p>专业、专心、负责、认真</p>
            </div>
            <div class="login_right">
                <div class="loginSelect">
                    <div>登录</div>
                    <div>注册</div>
                </div>



                <div>

                    <form action="/login" method="post">
                        <!-- 登陆 -->
                        <div class="usernameWrap">
                            <div class="username">
                            <span>
                              <img src="./static/imgs/login_1.png" alt="">
                            </span><input type="text" name="username" placeholder="用户名/手机号/邮箱">
                            </div>
                            <div class="userpwd">
                                <span><img src="./static/imgs/login_2.png" alt=""></span>
                                <input type="password" name="password" placeholder="密码长度为6-208-24位字符">
                                <span class="eye">
                                <img src="./static/imgs/login_3.png" alt="">
                            </span>
                            </div>
                            <div class="logindes">
                                <span>免费注册</span>
                                <a href="#">忘记密码？</a>
                            </div>
                            <div class="login_btn">
                                <%--<button type="button">登录</button>--%>
                                <input type="submit" value="登录" ></input>
                            </div>
                            <div class="remember">
                                <span><input id="rem" type="checkbox"><label for="rem">记住密码</label></span>
                                <span><input id="remSin" type="checkbox"><label for="remSin">自动登录</label></span>
                            </div>
                        </div>
                    </form>


                    <!-- 注册 -->
                    <div class="regWrap">
                        <form action="/register" method="post" id="registerForm">
                            <div class="regName">
                                <span>姓名</span>
                                <input type="text" name="username" class="regName" placeholder="3-20个字符">
                            </div>
                            <div class="regNum">
                                <span>手机号</span>
                                <input type="number" name="phoneNum" class="regName">
                            </div>
                            <div class="regQQ">
                                <span>QQ</span>
                                <input type="number" name="qqNum" class="regName">
                            </div>
                            <div class="regpwd">
                                <span>密码</span>
                                <input type="password" name="password" class="regName" placeholder="8-24个字符,不能是纯数字或字母">
                            </div>
                            <div class="regTpwd">
                                <span>确认密码</span>
                                <input type="password" name="password2" class="regName" placeholder="输入和上面一样的密码">
                            </div>
                            <button class="regBtn" type="button" onclick="formSubmit()">注册</button>
                        </form>
                    </div>


                </div>
            </div>
        </div>
    </main>
    <!-- 主题内容  结束 -->
    <!-- 底部开始 -->

  <%@include file="./common/footer.jsp"%>
    <!-- 底部结束 -->
</div>
</div>
</body>
<script>
    $('.loginSelect div').eq(0).attr('id', 'active');
    $('.login_right div.usernameWrap').eq(0).attr('id', 'activeWrap');
    $('.loginSelect div').click(function () {
        $(this).attr('id', 'active').siblings().removeAttr('id', 'active')
        var index = $(this).index();
        var regAndLog = $(this).parent().next().children().eq(index);
        regAndLog.show();
        regAndLog.siblings().hide()
    })
</script>
<
<script>
    function formSubmit(){
        var form = document.getElementById("registerForm");
        form.submit();
    }

</script>
</html>