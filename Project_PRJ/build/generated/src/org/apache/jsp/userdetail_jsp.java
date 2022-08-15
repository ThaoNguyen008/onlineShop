package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html class=\"no-js\" lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("        <title>CLOTHES SHOP</title>\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"assets/images/favicon.ico\">\n");
      out.write("\n");
      out.write("        <!-- CSS\n");
      out.write("            ============================================ -->\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Icon Font CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/icon-font.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Plugins CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/plugins.css\">\n");
      out.write("\n");
      out.write("        <!-- Helper CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/helper.css\">\n");
      out.write("\n");
      out.write("        <!-- Main Style CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("\n");
      out.write("        <!-- Modernizer JS -->\n");
      out.write("        <script src=\"assets/js/vendor/modernizr-2.8.3.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"main-wrapper\">\n");
      out.write("\n");
      out.write("            <!-- Header Section Start -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./common/header.jsp", out, false);
      out.write("\n");
      out.write("                <!-- Header Section End -->\n");
      out.write("\n");
      out.write("                <!-- Page Banner Section Start -->\n");
      out.write("                <div class=\"page-banner-section section\" style=\"background-image: url(assets/images/hero/hero-1.jpg)\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"page-banner-content col\">\n");
      out.write("\n");
      out.write("                                <h1>User detail</h1>\n");
      out.write("                                <ul class=\"page-breadcrumb\">\n");
      out.write("                                    <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                                    <li><a href=\"userdetail.jsp\">User detail</a></li>\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!-- Page Banner Section End -->\n");
      out.write("\n");
      out.write("                <!-- Page Section Start -->\n");
      out.write("                <div class=\"page-section section mt-80 mt-lg-60 mt-md-60 mt-sm-60 mt-xs-40 mb-40 mb-lg-20 mb-md-20 mb-sm-20 mb-xs-0\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("\n");
      out.write("                                <!-- Checkout Form s-->\n");
      out.write("                                <form action=\"#\" class=\"checkout-form\">\n");
      out.write("                                    <div class=\"row row-50\">\n");
      out.write("\n");
      out.write("                                        <div class=\"col-lg-12\">\n");
      out.write("\n");
      out.write("                                            <!-- Info -->\n");
      out.write("                                            <div id=\"billing-form\" class=\"mb-20\">\n");
      out.write("                                                <h4 class=\"checkout-title\">Your Information</h4>\n");
      out.write("\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("\n");
      out.write("                                                    <div class=\"col-md-6 col-12 mb-5\">\n");
      out.write("                                                        <label>Name</label>\n");
      out.write("                                                        <input type=\"text\" placeholder=\"First Name\">\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                    <div class=\"col-md-6 col-12 mb-5\">\n");
      out.write("                                                        <label>Phone</label>\n");
      out.write("                                                        <input type=\"email\" placeholder=\"Email Address\">\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                    <div class=\"col-12 mb-5\">\n");
      out.write("                                                        <label>Address</label>\n");
      out.write("                                                        <input type=\"text\" placeholder=\"Phone number\">\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <button class=\"place-order\">Save</button>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <hr>\n");
      out.write("                                            <!-- Pas -->\n");
      out.write("                                            <div id=\"billing-form\" class=\"mb-20\">\n");
      out.write("                                                <h4 class=\"checkout-title\">Change Password</h4>\n");
      out.write("\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("\n");
      out.write("                                                    <div class=\"col-md-6 col-12 mb-5\">\n");
      out.write("                                                        <label>Current Password</label>\n");
      out.write("                                                        <input type=\"text\" placeholder=\"First Name\">\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                    <div class=\"col-md-6 col-12 mb-5\">\n");
      out.write("                                                        <label>New Password</label>\n");
      out.write("                                                        <input type=\"email\" placeholder=\"Email Address\">\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                    <div class=\"col-12 mb-5\">\n");
      out.write("                                                        <label>Re-enter New Password</label>\n");
      out.write("                                                        <input type=\"text\" placeholder=\"Phone number\">\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <button class=\"place-order\">Change Pass</button>\n");
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!-- Page Section End -->\n");
      out.write("\n");
      out.write("                <!-- Brand Section End -->\n");
      out.write("\n");
      out.write("                <!-- Footer Top Section Start -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./common/footer.jsp", out, false);
      out.write("\n");
      out.write("            <!-- Footer Top Section End -->\n");
      out.write("\n");
      out.write("            <!-- Footer Bottom Section Start -->\n");
      out.write("            <!-- Footer Bottom Section End -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- JS\n");
      out.write("        ============================================ -->\n");
      out.write("\n");
      out.write("        <!-- jQuery JS -->\n");
      out.write("        <script src=\"assets/js/vendor/jquery-1.12.4.min.js\"></script>\n");
      out.write("        <!-- Popper JS -->\n");
      out.write("        <script src=\"assets/js/popper.min.js\"></script>\n");
      out.write("        <!-- Bootstrap JS -->\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- Plugins JS -->\n");
      out.write("        <script src=\"assets/js/plugins.js\"></script>\n");
      out.write("        <!-- Ajax Mail -->\n");
      out.write("        <script src=\"assets/js/ajax-mail.js\"></script>\n");
      out.write("        <!-- Main JS -->\n");
      out.write("        <script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
