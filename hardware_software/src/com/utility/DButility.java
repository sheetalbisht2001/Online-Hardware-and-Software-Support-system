package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButility {

    public static Connection provideConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/hardware_software","root","Root");

           if(con.isClosed()) System.out.println("Connection is closed...");
           else System.out.println("Connection is open...");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }



}
