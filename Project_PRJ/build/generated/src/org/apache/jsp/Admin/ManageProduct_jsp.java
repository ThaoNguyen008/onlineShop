package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Category;
import java.util.ArrayList;
import java.util.ArrayList;
import dal.DaoCategory;
import java.util.List;
import model.Product;
import dal.DaoProduct;

public final class ManageProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\n");
      out.write("        <title>CLOTHES SHOP-ADMIN</title>\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Roboto:400,700\"\n");
      out.write("            />\n");
      out.write("        <!-- https://fonts.google.com/specimen/Roboto -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://localhost:8080/project/assets/css/fontawesome.min.css\" />\n");
      out.write("        <!-- https://fontawesome.com/ -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://localhost:8080/project/assets/css/bootstrap.min.css\" />\n");
      out.write("        <!-- https://getbootstrap.com/ -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://localhost:8080/project/assets/css/templatemo-style.css\">\n");
      out.write("        <!--\n");
      out.write("            Product Admin CSS Template\n");
      out.write("            https://templatemo.com/tm-524-product-admin\n");
      out.write("        -->\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body id=\"reportsPage\">\n");
      out.write("        <nav class=\"navbar navbar-expand-xl\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./AdminCommon/header.jsp", out, false);
      out.write("\n");
      out.write("            </nav>\n");
      out.write("            <div class=\"container mt-5\">\n");
      out.write("                <div class=\"row tm-content-row\">\n");
      out.write("                    <div class=\"col-sm-12 col-md-12 col-lg-8 col-xl-8 tm-block-col\">\n");
      out.write("                        <form action=\"Product\" method=\"POST\">\n");
      out.write("                        <div class=\"tm-bg-primary-dark tm-block tm-block-products\">\n");
      out.write("                            <div class=\"tm-product-table-container\">\n");
      out.write("                                <table class=\"table table-hover tm-table-small tm-product-table\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("\n");
      out.write("                                            <th scope=\"col\">Product ID</th>\n");
      out.write("                                            <th scope=\"col\">Product Name</th>\n");
      out.write("                                            <th scope=\"col\">Decription</th>\n");
      out.write("                                            <th scope=\"col\">Image</th>\n");
      out.write("                                            <th scope=\"col\">Price</th>\n");
      out.write("                                            <th scope=\"col\">Quantity</th>\n");
      out.write("                                            <th scope=\"col\">Category</th>\n");
      out.write("                                            <th scope=\"col\">Discount</th>\n");
      out.write("                                            <th scope=\"col\">Action</th>\n");
      out.write("\n");
      out.write("                                            <th scope=\"col\">&nbsp;</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                    ");

                                        DaoProduct dp = new DaoProduct();
                                        List<Product> arrp = dp.getProduct();
                                        for (int i = 0; i < arrp.size(); i++) {
                                            Product pd = arrp.get(i);
                                    
      out.write("\n");
      out.write("                                    <tr onclick=\"editProduct(");
      out.print(pd.getProductid());
      out.write(")\">\n");
      out.write("\n");
      out.write("                                        <td>");
      out.print( pd.getProductid());
      out.write("</td>\n");
      out.write("                                        <td class=\"tm-product-name\">");
      out.print( pd.getProductname());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( pd.getDetail());
      out.write("</td>\n");
      out.write("                                        <td><img height=\"50px\" width=\"50px\" src=\"..//assets/images/product/");
      out.print(pd.getImage());
      out.write("\"></td>\n");
      out.write("                                        <td>");
      out.print( pd.getPrice());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( pd.getQuantily());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( pd.getCategoryID());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( pd.getDiscount());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                        <td>\n");
      out.write("                                             <input id=\"type\" type=\"text\" name=\"type\" value=\"delete\" style=\"display:none;\" />\n");
      out.write("                                            <a href=\"../Product?id=");
      out.print( pd.getProductid());
      out.write("\" class=\"tm-product-delete-link\">\n");
      out.write("                                                <i class=\"far fa-trash-alt tm-product-delete-icon\"></i>\n");
      out.write("                                            </a>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- table container -->\n");
      out.write("                        <a\n");
      out.write("                            href=\"add-product.jsp\"\n");
      out.write("                            class=\"btn btn-primary btn-block text-uppercase mb-3\">Add new product</a>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                            </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-12 col-md-12 col-lg-4 col-xl-4 tm-block-col\">\n");
      out.write("                    <div class=\"tm-bg-primary-dark tm-block tm-block-product-categories\">\n");
      out.write("                        <h2 class=\"tm-block-title\">Product Categories</h2>\n");
      out.write("                        <div class=\"tm-product-table-container\">\n");
      out.write("                            <table class=\"table tm-table-small tm-product-table\">\n");
      out.write("                                <tbody>\n");
      out.write("                                    ");

                                        DaoCategory dc = new DaoCategory();
                                        List<Category> ac = dc.getCategory();
                                        for (int i = 0; i < ac.size(); i++) {
                                            Category ca = ac.get(i);

                                    
      out.write("\n");
      out.write("                                    <tr onclick=\"editCategory(");
      out.print(ca.getId());
      out.write(")\">\n");
      out.write("                                        <td class=\"tm-product-name\">");
      out.print(ca.getId());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(ca.getName());
      out.write("</td>\n");
      out.write("                                        <td class=\"text-center\">\n");
      out.write("                                            <a href=\"#\" class=\"tm-product-delete-link\">\n");
      out.write("                                                <i class=\"far fa-trash-alt tm-product-delete-icon\"></i>\n");
      out.write("                                            </a>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- table container -->\n");
      out.write("                        <a\n");
      out.write("                            href=\"add-Category.jsp\"\n");
      out.write("                            class=\"btn btn-primary btn-block text-uppercase mb-3\">   Add new category</a>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <footer class=\"tm-footer row tm-mt-small\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./AdminCommon/footer.jsp", out, false);
      out.write("\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <script src=\"http://localhost:8080/project/assets/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <!-- https://jquery.com/download/ -->\n");
      out.write("        <script src=\"http://localhost:8080/project/assets/js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- https://getbootstrap.com/ -->\n");
      out.write("        <script>\n");
      out.write("                                        function editProduct(id) {\n");
      out.write("                                            window.location.href = \"../Product?id=\" + id;\n");
      out.write("                                        }\n");
      out.write("                                        function editCategory(id) {\n");
      out.write("                                            window.location.href = \"updateCategory?id=\" + id;\n");
      out.write("                                        }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
