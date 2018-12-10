$(function () {
    $.ajax({
        type: 'post',
        url: "/demand/findProvinceById",
        data: {'id':-1},
        dataType:"json",
    }).success(function (data) {
        var str = "";
        for(var a = 0;a < data.length; a++){
            str+="<option value='"+data[a].areaId+"'>"+data[a].areaname+"</option>";
        };
        $("#provinceId").html(str);
    }).error(function () {
        alert("查询失败");
    });
})

    function cleanCtiys() {
        $("#cityId").empty();
        $("#districtId").empty();
    }
    function findCity(){
        // 市
        var pid =  $("#provinceId").val();
        $.ajax({
            type: 'post',
            url: "/demand/findProvinceById",
            data: {'id':pid},
            dataType:"json",
        }).success(function (data) {
            var str = "";
            for(var a = 0;a < data.length; a++){
                str+="<option value='"+data[a].areaId+"'>"+data[a].areaname+"</option>";
            };
            $("#cityId").html(str);
            $("#districtId").empty();
        }).error(function () {
            alert("查询失败");
        });
    }
    function findDistrict(){
        // 市
        var cid =  $("#cityId").val();
        $.ajax({
            type: 'post',
            url: "/demand/findProvinceById",
            data: {'id':cid},
            dataType:"json",
        }).success(function (data) {
            var str = "";
            for(var a = 0;a < data.length; a++){
                str+="<option value='"+data[a].areaId+"'>"+data[a].areaname+"</option>";
            };
            $("#districtId").html(str);
        }).error(function () {
            alert("查询失败");
        });
    }
    function saveDemand(demandStatus) {
        window.editor.sync();
        var dataParam =$('#saveDemand').serializeArray();
        var provinceId =$("#provinceId").val();
        var cityId =$("#cityId").val();
        var districtId =$("#districtId").val();
        dataParam.push({"name":"demandProvince","value":provinceId})
        dataParam.push({"name":"demandCity","value":cityId})
        dataParam.push({"name":"demandCounties","value":districtId})
        dataParam.push({"name":"demandStatus","value":demandStatus})
        $.ajax({
            type: 'post',
            url: "/demand/release",
            data: dataParam,
            dataType:"json",
        }).success(function (data) {
            if(data>0){
                alert("添加成功")
                window.location.href="/demand/showMyDemand";
            }
        }).error(function (data) {
            alert(data)
        });
    }
