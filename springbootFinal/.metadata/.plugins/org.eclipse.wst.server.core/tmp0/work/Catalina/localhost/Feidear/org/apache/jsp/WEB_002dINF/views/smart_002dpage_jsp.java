/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.70
 * Generated at: 2023-01-04 11:15:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class smart_002dpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
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
      out.write("   ");
String pjName = "/Feidear";
      out.write("\r\n");
      out.write("\r\n");
      out.write("   <!-- header.jsp -->\r\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("   <!-- header.jsp ??? -->\r\n");
      out.write("   \r\n");
      out.write("   <!-- custom CSS -->\r\n");
      out.write("   <style type=\"text/css\">\r\n");
      out.write("      .fstv-grid{\r\n");
      out.write("         display : grid;\r\n");
      out.write("          margin-bottom: 5px;   \r\n");
      out.write("          grid-template-columns: repeat(4, 1fr);\r\n");
      out.write("            gap: 28px;\r\n");
      out.write("         @media screen and (max-width: 718px) {\r\n");
      out.write("             gap: 3px;   \r\n");
      out.write("         }\r\n");
      out.write("      }\r\n");
      out.write("      .fstv-list {\r\n");
      out.write("         width: 100%;\r\n");
      out.write("            position: relative;\r\n");
      out.write("         }\r\n");
      out.write("         \r\n");
      out.write("         .fstv-list::after {\r\n");
      out.write("         display:block;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      .categ-filter {\r\n");
      out.write("         float : left;\r\n");
      out.write("         width : 40%;\r\n");
      out.write("         margin-right :0.5vw;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      #weatherTbl .weatherIcon {\r\n");
      out.write("         max-width: 100%;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      .weatherTd, .dayTd {\r\n");
      out.write("         width:10%;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      #weatherTbl td {\r\n");
      out.write("         text-align: center;\r\n");
      out.write("      }\r\n");
      out.write("   </style>\r\n");
      out.write("   \r\n");
      out.write("   <!-- custom CSS ??? -->\r\n");
      out.write("   \r\n");
      out.write("    <!-- breadcrumb area start -->\r\n");
      out.write("    <div class=\"breadcrumb-area jarallax\" style=\"background-image:url(images/bg/1.png);\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <div class=\"breadcrumb-inner\">\r\n");
      out.write("                        <h1 class=\"page-title\">????????? ?????????</h1>\r\n");
      out.write("                        <ul class=\"page-list\">\r\n");
      out.write("                            <li><a href=\"#\">Smart Page</a></li>\r\n");
      out.write("                            <li>????????? ???????????? ????????? ??????</li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- breadcrumb area End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- blog area start -->\r\n");
      out.write("    <div class=\"user-profile-area pd-top-120\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-xl-10 col-lg-12\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-4\">\r\n");
      out.write("                            <ul class=\"nav nav-tabs tp-tabs style-two\">\r\n");
      out.write("                                <li class=\"nav-item\">\r\n");
      out.write("                                    <a class=\"nav-link active\"  data-toggle=\"tab\" href=\"#tabs_1\"><i class=\"fa fa-users\" aria-hidden=\"true\"></i>????????? ??????</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"nav-item\">\r\n");
      out.write("                                    <a class=\"nav-link\" data-toggle=\"tab\" href=\"#tabs_2\"><i class=\"fa fa-sun-o\" aria-hidden=\"true\"></i>????????? ??????</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"nav-item\">\r\n");
      out.write("                                    <a class=\"nav-link\" data-toggle=\"tab\" href=\"#tabs_3\"><i class=\"fa fa-bar-chart\" aria-hidden=\"true\"></i>??? ?????? ?????? ??????</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xl-7 col-lg-8 offset-xl-1\">\r\n");
      out.write("                            <div class=\"tab-content user-tab-content\">\r\n");
      out.write("                               <!-- ????????? ?????? ??? -->\r\n");
      out.write("                                <div class=\"tab-pane fade show active\" id=\"tabs_1\" >\r\n");
      out.write("                                   <div class=\"user-settings\">\r\n");
      out.write("                                        <h3 class=\"user-details-title\">????????? ??????</h3>\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                        <!-- ?????? ?????? DIV -->\r\n");
      out.write("                                        <div class=\"single-widget-search-input-title col-lg-12\">\r\n");
      out.write("                                            <!-- ?????? ?????? ?????? -->\r\n");
      out.write("                                           <div class=\"categ-filter\">\r\n");
      out.write("                                              <i class=\"fa fa-map-pin\"></i>??????\r\n");
      out.write("                                          <div class=\"single-widget-search-input\">\r\n");
      out.write("                                             <select class=\"select w-100 custom-select\">\r\n");
      out.write("                                                 <option value=\"\" selected disabled hidden>?????? ??????</option>\r\n");
      out.write("                                                  <option value=\"1\">??????</option>\r\n");
      out.write("                                                  <option value=\"2\">??????</option>\r\n");
      out.write("                                                  <option value=\"3\">??????</option>\r\n");
      out.write("                                                  <option value=\"4\">??????</option>\r\n");
      out.write("                                                  <option value=\"5\">??????</option>\r\n");
      out.write("                                                  <option value=\"6\">??????</option>\r\n");
      out.write("                                                  <option value=\"7\">??????</option>\r\n");
      out.write("                                                  <option value=\"8\">??????</option>\r\n");
      out.write("                                                  <option value=\"9\">??????</option>\r\n");
      out.write("                                                  <option value=\"10\">??????</option>\r\n");
      out.write("                                                  <option value=\"11\">??????</option>\r\n");
      out.write("                                                  <option value=\"12\">??????</option>\r\n");
      out.write("                                                  <option value=\"13\">??????</option>\r\n");
      out.write("                                                  <option value=\"14\">??????</option>\r\n");
      out.write("                                                  <option value=\"15\">??????</option>\r\n");
      out.write("                                                  <option value=\"16\">??????</option>\r\n");
      out.write("                                                  <option value=\"17\">??????</option>\r\n");
      out.write("                                              </select>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <!-- ?????? ?????? ?????? ??? -->\r\n");
      out.write("                                 <!-- ???????????? ?????? ?????? -->\r\n");
      out.write("                                      <div class=\"categ-filter\">\r\n");
      out.write("                                         <i class=\"fa fa-map-pin\"></i>????????????\r\n");
      out.write("                                          <div class=\"single-widget-search-input \">\r\n");
      out.write("                                             <select class=\"select w-100 custom-select\">\r\n");
      out.write("                                                <option value=\"\" selected disabled hidden>???????????? ??????</option>\r\n");
      out.write("                                                <option value=\"1\">????????????1</option>\r\n");
      out.write("                                                <option value=\"2\">????????????2</option>\r\n");
      out.write("                                                 <option value=\"3\">????????????3</option>\r\n");
      out.write("                                                 <option value=\"4\">????????????4</option>\r\n");
      out.write("                                       </select>\r\n");
      out.write("                                           </div>\r\n");
      out.write("                                         </div>\r\n");
      out.write("                                         <!-- ???????????? ?????? ?????? ??? -->\r\n");
      out.write("                                     </div>\r\n");
      out.write("                                        <!-- ?????? ?????? DIV ??? -->  \r\n");
      out.write("                                        <!-- ???????????? -->\r\n");
      out.write("                                        <div class=\"col-lg-12\">\r\n");
      out.write("                                           <div id=\"map\" style=\"height:400px;\"></div>\r\n");
      out.write("                                           <a class=\"btn btn-transparent\" href=\"#\" style=\"margin: 1vw 0vw;\" id=\"map_reload\">????????? ????????? ?????????????</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <!-- ???????????? ??? -->  \r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                \r\n");
      out.write("                                   \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!-- ????????? ?????? ??? ??? -->\r\n");
      out.write("                                <!-- ????????? ?????? ??? -->\r\n");
      out.write("                                <div class=\"tab-pane fade\" id=\"tabs_2\">\r\n");
      out.write("                                    <div class=\"user-verification\">\r\n");
      out.write("                              <h3 class=\"user-details-title\">????????? ??????</h3>\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                          <!-- ?????? ?????? DIV -->\r\n");
      out.write("                                          <div class=\"single-widget-search-input-title col-lg-12\">\r\n");
      out.write("                                             <!-- ?????? ?????? ?????? -->\r\n");
      out.write("                                             <div class=\"categ-filter\">\r\n");
      out.write("                                                <i class=\"fa fa-map-pin\"></i>??????\r\n");
      out.write("                                           <div class=\"single-widget-search-input\">\r\n");
      out.write("                                                <select class=\"select w-100 custom-select\">\r\n");
      out.write("                                                   <option value=\"\" selected disabled hidden>?????? ??????</option>\r\n");
      out.write("                                                   <option value=\"1\">??????</option>\r\n");
      out.write("                                                    <option value=\"2\">??????</option>\r\n");
      out.write("                                                    <option value=\"3\">??????</option>\r\n");
      out.write("                                                    <option value=\"4\">??????</option>\r\n");
      out.write("                                                    <option value=\"5\">??????</option>\r\n");
      out.write("                                                    <option value=\"6\">??????</option>\r\n");
      out.write("                                                    <option value=\"7\">??????</option>\r\n");
      out.write("                                                    <option value=\"8\">??????</option>\r\n");
      out.write("                                                    <option value=\"9\">??????</option>\r\n");
      out.write("                                                    <option value=\"10\">??????</option>\r\n");
      out.write("                                                    <option value=\"11\">??????</option>\r\n");
      out.write("                                                    <option value=\"12\">??????</option>\r\n");
      out.write("                                                    <option value=\"13\">??????</option>\r\n");
      out.write("                                                    <option value=\"14\">??????</option>\r\n");
      out.write("                                                    <option value=\"15\">??????</option>\r\n");
      out.write("                                                    <option value=\"16\">??????</option>\r\n");
      out.write("                                                    <option value=\"17\">??????</option>\r\n");
      out.write("                                          </select>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                           </div>\r\n");
      out.write("                                           <!-- ?????? ?????? ?????? ??? -->\r\n");
      out.write("                                    <!-- ???????????? ?????? ?????? -->\r\n");
      out.write("                                         <div class=\"categ-filter\">\r\n");
      out.write("                                               <i class=\"fa fa-map-pin\"></i>????????????\r\n");
      out.write("                                                <div class=\"single-widget-search-input \">\r\n");
      out.write("                                                   <select class=\"select w-100 custom-select\">\r\n");
      out.write("                                                      <option value=\"\" selected disabled hidden>???????????? ??????</option>\r\n");
      out.write("                                                      <option value=\"1\">????????????1</option>\r\n");
      out.write("                                                      <option value=\"2\">????????????2</option>\r\n");
      out.write("                                                       <option value=\"3\">????????????3</option>\r\n");
      out.write("                                                       <option value=\"4\">????????????4</option>\r\n");
      out.write("                                          </select>\r\n");
      out.write("                                              </div>\r\n");
      out.write("                                           </div>\r\n");
      out.write("                                           <!-- ???????????? ?????? ?????? ??? -->\r\n");
      out.write("                                 </div>\r\n");
      out.write("                                          <!-- ?????? ?????? DIV ??? -->  \r\n");
      out.write("                                           <div class=\"col-lg-12\">\r\n");
      out.write("                                           <h5 class=\"user-details-title\">(((??????????????? ????????? ?????? ?????????)))</h5>\r\n");
      out.write("                                           <!-- ?????? ?????? ????????? -->\r\n");
      out.write("                                           <table id=\"weatherTbl\" style=\"width:100%;\">\r\n");
      out.write("                                              <tr>\r\n");
      out.write("                                                 <td class=\"weatherTd\"><img class=\"weatherIcon\" alt=\"?????????\" src=\"images/weather/sunny.gif\"/></td>\r\n");
      out.write("                                                 <td class=\"dayTd\" style=\"text-align: center;\">?????????</td>\r\n");
      out.write("                                                 <td>??????</td>\r\n");
      out.write("                                                 <td>??????</td>\r\n");
      out.write("                                              </tr>\r\n");
      out.write("                                              <tr>\r\n");
      out.write("                                                 <td class=\"weatherTd\" ><img class=\"weatherIcon\" alt=\"???\" src=\"images/weather/rainy.gif\"/></td>\r\n");
      out.write("                                                 <td class=\"dayTd\" style=\"text-align: center;\">?????????</td>\r\n");
      out.write("                                                 <td>??????</td>\r\n");
      out.write("                                                 <td>??????</td>\r\n");
      out.write("                                              </tr>\r\n");
      out.write("                                              <tr>\r\n");
      out.write("                                                 <td class=\"weatherTd\" ><img class=\"weatherIcon\" alt=\"???\" src=\"images/weather/snowy.gif\"/></td>\r\n");
      out.write("                                                 <td class=\"dayTd\" style=\"text-align: center;\">?????????</td>\r\n");
      out.write("                                                 <td>??????</td>\r\n");
      out.write("                                                 <td>??????</td>\r\n");
      out.write("                                              </tr>\r\n");
      out.write("                                              <tr>\r\n");
      out.write("                                                 <td class=\"weatherTd\" ><img class=\"weatherIcon\" alt=\"??????\" src=\"images/weather/typhoon.gif\"/></td>\r\n");
      out.write("                                                 <td class=\"dayTd\" style=\"text-align: center;\">?????????</td>\r\n");
      out.write("                                                 <td>??????</td>\r\n");
      out.write("                                                 <td>??????</td>\r\n");
      out.write("                                              </tr>\r\n");
      out.write("                                              \r\n");
      out.write("                                           </table>\r\n");
      out.write("                                           \r\n");
      out.write("                                           </div>\r\n");
      out.write("                                        \r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                \r\n");
      out.write("                                <!-- ?????? ?????? ?????? ???-->\r\n");
      out.write("                                <div class=\"tab-pane fade\" id=\"tabs_3\">\r\n");
      out.write("                                    <div class=\"user-details\">\r\n");
      out.write("                                        <h3 class=\"user-details-title\">??? ?????? ?????? ??????</h3>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                           <div class=\"col-lg-12 bg-gray\" style=\"padding-top: 3vw;\">\r\n");
      out.write("                                              \r\n");
      out.write("                                              <!-- ?????? ?????? ?????? ?????? -->\r\n");
      out.write("                                                <div class=\"col-lg-5\" style=\"margin: 0px auto;\">\r\n");
      out.write("                                                   <h3 style=\"text-align: center; margin-bottom: 30px;\">FBTI TEST</h3>\r\n");
      out.write("                                                   <div class=\"user-payment-card\" style=\"text-align: center;\">\r\n");
      out.write("                                                       <img src=\"images/others/01.png\" alt=\"img\" style=\"margin-bottom: 1.25vw; border-radius: 70%\">\r\n");
      out.write("                                                        <br/>\r\n");
      out.write("                                                        <span> ????????? FBTI???? ~~~!</span><br/>\r\n");
      out.write("                                                        <a class=\"btn btn-transparent\" href=\"#\" style=\"margin: 1vw;\">?????? ???????????????</a>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                               <div class=\"col-lg-10 widget-contact\" style=\"margin: 0px auto;\">\r\n");
      out.write("                                                  <p>\r\n");
      out.write("                                                  <i class=\"fa fa-thumb-tack\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                  <span style=\"color: black;\">??? ????????? ?????? ????????? ???????????? ????????? ??????????????????... <br/>?????? ????????? ??? ?????? ?????????..?  ?????? br????????? ??? p?????? ?????????</span>\r\n");
      out.write("                                              </p>\r\n");
      out.write("                                              <p>\r\n");
      out.write("                                                  <i class=\"fa fa-thumb-tack\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                  <span style=\"color: black;\">??? ????????? ?????? ????????? ???????????? ????????? ??????????????????... ?????? ????????? ??? ?????? ?????????..? ?????? br????????? ??? ??? p?????? ?????????</span>\r\n");
      out.write("                                              </p>\r\n");
      out.write("                                              <p>\r\n");
      out.write("                                                  <i class=\"fa fa-thumb-tack\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                  <span style=\"color: black;\">??? ????????? ?????? ????????? ???????????? ????????? ??????????????????... ?????? ????????? ??? ?????? ?????????..? ?????? br????????? ??? ??? p?????? ?????????</span>\r\n");
      out.write("                                              </p>\r\n");
      out.write("                                               </div>   \r\n");
      out.write("                                               \r\n");
      out.write("                                               <!-- ?????? ?????? ?????? ?????? -->\r\n");
      out.write("                                               <div class=\"newslatter-area-wrap border-tp-solid\" >\r\n");
      out.write("                                               <h4 style=\"text-align: center; margin-bottom: 70px;\">?????????????? ????????? ???????????? ????????? ????????????????????????</h4>\r\n");
      out.write("                                                  <div class=\"fstv-grid\"  style=\"overflow:auto;\">\r\n");
      out.write("                                                     <div class=\"col-lg-12\" style=\"margin: 0px auto;\">\r\n");
      out.write("                                                         <div class=\"user-payment-card fstv-list\" style=\"text-align: center;\">\r\n");
      out.write("                                                             <img src=\"images/others/01.png\" alt=\"img\" style=\"margin-bottom: 1.25vw; border-radius: 70%\">\r\n");
      out.write("                                                              <br/>\r\n");
      out.write("                                                              <span style=\"white-space: nowrap;\"> ????????? ??????</span>\r\n");
      out.write("                                                          </div>\r\n");
      out.write("                                                      </div>\r\n");
      out.write("                                                      \r\n");
      out.write("                                                     <div class=\"col-lg-12\" style=\"margin: 0px auto;\">\r\n");
      out.write("                                                         <div class=\"user-payment-card fstv-list\" style=\"text-align: center;\">\r\n");
      out.write("                                                             <img src=\"images/others/01.png\" alt=\"img\" style=\"margin-bottom: 1.25vw; border-radius: 70%\">\r\n");
      out.write("                                                              <br/>\r\n");
      out.write("                                                              <span style=\"white-space: nowrap;\"> ????????? ??????</span>\r\n");
      out.write("                                                          </div>\r\n");
      out.write("                                                      </div>\r\n");
      out.write("                                                     \r\n");
      out.write("                                                     <div class=\"col-lg-12\" style=\"margin: 0px auto;\">\r\n");
      out.write("                                                         <div class=\"user-payment-card fstv-list\" style=\"text-align: center;\">\r\n");
      out.write("                                                             <img src=\"images/others/01.png\" alt=\"img\" style=\"margin-bottom: 1.25vw; border-radius: 70%\">\r\n");
      out.write("                                                              <br/>\r\n");
      out.write("                                                              <span style=\"white-space: nowrap;\"> ????????? ??????</span>\r\n");
      out.write("                                                          </div>\r\n");
      out.write("                                                      </div>\r\n");
      out.write("                                                     \r\n");
      out.write("                                                     <div class=\"col-lg-12\" style=\"margin: 0px auto;\">\r\n");
      out.write("                                                         <div class=\"user-payment-card fstv-list\" style=\"text-align: center;\">\r\n");
      out.write("                                                             <img src=\"images/others/01.png\" alt=\"img\" style=\"margin-bottom: 1.25vw; border-radius: 70%\">\r\n");
      out.write("                                                              <br/>\r\n");
      out.write("                                                              <span style=\"white-space: nowrap;\"> ????????? ??????</span>\r\n");
      out.write("                                                          </div>\r\n");
      out.write("                                                      </div>\r\n");
      out.write("                                                   </div>\r\n");
      out.write("                                               </div>     \r\n");
      out.write("                                            </div>\r\n");
      out.write("                                          </div>\r\n");
      out.write("                                        \r\n");
      out.write("                                        \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div> \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- blog area End -->\r\n");
      out.write("    \r\n");
      out.write("    <!-- newslatter area Start -->\r\n");
      out.write("    <div class=\"newslatter-area pd-top-120\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- newslatter area End -->\r\n");
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
      out.write("    \r\n");
      out.write("   <!-- custom js -->\r\n");
      out.write("   <script src=\"js/smart-page-custom.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- KAKAOMAP API -->\r\n");
      out.write("   <script type=\"text/javascript\" src=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=71d64a6b0837e8b3cf891b3a070aef14\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        var container = document.getElementById('map');\r\n");
      out.write("        var options = {\r\n");
      out.write("           center: new kakao.maps.LatLng(37.541, 126.986),\r\n");
      out.write("            level: 10\r\n");
      out.write("            \r\n");
      out.write("      };\r\n");
      out.write("     \r\n");
      out.write("        var map = new kakao.maps.Map(container, options);\r\n");
      out.write("      \r\n");
      out.write("        // ????????? ?????? ?????? ?????? ????????? ????????? ????????? reload???.\r\n");
      out.write("        $('#map_reload').click(function(){\r\n");
      out.write("           map.relayout();    \r\n");
      out.write("        })  \r\n");
      out.write("     </script>\r\n");
      out.write("     \r\n");
      out.write("     <!-- footer.jsp -->\r\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
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
