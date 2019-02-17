$.ajaxSetup({cache: false});
$(function () {
    ivLoader.setFun.pageReady();
});

var ivLoader = (function(){
    var setFun={

       pageReady: function () {
           setFun.getLocaleDrop();
           setFun.getIVGrid();
       },

        getLocaleDrop: function () {
            $("#locale").kendoDropDownList({
                dataTextField: "locale_disp",
                dataValueField: "locale",
                dataSource: {data:[{locale:"en",locale_name:"en_US",locale_disp:"English"},{locale:"ja",locale_name:"ja_JP",locale_disp:"Japanese"},{locale:"zh",locale_name:"zh_CN",locale_disp:"Chinese"}]},
                index: 0,
                change: setFun.localeOnChange
            });
        },

        localeOnChange: function (e) {
            console.log(e);
        },

        getIVGrid: function () {
            $.ajax({
                type: "POST",
                url: "selectIVList" ,
                data: JSON.stringify({customer_id:null, user_id:null}),
                dataType: "json",
                contentType:"application/json;charset=UTF-8"
            }).done(function (resData) {
                setFun.setIVGrid(resData);
            });
        },

        setIVGrid: function (data) {
            $("#imageViewerGrid").kendoGrid({
                dataSource:{
                    data:data,
                    pageSize:8,
                    schema:{
                        model:{
                            id: "file_id",
                            fields: {
                                inst_id:{type: "number"},
                                inst_name:{type: "string"},
                                file_name:{type: "string"},
                                file_type:{type: "string"},
                                file_size:{type: "number"}
                            }
                        }
                    }
                },
                pageable: true,
                height: 400,
                columns:[{
                    field:"file_id",
                    title: ""
                },{

                },{

                },{

                },{

                },{

                }]
            });
        }

    };
    return {
        setFun:setFun
    }
})();

