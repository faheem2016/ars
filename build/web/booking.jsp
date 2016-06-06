<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>

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
        <title>Ticket Booking</title>

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
        <script src="assets/js/ace-extra.min.js"></script>

        <!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->

        <!--[if lte IE 8]>
        <script src="../assets/js/html5shiv.min.js"></script>
        <script src="../assets/js/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>

        <!-- \\ Begin Holder \\ -->

        <div class="Center">
            <div class="widget-box">
                <div class="widget-header widget-header-blue widget-header-flat">
                    <h4 class="widget-title lighter">Ticket Booking</h4>
                </div>

                <div class="widget-body">
                    <div class="widget-main">
                        <!-- #section:plugins/fuelux.wizard -->
                        <div id="fuelux-wizard" data-target="#step-container">
                            <!-- #section:plugins/fuelux.wizard.steps -->
                            <ul class="wizard-steps">

                                <li data-target="#step1">
                                    <span class="step">1</span>
                                    <span class="title">Choose Flights</span>
                                </li>

                                <li data-target="#step2">
                                    <span class="step">2</span>
                                    <span class="title">Traveler Info</span>
                                </li>

                                <li data-target="#step3">
                                    <span class="step">3</span>
                                    <span class="title">Payment Info</span>
                                </li>
                                <li data-target="#step4">
                                    <span class="step">4</span>
                                    <span class="title">Confirmation</span>
                                </li>
                            </ul>

                            <!-- /section:plugins/fuelux.wizard.steps -->
                        </div>

                        <hr />

                        <!-- #section:plugins/fuelux.wizard.container -->
                        <div class="step-content pos-rel" id="step-container">

                            <div class="step-pane active" id="step1" style="height: 400px; background: url('img/seating-plan.png'); background-size: 1300px 520px; background-repeat: no-repeat;">
                                <div style=" height: 47%; width: 55%; margin-left: 25%; margin-top: 9% ">
                                    <form id="seats" action="" method="POST" >
                                        <input type="hidden" value="<% out.print(request.getAttribute("flight_no")); %>" id="flight_no">
                                        <input type="hidden" value="" id="_seat">
                                        <table style="margin-left: 30px;margin-top: 50px">
                                            <tr>
                                                <%
//                                                    DB con = new DB();
                                                    Class.forName("com.mysql.jdbc.Driver");
                                                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ars", "root", "root");
                                                    Statement stmt = con.createStatement();

                                                    ArrayList<String> reserved_seats = new ArrayList<String>();
                                                    try {
                                                        ResultSet rs = stmt.executeQuery("select seat from booked_seats");
                                                        while (rs.next()) {
                                                            reserved_seats.add(rs.getString("seat"));

                                                        }

                                                    } catch (SQLException e) {
                                                        out.print(e.getMessage());

                                                    }

                                                    for (int i = 1; i <= 48; i++) {
                                                        if ((i + 11) % 12 == 0) {
                                                %>
                                            <tr></tr>
                                            <%
                                                }

                                                if (reserved_seats.contains(String.valueOf(i))) {

                                            %>
                                            <td>
                                                <input type="button" style="height: 25px; width: 25px;" id="seat_<%= i%>" onclick="checkSeatAvailability('<%= i%>')" value="<%= i%>" disabled="disabled">
                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                            </td>
                                            <%
                                            } else {%>

                                            <td>
                                                <input type="button" style="height: 25px; width: 25px; " id="seat_<%= i%>" onclick="checkSeatAvailability('<%= i%>')" value="<%= i%>">
                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                            </td>

                                            <%
                                                    }
                                                }
                                            %>
                                            </tr>
                                        </table>
                                    </form>

                                </div>

                                <!--                                                    <form >
                                    <input type="checkbox" style="height: 25px; width: 25px; margin: 120px 0px 0x 350px">
                                </form>-->
                            </div>

                            <div class="step-pane" id="step2">
                                <h3 class="lighter block green">Enter the following information</h3>



                                <form class="form-horizontal" id="validation-form" method="get">

                                    <div class="form-group">
                                        <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="name">Name:</label>

                                        <div class="col-xs-12 col-sm-9">
                                            <div class="clearfix">
                                                <input type="text" id="name" name="name" class="col-xs-12 col-sm-5" />
                                            </div>
                                        </div>
                                    </div>

                                    <div class="space-2"></div>

                                    <div class="form-group">
                                        <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="phone">Phone Number:</label>

                                        <div class="col-xs-12 col-sm-9">
                                            <div class="input-group">
                                                <span class="input-group-addon">
                                                    <i class="ace-icon fa fa-phone"></i>
                                                </span>

                                                <input type="tel" id="phone" name="phone" />
                                            </div>
                                        </div>
                                    </div>

                                    <div class="space-2"></div>

                                    <div class="form-group">
                                        <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="email">Email Address:</label>

                                        <div class="col-xs-12 col-sm-9">
                                            <div class="clearfix">
                                                <input type="email" name="email" id="email" class="col-xs-12 col-sm-6" />
                                            </div>
                                        </div>
                                    </div>

                                    <div class="space-2"></div>

                                    <div class="hr hr-dotted"></div>


                                </form>   


                            </div>

                            <div class="step-pane" id="step3">

                                <div class="center">
                                    <form class="form-horizontal" id="validation-form1" method="get">
                                        <div class="form-group">

                                            <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="accno">Enter Account No:</label>

                                            <div class="col-xs-12 col-sm-9">
                                                <div class="clearfix">
                                                    <input type="number" name="accno" id="accno" class="col-xs-12 col-sm-4" value=""/>
                                                </div>
                                            </div>
                                        </div>	

                                         <div class="space-2"></div>

                                        <div class="form-group">
                                            <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="pass">Enter Password:</label>

                                            <div class="col-xs-12 col-sm-9">
                                                <div class="clearfix">
                                                    <input type="password" name="pass" id="pass" class="col-xs-12 col-sm-4" value=""/>
                                                </div>
                                            </div>
                                        </div>
                                    </form>
                                </div>

                            </div>

                            <div class="step-pane" id="step4">
                                <div class="center">
                                    <!--                                    <h3 class="green">Congrats!</h3>
                                                                        Your ticket has been reserved! Click finish to go back!
                                                                        <br><br><br>
                                                                        <table>
                                    
                                                                        </table>
                                    
                                                                        <button class="btn" type="button">
                                                                            View Ticket
                                                                        </button>-->


                                    <table style="width:100%;border: 1px solid;float: center">
                                        <tr>
                                            <td><b>Name</b></td>
                                            <td id="pass_name"></td>
                                        </tr>
                                        <tr>
                                            <td><b>Email</b></td>
                                            <td id="pass_email"></td>
                                        </tr>
                                        <tr>
                                            <td><b>Phone #</b></td>
                                            <td id="pass_phone"></td>
                                        </tr>
                                        <tr>
                                            <td><b>Account #</b></td>
                                            <td id="pass_accno"></td>
                                        </tr>
                                        <tr>
                                            <td><b>Seat</b></td>
                                            <td id="pass_seat"></td>
                                        </tr>
                                    </table>
                                </div>
                            </div>
                        </div>

                        <!-- /section:plugins/fuelux.wizard.container -->
                        <hr />
                        <div class="wizard-actions">
                            <!-- #section:plugins/fuelux.wizard.buttons -->
                            <button class="btn btn-prev">
                                <i class="ace-icon fa fa-arrow-left"></i>
                                Prev
                            </button>

                            <button class="btn btn-success btn-next" data-last="Confirm">
                                Next
                                <i class="ace-icon fa fa-arrow-right icon-on-right"></i>
                            </button>

                            <button class="btn" type="button" onclick="window.location.href = 'index.jsp'">
                                Cancel
                            </button>
                            <!-- /section:plugins/fuelux.wizard.buttons -->
                        </div>

                        <!-- /section:plugins/fuelux.wizard -->
                    </div><!-- /.widget-main -->
                </div><!-- /.widget-body -->
            </div>

            <!--[if !IE]> -->
            <script type="text/javascript">
                window.jQuery || document.write("<script src='assets/js/jquery.min.js'>" + "<" + "/script>");
            </script>

            <!-- <![endif]-->

            <!--[if IE]>
<script type="text/javascript">
window.jQuery || document.write("<script src='../assets/js/jquery1x.min.js'>"+"<"+"/script>");
</script>
<![endif]-->
            <script type="text/javascript">
                if ('ontouchstart' in document.documentElement)
                    document.write("<script src='assets/js/jquery.mobile.custom.min.js'>" + "<" + "/script>");
            </script>
            <script src="assets/js/bootstrap.min.js"></script>

            <!-- page specific plugin scripts -->
            <script src="assets/js/fuelux/fuelux.wizard.min.js"></script>
            <script src="assets/js/jquery.validate.min.js"></script>
            <script src="assets/js/additional-methods.min.js"></script>
            <script src="assets/js/bootbox.min.js"></script>
            <script src="assets/js/jquery.maskedinput.min.js"></script>
            <script src="assets/js/select2.min.js"></script>

            <!-- ace scripts -->
            <script src="assets/js/ace-elements.min.js"></script>
            <script src="assets/js/ace.min.js"></script>

            <!-- inline scripts related to this page -->
            <script type="text/javascript">
                jQuery(function($) {

                    $('[data-rel=tooltip]').tooltip();

                    $(".select2").css('width', '200px').select2({allowClear: true})
                            .on('change', function() {
                                $(this).closest('form').validate().element($(this));
                            });


                    var $validation = false;
                    $('#fuelux-wizard')
                            .ace_wizard({
                                //step: 2 //optional argument. wizard will jump to step "2" at first
                            })
                            .on('change', function(e, info) {
                                if (info.step == 1 && $validation) {
                                    if (!$('#validation-form').valid())
                                        return false;
                                }

                                if (info.step == 1) {
                                    var seat = $("#_seat").val();
                                    if (seat == null || seat == '') {
                                        alert("Please select seat first.");
                                        return false;
                                    }
                                }

                                if (info.step == 2) {
                                    if (!$('#validation-form').valid()) {
                                        return false;
                                    }
                                }
                                if (info.step == 3) {
                                    if (!$('#validation-form1').valid()) {
                                        return false;
                                    }
                                    var name = $("#name").val();
                                    var email = $("#email").val();
                                    var phone = $("#phone").val();
                                    var seat_no = $("#_seat").val();
                                    $("#pass_name").html(name);

                                    var accno = $("#accno").val();
                                    $("#pass_email").html(email);
                                    $("#pass_phone").html(phone);
                                    $("#pass_accno").html(accno);
                                    $("#pass_seat").html(seat_no);
                                    console.log("here in step 4");

                                }
                            })
                            .on('finished', function(e) {
                                var flight_no = document.getElementById("flight_no").value;
                                var seat_no = $("#_seat").val();

                                var name = $("#name").val();
                                var phone = $("#phone").val();
                                var email = $("#email").val();
                                var accno = $("#accno").val();
                                var pass = $("#pass").val();

                                var data = {
                                    flight_no: flight_no,
                                    seat_no: seat_no,
                                    name: name,
                                    phone: phone,
                                    email: email,
                                    accno: accno,
                                    pass: pass
                                };
                                $.ajax({
                                    url: 'bookSeat',
                                    type: "GET",
                                    dataType: "json",
                                    contentType: "application/json",
                                    data: data,
                                    success: function(msg) {
                                        console.log("check book seat response = " + msg)
                                        bootbox.dialog({
                                            closeButton: false,
                                            message: "Thank you! Your information is successfully saved!",
                                            buttons: {
                                                OK: function() {
                                                    window.location.href = "index.jsp";
                                                }
                                            }
                                        });                                       
                                    }
                                });

                            }).on('stepclick', function(e) {
                        //e.preventDefault();//this will prevent clicking and selecting steps

                    });


                    //jump to a step
                    $('#step-jump').on('click', function() {
                        var wizard = $('#fuelux-wizard').data('wizard')
                        wizard.currentStep = 3;
                        wizard.setState();
                    })
                    //determine selected step
                    //wizard.selectedItem().step



                    //hide or show the other form which requires validation
                    //this is for demo only, you usullay want just one form in your application
                    $('#skip-validation').removeAttr('checked').on('click', function() {
                        $validation = this.checked;
                        if (this.checked) {
                            $('#sample-form').hide();
                            $('#validation-form').removeClass('hide');
                        }
                        else {
                            $('#validation-form').addClass('hide');
                            $('#sample-form').show();
                        }
                    })



                    //documentation : http://docs.jquery.com/Plugins/Validation/validate


                    $.mask.definitions['~'] = '[+-]';
                    $('#phone').mask('(999) 999-9999');

                    jQuery.validator.addMethod("phone", function(value, element) {
                        return this.optional(element) || /^\(\d{3}\) \d{3}\-\d{4}( x\d{1,6})?$/.test(value);
                    }, "Enter a valid phone number.");

                    $('#validation-form').validate({
                        errorElement: 'div',
                        errorClass: 'help-block',
                        focusInvalid: false,
                        rules: {
                            email: {
                                required: true,
                                email: true
                            },
                            password: {
                                required: true,
                                minlength: 5
                            },
                            password2: {
                                required: true,
                                minlength: 5,
                                equalTo: "#password"
                            },
                            name: {
                                required: true
                            },
                            accno: {
                                required: true
                            },
                            pass: {
                                required: true
                            },
                            phone: {
                                required: true,
                                phone: 'required'
                            },
                            url: {
                                required: true,
                                url: true
                            },
                            comment: {
                                required: true
                            },
                            state: {
                                required: true
                            },
                            platform: {
                                required: true
                            },
                            subscription: {
                                required: true
                            },
                            gender: {
                                required: true,
                            },
                            agree: {
                                required: true,
                            }
                        },
                        messages: {
                            email: {
                                required: "Please provide a valid email.",
                                email: "Please provide a valid email."
                            },
                            password: {
                                required: "Please specify a password.",
                                minlength: "Please specify a secure password."
                            },
                            state: "Please choose state",
                            subscription: "Please choose at least one option",
                            gender: "Please choose gender",
                            agree: "Please accept our policy"
                        },
                        highlight: function(e) {
                            $(e).closest('.form-group').removeClass('has-info').addClass('has-error');
                        },
                        success: function(e) {
                            $(e).closest('.form-group').removeClass('has-error');//.addClass('has-info');
                            $(e).remove();
                        },
                        errorPlacement: function(error, element) {
                            if (element.is('input[type=checkbox]') || element.is('input[type=radio]')) {
                                var controls = element.closest('div[class*="col-"]');
                                if (controls.find(':checkbox,:radio').length > 1)
                                    controls.append(error);
                                else
                                    error.insertAfter(element.nextAll('.lbl:eq(0)').eq(0));
                            }
                            else if (element.is('.select2')) {
                                error.insertAfter(element.siblings('[class*="select2-container"]:eq(0)'));
                            }
                            else if (element.is('.chosen-select')) {
                                error.insertAfter(element.siblings('[class*="chosen-container"]:eq(0)'));
                            }
                            else
                                error.insertAfter(element.parent());
                        },
                        submitHandler: function(form) {
                        },
                        invalidHandler: function(form) {
                        }
                    });
                    
                     $('#validation-form1').validate({
                        errorElement: 'div',
                        errorClass: 'help-block',
                        focusInvalid: false,
                        rules: {
                            accno: {
                                required: true
                            },
                            pass: {
                                required: true
                            },
                        },
                        messages: {
                            accno: {
                                required: "Account no is required.",
                            },
                            pass: {
                                required: "Please specify a password.",
                            }
                        },
                        highlight: function(e) {
                            $(e).closest('.form-group').removeClass('has-info').addClass('has-error');
                        },
                        success: function(e) {
                            $(e).closest('.form-group').removeClass('has-error');//.addClass('has-info');
                            $(e).remove();
                        },
                        errorPlacement: function(error, element) {
                            if (element.is('input[type=checkbox]') || element.is('input[type=radio]')) {
                                var controls = element.closest('div[class*="col-"]');
                                if (controls.find(':checkbox,:radio').length > 1)
                                    controls.append(error);
                                else
                                    error.insertAfter(element.nextAll('.lbl:eq(0)').eq(0));
                            }
                            else if (element.is('.select2')) {
                                error.insertAfter(element.siblings('[class*="select2-container"]:eq(0)'));
                            }
                            else if (element.is('.chosen-select')) {
                                error.insertAfter(element.siblings('[class*="chosen-container"]:eq(0)'));
                            }
                            else
                                error.insertAfter(element.parent());
                        },
                        submitHandler: function(form) {
                        },
                        invalidHandler: function(form) {
                        }
                    });




                    $('#modal-wizard .modal-header').ace_wizard();
                    $('#modal-wizard .wizard-actions .btn[data-dismiss=modal]').removeAttr('disabled');


                    /**
                     $('#date').datepicker({autoclose:true}).on('changeDate', function(ev) {
                     $(this).closest('form').validate().element($(this));
                     });
                     
                     $('#mychosen').chosen().on('change', function(ev) {
                     $(this).closest('form').validate().element($(this));
                     });
                     */
                })
            </script>

            <!-- the following scripts are used in demo only for onpage help and you don't need them -->
            <link rel="stylesheet" href="assets/css/ace.onpage-help.css" />
            <link rel="stylesheet" href="docs/assets/js/themes/sunburst.css" />

            <script type="text/javascript"> ace.vars['base'] = '..';</script>
            <script src="assets/js/ace/elements.onpage-help.js"></script>
            <script src="assets/js/ace/ace.onpage-help.js"></script>
            <script src="docs/assets/js/rainbow.js"></script>
            <script src="docs/assets/js/language/generic.js"></script>
            <script src="docs/assets/js/language/html.js"></script>
            <script src="docs/assets/js/language/css.js"></script>
            <script src="docs/assets/js/language/javascript.js"></script>

            <script>
                function  checkSeatAvailability(id) {
                    var flight_no = document.getElementById("flight_no").value;
                    var seat_no = id;
                    var data = {
                        flight_no: flight_no,
                        seat_no: seat_no
                    };
                    $.ajax({
                        url: 'searchSeat',
                        type: "GET",
                        dataType: "json",
                        contentType: "application/json",
                        data: data,
                        success: function(msg) {
                            console.log("herer in response");
                            console.log("msg = " + msg);
                            if (msg == 0) {
                                $('#seat_' + seat_no).prop('disabled', true);
                                alert("This seat is already reserved.");
                            } else {
                                var old_seat = $("#_seat").val();
                                if (old_seat != null && old_seat != '') {
                                    $("#seat_" + old_seat).removeClass("btn-success");
                                }
                                $("#seat_" + seat_no).addClass("btn-success");
//                                document.getElementById("_seat").innerHTML = seat_no;
                                $("#_seat").val(seat_no);
                            }
                        }
                    });
                }
            </script>
    </body>
</html>