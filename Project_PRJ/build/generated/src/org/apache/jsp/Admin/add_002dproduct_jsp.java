package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.Category;
import dal.DaoCategory;
import dal.DaoCategory;

public final class add_002dproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\n");
      out.write("        <title>Add Product</title>\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Roboto:400,700\"\n");
      out.write("            />\n");
      out.write("        <!-- https://fonts.google.com/specimen/Roboto -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://localhost:8080/project/assets//css/fontawesome.min.css\" />\n");
      out.write("        <!-- https://fontawesome.com/ -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://localhost:8080/project/assets/jquery-ui-datepicker/jquery-ui.min.css\" type=\"text/css\" />\n");
      out.write("        <!-- http://api.jqueryui.com/datepicker/ -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://localhost:8080/project/assets/css/bootstrap.min.css\" />\n");
      out.write("        <!-- https://getbootstrap.com/ -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://localhost:8080/project/assets/css/templatemo-style.css\">\n");
      out.write("        <!--\n");
      out.write("            Product Admin CSS Template\n");
      out.write("            https://templatemo.com/tm-524-product-admin\n");
      out.write("        -->\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-xl\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./AdminCommon/header.jsp", out, false);
      out.write("\n");
      out.write("            </nav>\n");
      out.write("            <div class=\"container tm-mt-big tm-mb-big\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xl-9 col-lg-10 col-md-12 col-sm-12 mx-auto\">\n");
      out.write("                        <div class=\"tm-bg-primary-dark tm-block tm-block-h-auto\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-12\">\n");
      out.write("                                    <h2 class=\"tm-block-title d-inline-block\">Add Product</h2>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row tm-edit-product-row\">\n");
      out.write("                                <div class=\"col-xl-6 col-lg-6 col-md-12\">\n");
      out.write("                                    <form action=\"Product\" method=\"POST\" class=\"tm-edit-product-form\">\n");
      out.write("                                        <input id=\"type\" type=\"text\" name=\"type\" value=\"add\" style=\"display:none;\" />\n");
      out.write("                                        <div class=\"form-group mb-3\">\n");
      out.write("                                            <label\n");
      out.write("                                                for=\"name\"\n");
      out.write("                                                >Product Name\n");
      out.write("                                            </label>\n");
      out.write("                                            <input\n");
      out.write("                                                id=\"name\"\n");
      out.write("                                                name=\"name\"\n");
      out.write("                                                type=\"text\"\n");
      out.write("                                                class=\"form-control validate\"\n");
      out.write("                                                required\n");
      out.write("                                                />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group mb-3\">\n");
      out.write("                                            <label\n");
      out.write("                                                for=\"description\"\n");
      out.write("                                                >Description</label\n");
      out.write("                                            >\n");
      out.write("                                            <input\n");
      out.write("                                                id=\"name\"\n");
      out.write("                                                name=\"description\"\n");
      out.write("                                                type=\"text\"\n");
      out.write("                                                class=\"form-control validate\"\n");
      out.write("                                                required\n");
      out.write("                                                />\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group mb-3\">\n");
      out.write("                                            <label\n");
      out.write("                                                for=\"Discount\"\n");
      out.write("                                                >img \n");
      out.write("                                            </label>\n");
      out.write("                                            <input\n");
      out.write("                                              \n");
      out.write("                                                name=\"img\"\n");
      out.write("                                                type=\"text\"\n");
      out.write("                                                value=\"\"\n");
      out.write("                                                class=\"form-control validate\"\n");
      out.write("                                                />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group mb-3\">\n");
      out.write("                                            <label\n");
      out.write("                                                for=\"price\"\n");
      out.write("                                                >Price\n");
      out.write("                                            </label>\n");
      out.write("                                            <input\n");
      out.write("                                                type=\"text\"\n");
      out.write("                                                name=\"Price\"\n");
      out.write("                                                class=\"form-control validate\"\n");
      out.write("                                                required\n");
      out.write("                                                />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group mb-3\">\n");
      out.write("                                            <label\n");
      out.write("                                                for=\"Quantity\"\n");
      out.write("                                                >Quantity\n");
      out.write("                                            </label>\n");
      out.write("                                            <input\n");
      out.write("                                                type=\"text\"\n");
      out.write("                                                name=\"Quantity\"\n");
      out.write("                                                class=\"form-control validate\"\n");
      out.write("                                                required\n");
      out.write("                                                />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group mb-3\" name=\"category\">\n");
      out.write("                                            <label\n");
      out.write("                                                for=\"category\"\n");
      out.write("                                                >Category</label\n");
      out.write("                                            >\n");
      out.write("                                            <select\n");
      out.write("                                                class=\"custom-select tm-select-accounts\"\n");
      out.write("                                                id=\"category\"\n");
      out.write("                                                >\n");
      out.write("                                                <option>Select Category</option>\n");
      out.write("                                            ");

                                                DaoCategory dc = new DaoCategory();
                                                List<Category> ac = dc.getCategory();
                                                for (int i = 0; i < ac.size(); i++) {
                                                    Category ca = ac.get(i);

                                            
      out.write("\n");
      out.write("\n");
      out.write("                                            <option>");
      out.print(ca.getName());
      out.write("</option>\n");
      out.write("                                            ");

                                                }
                                            
      out.write("\n");
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"form-group mb-3 col-xs-12 col-sm-6\">\n");
      out.write("                                            <label\n");
      out.write("                                                for=\"Discount\"\n");
      out.write("                                                >Discount\n");
      out.write("                                            </label>\n");
      out.write("                                            <input\n");
      out.write("                                                id=\"Discount\"\n");
      out.write("                                                name=\"Discount\"\n");
      out.write("                                                type=\"text\"\n");
      out.write("                                                class=\"form-control validate\"\n");
      out.write("                                                data-large-mode=\"true\"\n");
      out.write("                                                />\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <!--                            <div class=\"col-xl-6 col-lg-6 col-md-12 mx-auto mb-4\">\n");
      out.write("                                                            <div class=\"tm-product-img-dummy mx-auto\">\n");
      out.write("                                                                <i\n");
      out.write("                                                                    class=\"fas fa-cloud-upload-alt tm-upload-icon\"\n");
      out.write("                                                                    onclick=\"document.getElementById('fileInput').click();\"\n");
      out.write("                                                                    ></i>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"custom-file mt-3 mb-3\">\n");
      out.write("                                                                <input id=\"fileInput\" type=\"file\" style=\"display:none;\" />\n");
      out.write("                                                                <input\n");
      out.write("                                                                    type=\"button\"\n");
      out.write("                                                                    class=\"btn btn-primary btn-block mx-auto\"\n");
      out.write("                                                                    value=\"UPLOAD PRODUCT IMAGE\"\n");
      out.write("                                                                    onclick=\"document.getElementById('fileInput').click();\"\n");
      out.write("                                                                    />\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>-->\n");
      out.write("                            <div class=\"col-7\">\n");
      out.write("                                <input  name=\"type\" value=\"add\" style=\"display:none;\" />\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary btn-block text-uppercase\">Add Product Now</button>\n");
      out.write("                            </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <footer class=\"tm-footer row tm-mt-small\">\n");
      out.write("\n");
      out.write("        </footer> \n");
      out.write("\n");
      out.write("        <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <!-- https://jquery.com/download/ -->\n");
      out.write("        <script src=\"jquery-ui-datepicker/jquery-ui.min.js\"></script>\n");
      out.write("        <!-- https://jqueryui.com/download/ -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- https://getbootstrap.com/ -->\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#expire_date\").datepicker();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
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
