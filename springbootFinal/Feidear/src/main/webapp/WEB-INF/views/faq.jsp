<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<%String pjName = "/Feidear";%>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Viaje - Travel, Tour Booking HTML5 Template</title>
    <!-- favicon -->
    <link rel=icon href="<%=pjName%>/resources/assets/images/favicon.png" sizes="20x20" type="image/png">

    <!-- Additional plugin css -->
    <link rel="stylesheet" href="<%=pjName%>/resources/assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=pjName%>/resources/assets/css/animate.css">
    <link rel="stylesheet" href="<%=pjName%>/resources/assets/css/magnific-popup.css">
    <link rel="stylesheet" href="<%=pjName%>/resources/assets/css/owl.carousel.min.css">
    <link rel="stylesheet" href="<%=pjName%>/resources/assets/css/slick.css">
    <link rel="stylesheet" href="<%=pjName%>/resources/assets/css/swiper.min.css">
    <link rel="stylesheet" href="<%=pjName%>/resources/assets/css/nice-select.css">
    <!-- icons -->
    <link rel="stylesheet" href="<%=pjName%>/resources/assets/css/font-awesome.min.css">
    <link rel="stylesheet" href="<%=pjName%>/resources/assets/css/themify-icons.css">
    <link rel="stylesheet" href="<%=pjName%>/resources/assets/css/line-awesome.min.css">
    <!-- main css -->
    <link rel="stylesheet" href="<%=pjName%>/resources/assets/css/style.css">
    <!-- responsive css -->
    <link rel="stylesheet" href="<%=pjName%>/resources/assets/css/responsive.css">

</head>
<body>

    <!-- preloader area start -->
    <div class="preloader" id="preloader">
        <div class="preloader-inner">
            <div class="spinner">
                <div class="dot1"></div>
                <div class="dot2"></div>
            </div>
        </div>
    </div>
    <!-- preloader area end -->

    <!-- //. sign up Popup -->
    <div class="signUp-popup login-register-popup" id="signUp-popup">
        <div class="login-register-popup-wrap">
            <div class="row no-gutters">
                <div class="col-lg-6">
                    <div class="thumb">
                        <img src="<%=pjName%>/resources/assets/images/others/signup.png" alt="img">
                    </div>
                </div>
                <div class="col-lg-6 align-self-center">
                    <div class="shape-thumb">
                        <img src="<%=pjName%>/resources/assets/images/others/signup-shape.png" alt="img">
                    </div>
                    <form class="login-form-wrap">
                        <h4 class="text-center">Sign Up</h4>
                        <div class="single-input-wrap style-two">
                            <input type="text" placeholder="Name">
                            <span class="single-input-title"><i class="fa fa-user"></i></span>
                        </div>
                        <div class="single-input-wrap style-two">
                            <input type="text" placeholder="Email">
                            <span class="single-input-title"><i class="fa fa-envelope"></i></span>
                        </div>
                        <div class="single-input-wrap style-two">
                            <input type="text" placeholder="Password">
                            <span class="single-input-title"><i class="fa fa-lock"></i></span>
                        </div>
                        <label class="checkbox">
                            <input type="checkbox">
                            <span>Remember me</span>
                        </label>
                        <div class="single-input-wrap style-two">
                            <button class="btn btn-yellow w-100">Sign Up</button>
                        </div>
                        <div class="sign-in-btn">I already have an account. <a href="#">Sign In</a></div> 
                        <div class="social-wrap">
                            <p>Or Continue With</p>
                            <ul class="social-icon">
                                <li>
                                    <a class="facebook" href="#" target="_blank"><i class="fa fa-facebook  "></i></a>
                                </li>
                                <li>
                                    <a class="twitter" href="#" target="_blank"><i class="fa fa-twitter  "></i></a>
                                </li>
                                <li>
                                    <a class="pinterest" href="#" target="_blank"><i class="fa fa-pinterest"></i></a>
                                </li>
                            </ul>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <!-- //. sign up Popup End -->

    <!-- navbar area start -->
    <nav class="navbar navbar-area navbar-expand-lg nav-style-01">
        <div class="container nav-container">
            <div class="responsive-mobile-menu">
                <div class="mobile-logo">
                    <a href="index">
                        <img src="<%=pjName%>/resources/assets/images/sticky-logo.png" alt="logo">
                    </a>
                </div>
                <button class="navbar-toggler float-right" type="button" data-toggle="collapse" data-target="#tp_main_menu" 
                    aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggle-icon">
                        <span class="line"></span>
                        <span class="line"></span>
                        <span class="line"></span>
                    </span>
                </button>
                <div class="nav-right-content">
                    <ul class="pl-0">
                        <li class="top-bar-btn-booking">
                            <a class="btn btn-yellow" href="tour-details">Book Now <i class="fa fa-paper-plane"></i></a>
                        </li>

                        <li class="notification">
                            <a class="signUp-btn" href="#">
                                <i class="fa fa-user-o"></i>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="collapse navbar-collapse" id="tp_main_menu">
                <div class="logo-wrapper desktop-logo">
                    <a href="index" class="main-logo">
                        <img src="<%=pjName%>/resources/assets/images/logo.png" alt="logo">
                    </a>
                    <a href="index" class="sticky-logo">
                        <img src="<%=pjName%>/resources/assets/images/sticky-logo.png" alt="logo">
                    </a>
                </div>
                <ul class="navbar-nav">
                    <li>
                        <a href="tour-list">축제</a>
                    </li>
                    <li class="menu-item-has-children">
                        <a href="#">커뮤니티</a>
                        <ul class="sub-menu">
                            <li><a href="blog-details02">축제일기</a></li>
                            <li><a href="blog02">매거진</a></li>
                            <li><a href="blog-details">매거진 상세</a></li>
                        </ul>
                    </li>
                    <li class="menu-item-has-children">
                        <a href="#">이벤트</a>
                        <ul class="sub-menu">
                            <li><a href="blog03">제휴 이벤트</a></li>
                      		<li><a href="destination-details">서포터즈</a></li>
                        </ul>
                    </li>
                    <li class="menu-item-has-children">
                        <a href="#">스마트 PAGE</a>
                        <ul class="sub-menu">
                            <li><a href="user-profile">MY 여행성향 분석</a></li>
                      		<li><a href="user-profile">실시간 날씨</a></li>
                      		<li><a href="user-profile">혼잡도 체크</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="faq">FAQ</a>
                    </li>
                    <li>
                        <a href="contact">1:1문의</a>
                    </li>
                </ul>
            </div>
            <div class="nav-right-content">
                <ul>
                    <li><a href="user-profile">MY PAGE</a>
                    </li>
                    <li class="pr-0">
                        <a class="btn btn-yellow" href="tour-details">축제 캘린더<i class="fa fa-paper-plane"></i></a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <!-- navbar area end -->


    <!-- breadcrumb area start -->
    <div class="breadcrumb-area jarallax" style="background-image:url(<%=pjName%>/resources/assets/images/bg/1.png);">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="breadcrumb-inner">
                        <h1 class="page-title">FAQs</h1>
                        <ul class="page-list">
                            <li><a href="index">Home</a></li>
                            <li>FAQs</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- breadcrumb area End -->

<!DOCTYPE html>
<html lang="ko">
<head>
    <script
        src="https://code.jquery.com/jquery-1.12.4.min.js"
        integrity="sha256-ZosEbRLbNQzLpnKIkEdrPv7lOy9C27hHQ+Xp8a4MxAQ="
        crossorigin="anonymous"></script>
    <script type="text/javascript" src="https://openapi.map.naver.com/openapi/v3/maps.js?clientId=[YOUR_CLINET_ID]&submodules=panorama,geocoder,drawing,visualization&callback=startMap"></script>
</head>
<body>
<h1>GPX 데이터 레이어 표시하기</h1>
<div id="wrap" class="section">
    <h2>GPX 데이터 레이어 표시하기</h2>
    <p>GPX 데이터를 지도에 표시하는 예제입니다. 이 예제는 jQuery 구문을 포함하고 있습니다.</p>
    <div id="map" style="width:100%;height:600px;"></div>
</div>
<script id="code">

    var map;

    function startMap() {
        console.log('startMap');

        map = new naver.maps.Map(document.getElementById('map'), {
            zoom: 5,
            mapTypeId: 'normal',
            center: new naver.maps.LatLng(38.1361378, 128.4021238)
        });

        $.ajax({
            url: 'http://www.pbq.co.kr/kayak.gpx',<!DOCTYPE html>
        <html lang="ko">
            <head>
            <script
        src="https://code.jquery.com/jquery-1.12.4.min.js"
        integrity="sha256-ZosEbRLbNQzLpnKIkEdrPv7lOy9C27hHQ+Xp8a4MxAQ="
        crossorigin="anonymous"></script>
<script type="text/javascript" src="https://openapi.map.naver.com/openapi/v3/maps.js?clientId=[YOUR_CLINET_ID]&submodules=panorama,geocoder,drawing,visualization&callback=startMap"></script>
</head>
<body>
<h1>GPX 데이터 레이어 표시하기</h1>
<div id="wrap" class="section">
    <h2>GPX 데이터 레이어 표시하기</h2>
    <p>GPX 데이터를 지도에 표시하는 예제입니다. 이 예제는 jQuery 구문을 포함하고 있습니다.</p>
    <div id="map" style="width:100%;height:600px;"></div>
</div>
<script id="code">

    var map;

    function startMap() {
        console.log('startMap');

        map = new naver.maps.Map(document.getElementById('map'), {
            zoom: 5,
            mapTypeId: 'normal',
            center: new naver.maps.LatLng(38.1361378, 128.4021238)
        });

        $.ajax({
            url: 'http://www.pbq.co.kr/kayak.gpx',
            dataType: 'xml',
            success: startDataLayer
        });
    }

    function startDataLayer(xmlDoc) {
        map.data.addGpx(xmlDoc);
    }

</script>
</body>
</html>

dataType: 'xml',
            success: startDataLayer
        });
    }

    function startDataLayer(xmlDoc) {
        map.data.addGpx(xmlDoc);
    }

</script>
</body>
</html>

    
    <!-- footer area start -->
    <footer class="footer-area" style="background-image: url(<%=pjName%>/resources/assets/images/bg/2.png);">
        <div class="container">
            <div class="row">
                <div class="col-lg-4 col-md-6">
                    <div class="footer-widget widget">
                        <div class="about_us_widget">
                            <a href="index" class="footer-logo"> 
                                <img src="<%=pjName%>/resources/assets/images/logo.png" alt="footer logo">
                            </a>
                            <p>We believe brand interaction is key in commu- nication. Real innovations and a positive customer experience are the heart of successful communication.</p>
                            <ul class="social-icon">
                                <li>
                                    <a class="facebook" href="#" target="_blank"><i class="fa fa-facebook  "></i></a>
                                </li>
                                <li>
                                    <a class="twitter" href="#" target="_blank"><i class="fa fa-twitter  "></i></a>
                                </li>
                                <li>
                                    <a class="pinterest" href="#" target="_blank"><i class="fa fa-instagram"></i></a>
                                </li>
                            </ul>
                       </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6">
                    <div class="footer-widget widget ">
                        <div class="widget-contact">
                            <h4 class="widget-title">Contact us</h4>
                            <p>
                                <i class="fa fa-map-marker"></i> 
                                <span>Manama Tower, Badda Link Road, Badda Dhaka, Bangladesh</span>
                            </p>
                            <p class="location"> 
                                <i class="fa fa-envelope-o"></i>
                                <span>travelpoint@gmail.com</span>
                            </p>
                            <p class="telephone">
                                <i class="fa fa-phone base-color"></i> 
                                <span>
                                    +088 012121240
                                </span>
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-2 col-md-6">
                    <div class="footer-widget widget">
                        <h4 class="widget-title">Quick Link</h4>
                        <ul class="widget_nav_menu">
                            <li><a href="#">Home</a></li>
                            <li><a href="#">About Us</a></li>
                            <li><a href="#">Destination</a></li>
                            <li><a href="#">Tours</a></li>
                            <li><a href="#">Blog</a></li>
                            <li><a href="#">Contact</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6">
                    <div class="footer-widget widget">
                        <h4 class="widget-title">Instagram Gallery</h4>
                        <ul class="widget-instagram-feed">
                            <li><a href="#"><img src="<%=pjName%>/resources/assets/images/instagram/1.png" alt="img"></a></li>
                            <li><a href="#"><img src="<%=pjName%>/resources/assets/images/instagram/2.png" alt="img"></a></li>
                            <li><a href="#"><img src="<%=pjName%>/resources/assets/images/instagram/3.png" alt="img"></a></li>
                            <li><a href="#"><img src="<%=pjName%>/resources/assets/images/instagram/4.png" alt="img"></a></li>
                            <li><a href="#"><img src="<%=pjName%>/resources/assets/images/instagram/5.png" alt="img"></a></li>
                            <li><a href="#"><img src="<%=pjName%>/resources/assets/images/instagram/6.png" alt="img"></a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div class="copyright-inner">
            <div class="copyright-text">
                &copy; Viaje 2019 All rights reserved. Powered with <a href="http://zwin.io/" target="_blank"><i class="fa fa-heart"></i> </a> by <a href="http://zwin.io/" target="_blank"><span>Zwin.</span></a>
            </div>
        </div>
    </footer>
    <!-- footer area end -->

    <!-- back to top area start -->
    <div class="back-to-top">
        <span class="back-top"><i class="fa fa-angle-up"></i></span>
    </div>
    <!-- back to top area end -->


    <!-- Additional plugin js -->
    <script src="<%=pjName%>/resources/assets/js/jquery-2.2.4.min.js"></script>
    <script src="<%=pjName%>/resources/assets/js/popper.min.js"></script>
    <script src="<%=pjName%>/resources/assets/js/bootstrap.min.js"></script>
    <script src="<%=pjName%>/resources/assets/js/jquery.magnific-popup.js"></script>
    <script src="<%=pjName%>/resources/assets/js/owl.carousel.min.js"></script>
    <script src="<%=pjName%>/resources/assets/js/wow.min.js"></script>
    <script src="<%=pjName%>/resources/assets/js/slick.js"></script>
    <script src="<%=pjName%>/resources/assets/js/waypoints.min.js"></script>
    <script src="<%=pjName%>/resources/assets/js/jquery.counterup.min.js"></script>
    <script src="<%=pjName%>/resources/assets/js/imagesloaded.pkgd.min.js"></script>
    <script src="<%=pjName%>/resources/assets/js/isotope.pkgd.min.js"></script>
    <script src="<%=pjName%>/resources/assets/js/swiper.min.js"></script>
    <script src="<%=pjName%>/resources/assets/js/jquery.nice-select.min.js"></script>
    <script src="<%=pjName%>/resources/assets/js/jquery-ui.min.js"></script>
    <script src="<%=pjName%>/resources/assets/js/jarallax.min.js"></script>

    <!-- main js -->
    <script src="<%=pjName%>/resources/assets/js/main.js"></script>

</body>
</html>