package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("\t\t<meta charset=\"utf-8\" />\n");
      out.write("\t\t<title>FT Login</title>\n");
      out.write("\n");
      out.write("\t\t<meta name=\"description\" content=\"User login page\" />\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0\" />\n");
      out.write("\n");
      out.write("\t\t<!-- bootstrap & fontawesome -->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\" />\n");
      out.write("\n");
      out.write("\t\t<!-- text fonts -->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/ace-fonts.css\" />\n");
      out.write("\n");
      out.write("\t\t<!-- ace styles -->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/ace.min.css\" />\n");
      out.write("\n");
      out.write("\t\t<!--[if lte IE 9]>\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"../assets/css/ace-part2.min.css\" />\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/ace-rtl.min.css\" />\n");
      out.write("\n");
      out.write("\t\t<!--[if lte IE 9]>\n");
      out.write("\t\t  <link rel=\"stylesheet\" href=\"../assets/css/ace-ie.min.css\" />\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/ace.onpage-help.css\" />\n");
      out.write("\n");
      out.write("\t\t<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("\n");
      out.write("\t\t<!--[if lt IE 9]>\n");
      out.write("\t\t<script src=\"../assets/js/html5shiv.js\"></script>\n");
      out.write("\t\t<script src=\"../assets/js/respond.min.js\"></script>\n");
      out.write("\t\t<![endif]-->\n");
      out.write("                \n");
      out.write("                <script>\n");
      out.write("                    function validation() {\n");
      out.write("                        var nam = document.getElementById('n').value;\n");
      out.write("                        var pas  = document.getElementById('p').value;\n");
      out.write("                        var blank = \"\";\n");
      out.write("                        if (pas == blank) {\n");
      out.write("                                document.getElementById(\"chk\").innerHTML = \"Invalid username/password\";\n");
      out.write("                                return false;\n");
      out.write("                        }\n");
      out.write("                        if (nam == blank) {\n");
      out.write("                                document.getElementById(\"chk\").innerHTML = \"Invalid username/password\";\n");
      out.write("                                return false;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                </script>\n");
      out.write("\t</head>\n");
      out.write("\n");
      out.write("\t<body class=\"login-layout\">\n");
      out.write("\t\t<div class=\"main-container\">\n");
      out.write("\t\t\t<div class=\"main-content\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-10 col-sm-offset-1\">\n");
      out.write("                                            <div class=\"login-container\" style=\"margin-top: 100px\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"center\">\n");
      out.write("\t\t\t\t\t\t\t\t<h1>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"red\">FT</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"white\" id=\"id-text2\">Airlines</span>\n");
      out.write("\t\t\t\t\t\t\t\t</h1>\n");
      out.write("\t\t\t\t\t\t\t\t<h4 class=\"blue\" id=\"id-company-text\"> Admin Login</h4>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"space-6\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"position-relative\">\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"login-box\" class=\"login-box visible widget-box no-border\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"widget-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"widget-main\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"header blue lighter bigger\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tPlease Enter Your Information\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</h4>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"space-6\"></div>\n");
      out.write("\n");
      out.write("                                                                                        <form action=\"LoginServlet\" method=\"POST\" onsubmit=\"return validation()\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"block clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"n\" type=\"text\" name=\"name\" class=\"form-control\" placeholder=\"Username\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-user\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"block clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"p\" type=\"password\" name=\"pass\" class=\"form-control\" placeholder=\"Password\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-lock\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"space\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"width-35 pull-right btn btn-sm btn-primary\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-key\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"bigger-110\">Login</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("                                                                                                            <button class=\"width-35 pull-left btn btn-sm btn\" type=\"button\" onclick=\"window.location.href = 'index.jsp'\">\n");
      out.write("                                                                                                                    Back\n");
      out.write("                                                                                                            </button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"space-4\"></div>\n");
      out.write("                                                                                                        <h4 style=\"color: red;float:right\" id=\"chk\">\n");
      out.write("                                                                                                            ");


                                                                                                                if(request.getAttribute("error") != null){
                                                                                                                    out.println(request.getAttribute("error"));
                                                                                                                }

                                                                                                            
      out.write("\n");
      out.write("                                                                                                        </h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("                                                                                            \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div><!-- /.widget-main -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div><!-- /.widget-body -->\n");
      out.write("\t\t\t\t\t\t\t\t</div><!-- /.login-box -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div><!-- /.col -->\n");
      out.write("\t\t\t\t</div><!-- /.row -->\n");
      out.write("\t\t\t</div><!-- /.main-content -->\n");
      out.write("\t\t</div><!-- /.main-container -->\n");
      out.write("\n");
      out.write("\t\t<!-- basic scripts -->\n");
      out.write("\n");
      out.write("\t\t<!--[if !IE]> -->\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\twindow.jQuery || document.write(\"<script src='assets/js/jquery.min.js'>\"+\"<\"+\"/script>\");\n");
      out.write("\t\t</script>\n");
      out.write("\n");
      out.write("\t\t<!-- <![endif]-->\n");
      out.write("\n");
      out.write("\t\t<!--[if IE]>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write(" window.jQuery || document.write(\"<script src='../assets/js/jquery1x.min.js'>\"+\"<\"+\"/script>\");\n");
      out.write("</script>\n");
      out.write("<![endif]-->\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\tif('ontouchstart' in document.documentElement) document.write(\"<script src='assets/js/jquery.mobile.custom.min.js'>\"+\"<\"+\"/script>\");\n");
      out.write("\t\t</script>\n");
      out.write("\n");
      out.write("\t\t<!-- inline scripts related to this page -->\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t$('body').attr('class', 'login-layout blur-login');\n");
      out.write("\t\t\t\t$('#id-text2').attr('class', 'white');\n");
      out.write("\t\t\t\t$('#id-company-text').attr('class', 'light-blue');\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t</script>\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("               ");
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
