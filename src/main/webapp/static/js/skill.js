//    为服务商添加技能
    $(function () {
        //初始化数组（存放本用户之前选中的技能）
        var data = [];
        //便利所有技能标签
        $('.div3 .p44 span').each(function () {
            //如果有已选中标签，放入数组
            if($(this).attr("check")=='true'){
                data.push($(this).attr("skill-id"))
            }
        })
        //修改数组数据
        updateArray(data);
        $('#comimed').click(data,function () {
            $.ajax({
                type: 'post',
                url: "/skill/addMySkill",
                data: {'skids':data.toString()},
                dataType:"json",
            }).success(function (e) {
                alert("添加成功");
            }).error(function () {
                alert("添加失败");
            });
        })
    })

    function updateArray(data) {
        $('.div3 .p44 span').click(function () {
            // 三木运算符
            // var isCheck =(($(this).attr("check"))=='false') ? ($(this).attr("check","true")): ($(this).attr("check","false"));
            var isCheck =(($(this).attr("check"))=='false') ? 'true':'false';
            $(this).attr("check",isCheck);
            if(($(this).attr("check"))=='false'){
                for(var i =0;i<data.length;i++){
                    if(data[i]==($(this).attr("skill-id"))){
                        data.splice(i,1);
                        updateCss();
                    }
                }
            }else {
                data.push($(this).attr("skill-id"))
                updateCss();
            }
        })
    }
    function updateCss() {
        $('.div3 .p44 span').each(function () {
            //如果有已选中标签，放入数组
            if($(this).attr("check")=='true'){
                $(this).css("background","#FF3737")
            }else {
                $(this).css("background","#FFF")
            }
        })
    }
