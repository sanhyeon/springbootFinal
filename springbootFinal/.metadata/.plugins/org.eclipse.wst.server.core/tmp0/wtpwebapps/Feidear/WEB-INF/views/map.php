<!--  데이터베이스 불러오기-->
<?php
   $con=mysqli_connect("localhost", "유저", "패스워드", "DB이름") or die("MySQL 접속 실패");

   $sql = "SELECT * FROM DB이름";
 
   $ret = mysqli_query($con, $sql);
 
   $arr = array();
 
   while($row = mysqli_fetch_array($ret)){
       array_push($arr, [(double)$row['y'], (double)$row['x'] ,$row['aptname']]);    
} //배열 arr에 [36.~, 126.~, 아파트이름] 형태로 저장하였다.

//echo var_dump($arr); //배열에 잘 들어갔는지 확인하기위함

mysqli_close($con);

?>

<!DOCTYPE html>
<html>
    <head>
        <title>다중 마커와 다중 인포윈도우</title>
        <meta name="viewport" content="initial-scale=1.0,user-scalable=no"> 
        
        <style type="text/css">
        html { height: 100% } 
        body { height: 100%; margin: 0; padding: 0 }
        h1 { text-align : center}
        #map { width: 90%; height: 80%; border : solid blue ; margin-left:auto; margin-right:auto } 
        </style> 

</head>

        <script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=카카오api에서 발급받은 javascript 키"></script>
        <script type="text/javascript"> 
        window.onload = function() { 
            var position = new kakao.maps.LatLng(37.5737049, 126.9888481); // 지도의 중심     
            var map = new kakao.maps.Map(document.getElementById('map'), { 
                center: position,
                level: 9,
                mapTypeId: kakao.maps.MapTypeId.ROADMAP });
            var zoomControl = new kakao.maps.ZoomControl();
            map.addControl(zoomControl, kakao.maps.ControlPosition.RIGHT);
            var mapTypeControl = new kakao.maps.MapTypeControl();
            map.addControl(mapTypeControl, kakao.maps.ControlPosition.TOPRIGHT); // 다중 마커와 인포윈도우 표시
            
            var locations = <?php echo json_encode($arr); ?>;
            for(i = 0; i < locations.length; i++) {
                var marker = new kakao.maps.Marker({ 
                    position: new kakao.maps.LatLng(locations[i][0], locations[i][1])
                 });
                marker.setMap(map);
                kakao.maps.event.addListener(marker, 'click', (function(marker, i) { 
                    return function() { 
                        var infowindow = new kakao.maps.InfoWindow({
                            content: '<p style="margin:7px 22px 7px 12px;font:12px/1.5 sans-serif">' + locations[i][2] + '</p>',
                            removable : true
                            });
                            infowindow.open(map, marker);
                             } 
                             })(marker, i));
                            } }; 
                            </script>
                            
                            <body>
    <div id="map"></div>
</body></html>