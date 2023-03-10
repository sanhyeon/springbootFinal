<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Feidear</title>
    <!-- favicon -->
    <link rel=icon href="/images/favicon.png" sizes="20x20" type="image/png">

    <!-- Additional plugin css -->
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/animate.css">
    <link rel="stylesheet" href="/css/magnific-popup.css">
    <link rel="stylesheet" href="/css/owl.carousel.min.css">
    <link rel="stylesheet" href="/css/slick.css">
    <link rel="stylesheet" href="/css/swiper.min.css">
    <link rel="stylesheet" href="/css/nice-select.css">
    <link rel="stylesheet" href="/css/jquery-ui.min.css">
    <!-- icons -->
    <link rel="stylesheet" href="/css/font-awesome.min.css">
    <link rel="stylesheet" href="/css/themify-icons.css">
    <link rel="stylesheet" href="/css/line-awesome.min.css">
    <!-- main css -->
    <link rel="stylesheet" href="/css/style.css">
    <!-- responsive css -->
    <link rel="stylesheet" href="/css/responsive.css">

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

 <div class="body-overlay" id="body-overlay"></div>

    <!-- //. login Popup -->
    <div class="signUp-popup login-register-popup" id="signUp-popup">
        <div class="login-register-popup-wrap">
            <div class="row no-gutters">
                <div class="col-lg-6">
                    <div class="thumb">
                        <img src="/images/others/signup.png" alt="img">
                    </div>
                </div>
                <div class="col-lg-6 align-self-center">
                    <div class="shape-thumb">
                        <img src="/images/others/signup-shape.png" alt="img">
                    </div>
                    <form class="login-form-wrap">
                        <h4 class="text-center">Log In</h4>
                        <div class="single-input-wrap style-two">
                            <input type="text" placeholder="ID">
                            <span class="single-input-title"><i class="fa fa-user"></i></span>
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
                            <button class="btn btn-yellow w-100">?????????</button>
                        </div>
                        <div class="sign-in-btn">???????????? ????????? ????????? ??? <a href="/sign-up">????????????</a></div> 
                        <div class="social-wrap">
                            <p>Or Continue With</p>
                            <ul class="social-icon">
                                <li>
                                    <a class="facebook" href="/#" target="_blank"><i class="fa fa-facebook  "></i></a>
                                </li>
                                <li>
                                    <a class="twitter" href="/#" target="_blank"><i class="fa fa-twitter  "></i></a>
                                </li>
                            </ul>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <!-- //. login Popup End -->

    <!-- navbar area start -->
    <div class="top-navbar">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 topbar-contact-wrap">
                    <div class="topbar-contact">
                        <i class="fa fa-phone"></i>
                        <span class="title">Support :</span>
                        <span class="number">02 1234 5678</span>
                    </div>
                    <ul class="social-icon">
                        <li>
                            <a class="facebook" href="/#" target="_blank"><i class="fa fa-facebook  "></i></a>
                        </li>
                        <li>
                            <a class="twitter" href="/#" target="_blank"><i class="fa fa-twitter  "></i></a>
                        </li>
                        <li>
                            <a class="pinterest" href="/#" target="_blank"><i class="fa fa-instagram"></i></a>
                        </li>
                    </ul>
                </div>
                <div class="col-lg-6">
                    <div class="nav-right-content float-right">
                        <ul class="pl-0">


                            <li class="notification">
                                <a class="signUp-btn" href="/#">
                                    <i class="fa fa-user-o"></i>
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <nav class="navbar navbar-area navbar-expand-lg nav-style-03">
        <div class="container nav-container">
            <div class="responsive-mobile-menu">
                <div class="mobile-logo">
                    <a href="/index">
                        <img src="/images/sticky-logo.png" alt="logo">
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
                            <a class="btn btn-yellow" href="/tour-details">Book Now <i class="fa fa-paper-plane"></i></a>
                        </li>

                        <li class="notification">
                            <a class="signUp-btn" href="/#">
                                <i class="fa fa-user-o"></i>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="collapse navbar-collapse" id="tp_main_menu">
                <div class="logo-wrapper desktop-logo">
                    <a href="/index" class="main-logo">
                        <img src="/images/logo.png" alt="logo">
                    </a>
                    <a href="/index" class="sticky-logo">
                        <img src="/images/sticky-logo.png" alt="logo">
                    </a>
                </div>
                <ul class="navbar-nav">
                    <li class="menu-item-has-children">
                        <a>?????? ????????????</a>
                        <ul class="sub-menu">
                            <li><a href="/viewFestivalList">?????? ??????</a></li>
                            <li><a href="#">?????? ??????</a></li>
                        </ul>
                    </li>
                    <li class="menu-item-has-children">
                        <a>????????????</a>
                        <ul class="sub-menu">
                            <li><a href="/reviews/review-list">?????? ??????</a></li>
                            <li><a href="/magazine">?????????</a></li>
                        </ul>
                    </li>
                    <li class="menu-item-has-children">
                        <a>?????????</a>
                        <ul class="sub-menu">
                            <li><a href="/event">?????? ?????????</a></li>
                      		<li><a href="/supporters">????????????</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="/smart-page">????????? ?????????</a>
                    </li>
                    <li class="menu-item-has-children">
                        <a>????????????</a>
                        <ul class="sub-menu">
                            <li><a href="/faq">FAQ</a></li>
                            <li><a href="/qna">1:1 ??????</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
            <div class="nav-right-content">
                <ul>
                    <li><a href="/user/getUser">MY PAGE</a>
                    </li>
                    <li class="pr-0">
                        <a class="btn btn-yellow" href="/calendar">?????? ?????????<i class="fa fa-paper-plane"></i></a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <!-- navbar area end -->