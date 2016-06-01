package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class update_005fs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\t<head>\n");
      out.write("            ");

                response.addHeader("Cache-Control", "no-cache,no-store,private,must-revalidate,max-stale=0,post-check=0,pre-check=0"); 
                response.addHeader("Pragma", "no-cache"); 
                response.addDateHeader ("Expires", 0);
            
      out.write("\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("\t\t<meta charset=\"utf-8\" />\n");
      out.write("\t\t<title>FT Airlines Admin Panel</title>\n");
      out.write("\n");
      out.write("\t\t<meta name=\"description\" content=\"overview &amp; stats\" />\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0\" />\n");
      out.write("\n");
      out.write("\t\t<!-- bootstrap & fontawesome -->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\" />\n");
      out.write("\n");
      out.write("\t\t<!-- page specific plugin styles -->\n");
      out.write("\n");
      out.write("\t\t<!-- text fonts -->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/ace-fonts.css\" />\n");
      out.write("\n");
      out.write("\t\t<!-- ace styles -->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/ace.min.css\" id=\"main-ace-style\" />\n");
      out.write("\n");
      out.write("\t\t<!--[if lte IE 9]>\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"../assets/css/ace-part2.min.css\" />\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/ace-skins.min.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/ace-rtl.min.css\" />\n");
      out.write("\n");
      out.write("\t\t<!--[if lte IE 9]>\n");
      out.write("\t\t  <link rel=\"stylesheet\" href=\"../assets/css/ace-ie.min.css\" />\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\n");
      out.write("\t\t<!-- inline styles related to this page -->\n");
      out.write("\n");
      out.write("\t\t<!-- ace settings handler -->\n");
      out.write("\t\t<script src=\"assets/js/ace-extra.min.js\"></script>\n");
      out.write("\n");
      out.write("\t\t<!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->\n");
      out.write("\n");
      out.write("\t\t<!--[if lte IE 8]>\n");
      out.write("\t\t<script src=\"../assets/js/html5shiv.min.js\"></script>\n");
      out.write("\t\t<script src=\"../assets/js/respond.min.js\"></script>\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\t</head>\n");
      out.write("\n");
      out.write("\t<body class=\"no-skin\">\n");
      out.write("\t\t<!-- #section:basics/navbar.layout -->\n");
      out.write("\t\t<div id=\"navbar\" class=\"navbar navbar-default\">\n");
      out.write("\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\ttry{ace.settings.check('navbar' , 'fixed')}catch(e){}\n");
      out.write("\t\t\t</script>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"navbar-container\" id=\"navbar-container\">\n");
      out.write("\t\t\t\t<!-- #section:basics/sidebar.mobile.toggle -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- /section:basics/sidebar.mobile.toggle -->\n");
      out.write("\t\t\t\t<div class=\"navbar-header pull-left\">\n");
      out.write("\t\t\t\t\t<!-- #section:basics/navbar.layout.brand -->\n");
      out.write("\t\t\t\t\t<a href=\"Admin-Home.jsp\" class=\"navbar-brand\">\n");
      out.write("\t\t\t\t\t\t<small>\n");
      out.write("\t\t\t\t\t\t\tFT Airlines Admin Panel\n");
      out.write("\t\t\t\t\t\t</small>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- /section:basics/navbar.layout.brand -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- #section:basics/navbar.toggle -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- /section:basics/navbar.toggle -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- #section:basics/navbar.dropdown -->\n");
      out.write("\t\t\t\t<div class=\"navbar-buttons navbar-header pull-right\" role=\"navigation\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav ace-nav\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!-- #section:basics/navbar.user_menu -->\n");
      out.write("\t\t\t\t\t\t<li class=\"light-blue\">\n");
      out.write("\t\t\t\t\t\t\t<a data-toggle=\"dropdown\" href=\"#\" class=\"dropdown-toggle\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"user-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<small>Welcome,</small>\n");
      out.write("                                                                        ");

                                                                            //allow access only if session exists
                                                                            if(session.getAttribute("user") == null){
                                                                                    response.sendRedirect("login.jsp");
                                                                            }
                                                                                String userName = null;
                                                                                String sessionID = null;
                                                                                Cookie[] cookies = request.getCookies();
                                                                                if(cookies !=null){
                                                                                for(Cookie cookie : cookies){
                                                                                        if(cookie.getName().equals("user")) userName = cookie.getValue();
                                                                                }
                                                                            }
                                                                        
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.print(userName);
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-caret-down\"></i>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close\">\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("                                                                    \n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("                                                                            <form action=\"LogoutServlet\" method=\"post\">\n");
      out.write("                                                                                <i class=\"ace-icon fa fa-power-off\"></i>\n");
      out.write("                                                                                <input type=\"submit\" value=\"Logout\" style=\"background-color: #FEE188\">\n");
      out.write("                                                                            </form>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!-- /section:basics/navbar.user_menu -->\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- /section:basics/navbar.dropdown -->\n");
      out.write("\t\t\t</div><!-- /.navbar-container -->\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- /section:basics/navbar.layout -->\n");
      out.write("\t\t<div class=\"main-container\" id=\"main-container\">\n");
      out.write("\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\ttry{ace.settings.check('main-container' , 'fixed')}catch(e){}\n");
      out.write("\t\t\t</script>\n");
      out.write("\n");
      out.write("\t\t\t<!-- #section:basics/sidebar -->\n");
      out.write("\t\t\t<div id=\"sidebar\" class=\"sidebar                  responsive\">\n");
      out.write("\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\ttry{ace.settings.check('sidebar' , 'fixed')}catch(e){}\n");
      out.write("\t\t\t\t</script>\n");
      out.write("\n");
      out.write("\t\t\t\t<ul class=\"nav nav-list\">\n");
      out.write("\t\t\t\t\t<li class=\"\">\n");
      out.write("\t\t\t\t\t\t<a href=\"Admin-Home.jsp\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"menu-icon fa fa-tachometer\"></i>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"menu-text\"> Dashboard </span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<b class=\"arrow\"></b>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"active\">\n");
      out.write("\t\t\t\t\t\t<a href=\"update_s.jsp\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"menu-icon fa fa-desktop\"></i>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"menu-text\"> Update Schedule </span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<b class=\"arrow\"></b>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"\">\n");
      out.write("\t\t\t\t\t\t<a href=\"update_p.jsp\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"menu-icon fa fa-list\"></i>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"menu-text\"> Update Passenger</span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<b class=\"arrow\"></b>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"\">\n");
      out.write("\t\t\t\t\t\t<a href=\"booking.jsp\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"menu-icon fa fa-pencil-square-o\"></i>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"menu-text\"> Seats Reservation</span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<b class=\"arrow\"></b>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"\">\n");
      out.write("\t\t\t\t\t\t<a href=\"seats_c.jsp\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"menu-icon fa fa-list-alt\"></i>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"menu-text\"> Seats Cancelation</span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<b class=\"arrow\"></b>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("                                        <li class=\"\">\n");
      out.write("\t\t\t\t\t\t<a href=\"admins.jsp\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"menu-icon fa fa-desktop\"></i>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"menu-text\"> Manage Admins</span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<b class=\"arrow\"></b>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t</div><!-- /.main-content -->\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"page-content-area\">\n");
      out.write("\t\t\t\t\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                    <div class=\"col-xs-9\">\n");
      out.write("                                        <!-- PAGE CONTENT BEGINS -->\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-xs-12\">\n");
      out.write("                                                <div class=\"page-header\">\n");
      out.write("                                                    <h1>Manage Flight Schedule</h1>\n");
      out.write("                                                </div><!-- /.page-header -->\n");
      out.write("                                                \n");
      out.write("                                                <table id=\"sample-table-1\" class=\"table table-striped table-bordered table-hover\">\n");
      out.write("                                                            <thead>\n");
      out.write("                                                                    <tr>\n");
      out.write("                                                                        <th>Departure Date</th>\n");
      out.write("                                                                        <th>Departure Time</th>\n");
      out.write("                                                                        <th>From</th>\n");
      out.write("                                                                        <th>To</th>\n");
      out.write("                                                                        <th>Actions</th>\n");
      out.write("                                                                    </tr>\n");
      out.write("                                                            </thead>\n");
      out.write("                                                            \n");
      out.write("                                                            ");

                    
                                                                try{    
                                                                    Class.forName("com.mysql.jdbc.Driver");
                                                                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ars","root", "root");
                                                                    Statement stmt = con.createStatement();

                                                                    ResultSet a = stmt.executeQuery("select departure_date,time,from_id,to_id"
                                                                                                   + "from flight_schedule");
                                                                    while(a.next()){
                                                            
      out.write("\n");
      out.write("                                                                                    \n");
      out.write("                                                                <tr>\n");
      out.write("                                                                        <td>\n");
      out.write("                                                                            ");
      out.print( a.getString("departure_date") );
      out.write("\n");
      out.write("                                                                            ");
      out.print( a.getString("time") );
      out.write("\n");
      out.write("                                                                            ");
      out.print( a.getString("from_id") );
      out.write("\n");
      out.write("                                                                            ");
      out.print( a.getString("to_id") );
      out.write("\n");
      out.write("                                                                        </td>\n");
      out.write("\n");
      out.write("                                                                        <td>\n");
      out.write("                                                                                <div class=\"hidden-sm hidden-xs btn-group\">\n");
      out.write("                                                                                    \n");
      out.write("                                                                                        <a href=\"update_admin?id='");
      out.print( a.getString("id") );
      out.write("'\" class=\"btn btn-primary btn-sm\"> <i class=\"ace-icon fa fa-edit\"> </i> </a>\n");
      out.write("\n");
      out.write("                                                                                        <a href=\"delete_admin?id='");
      out.print( a.getString("id") );
      out.write("'\" class=\"btn btn-danger btn-sm\"> <i class=\"ace-icon fa fa-trash-o\"> </i> </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                                </div>\n");
      out.write("                                                                        </td>\n");
      out.write("                                                                </tr>\n");
      out.write("                                                            \n");
      out.write("                                                            ");

                                                                }   
                                                                a.close();
                                                                }catch(Exception e){
                                                                     System.out.println("Can't connect to Database!");
                                                                }
                                                            
      out.write("\n");
      out.write("                                                </table>\n");
      out.write("                                                \n");
      out.write("                                                <div class=\"page-header\">\n");
      out.write("                                                    <a href=\"addAdmin.jsp\"><h5>+ Add new Admin</h5></a>\n");
      out.write("                                                </div><!-- /.page-header -->\n");
      out.write("\n");
      out.write("                                    <h4 style=\"color: greenyellow; float:right\" id=\"chk\">\n");
      out.write("                                        ");


                                            if(request.getAttribute("success") != null){
                                                out.println(request.getAttribute("success"));
                                            }
                                        
      out.write("\n");
      out.write("                                    </h4>\n");
      out.write("                                    <h4 style=\"color: red; float:right\" id=\"chk\">\n");
      out.write("                                        ");


                                            if(request.getAttribute("error") != null){
                                                out.println(request.getAttribute("error"));
                                            }
                                        
      out.write("\n");
      out.write("                                    </h4>\n");
      out.write("                                </div><!-- /.span -->\n");
      out.write("                        </div><!-- /.row -->\n");
      out.write("                         </div><!-- /.page-content-area -->\n");
      out.write("                    </div><!-- /.page-content -->\n");
      out.write("            </div><!-- /.main-content -->\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"footer\">\n");
      out.write("\t\t\t\t<div class=\"footer-inner\">\n");
      out.write("\t\t\t\t\t<!-- #section:basics/footer -->\n");
      out.write("\t\t\t\t\t<div class=\"footer-content\">\n");
      out.write("\t\t\t\t\t\t<span class=\"bigger-120\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"blue bolder\">FT</span>\n");
      out.write("\t\t\t\t\t\t\tAirlines &copy; 2016\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t&nbsp; &nbsp;\n");
      out.write("\t\t\t\t\t\t<span class=\"action-buttons\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-twitter-square light-blue bigger-150\"></i>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-facebook-square text-primary bigger-150\"></i>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-rss-square orange bigger-150\"></i>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- /section:basics/footer -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<a href=\"#\" id=\"btn-scroll-up\" class=\"btn-scroll-up btn btn-sm btn-inverse\">\n");
      out.write("\t\t\t\t<i class=\"ace-icon fa fa-angle-double-up icon-only bigger-110\"></i>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t</div><!-- /.main-container -->\n");
      out.write("\n");
      out.write("\t\t<!-- basic scripts -->\n");
      out.write("\n");
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
      out.write("\t\t<script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\t\t<!-- page specific plugin scripts -->\n");
      out.write("\n");
      out.write("\t\t<!--[if lte IE 8]>\n");
      out.write("\t\t  <script src=\"../assets/js/excanvas.min.js\"></script>\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\t\t<script src=\"assets/js/jquery-ui.custom.min.js\"></script>\n");
      out.write("\t\t<script src=\"assets/js/jquery.ui.touch-punch.min.js\"></script>\n");
      out.write("\t\t<script src=\"assets/js/jquery.easypiechart.min.js\"></script>\n");
      out.write("\t\t<script src=\"assets/js/jquery.sparkline.min.js\"></script>\n");
      out.write("\t\t<script src=\"assets/js/flot/jquery.flot.min.js\"></script>\n");
      out.write("\t\t<script src=\"assets/js/flot/jquery.flot.pie.min.js\"></script>\n");
      out.write("\t\t<script src=\"assets/js/flot/jquery.flot.resize.min.js\"></script>\n");
      out.write("\n");
      out.write("\t\t<!-- ace scripts -->\n");
      out.write("\t\t<script src=\"assets/js/ace-elements.min.js\"></script>\n");
      out.write("\t\t<script src=\"assets/js/ace.min.js\"></script>\n");
      out.write("\n");
      out.write("\t\t<!-- inline scripts related to this page -->\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\tjQuery(function($) {\n");
      out.write("\t\t\t\t$('.easy-pie-chart.percentage').each(function(){\n");
      out.write("\t\t\t\t\tvar $box = $(this).closest('.infobox');\n");
      out.write("\t\t\t\t\tvar barColor = $(this).data('color') || (!$box.hasClass('infobox-dark') ? $box.css('color') : 'rgba(255,255,255,0.95)');\n");
      out.write("\t\t\t\t\tvar trackColor = barColor == 'rgba(255,255,255,0.95)' ? 'rgba(255,255,255,0.25)' : '#E2E2E2';\n");
      out.write("\t\t\t\t\tvar size = parseInt($(this).data('size')) || 50;\n");
      out.write("\t\t\t\t\t$(this).easyPieChart({\n");
      out.write("\t\t\t\t\t\tbarColor: barColor,\n");
      out.write("\t\t\t\t\t\ttrackColor: trackColor,\n");
      out.write("\t\t\t\t\t\tscaleColor: false,\n");
      out.write("\t\t\t\t\t\tlineCap: 'butt',\n");
      out.write("\t\t\t\t\t\tlineWidth: parseInt(size/10),\n");
      out.write("\t\t\t\t\t\tanimate: /msie\\s*(8|7|6)/.test(navigator.userAgent.toLowerCase()) ? false : 1000,\n");
      out.write("\t\t\t\t\t\tsize: size\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t})\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t$('.sparkline').each(function(){\n");
      out.write("\t\t\t\t\tvar $box = $(this).closest('.infobox');\n");
      out.write("\t\t\t\t\tvar barColor = !$box.hasClass('infobox-dark') ? $box.css('color') : '#FFF';\n");
      out.write("\t\t\t\t\t$(this).sparkline('html',\n");
      out.write("\t\t\t\t\t\t\t\t\t {\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttagValuesAttribute:'data-values',\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype: 'bar',\n");
      out.write("\t\t\t\t\t\t\t\t\t\tbarColor: barColor ,\n");
      out.write("\t\t\t\t\t\t\t\t\t\tchartRangeMin:$(this).data('min') || 0\n");
      out.write("\t\t\t\t\t\t\t\t\t });\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t  //flot chart resize plugin, somehow manipulates default browser resize event to optimize it!\n");
      out.write("\t\t\t  //but sometimes it brings up errors with normal resize event handlers\n");
      out.write("\t\t\t  $.resize.throttleWindow = false;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t  var placeholder = $('#piechart-placeholder').css({'width':'90%' , 'min-height':'150px'});\n");
      out.write("\t\t\t  var data = [\n");
      out.write("\t\t\t\t{ label: \"social networks\",  data: 38.7, color: \"#68BC31\"},\n");
      out.write("\t\t\t\t{ label: \"search engines\",  data: 24.5, color: \"#2091CF\"},\n");
      out.write("\t\t\t\t{ label: \"ad campaigns\",  data: 8.2, color: \"#AF4E96\"},\n");
      out.write("\t\t\t\t{ label: \"direct traffic\",  data: 18.6, color: \"#DA5430\"},\n");
      out.write("\t\t\t\t{ label: \"other\",  data: 10, color: \"#FEE074\"}\n");
      out.write("\t\t\t  ]\n");
      out.write("\t\t\t  function drawPieChart(placeholder, data, position) {\n");
      out.write("\t\t\t \t  $.plot(placeholder, data, {\n");
      out.write("\t\t\t\t\tseries: {\n");
      out.write("\t\t\t\t\t\tpie: {\n");
      out.write("\t\t\t\t\t\t\tshow: true,\n");
      out.write("\t\t\t\t\t\t\ttilt:0.8,\n");
      out.write("\t\t\t\t\t\t\thighlight: {\n");
      out.write("\t\t\t\t\t\t\t\topacity: 0.25\n");
      out.write("\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\tstroke: {\n");
      out.write("\t\t\t\t\t\t\t\tcolor: '#fff',\n");
      out.write("\t\t\t\t\t\t\t\twidth: 2\n");
      out.write("\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\tstartAngle: 2\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tlegend: {\n");
      out.write("\t\t\t\t\t\tshow: true,\n");
      out.write("\t\t\t\t\t\tposition: position || \"ne\", \n");
      out.write("\t\t\t\t\t\tlabelBoxBorderColor: null,\n");
      out.write("\t\t\t\t\t\tmargin:[-30,15]\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t,\n");
      out.write("\t\t\t\t\tgrid: {\n");
      out.write("\t\t\t\t\t\thoverable: true,\n");
      out.write("\t\t\t\t\t\tclickable: true\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t })\n");
      out.write("\t\t\t }\n");
      out.write("\t\t\t drawPieChart(placeholder, data);\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t /**\n");
      out.write("\t\t\t we saved the drawing function and the data to redraw with different position later when switching to RTL mode dynamically\n");
      out.write("\t\t\t so that's not needed actually.\n");
      out.write("\t\t\t */\n");
      out.write("\t\t\t placeholder.data('chart', data);\n");
      out.write("\t\t\t placeholder.data('draw', drawPieChart);\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t  //pie chart tooltip example\n");
      out.write("\t\t\t  var $tooltip = $(\"<div class='tooltip top in'><div class='tooltip-inner'></div></div>\").hide().appendTo('body');\n");
      out.write("\t\t\t  var previousPoint = null;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t  placeholder.on('plothover', function (event, pos, item) {\n");
      out.write("\t\t\t\tif(item) {\n");
      out.write("\t\t\t\t\tif (previousPoint != item.seriesIndex) {\n");
      out.write("\t\t\t\t\t\tpreviousPoint = item.seriesIndex;\n");
      out.write("\t\t\t\t\t\tvar tip = item.series['label'] + \" : \" + item.series['percent']+'%';\n");
      out.write("\t\t\t\t\t\t$tooltip.show().children(0).text(tip);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t$tooltip.css({top:pos.pageY + 10, left:pos.pageX + 10});\n");
      out.write("\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t$tooltip.hide();\n");
      out.write("\t\t\t\t\tpreviousPoint = null;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t });\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\tvar d1 = [];\n");
      out.write("\t\t\t\tfor (var i = 0; i < Math.PI * 2; i += 0.5) {\n");
      out.write("\t\t\t\t\td1.push([i, Math.sin(i)]);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\tvar d2 = [];\n");
      out.write("\t\t\t\tfor (var i = 0; i < Math.PI * 2; i += 0.5) {\n");
      out.write("\t\t\t\t\td2.push([i, Math.cos(i)]);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\tvar d3 = [];\n");
      out.write("\t\t\t\tfor (var i = 0; i < Math.PI * 2; i += 0.2) {\n");
      out.write("\t\t\t\t\td3.push([i, Math.tan(i)]);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\tvar sales_charts = $('#sales-charts').css({'width':'100%' , 'height':'220px'});\n");
      out.write("\t\t\t\t$.plot(\"#sales-charts\", [\n");
      out.write("\t\t\t\t\t{ label: \"Domains\", data: d1 },\n");
      out.write("\t\t\t\t\t{ label: \"Hosting\", data: d2 },\n");
      out.write("\t\t\t\t\t{ label: \"Services\", data: d3 }\n");
      out.write("\t\t\t\t], {\n");
      out.write("\t\t\t\t\thoverable: true,\n");
      out.write("\t\t\t\t\tshadowSize: 0,\n");
      out.write("\t\t\t\t\tseries: {\n");
      out.write("\t\t\t\t\t\tlines: { show: true },\n");
      out.write("\t\t\t\t\t\tpoints: { show: true }\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\txaxis: {\n");
      out.write("\t\t\t\t\t\ttickLength: 0\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tyaxis: {\n");
      out.write("\t\t\t\t\t\tticks: 10,\n");
      out.write("\t\t\t\t\t\tmin: -2,\n");
      out.write("\t\t\t\t\t\tmax: 2,\n");
      out.write("\t\t\t\t\t\ttickDecimals: 3\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tgrid: {\n");
      out.write("\t\t\t\t\t\tbackgroundColor: { colors: [ \"#fff\", \"#fff\" ] },\n");
      out.write("\t\t\t\t\t\tborderWidth: 1,\n");
      out.write("\t\t\t\t\t\tborderColor:'#555'\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t$('#recent-box [data-rel=\"tooltip\"]').tooltip({placement: tooltip_placement});\n");
      out.write("\t\t\t\tfunction tooltip_placement(context, source) {\n");
      out.write("\t\t\t\t\tvar $source = $(source);\n");
      out.write("\t\t\t\t\tvar $parent = $source.closest('.tab-content')\n");
      out.write("\t\t\t\t\tvar off1 = $parent.offset();\n");
      out.write("\t\t\t\t\tvar w1 = $parent.width();\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\tvar off2 = $source.offset();\n");
      out.write("\t\t\t\t\t//var w2 = $source.width();\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\tif( parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2) ) return 'right';\n");
      out.write("\t\t\t\t\treturn 'left';\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t$('.dialogs,.comments').ace_scroll({\n");
      out.write("\t\t\t\t\tsize: 300\n");
      out.write("\t\t\t    });\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t//Android's default browser somehow is confused when tapping on label which will lead to dragging the task\n");
      out.write("\t\t\t\t//so disable dragging when clicking on label\n");
      out.write("\t\t\t\tvar agent = navigator.userAgent.toLowerCase();\n");
      out.write("\t\t\t\tif(\"ontouchstart\" in document && /applewebkit/.test(agent) && /android/.test(agent))\n");
      out.write("\t\t\t\t  $('#tasks').on('touchstart', function(e){\n");
      out.write("\t\t\t\t\tvar li = $(e.target).closest('#tasks li');\n");
      out.write("\t\t\t\t\tif(li.length == 0)return;\n");
      out.write("\t\t\t\t\tvar label = li.find('label.inline').get(0);\n");
      out.write("\t\t\t\t\tif(label == e.target || $.contains(label, e.target)) e.stopImmediatePropagation() ;\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t$('#tasks').sortable({\n");
      out.write("\t\t\t\t\topacity:0.8,\n");
      out.write("\t\t\t\t\trevert:true,\n");
      out.write("\t\t\t\t\tforceHelperSize:true,\n");
      out.write("\t\t\t\t\tplaceholder: 'draggable-placeholder',\n");
      out.write("\t\t\t\t\tforcePlaceholderSize:true,\n");
      out.write("\t\t\t\t\ttolerance:'pointer',\n");
      out.write("\t\t\t\t\tstop: function( event, ui ) {\n");
      out.write("\t\t\t\t\t\t//just for Chrome!!!! so that dropdowns on items don't appear below other items after being moved\n");
      out.write("\t\t\t\t\t\t$(ui.item).css('z-index', 'auto');\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t);\n");
      out.write("\t\t\t\t$('#tasks').disableSelection();\n");
      out.write("\t\t\t\t$('#tasks input:checkbox').removeAttr('checked').on('click', function(){\n");
      out.write("\t\t\t\t\tif(this.checked) $(this).closest('li').addClass('selected');\n");
      out.write("\t\t\t\t\telse $(this).closest('li').removeClass('selected');\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t//show the dropdowns on top or bottom depending on window height and menu position\n");
      out.write("\t\t\t\t$('#task-tab .dropdown-hover').on('mouseenter', function(e) {\n");
      out.write("\t\t\t\t\tvar offset = $(this).offset();\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\tvar $w = $(window)\n");
      out.write("\t\t\t\t\tif (offset.top > $w.scrollTop() + $w.innerHeight() - 100) \n");
      out.write("\t\t\t\t\t\t$(this).addClass('dropup');\n");
      out.write("\t\t\t\t\telse $(this).removeClass('dropup');\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t})\n");
      out.write("\t\t</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!-- the following scripts are used in demo only for onpage help and you don't need them -->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/ace.onpage-help.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"docs/assets/js/themes/sunburst.css\" />\n");
      out.write("\n");
      out.write("\t\t<script type=\"text/javascript\"> ace.vars['base'] = '..'; </script>\n");
      out.write("\t\t<script src=\"assets/js/ace/elements.onpage-help.js\"></script>\n");
      out.write("\t\t<script src=\"assets/js/ace/ace.onpage-help.js\"></script>\n");
      out.write("\t\t<script src=\"docs/assets/js/rainbow.js\"></script>\n");
      out.write("\t\t<script src=\"docs/assets/js/language/generic.js\"></script>\n");
      out.write("\t\t<script src=\"docs/assets/js/language/html.js\"></script>\n");
      out.write("\t\t<script src=\"docs/assets/js/language/css.js\"></script>\n");
      out.write("\t\t<script src=\"docs/assets/js/language/javascript.js\"></script>\n");
      out.write("\t</body>\n");
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
