$(function(){
    $('#selectArea').on('change',function(){
        //사용자 입력값 받아옴				
			let param= { idx : $(this).val()}
            $.ajax({
            type : 'get',
            url: './smartPage',
            data : param,
            success : function(result){
                alert(result);
                // console.log(param,' : ',result);
                for(row of result){
                    console.log(row)
                }
            },
            error : function(err){
                console.log(err);
                alert('입력되지 않았습니다.');
            }//end of error
            })//end of ajax

    })
})