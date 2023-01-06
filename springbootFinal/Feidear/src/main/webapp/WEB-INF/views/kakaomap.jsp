<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	
<title>Insert title here</title>
</head>
<body>
	<div id="map" style="height:400px;"></div>
</body>
</html>

<!-- KAKAOMAP API -->
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=71d64a6b0837e8b3cf891b3a070aef14"></script>
    <script>
        var container = document.getElementById('map');
        var options = {
            center: new kakao.maps.LatLng(33.450701, 126.570667),
            level: 3
        };
 
        var map = new kakao.maps.Map(container, options);
    </script>