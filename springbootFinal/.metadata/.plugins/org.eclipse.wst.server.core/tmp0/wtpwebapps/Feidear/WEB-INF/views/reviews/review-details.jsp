<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%String pjName = "/Feidear";%>
 	
 	<!-- header -->
	<jsp:include page="header.jsp"></jsp:include>
	
    <!-- //. sign up Popup -->
    <div class="signUp-popup login-register-popup" id="signUp-popup">
        <div class="login-register-popup-wrap">
            <div class="row no-gutters">
                <div class="col-lg-6">
                    <div class="thumb">
                        <img src="../images/others/signup.png" alt="img">
                    </div>
                </div>
                <div class="col-lg-6 align-self-center">
                    <div class="shape-thumb">
                        <img src="../images/others/signup-shape.png" alt="img">
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

    <!-- breadcrumb area start -->
    <div class="breadcrumb-area style-three jarallax" style="background-image:url(../images/bg/1.png);">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="breadcrumb-inner">
                        <h1 class="page-title">축제 일기 글 제목 불러와야지</h1>
                        <ul class="page-list">
                            <li><a href="index">Home</a></li>
                            <li>리뷰 게시판 상세보기입니다</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- breadcrumb area End -->

    <!-- blog area start -->
    <div class="blog-details-area pd-top-120">
        <div class="container">
            <div class="row">
                <div class="col-lg-8">
                    <div class="single-blog mb-0">
                        <div class="thumb">
                            <img src="../images/blog-details/1.png" alt="blog">
                        </div>
                        <div class="single-blog-details">
                            <p class="date mb-0">2023. 01. 03. 화요일</p>
                            <h3 class="title">리뷰 제목</h3>
                            <p class="content mb-0">리뷰 내용 어쩌구 저쩌구 리뷰 내용 어쩌구 저쩌구 리뷰 내용 어쩌구 저쩌구 리뷰 내용 어쩌구 저쩌구 리뷰 내용 어쩌구 저쩌구 </p>
                        </div>
                    </div>
                    <!-- details-blockquote-start -->
                    <blockquote class="blockquote tp-blockquote bg-dark-blue">
                      <p class="mb-0">인용 문구 어쩌구 저쩌구 인용 문구 어쩌구 저쩌구 인용 문구 어쩌구 저쩌구 인용 문구 어쩌구 저쩌구 </p>
                    </blockquote>
                    <!-- details-blockquote-end -->
                    <p>리뷰 내용 어쩌구 저쩌구 리뷰 내용 어쩌구 저쩌구 리뷰 내용 어쩌구 저쩌구 리뷰 내용 어쩌구 저쩌구 리뷰 내용 어쩌구 저쩌구 </p>
                    <h4 class="single-page-small-title mt-5">여행 사진 보여드리겠습니다 어쩌구 저쩌구 짜잔</h4>

                    <!-- details-gallery-start -->
                    <div class="gallery-area">
                        <div class="containerss">
                            <div class="gallery-filter-area row custom-gutter">
                                <div class="gallery-sizer col-1"></div>
                                <!-- gallery-item -->
                                <div class="tp-gallery-item col-md-4 col-sm-6 mb-10">
                                    <div class="tp-gallery-item-img">
                                        <img src="../images/blog-details/2.png" alt="image">
                                    </div>
                                </div>
                                <!-- gallery-item -->
                                <div class="tp-gallery-item col-md-4 col-sm-6">
                                    <div class="tp-gallery-item-img">
                                        <img src="../images/blog-details/3.png" alt="image">
                                    </div>
                                </div>
                                <!-- gallery-item -->
                                <div class="tp-gallery-item col-md-4 col-sm-6">
                                    <div class="tp-gallery-item-img">
                                        <img src="../images/blog-details/4.png" alt="image">
                                    </div>
                                </div>
                                <!-- gallery-item -->
                                <div class="tp-gallery-item col-md-4 col-sm-6">
                                    <div class="tp-gallery-item-img">
                                        <img src="../images/blog-details/5.png" alt="image">
                                    </div>
                                </div>
                                <!-- gallery-item -->
                                <div class="tp-gallery-item col-md-4 col-sm-6">
                                    <div class="tp-gallery-item-img">
                                        <img src="../images/blog-details/6.png" alt="image">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- details-gallery-end -->
                    <p>리뷰 내용 어쩌구 저쩌구 리뷰 내용 어쩌구 저쩌구 리뷰 내용 어쩌구 저쩌구 리뷰 내용 어쩌구 저쩌구 리뷰 내용 어쩌구 저쩌구 111</p>
                    <!-- details-video-start -->
                    <h4 class="single-page-small-title mt-5">이게 동영상이란다</h4>
                    <div class="video-popup-wrap style-two">
                        <div class="thumb">
                            <img src="../images/blog-details/7.png" alt="video">
                        </div>
                        <div class="video-popup-btn">
                            <a href="https://www.youtube.com/watch?v=c7XEhXZ_rsk" class="video-play-btn mfp-iframe"><i class="fa fa-play"></i></a>
                        </div>
                    </div>
                    <!-- details-video-end -->
                    <p>나는 동영상 아래 설명이야 히히</p>
                    <p>난 동영상 아래 설명 아래 설명이야 히히힛</p>
                    <div class="row tag-share-area">
                        <div class="col-lg-6">
                            <span class="mr-2">공유 및 찜:</span>
                            <ul class="social-icon style-two">
                                <li>
                                    <a class="facebook" href="#"><i class="fa fa-facebook"></i></a>
                                </li>
                                <li>
                                    <a class="twitter" href="#"><i class="fa fa-twitter"></i></a>
                                </li>
                                <li>
                                    <a class="pinterest" href="#"><i class="fa fa-instagram"></i></a>
                                </li>
                                <li>
                                    <a class="linkedin" href="#"><i class="fa fa-linkedin"></i></a>
                                </li>
                                <li>
                                    <a class="linkedin" href="#"><i class="fa fa-heart"></i></a>
                                </li>
                            </ul>
                        </div>
                        <div class="col-xl-5 col-lg-6 offset-xl-1">
                            <div class="single-blog-post-tags d-flex">
                                <span class="all-tags-title">관련 태그 :</span>
                                <div class="all-tags">
                                    <a href="#">태그 1</a>
                                    <a href="#">태그 2</a>
                                    <a href="#">태그 3</a>
                                    <a href="#">Discover</a>
                                    <a href="#">Travel</a>
                                    <a href="#">Asia</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <nav class="navigation post-navigation single-post-navigation">
                        <div class="nav-links tp-control-nav">
                            <div class="row">
                                <div class="col-xl-5 col-lg-6 col-6 ">
                                    <div class="nav-previous w-100">
                                        <a href="#">
                                            <span class="slick-arrow float-left"><i class="la la-long-arrow-left"></i></span>
                                            <span class="nav-post-text pl-2 float-left">이전 리뷰</span>
                                            <h4 class="float-left">어디 갔다 왔게? 히히</h4>
                                        </a> 
                                    </div>
                                </div>
                                <div class="col-xl-5 col-lg-6 col-6  offset-xl-2">
                                    <div class="nav-next w-100">
                                        <a href="#">
                                            <span class="pr-2 nav-post-text">다음 리뷰</span>
                                            <span class="slick-arrow float-right"><i class="la la-long-arrow-right"></i></span>
                                            <h4 class="float-right">안 알랴줌 ㅋㅋㅋㅋ</h4>
                                        </a> 
                                    </div>
                                </div>
                            </div>
                        </div>
                    </nav>
                    <!-- author-area-start -->
                    <div class="author-area media">
                        <div class="media-left">
                            <img src="../images/blog-details/8.png" alt="img">
                        </div>
                        <div class="media-body">
                            <h4>리뷰 작성자 정보</h4>
                            <h7><b>리뷰 작성자</b>아이디 </h7>
                            <p>리뷰 작성자 소개 어쩌구 저쩌구 리뷰 작성자 소개 어쩌구 저쩌구 리뷰 작성자 소개 어쩌구 저쩌구</p>
                            <ul class="social-icon style-three">
                                <li>
                                    <a class="facebook" href="#"><i class="fa fa-facebook"></i></a>
                                </li>
                                <li>
                                    <a class="twitter" href="#"><i class="fa fa-twitter"></i></a>
                                </li>
                                <li>
                                    <a class="pinterest" href="#"><i class="fa fa-instagram"></i></a>
                                </li>
                                <li>
                                    <a class="linkedin" href="#"><i class="fa fa-linkedin"></i></a>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <!-- author-area-end -->
                    <!-- comments-area-start -->
                    <div class="comments-area">
                        <h4 class="comments-title">댓 글</h4>
                        <ul class="comment-list">
                            <li>
                                <div class="single-comment-wrap">
                                    <div class="thumb">
                                        <img src="../images/blog-details/9.png" alt="img">
                                    </div>
                                    <div class="content">
                                        <h4 class="title">댓글 작성자 아이디</h4>
                                        <span class="date"> 2023. 01. 03. </span>
                                        <p>댓글 내용 어쩌구 저쩌구 댓글 내용 어쩌구 저쩌구 댓글 내용 어쩌구 저쩌구 댓글 내용 어쩌구 저쩌구 댓글 내용 어쩌구 저쩌구</p>
                                        <a href="#" class="reply btn btn-yellow"><span><i class="fa fa-reply"></i>답글 달기</span></a>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <ul class="children">
                                    <li >
                                        <div class="single-comment-wrap">
                                            <div class="thumb">
                                                <img src="../images/blog-details/10.png" alt="img">
                                            </div>
                                            <div class="content">
                                                <h4 class="title">Laurie</h4>
                                                <span class="date">17 SEP 2019</span>
                                                <p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren</p>
                                                <a href="#" class="reply btn btn-yellow"><span><i class="fa fa-reply"></i>Reply</span></a>
                                            </div>
                                        </div>
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <div class="single-comment-wrap">
                                    <div class="thumb">
                                        <img src="../images/blog-details/11.png" alt="img">
                                    </div>
                                    <div class="content">
                                        <h4 class="title">Eliza Jordan</h4>
                                        <span class="date">17 SEP 2019</span>
                                        <p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr</p>
                                        <a href="#" class="reply btn btn-yellow"><span><i class="fa fa-reply"></i>Reply</span></a>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>
                    <!-- comments-area-end -->
                    <!-- blog-comment-area start -->
                    <div class="blog-comment-area">
                        <form class="tp-form-wrap bg-gray tp-form-wrap-one">
                            <h4 class="single-page-small-title">댓글 작성하기</h4>
                            <div class="row">
                                <div class="col-lg-6 col-md-6">
                                    <label class="single-input-wrap">
                                        <span class="single-input-title">아이디</span>
                                        <input type="text">
                                    </label>
                                </div>
                                <div class="col-lg-12">
                                    <label class="single-input-wrap">
                                        <span class="single-input-title">댓글 내용</span>
                                        <textarea></textarea>
                                    </label>
                                </div>
                                <div class="col-12">
                                    <button class="btn btn-yellow" href="#" type="button">저 장</button>
                                </div>
                            </div>
                        </form>
                    </div>
                    <!-- blog-comment-area start -->
                </div>
                <div class="col-lg-4">
                    <aside class="sidebar-area sidebar-area-4">
                        <div class="widget widget_search bg-none pd-none">
                        	<form class="write-form">
                                <div class="form-group">
                                  <button class="submit-btn" type="submit"><a href="/reviews/review-write">나의 일기 쓰러 가기 <img src="../images/pencil_24.png" ></button>
                                </div>
                            </form></br>
                        </div>
                        <div class="widget widget_categories">
                            <h2 class="widget-title">인 기 글</h2>
                            <div>
	                            <ul>
	                                <li><a href="#">인기짱1</a></li>	<!-- 오른쪽에 조회수 같이 띄우고 싶었는데 안되네요? -->
	                                <li><a href="#">인기짱2</a></li>
	                                <li><a href="#">인기짱3</a></li>
	                                <li><a href="#">Design Studio</a></li>
	                                <li><a href="#">Business Studio</a></li>
	                                <li><a href="#">Product Showcase</a></li>
	                            </ul>
                        	</div>
                        </div>
                        <div class="widget widget_tag_cloud">
                            <h2 class="widget-title">태 그</h2>
                            <div class="tagcloud">
                                <a href="#">겨 울</a>
                                <a href="#">눈 꽃</a>
                                <a href="#">불 빛</a>
                                <a href="#">새 해</a>
                                <a href="#">힘 내 자</a>
                            </div>
                        </div>
                        <!-- 광고 배너 위치  -->
                            <div class="widget widget_tag_cloud">
	                            <h2 class="widget-title">광고 배너</h2>
	                           <a href="#"><img src="../images/others/01.png" alt="img"></a>
                            </div>
                       </div>
                    </aside>
                </div>
            </div>
        </div>
    </div>
    <!-- blog area End -->
    
<!-- newslatter area Start ( 공백용 ) -->
<div class="newslatter-area pd-top-120">
    <div class="container">
        <div class="newslatter-area-wrap border-tp-solid">
        </div>
    </div>
</div>
<!-- newslatter area End -->
    
    <!-- footer -->
    <jsp:include page="footer.jsp"></jsp:include>

    <!-- Additional plugin js -->
    <script src="../js/jquery-2.2.4.min.js"></script>
    <script src="../js/popper.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/jquery.magnific-popup.js"></script>
    <script src="../js/owl.carousel.min.js"></script>
    <script src="../js/wow.min.js"></script>
    <script src="../js/slick.js"></script>
    <script src="../js/waypoints.min.js"></script>
    <script src="../js/jquery.counterup.min.js"></script>
    <script src="../js/imagesloaded.pkgd.min.js"></script>
    <script src="../js/isotope.pkgd.min.js"></script>
    <script src="../js/swiper.min.js"></script>
    <script src="../js/jquery.nice-select.min.js"></script>
    <script src="../js/jquery-ui.min.js"></script>
    <script src="../js/jarallax.min.js"></script>

    <!-- main js -->
    <script src="../js/main.js"></script>

</body>
</html>