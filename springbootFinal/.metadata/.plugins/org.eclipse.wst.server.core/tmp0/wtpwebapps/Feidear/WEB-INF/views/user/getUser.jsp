<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

  <jsp:include page="../header.jsp"></jsp:include>


    <!-- 상단바 밑 제목 area start -->
    <div class="breadcrumb-area jarallax" style="background-image:url(/images/bg/1.png);">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="breadcrumb-inner">
                        <h1 class="page-title">MY PAGE</h1>
                        <ul class="page-list">
                            <li><a href="index">Home</a></li>
                            <li>마이 페이지</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- 상단바 밑 제목 area End -->

    <!-- 마이페이지 본문 area start -->
    
       <!-- 마이페이지 탭팬 리스트 start -->
    <div class="user-profile-area pd-top-120">
        <div class="container">
            <div class="row">
                <div class="col-xl-10 col-lg-12">
                    <div class="row">
                        <div class="col-lg-4">
                            <ul class="nav nav-tabs tp-tabs style-two">
                                <li class="nav-item">
                                    <a class="nav-link active" data-toggle="tab" href="#tabs_1"><i class="fa fa-user"></i>회원정보 변경</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" data-toggle="tab" href="#tabs_2"><i class="fa fa-window-close-o" aria-hidden="true"></i>회원 탈퇴</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link"  data-toggle="tab" href="#tabs_3"><i class="fa fa-address-card"></i>비밀번호 변경</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link"  data-toggle="tab" href="#tabs_4"><i class="fa fa-bookmark" aria-hidden="true"></i>내 찜 목록</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link"  data-toggle="tab" href="#tabs_6"><i class="fa fa-book" aria-hidden="true"></i>내 후기</a>
                                </li>
                                <li class="text-center">
                                    <a class="btn btn-yellow" href="#"><i class="fa fa-sign-in" aria-hidden="true"></i> <span>로그아웃</span></a>
                                </li>
                            </ul>
                        </div>
       <!-- 마이페이지 탭팬 리스트 end -->
                        
                        <!-- tabpan 목록 start-->
                        
                          
                          
                       <!-- 회 원 정 보 변 경 하 기 탭 팬 -->   
                       
                        <div class="col-xl-7 col-lg-8 offset-xl-1">
                            <div class="tab-content user-tab-content">
                                <div class="tab-pane fade show active" id="tabs_1" >
                                    <div class="user-details">
                                        <h3 class="user-details-title">회원정보 변경</h3>
                                        <form action="updateUser" class="tp-form-wrap" method="post">
                                        <div class="tp-img-upload">
                                        
                                        <!-- 사진 업로드 파일VO 설정했던 걸로 설정 다시하고 받아와야함 -->
                                        
                                            <div class="tp-avatar-preview">
                                                <div id="tp_imagePreview" value="${user.u_image}" style="${user.u_image}">
                                                </div>
                                                	<input type="image" value="${user.u_image}">
                                            </div>
                                            <div class="tp-avatar-edit">
                                                <input type='file' name="u_image" id="tp_imageUpload"accept=".png, .jpg, .jpeg" />
                                                <label class="btn btn-transparent" for="tp_imageUpload"><i class="fa fa-picture-o"></i>사진 변경</label>
                                                <h4 class="u_id" name="u_id">ID : ${user.u_id} </h4>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-md-12">
                                                <label class="single-input-wrap style-two">
                                                    <span class="single-input-title">이름</span>
                                                    <input type="text" id="u_name" name="u_name" value="${user.u_name}">
                                                </label> 
                                            </div>
                                            <div class="col-lg-12">
   
                                                <label class="single-input-wrap style-two">
                                                    <span class="single-input-title">자기 소개</span>
                                                    <textarea id="u_comment" name="u_comment">${user.u_comment}</textarea>
                                                </label>
                                            </div>
                                            <div class="col-md-6">
                                                <label class="single-input-wrap style-two">
                                                    <span class="single-input-title">Email</span>
                                                    <input type="text" id="u_email" name="u_email" value="${user.u_email}">
                                                </label>
                                            </div>
                                            <div class="col-md-6">
                                                <label class="single-input-wrap style-two">
                                                    <span class="single-input-title">전화번호</span>
                                                    <input type="text" id="u_phone" name="u_phone" value="${user.u_phone}">
                                                </label>
                                            </div>
                                            <div class="col-12">
                                                <input type="submit" class="btn btn-yellow mt-3 text-center" value="변경사항 저장">
                                            </div>
                                        </div>
                                    </form>
                                    </div>
                                </div>
                           <!-- 회원정보 변경 end -->

                           
                           
                                
                                
                           <!-- 회원탈퇴 start -->
                                <div class="tab-pane fade" id="tabs_2">
                                    <div class="user-verification">
                                            <div class="col-lg-8">
                                                <h3 class="user-details-title">회원 탈퇴</h3>
                                                <div class="notice"><i class="fa fa-exclamation-triangle"></i>탈퇴 시 저장된 모든 기록이 삭제됨</div>
                                                <br/>
                                            </div>
                                        <form action="deleteMember" id="deleteMember" method="post">
                                        <div class="row">
                                            <div class="col-lg-7">
                                                <label class="single-input-wrap style-two">
                                                    <input type="password" placeholder="현재 비밀번호" id="pass" name="u_pw">
                                                </label>
                                            </div>
                                            <div class="col-lg-7">
                                                <label class="single-input-wrap style-two">
                                                    <input type="password" placeholder="비밀번호 확인" id="u_pwCheck" name="u_pwCheck">
                                                </label>
                                            </div>
                                            </div>
                                                <input type="submit" class="btn btn-yellow mt-3 text-center" value="회원 탈퇴">
                                        </form>
                                    </div>
                                </div>
                           <!-- 회원탈퇴 end -->
                                
                                
                           <!-- 비밀번호 변경 start -->
                                <div class="tab-pane fade" id="tabs_3">
                                    <div class="user-settings">
                                        <h3 class="user-details-title">비밀번호 변경</h3>
                                        <form action="modifyPassword" id="modifyPassword" method="post">
                                        <div class="row">
                                            <div class="col-lg-7">
                                                <label class="single-input-wrap style-two">
                                                    <span class="single-input-title mb-3">비밀번호를 변경합니다.</span>
                                                    <input type="password" placeholder="현재 비밀번호" id="u_npw" name="u_npw">
                                                </label>
                                            </div>
                                            <div class="col-lg-7">
                                                <label class="single-input-wrap style-two">
                                                    <input type="password" placeholder="새 비밀번호" name="u_pw" id="u_pw">
                                                </label>
                                            </div>
                                            <div class="col-lg-7">
                                                <label class="single-input-wrap style-two">
                                                    <input type="password" placeholder="새 비밀번호 확인" name="u_npwCheck" id="u_npwCheck">
                                                </label>
                                            </div>
                                        </div>
                                                <input type="submit" class="btn btn-yellow mt-3 text-center" value="변경사항 저장">
                                        </form>
                                    </div>
                                </div>
                           <!-- 비밀번호 변경 end -->
                                
                                
                           <!-- 내찜목록 start -->
                                <div class="tab-pane fade" id="tabs_4">
                                    <div class="user-recent-view">
                                        <h3 class="user-details-title">내 찜 목록</h3>
                                          <span>
                                          <input type="checkbox" value='selectall' onclick='selectAll(this)'/>전체 선택
                                        &nbsp;
                                          <input type="button" class="btn btn-yellow mt-3 text-center" value="찜 삭제">
                                          </span>
                                        <br/><br/>
                                        <div class="row">
                                            <!-- 페이징 필요함 -->
                                            <div class="col-sm-6">
                                                <div class="single-destinations-list style-two">
                                                    <div class="checkboxes">
                                                       <input type="checkbox">
                                                    </div>
                                                    <div class="thumb">
                                                        <img src="/images/destination-list/4.png" alt="list">
                                                    </div>
                                                    <div class="details">
                                                        <p class="location"><img src="/images/icons/1.png" alt="map">위치</p>
                                                        <h4 class="title"><a href="tour-details">어쩌고 축제</a></h4>
                                                        <p class="content">뭘로쓰지</p>
                                                        <div class="tp-price-meta">
                                                            <h2>축제기간? <small>$</small></h2>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-sm-6">
                                                <div class="single-destinations-list style-two">
                                                    <div class="checkboxes">
                                                       <input type="checkbox">
                                                    </div>
                                                    <div class="thumb">
                                                        <img src="/images/destination-list/4.png" alt="list">
                                                    </div>
                                                    <div class="details">
                                                        <p class="location"><img src="/images/icons/1.png" alt="map">위치</p>
                                                        <h4 class="title"><a href="tour-details">어쩌고 축제</a></h4>
                                                        <p class="content">뭘로쓰지</p>
                                                        <div class="tp-price-meta">
                                                            <h2>축제기간? <small>$</small></h2>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-sm-6">
                                                <div class="single-destinations-list style-two">
                                                    <div class="checkboxes">
                                                       <input type="checkbox">
                                                    </div>
                                                    <div class="thumb">
                                                        <img src="/images/destination-list/4.png" alt="list">
                                                    </div>
                                                    <div class="details">
                                                        <p class="location"><img src="/images/icons/1.png" alt="map">위치</p>
                                                        <h4 class="title"><a href="tour-details">어쩌고 축제</a></h4>
                                                        <p class="content">뭘로쓰지</p>
                                                        <div class="tp-price-meta">
                                                            <h2>축제기간? <small>$</small></h2>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                           <!-- 내찜목록 end -->
                                
                                
                           <!-- 내 후기 start -->
                                <div class="tab-pane fade" id="tabs_6">
                                    <div class="user-tour-details">
                                        <h3 class="user-details-title">내 후기</h3>
                                        <span class="user-tour-details-title">내가 작성한 후기</span>
                                        <span>| 후기 모아보기</span>
                                        <!-- 페이징 필요함 -->
                                        <div class="comments-area tour-details-review-area">
                                            <ul class="comment-list mb-0">
                                                <li>
                                                    <div class="single-comment-wrap">
                                                        <div class="thumb">
                                                            <img src="/images/client/2.png" alt="img">
                                                        </div>
                                                        <div class="content">
                                                            <h4 class="title">요뎡</h4>
                                                            <span class="date">2023-01-01</span>
                                                            <div class="tp-review-meta">
                                                                <i class="ic-yellow fa fa-star"></i>
                                                                <i class="ic-yellow fa fa-star"></i>
                                                                <i class="ic-yellow fa fa-star"></i>
                                                                <i class="ic-yellow fa fa-star"></i>
                                                                <i class="ic-yellow fa fa-star"></i>
                                                            </div>
                                                            <p>후기를 남겨야지요. 뭐라고 쓸건지 알아서 쓰겠지만 내가 이렇게 어쩌고라고 써야겠지요.
                                                               후기를 남겨야지요. 뭐라고 쓸건지 알아서 쓰겠지만 내가 이렇게 어쩌고라고 써야겠지요.
                                                            </p>
                                                        </div>
                                                    </div>
                                                </li>

                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                           <!-- 내 후기 end -->
                       <!-- tabpan 목록 end-->
                    
                    </div>
                </div> 
            </div>
        </div>
    </div>
    <!-- 마이페이지 본문 area End -->
    
    <!-- 뉴스레터 area Start -->
    <div class="newslatter-area pd-top-120">
        <div class="container">
            <div class="newslatter-area-wrap border-tp-solid">
                <div class="row">
                    <div class="col-xl-3 col-lg-6 col-md-5 offset-xl-2">
                        <div class="section-title mb-md-0">
                            <h2 class="title">Newsletter</h2>
                            <p>Sign up to receive the best offers</p>
                        </div>
                    </div>
                    <div class="col-xl-4 col-lg-6 col-md-7 align-self-center offset-xl-1">
                        <div class="input-group newslatter-wrap">
                            <div class="input-group-prepend">
                                <span class="input-group-text"><i class="fa fa-envelope"></i></span>
                            </div>
                            <input type="text" class="form-control" placeholder="Email">
                            <div class="input-group-append">
                                <button class="btn btn-yellow" type="button">Subscribe</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- 뉴스레터 area End -->
    
  <jsp:include page="../footer.jsp"></jsp:include>

    <!-- Additional plugin js -->
    <script src="/js/jquery-2.2.4.min.js"></script>
    <script src="/js/popper.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <script src="/js/jquery.magnific-popup.js"></script>
    <script src="/js/owl.carousel.min.js"></script>
    <script src="/js/wow.min.js"></script>
    <script src="/js/slick.js"></script>
    <script src="/js/waypoints.min.js"></script>
    <script src="/js/jquery.counterup.min.js"></script>
    <script src="/js/imagesloaded.pkgd.min.js"></script>
    <script src="/js/isotope.pkgd.min.js"></script>
    <script src="/js/swiper.min.js"></script>
    <script src="/js/jquery.nice-select.min.js"></script>
    <script src="/js/jquery-ui.min.js"></script>
    <script src="/js/jarallax.min.js"></script>

    <!-- main js -->
    <script src="/js/main.js"></script>
    
    <script type="text/javascript">
    
	    function selectAll(selectAll)  {
	         const checkboxes 
	            = document.querySelectorAll('input[type="checkbox"]');
	         
	         checkboxes.forEach((checkbox) => {
	           checkbox.checked = selectAll.checked
	         })
	       }// end selectAll 
	        
	    $('#modifyPassword').on('submit',function() {
	  
	      	//예전 비밀번호 확인(모델 값 가져와서 변수에 담을 때 "" 안에 안 넣으면 인식 못함)
	    	var oldPassword = "${user.u_pw}";
	    	var oldPasswordCheck = $('#modifyPassword').find("input[name='u_npw']").val();
	    	
	    	//새로 바뀐 비밀번호 중복 확인
	    	var newPassword = $('#modifyPassword').find("input[name='u_pw']").val();
	    	var newPasswordCheck = $('#modifyPassword').find("input[name='u_npwCheck']").val();    
	    	
	    	if(oldPassword !== oldPasswordCheck){
	    		alert('현재 비밀번호가 일치하지 않습니다!!');
		    		return false;	    		
	    	}
	    	
		    if(newPassword !== newPasswordCheck) {
		    	alert('바꿀 비밀번호가 일치하지 않습니다!!');
		    	return false;
		    }
		    
	    	alert('비밀번호가 변경되었습니다!'); 	
	    
	    });//end modifyPassword
	    
	   $('#deleteMember').on('submit',function() {
	   
	   		var password = "${user.u_pw}";
	   		var nowPassword = $('#deleteMember').find("input[name='u_pw']").val();
	   		var nowPasswordCheck = $('#deleteMember').find("input[name='u_pwCheck']").val();
	    	
	   		if(password !== nowPassword){
	   			alert('입력하신 현재 비밀번호가 다릅니다!!');
				return false;	   
	   		}
	   		
	   		if(nowPassword !== nowPasswordCheck){	   			
	   			alert('입력하신 현재 비밀번호와 확인 비밀번호가 다릅니다!!');
				return false;	   
	   		}
	   		
	   		var change = confirm("정말로 삭제하시겠습니까?");
	   		if(change==false){	   			
	   			alert("취소하였습니다!");
	   			return false;
	   		}
	   		alert("다음에 또 만나요 :)");
	   
	   });//end 
    
    </script>

</body>
</html>