
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <!-- <<Mobile Viewport Code>> -->
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

        <!-- <<Attched Stylesheets>> -->
        <link rel="stylesheet" href="css/theme.css" type="text/css" />
        <link rel="stylesheet" href="css/media.css" type="text/css" />
        <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css" />
        <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,600,600italic,400italic,800,700' rel='stylesheet' type='text/css'>    
        <link href='https://fonts.googleapis.com/css?family=Oswald:400,700,300' rel='stylesheet' type='text/css'>

        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <meta charset="utf-8" />
        <title>Pakistan's Airlines</title>

        <meta name="description" content="and Validation" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

        <!-- bootstrap & fontawesome -->
        <link rel="stylesheet" href="assets/css/bootstrap.min.css" />
        <link rel="stylesheet" href="assets/css/font-awesome.min.css" />

        <!-- page specific plugin styles -->
        <link rel="stylesheet" href="assets/css/select2.css" />

        <!-- text fonts -->
        <link rel="stylesheet" href="assets/css/ace-fonts.css" />

        <!-- ace styles -->
        <link rel="stylesheet" href="assets/css/ace.min.css" id="main-ace-style" />

        <!--[if lte IE 9]>
                <link rel="stylesheet" href="../assets/css/ace-part2.min.css" />
        <![endif]-->
        <link rel="stylesheet" href="assets/css/ace-skins.min.css" />
        <link rel="stylesheet" href="assets/css/ace-rtl.min.css" />

        <!--[if lte IE 9]>
          <link rel="stylesheet" href="../assets/css/ace-ie.min.css" />
        <![endif]-->

        <!-- inline styles related to this page -->

        <!-- ace settings handler -->
        <script>

            src = "assets/js/ace-extra.min.js"

            function letter_validation() {
                var to = document.getElementById('form-field-1').value;
                var from = document.getElementById('form-field-1-1').value;
                var date = document.getElementById('form-field-1-2').value;

//                var letters = /^[A-Za-z]+$/;
                var blank = "";

                if (to == blank) {
                    document.getElementById("chk").innerHTML = "Invalid Entries";
                    return false;
                } 
//                else if (!to.match(letters)) {
//                    document.getElementById("chk").innerHTML = "Only letters are allowed!";
//                    return false;
//                }

                if (from == blank) {
                    document.getElementById("chk").innerHTML = "Invalid Entries";
                    return false;
                }
//                else if (!from.match(letters)) {
//                    document.getElementById("chk").innerHTML = "Only letters are allowed!";
//                    return false;
//                }

                if (date == blank) {
                    document.getElementById("chk").innerHTML = "Invalid Entries";
                    return false;
                }

                if (from == to) {
                    document.getElementById("chk").innerHTML = "Please select two different cities!";
                    return false;
                }
                ;

            }


        </script>


        <!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->

        <!--[if lte IE 8]>
        <script src="../assets/js/html5shiv.min.js"></script>
        <script src="../assets/js/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>

        <!-- \\ Begin Holder \\ -->
        <div class="DesignHolder">
            <!-- \\ Begin Frame \\ -->
            <div class="LayoutFrame">
                <!-- \\ Begin Header \\ -->
                <header>
                    <div class="Center">
                        <div class="site-logo">
                            <h1><a href="#"><span>FTA</span>&nbsp;Airlines</a></h1>
                        </div>
                        <div id="mobile_sec">
                            <div class="mobile"><i class="fa fa-bars"></i><i class="fa fa-times"></i></div>
                            <div class="menumobile">
                                <!-- \\ Begin Navigation \\ -->
                                <nav class="Navigation">
                                    <ul>
                                        <li class="active">                                
                                            <a href="#home">Home</a>
                                            <span class="menu-item-bg"></span>
                                        </li>
                                        <li>
                                            <a href="#about">About</a>
                                            <span class="menu-item-bg"></span>
                                        </li>
                                        <li>
                                            <a href="#services">Services</a>
                                            <span class="menu-item-bg"></span>
                                        </li>
                                        <li>
                                            <a href="#booking">Ticket Booking</a>
                                            <span class="menu-item-bg"></span>
                                        </li>
                                        <li>
                                            <a href="#contact">Contact</a>
                                            <span class="menu-item-bg"></span>
                                        </li>
                                    </ul>

                                </nav>
                                <!-- // End Navigation // -->
                            </div>

                        </div>
                        <div class="clear"></div>
                    </div>
                    <button class="btn" style="float: right" onclick="window.location.href = 'login.jsp'">
                        Login
                    </button>
                </header>
                <!-- // End Header // -->
                <!-- \\ Begin Banner Section \\ -->
                <div class="Banner_sec" id="home">
                    <!--  \\ Begin banner Side -->
                    <div class="bannerside">
                        <div class="Center">
                            <!--  \\ Begin Left Side -->
                            <div class="leftside">
                                <h3>Welcome to <span>FTA Airlines</span></h3>
                                <p>FTA Airlines is based in Lahore. Our aim is to offer great value for money and efficient services.</p>
                                <a href="#about">MORE DETAILS</a>
                            </div>                        								
                            <!--  // End Left Side // -->
                            <!--  \\ Begin Right Side -->
                            <div class="rightside">
                                <ul id="slider">	
                                    <li>
                                        <div class="Slider">
                                            <figure><img src="img/Slider-img1.jpg" alt="image"></figure>

                                        </div>
                                    </li>
                                    <li>
                                        <div class="Slider">
                                            <figure><img src="img/Slider-img2.jpg" alt="image"></figure>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="Slider">
                                            <figure><img src="img/Slider-img3.jpg" alt="image"></figure>
                                        </div>
                                    </li>
                                </ul>                                                            
                                <figure><img src="img/Shadow-img.png" alt="image" class="Shadow"></figure>                                                        
                            </div>
                            <!--  // End Right Side // -->
                        </div>
                    </div>
                    <!--  // End banner Side // -->
                    <div class="clear"></div>
                </div>
                <!-- // End Banner Section // -->
                <div class="bgcolor"></div>
                <!-- \\ Begin Container \\ -->
                <div id="Container">
                    <!-- \\ Begin About Section \\ -->
                    <div class="About_sec" id="about">
                        <div class="Center">            	
                            <h2>about us</h2>            		
                            <p>FTA Airline is based in Lahore, Pakistan. The airline started its operation on April 29, 2014. Connecting about 5 cities of Pakistan. Our aim is to offer great value for money and efficient services. The airline provides all essential on board services like free standardized meals and on board entertainment to its passengers unlike other low cost carrier.</p>
                            <div class="Line"></div>	
                            <!-- \\ Begin Tab side \\ -->
                            <div class="Tabside">
                                <ul>
                                    <li><a href="javascript:;" class="tabLink activeLink" id="cont-1">Mision</a></li>
                                    <li><a href="javascript:;" class="tabLink" id="cont-2">vision</a></li>
                                    <li><a href="javascript:;" class="tabLink" id="cont-3">Sponsors</a></li>
                                </ul>
                                <div class="clear"></div>
                                <div class="tabcontent" id="cont-1-1">
                                    <div class="TabImage">
                                        <div class="img1">
                                            <figure><img src="img/Slider-img3.jpg" alt="image"></figure>	
                                        </div>
                                        <div class="img2">
                                            <figure><img src="img/Slider-img1.jpg" alt="image"></figure>
                                        </div>
                                    </div>
                                    <div class="Description">
                                        <h3>Sed ac urna sit amet lorem<span>taciti sociosqu ad litora torquent per conubia</span></h3>
                                        <p>November is free HTML CSS website template from <span class="cyan">templatemo</span> and you can download and use it for any purpose. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam elit nunc, porta commodo euismod eu, fermentum a neque. Fusce scelerisque tincidunt auctor. Integer varius ullamcorper interdum.</p>
                                        <p>Phasellus pretium elementum rhoncus. Aenean sit amet odio eu ante volutpat rutrum. Vestibulum ullamcorper faucibus orci, in blandit massa fringilla at. Nulla in fermentum eros. Suspendisse vitae aliquam metus.</p>
                                    </div>
                                </div>
                                <div class="tabcontent hide" id="cont-2-1">
                                    <div class="TabImage">
                                        <div class="img1">
                                            <figure><img src="img/Slider-img2.jpg" alt="image"></figure>	
                                        </div>
                                        <div class="img2">
                                            <figure><img src="img/Slider-img1.jpg" alt="image"></figure>
                                        </div>
                                    </div>
                                    <div class="Description">
                                        <h3>Smauris vitae consequat<span>Vestibulum ullamcorper faucibus orci</span></h3>
                                        <p>Consequat ipsum, nec sagittis sem nibh id elit. Dui sed odio sit amet nibh vulputate cursus a sit amet mauris. Morbi accumsan ipsum velit. Namslo nec tellus a odio tincidunt auctor a ornare odio. Smauris vitae erat consequat sitsrl amet soi mauris auctor eu in elit. </p>
                                        <p>Class aptent taciti sociosqu ad litora torquent per conubia nostraper inceptos himenaeos. Mauris in erat justo. Nullam ac urna eu felis dapibus.</p>
                                    </div>
                                </div>
                                <div class="tabcontent hide" id="cont-3-1">
                                    <div class="TabImage">
                                        <div class="img1">
                                            <figure><img src="img/Slider-img2.jpg" alt="image"></figure>	
                                        </div>
                                        <div class="img2">
                                            <figure><img src="img/Slider-img1.jpg" alt="image"></figure>
                                        </div>
                                    </div>
                                    <div class="Description">
                                        h3>Smauris vitae consequat<span>Vestibulum ullamcorper faucibus orci</span></h3>
                                        <p>Consequat ipsum, nec sagittis sem nibh id elit. Dui sed odio sit amet nibh vulputate cursus a sit amet mauris. Morbi accumsan ipsum velit. Namslo nec tellus a odio tincidunt auctor a ornare odio. Smauris vitae erat consequat sitsrl amet soi mauris auctor eu in elit. </p>
                                        <p>Class aptent taciti sociosqu ad litora torquent per conubia nostraper inceptos himenaeos. Mauris in erat justo. Nullam ac urna eu felis dapibus.</p>
                                    </div>
                                </div>
                                <div class="clear"></div>	
                            </div>                    
                            <!-- // End Tab Side // -->
                        </div>
                    </div>
                    <!-- // End About Section // -->
                    <!-- \\ Begin Services Section \\ -->
                    <div class="Services_sec" id="services">
                        <div class="Center">
                            <h2>our Services</h2>
                            <p> Morbi accumsan ipsum velit. Nam nec tellus a odio tincidunt auctor a ornare odio. Sed non  mauris vitae erat consequat auctor eu in elit. Class aptent<br> taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.</p>		
                            <div class="Line"></div>
                            <!-- \\ Begin Services Side  \\ -->
                            <div class="Serviceside">
                                <ul>
                                    <li class="Development"><a href="#services"><h4>DEVELOPMENT</h4></a></li>
                                    <li class="Desdin"><a href="#services"><h4>DESIGN</h4></a></li>
                                    <li class="Concept"><a href="#services"><h4>CONCEPT</h4></a></li>
                                    <li class="System"><a href="#services"><h4>SYSTEM</h4></a></li>
                                </ul>
                            </div>
                            <!-- // End Services Side // -->
                        </div>                
                    </div>
                    <!-- // End Services Section // -->
                    <!-- \\ Begin Pricing Section \\ -->
                    <div class="Pricing_sec" id="booking">
                        <div class="Center">
                            <h2>Ticket Booking</h2>
                            <p>All plans come with unlimited disk space. Our support can be as quick as 15 minutes to get a response. Sed non<br>
                                mauris vitae erat consequat auctor eu in elit. Class aptent taciti sociosqu.</p>
                            <div class="Line"></div>
                            <!-- \\ Begin Pricing Side \\ -->
                            <div style="padding-top: 10px; padding-bottom: 10px; ">
                                <h3 style="color: red" id="chk">

                                    <%

                                        if (request.getAttribute("error") != null) {
                                            out.println(request.getAttribute("error"));
                                        }

                                    %>

                                </h3>
                            </div>
                            <div class="row">
                                <div class="col-xs-12">
                                    <!-- PAGE CONTENT BEGINS -->
                                    <form class="form-horizontal" action="search" onsubmit="return letter_validation()" method="POST">
                                        <!-- #section:elements.form -->
                                        <div class="form-group" >
                                            <label class="col-sm-5 control-label no-padding-right" for="form-field-1"> From </label>

                                            <div class="col-sm-7">
                                                  
                                                <select class="col-xs-10 col-sm-5" id="form-field-1" name="from">
                                                    <option value="">Select the City</option>
                                                    
                                                    
                                                      
                                                    <% try {
                                                            Class.forName("com.mysql.jdbc.Driver");
                                                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ars", "root", "root");
                                                            Statement stmt = con.createStatement();

                                                            ResultSet a = stmt.executeQuery("select * from city");
                                                            while (a.next()) {
                                                    %>
                                                    <option value="<%= a.getString("id")%>"> <%= a.getString("name")%> </option>

                                                    <%
                                                            }
                                                            
                                                        } catch (Exception e) {
                                                            System.out.println("Can't connect to Database!");
                                                        }
                                                    %>

                                                </select>

                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="col-sm-5 control-label no-padding-right" for="form-field-1"> To </label>

                                            <div class="col-sm-7">
                                                <select class="col-xs-10 col-sm-5" id="form-field-1-1" name="to">
                                                    <option value="">Select the City</option>
                                                    <%
                                                    System.out.println("hi thererere");
                                                        try {
                                                             
                                                            Class.forName("com.mysql.jdbc.Driver");
                                                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ars", "root", "root");
                                                            Statement stmt = con.createStatement();
                                                            System.out.println("hi thererere");
                                                            ResultSet a = stmt.executeQuery("select * from city");
                                                            while (a.next()) {
                                                    %>
                                                    <option value="<%= a.getString("id")%>"> <%= a.getString("name")%> </option>

                                                    <% 
                                                            }
                                                         
                                                        }  
                                                        catch (Exception e) {
                                                            System.out.println("Can't connect to Database!");
                                                        }
                                                    %>
                                                </select>

                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="col-sm-5 control-label no-padding-right" for="form-field-1"> Date </label>

                                            <div class="col-sm-7">
                                                <input type="date" id="form-field-1-2" name="date" class="col-xs-8 col-sm-5" />
                                            </div>
                                        </div>
                                        <div class="clearfix form-actions">
                                            <div class="col-md-offset-3 col-md-6">
                                                <button id="btn1" class="btn btn-info" type="submit">
                                                    <i class="ace-icon fa fa-check bigger-110"></i>
                                                    Search
                                                </button>

                                                &nbsp; &nbsp; &nbsp;
                                                <button class="btn" type="reset">
                                                    <i class="ace-icon fa fa-undo bigger-110"></i>
                                                    Reset
                                                </button>
                                            </div>
                                        </div>
                                    </form>


                                </div>
                            </div>
                        </div><!-- /.span -->
                    </div><!-- /.row -->


                </div>
            </div>
            <!-- // End Pricing Section // -->
            <!-- \\ Begin Contact Section \\ -->
            <div class="Contact_sec" id="contact">
                <div class="Contactside">
                    <div class="Center">
                        <h2>contact us</h2>
                        <p>Sed non neque elit. Sed ut imperdiet nisi. Proin condimentum fermentum nunc. Etiam pharetra, erat sed fermentum<br>
                            feugiat velit mauris egestas quamut aliquam massa nisl quis neque. Suspendisse in orci enim.</p>
                        <div class="Line"></div>
                    </div>  

                </div>

                <div class="Map">

                    <div id="GoogleMap"></div>

                </div>

                <!-- \\ Begin Get Section \\ -->
                <div class="Get_sec">
                    <div class="Mid">					
                        <!-- \\ Begin Left Side \\ -->
                        <div class="Leftside">
                            <form action="#">
                                <fieldset>
                                    <p><input type="text" value="" placeholder="NAME" class="field"></p>
                                    <p><input type="email" value="" placeholder="EMAIL" class="field"></p>
                                    <p><input type="text" value="" placeholder="TITLE" class="field"></p>
                                    <p><textarea cols="2"  rows="2" placeholder="MESSAGE"></textarea></p>
                                    <p><input type="submit" value="send" class="button"></p>
                                </fieldset>
                            </form>
                        </div>
                        <!-- // End Left Side // -->
                        <!-- \\ Begin Right Side \\ -->
                        <div class="Rightside">
                            <h3>Get in touch !</h3>
                            <address>
                                990 Proin Gravida Street, Aliquet Snean Tate,<br>Lincoln Way, San Francisco, California.
                            </address>	
                            <address class="Number">
                                (+001) 001 002 0034, (+002) 009 008 0760<br>(+003) 456 050 0670 
                            </address>	
                            <address class="Email">
                                <a href="mailto:info@november.com">info@november.com</a>
                            </address>	
                            <div class="clear"></div>
                            <ul>
                                <li><a rel="nofollow" href="http://www.facebook.com/templatemo"
                                       target="_parent"><img src="img/facebook-icn.png" alt="image"></a></li>
                                <li><a href="#"><img src="img/twitter-icn.png" alt="image"></a></li>
                                <li><a href="#"><img src="img/google-plus-icn.png" alt="image"></a></li>
                            </ul>
                        </div>
                        <!-- // End Right Side // -->
                    </div>
                    <!-- \\ Begin Footer \\-->
                    <footer>
                        <div class="Cntr">                
                            <p>COPYRIGHT © 2084 COMPANY NAME. DESIGN: <a rel="nofollow" href="http://www.templatemo.com" target="_parent">TEMPLATEMO</a></p>
                        </div>
                    </footer>
                    <!-- // End Footer // -->
                </div>
                <!-- // End Get Section // -->

            </div>
            <!-- // End Contact Section // -->
        </div>
        <!-- // End Container // -->
    </div>
    <!-- // End Layout Frame // -->
</div>
<!-- // End Design Holder // -->
<div id="loader-wrapper">
    <div id="loader"></div>

    <div class="loader-section section-left"></div>
    <div class="loader-section section-right"></div>

</div>

<!-- <<Attched Javascripts>> -->
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="js/jquery.sudoSlider.min.js"></script>
<script type="text/javascript" src="js/global.js"></script>
<script type="text/javascript" src="js/modernizr.js"></script>

</body>
</html>


