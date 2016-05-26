/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faheem
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
 public class DB {
   public Connection con ;
   public Statement stmt ;
   public ResultSet rs;
    DB()
    {
        try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ars","root", "Passw0rd");
                    
                } 
                catch (Exception cnfe) {
                    System.out.println("Couldn't find the driver!");
                    }
                
                if (con != null) {
                    System.out.println("Hooray! We connected to the database!");
                } else {
                    System.out.println("We should never get here.");
                }
     
                 try {
                    stmt = con.createStatement();
                    System.out.println("Statement Created Successfully");
                } catch (SQLException se) {
                    System.out.println("We got an exception while creating a statement:" + "that probably means we're no longer connected.");
                    se.printStackTrace();
                }
    }
   
    
     
}
