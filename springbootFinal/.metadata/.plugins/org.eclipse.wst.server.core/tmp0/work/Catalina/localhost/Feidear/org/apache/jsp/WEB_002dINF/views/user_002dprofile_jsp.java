/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.70
 * Generated at: 2023-01-04 11:20:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_002dprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- 상단바 밑 제목 area start -->\r\n");
      out.write("    <div class=\"breadcrumb-area jarallax\" style=\"background-image:url(images/bg/1.png);\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <div class=\"breadcrumb-inner\">\r\n");
      out.write("                        <h1 class=\"page-title\">MY PAGE</h1>\r\n");
      out.write("                        <ul class=\"page-list\">\r\n");
      out.write("                            <li><a href=\"index\">Home</a></li>\r\n");
      out.write("                            <li>마이 페이지</li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- 상단바 밑 제목 area End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- 마이페이지 본문 area start -->\r\n");
      out.write("    \r\n");
      out.write("       <!-- 마이페이지 탭팬 리스트 start -->\r\n");
      out.write("    <div class=\"user-profile-area pd-top-120\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-xl-10 col-lg-12\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-4\">\r\n");
      out.write("                            <ul class=\"nav nav-tabs tp-tabs style-two\">\r\n");
      out.write("                                <li class=\"nav-item\">\r\n");
      out.write("                                    <a class=\"nav-link active\" data-toggle=\"tab\" href=\"#tabs_1\"><i class=\"fa fa-user\"></i>회원정보 변경</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"nav-item\">\r\n");
      out.write("                                    <a class=\"nav-link\" data-toggle=\"tab\" href=\"#tabs_2\"><i class=\"fa fa-window-close-o\" aria-hidden=\"true\"></i>회원 탈퇴</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"nav-item\">\r\n");
      out.write("                                    <a class=\"nav-link\"  data-toggle=\"tab\" href=\"#tabs_3\"><i class=\"fa fa-address-card\"></i>비밀번호 변경</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"nav-item\">\r\n");
      out.write("                                    <a class=\"nav-link\"  data-toggle=\"tab\" href=\"#tabs_4\"><i class=\"fa fa-bookmark\" aria-hidden=\"true\"></i>내 찜 목록</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"nav-item\">\r\n");
      out.write("                                    <a class=\"nav-link\"  data-toggle=\"tab\" href=\"#tabs_6\"><i class=\"fa fa-book\" aria-hidden=\"true\"></i>내 후기</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"text-center\">\r\n");
      out.write("                                    <a class=\"btn btn-yellow\" href=\"#\"><i class=\"fa fa-sign-in\" aria-hidden=\"true\"></i> <span>로그아웃</span></a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("       <!-- 마이페이지 탭팬 리스트 end -->\r\n");
      out.write("                        \r\n");
      out.write("                        <!-- tabpan 목록 start-->\r\n");
      out.write("                           <!-- 회원정보 변경 start -->\r\n");
      out.write("                        <div class=\"col-xl-7 col-lg-8 offset-xl-1\">\r\n");
      out.write("                            <div class=\"tab-content user-tab-content\">\r\n");
      out.write("                                <div class=\"tab-pane fade show active\" id=\"tabs_1\" >\r\n");
      out.write("                                    <div class=\"user-details\">\r\n");
      out.write("                                        <h3 class=\"user-details-title\">회원정보 변경</h3>\r\n");
      out.write("                                        <div class=\"tp-img-upload\">\r\n");
      out.write("                                            <div class=\"tp-avatar-preview\">\r\n");
      out.write("                                                <div id=\"tp_imagePreview\" style=\"background-image: url(images/team/1.png);\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"tp-avatar-edit\">\r\n");
      out.write("                                                <input type='file' id=\"tp_imageUpload\" accept=\".png, .jpg, .jpeg\" />\r\n");
      out.write("                                                <label class=\"btn btn-transparent\" for=\"tp_imageUpload\"><i class=\"fa fa-picture-o\"></i>사진 변경</label>\r\n");
      out.write("                                                <h4 class=\"id\">ID : </h4>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <form action=\"modifyMember\" class=\"tp-form-wrap\" method=\"post\">\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                            <div class=\"col-md-12\">\r\n");
      out.write("                                                <label class=\"single-input-wrap style-two\">\r\n");
      out.write("                                                    <span class=\"single-input-title\">이름</span>\r\n");
      out.write("                                                    <input type=\"text\" id=\"putname\">\r\n");
      out.write("                                                </label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-lg-12\">\r\n");
      out.write("                                                <label class=\"single-input-wrap style-two\">\r\n");
      out.write("                                                    <span class=\"single-input-title\">자기 소개</span>\r\n");
      out.write("                                                    <textarea></textarea>\r\n");
      out.write("                                                </label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-md-6\">\r\n");
      out.write("                                                <label class=\"single-input-wrap style-two\">\r\n");
      out.write("                                                    <span class=\"single-input-title\">Email</span>\r\n");
      out.write("                                                    <input type=\"text\">\r\n");
      out.write("                                                </label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-md-6\">\r\n");
      out.write("                                                <label class=\"single-input-wrap style-two\">\r\n");
      out.write("                                                    <span class=\"single-input-title\">전화번호</span>\r\n");
      out.write("                                                    <input type=\"text\" placeholder=\"010-1234-5678\">\r\n");
      out.write("                                                </label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-12\">\r\n");
      out.write("                                                <input type=\"submit\" class=\"btn btn-yellow mt-3 text-center\" value=\"변경사항 저장\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                           <!-- 회원정보 변경 end -->\r\n");
      out.write("                                \r\n");
      out.write("                                \r\n");
      out.write("                           <!-- 회원탈퇴 start -->\r\n");
      out.write("                                <div class=\"tab-pane fade\" id=\"tabs_2\">\r\n");
      out.write("                                    <div class=\"user-verification\">\r\n");
      out.write("                                            <div class=\"col-lg-8\">\r\n");
      out.write("                                                <h3 class=\"user-details-title\">회원 탈퇴</h3>\r\n");
      out.write("                                                <div class=\"notice\"><i class=\"fa fa-exclamation-triangle\"></i>탈퇴 시 저장된 모든 기록이 삭제됨</div>\r\n");
      out.write("                                                <br/>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        <form action=\"deleteMember\" method=\"post\">\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                            <div class=\"col-lg-7\">\r\n");
      out.write("                                                <label class=\"single-input-wrap style-two\">\r\n");
      out.write("                                                    <input type=\"password\" placeholder=\"현재 비밀번호\" id=\"Pass\">\r\n");
      out.write("                                                </label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-lg-7\">\r\n");
      out.write("                                                <label class=\"single-input-wrap style-two\">\r\n");
      out.write("                                                    <input type=\"password\" placeholder=\"비밀번호 확인\" id=\"passCheck\">\r\n");
      out.write("                                                </label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                                <input type=\"submit\" class=\"btn btn-yellow mt-3 text-center\" value=\"회원 탈퇴\">\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                           <!-- 회원탈퇴 end -->\r\n");
      out.write("                                \r\n");
      out.write("                                \r\n");
      out.write("                           <!-- 비밀번호 변경 start -->\r\n");
      out.write("                                <div class=\"tab-pane fade\" id=\"tabs_3\">\r\n");
      out.write("                                    <div class=\"user-settings\">\r\n");
      out.write("                                        <h3 class=\"user-details-title\">비밀번호 변경</h3>\r\n");
      out.write("                                        <form action=\"modifyPassword\" method=\"post\">\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                            <div class=\"col-lg-7\">\r\n");
      out.write("                                                <label class=\"single-input-wrap style-two\">\r\n");
      out.write("                                                    <span class=\"single-input-title mb-3\">비밀번호를 변경합니다.</span>\r\n");
      out.write("                                                    <input type=\"password\" placeholder=\"현재 비밀번호\" id=\"oldPass\">\r\n");
      out.write("                                                </label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-lg-7\">\r\n");
      out.write("                                                <label class=\"single-input-wrap style-two\">\r\n");
      out.write("                                                    <input type=\"password\" placeholder=\"새 비밀번호\" id=\"newPass\">\r\n");
      out.write("                                                </label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-lg-7\">\r\n");
      out.write("                                                <label class=\"single-input-wrap style-two\">\r\n");
      out.write("                                                    <input type=\"password\" placeholder=\"새 비밀번호 확인\" id=\"newPassCheck\">\r\n");
      out.write("                                                </label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                                <input type=\"submit\" class=\"btn btn-yellow mt-3 text-center\" value=\"변경사항 저장\">\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                           <!-- 비밀번호 변경 end -->\r\n");
      out.write("                                \r\n");
      out.write("                                \r\n");
      out.write("                           <!-- 내찜목록 start -->\r\n");
      out.write("                                <div class=\"tab-pane fade\" id=\"tabs_4\">\r\n");
      out.write("                                    <div class=\"user-recent-view\">\r\n");
      out.write("                                        <h3 class=\"user-details-title\">내 찜 목록</h3>\r\n");
      out.write("                                          <span>\r\n");
      out.write("                                          <input type=\"checkbox\" value='selectall' onclick='selectAll(this)'/>전체 선택\r\n");
      out.write("                                        &nbsp;\r\n");
      out.write("                                          <input type=\"button\" class=\"btn btn-yellow mt-3 text-center\" value=\"찜 삭제\">\r\n");
      out.write("                                          </span>\r\n");
      out.write("                                        <br/><br/>\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                            <!-- 페이징 필요함 -->\r\n");
      out.write("                                            <div class=\"col-sm-6\">\r\n");
      out.write("                                                <div class=\"single-destinations-list style-two\">\r\n");
      out.write("                                                    <div class=\"checkboxes\">\r\n");
      out.write("                                                       <input type=\"checkbox\">\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"thumb\">\r\n");
      out.write("                                                        <img src=\"images/destination-list/4.png\" alt=\"list\">\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"details\">\r\n");
      out.write("                                                        <p class=\"location\"><img src=\"images/icons/1.png\" alt=\"map\">위치</p>\r\n");
      out.write("                                                        <h4 class=\"title\"><a href=\"tour-details\">어쩌고 축제</a></h4>\r\n");
      out.write("                                                        <p class=\"content\">뭘로쓰지</p>\r\n");
      out.write("                                                        <div class=\"tp-price-meta\">\r\n");
      out.write("                                                            <h2>축제기간? <small>$</small></h2>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-sm-6\">\r\n");
      out.write("                                                <div class=\"single-destinations-list style-two\">\r\n");
      out.write("                                                    <div class=\"checkboxes\">\r\n");
      out.write("                                                       <input type=\"checkbox\">\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"thumb\">\r\n");
      out.write("                                                        <img src=\"images/destination-list/4.png\" alt=\"list\">\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"details\">\r\n");
      out.write("                                                        <p class=\"location\"><img src=\"images/icons/1.png\" alt=\"map\">위치</p>\r\n");
      out.write("                                                        <h4 class=\"title\"><a href=\"tour-details\">어쩌고 축제</a></h4>\r\n");
      out.write("                                                        <p class=\"content\">뭘로쓰지</p>\r\n");
      out.write("                                                        <div class=\"tp-price-meta\">\r\n");
      out.write("                                                            <h2>축제기간? <small>$</small></h2>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-sm-6\">\r\n");
      out.write("                                                <div class=\"single-destinations-list style-two\">\r\n");
      out.write("                                                    <div class=\"checkboxes\">\r\n");
      out.write("                                                       <input type=\"checkbox\">\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"thumb\">\r\n");
      out.write("                                                        <img src=\"images/destination-list/4.png\" alt=\"list\">\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"details\">\r\n");
      out.write("                                                        <p class=\"location\"><img src=\"images/icons/1.png\" alt=\"map\">위치</p>\r\n");
      out.write("                                                        <h4 class=\"title\"><a href=\"tour-details\">어쩌고 축제</a></h4>\r\n");
      out.write("                                                        <p class=\"content\">뭘로쓰지</p>\r\n");
      out.write("                                                        <div class=\"tp-price-meta\">\r\n");
      out.write("                                                            <h2>축제기간? <small>$</small></h2>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                           <!-- 내찜목록 end -->\r\n");
      out.write("                                \r\n");
      out.write("                                \r\n");
      out.write("                           <!-- 내 후기 start -->\r\n");
      out.write("                                <div class=\"tab-pane fade\" id=\"tabs_6\">\r\n");
      out.write("                                    <div class=\"user-tour-details\">\r\n");
      out.write("                                        <h3 class=\"user-details-title\">내 후기</h3>\r\n");
      out.write("                                        <span class=\"user-tour-details-title\">내가 작성한 후기</span>\r\n");
      out.write("                                        <span>| 후기 모아보기</span>\r\n");
      out.write("                                        <!-- 페이징 필요함 -->\r\n");
      out.write("                                        <div class=\"comments-area tour-details-review-area\">\r\n");
      out.write("                                            <ul class=\"comment-list mb-0\">\r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <div class=\"single-comment-wrap\">\r\n");
      out.write("                                                        <div class=\"thumb\">\r\n");
      out.write("                                                            <img src=\"images/client/2.png\" alt=\"img\">\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"content\">\r\n");
      out.write("                                                            <h4 class=\"title\">요뎡</h4>\r\n");
      out.write("                                                            <span class=\"date\">2023-01-01</span>\r\n");
      out.write("                                                            <div class=\"tp-review-meta\">\r\n");
      out.write("                                                                <i class=\"ic-yellow fa fa-star\"></i>\r\n");
      out.write("                                                                <i class=\"ic-yellow fa fa-star\"></i>\r\n");
      out.write("                                                                <i class=\"ic-yellow fa fa-star\"></i>\r\n");
      out.write("                                                                <i class=\"ic-yellow fa fa-star\"></i>\r\n");
      out.write("                                                                <i class=\"ic-yellow fa fa-star\"></i>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                            <p>후기를 남겨야지요. 뭐라고 쓸건지 알아서 쓰겠지만 내가 이렇게 어쩌고라고 써야겠지요.\r\n");
      out.write("                                                               후기를 남겨야지요. 뭐라고 쓸건지 알아서 쓰겠지만 내가 이렇게 어쩌고라고 써야겠지요.\r\n");
      out.write("                                                            </p>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </li>\r\n");
      out.write("\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                           <!-- 내 후기 end -->\r\n");
      out.write("                       <!-- tabpan 목록 end-->\r\n");
      out.write("                    \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div> \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- 마이페이지 본문 area End -->\r\n");
      out.write("    \r\n");
      out.write("    <!-- 뉴스레터 area Start -->\r\n");
      out.write("    <div class=\"newslatter-area pd-top-120\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"newslatter-area-wrap border-tp-solid\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-xl-3 col-lg-6 col-md-5 offset-xl-2\">\r\n");
      out.write("                        <div class=\"section-title mb-md-0\">\r\n");
      out.write("                            <h2 class=\"title\">Newsletter</h2>\r\n");
      out.write("                            <p>Sign up to receive the best offers</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-xl-4 col-lg-6 col-md-7 align-self-center offset-xl-1\">\r\n");
      out.write("                        <div class=\"input-group newslatter-wrap\">\r\n");
      out.write("                            <div class=\"input-group-prepend\">\r\n");
      out.write("                                <span class=\"input-group-text\"><i class=\"fa fa-envelope\"></i></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Email\">\r\n");
      out.write("                            <div class=\"input-group-append\">\r\n");
      out.write("                                <button class=\"btn btn-yellow\" type=\"button\">Subscribe</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- 뉴스레터 area End -->\r\n");
      out.write("    \r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Additional plugin js -->\r\n");
      out.write("    <script src=\"js/jquery-2.2.4.min.js\"></script>\r\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.magnific-popup.js\"></script>\r\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"js/wow.min.js\"></script>\r\n");
      out.write("    <script src=\"js/slick.js\"></script>\r\n");
      out.write("    <script src=\"js/waypoints.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.counterup.min.js\"></script>\r\n");
      out.write("    <script src=\"js/imagesloaded.pkgd.min.js\"></script>\r\n");
      out.write("    <script src=\"js/isotope.pkgd.min.js\"></script>\r\n");
      out.write("    <script src=\"js/swiper.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.nice-select.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery-ui.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jarallax.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- main js -->\r\n");
      out.write("    <script src=\"js/main.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    function selectAll(selectAll)  {\r\n");
      out.write("         const checkboxes \r\n");
      out.write("            = document.querySelectorAll('input[type=\"checkbox\"]');\r\n");
      out.write("         \r\n");
      out.write("         checkboxes.forEach((checkbox) => {\r\n");
      out.write("           checkbox.checked = selectAll.checked\r\n");
      out.write("         })\r\n");
      out.write("       }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
