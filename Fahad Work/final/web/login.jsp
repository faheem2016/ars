<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
       
        </script>
    </head>
    <body>
        <div id="Main" style="height: 100%;width: 100%;color: white;" >
            <center><div id ="container" style="height:300px;width:40%;background: black;border:3px solid blue;margin-top: 15%;">
                    
                    <h1>Admin Login</h1>
                    <form id="f1" method="POST" action="LoginServlet" onsubmit="return Validate()">
                        
                        <pre>User Name:   <input type="text" id="user_name" class="creden" value="" name="user" required=""></pre>
                        <pre>Password:    <input type="password" id="Password" class="creden" value="" name="pwd" required=""></pre>
                        
                        <br>
                        <input type="submit" value="Login" onclick=" return Validate()">
                    </form>
                    <h4 style="color: red;float:right" id="chk">
                        <%
                        
                            if(request.getAttribute("error") != null){
                                out.println(request.getAttribute("error"));
                            }
                            
                        %>
                        </h4>
                </div></center>
            
        </div>
    </body>
</html>