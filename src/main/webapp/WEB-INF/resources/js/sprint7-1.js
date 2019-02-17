$.ajaxSetup({cache: false});
$(function () {
    ivLoader.setFun.pageReady();
});

var ivLoader = (function(){
    var setFun={
       pageReady: function () {
           setFun.getIVGrid();
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
                height: 550,
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

