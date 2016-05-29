<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>FT Login</title>

		<meta name="description" content="User login page" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

		<!-- bootstrap & fontawesome -->
		<link rel="stylesheet" href="assets/css/bootstrap.min.css" />
		<link rel="stylesheet" href="assets/css/font-awesome.min.css" />

		<!-- text fonts -->
		<link rel="stylesheet" href="assets/css/ace-fonts.css" />

		<!-- ace styles -->
		<link rel="stylesheet" href="assets/css/ace.min.css" />

		<!--[if lte IE 9]>
			<link rel="stylesheet" href="../assets/css/ace-part2.min.css" />
		<![endif]-->
		<link rel="stylesheet" href="assets/css/ace-rtl.min.css" />

		<!--[if lte IE 9]>
		  <link rel="stylesheet" href="../assets/css/ace-ie.min.css" />
		<![endif]-->
		<link rel="stylesheet" href="assets/css/ace.onpage-help.css" />

		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

		<!--[if lt IE 9]>
		<script src="../assets/js/html5shiv.js"></script>
		<script src="../assets/js/respond.min.js"></script>
		<![endif]-->
                
                <script>
                    function validation() {
                        var nam = document.getElementById('n').value;
                        var pas  = document.getElementById('p').value;
                        var blank = "";
                        if (pas == blank) {
                                document.getElementById("chk").innerHTML = "Invalid username/password";
                                return false;
                        }
                        if (nam == blank) {
                                document.getElementById("chk").innerHTML = "Invalid username/password";
                                return false;
                        }
                    }
                </script>
	</head>

	<body class="login-layout">
		<div class="main-container">
			<div class="main-content">
				<div class="row">
					<div class="col-sm-10 col-sm-offset-1">
                                            <div class="login-container" style="margin-top: 100px">
							<div class="center">
								<h1>
									<span class="red">FT</span>
									<span class="white" id="id-text2">Airlines</span>
								</h1>
								<h4 class="blue" id="id-company-text"> Admin Login</h4>
							</div>

							<div class="space-6"></div>

							<div class="position-relative">
								<div id="login-box" class="login-box visible widget-box no-border">
									<div class="widget-body">
										<div class="widget-main">
											<h4 class="header blue lighter bigger">
												
												Please Enter Your Information
											</h4>

											<div class="space-6"></div>

                                                                                        <form action="LoginServlet" method="POST" onsubmit="return validation()" >
												<fieldset>
													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input id="n" type="text" name="name" class="form-control" placeholder="Username" />
															<i class="ace-icon fa fa-user"></i>
														</span>
													</label>

													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input id="p" type="password" name="pass" class="form-control" placeholder="Password" />
															<i class="ace-icon fa fa-lock"></i>
														</span>
													</label>

													<div class="space"></div>

													<div class="clearfix">
														
														<button type="submit" class="width-35 pull-right btn btn-sm btn-primary">
															<i class="ace-icon fa fa-key"></i>
															<span class="bigger-110">Login</span>
														</button>
                                                                                                            <button class="width-35 pull-left btn btn-sm btn" type="button" onclick="window.location.href = 'index.jsp'">
                                                                                                                    Back
                                                                                                            </button>
													</div>

													<div class="space-4"></div>
                                                                                                        <h4 style="color: red;float:right" id="chk">
                                                                                                            <%

                                                                                                                if(request.getAttribute("error") != null){
                                                                                                                    out.println(request.getAttribute("error"));
                                                                                                                }

                                                                                                            %>
                                                                                                        </h4>
												</fieldset>
											</form>
                                                                                            
											
										</div><!-- /.widget-main -->

										
									</div><!-- /.widget-body -->
								</div><!-- /.login-box -->

						</div>
					</div><!-- /.col -->
				</div><!-- /.row -->
			</div><!-- /.main-content -->
		</div><!-- /.main-container -->

		<!-- basic scripts -->

		<!--[if !IE]> -->
		<script type="text/javascript">
			window.jQuery || document.write("<script src='assets/js/jquery.min.js'>"+"<"+"/script>");
		</script>

		<!-- <![endif]-->

		<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='../assets/js/jquery1x.min.js'>"+"<"+"/script>");
</script>
<![endif]-->
		<script type="text/javascript">
			if('ontouchstart' in document.documentElement) document.write("<script src='assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>

		<!-- inline scripts related to this page -->
		<script type="text/javascript">
			
				$('body').attr('class', 'login-layout blur-login');
				$('#id-text2').attr('class', 'white');
				$('#id-company-text').attr('class', 'light-blue');
				
		</script>
	</body>
</html>

                    
               