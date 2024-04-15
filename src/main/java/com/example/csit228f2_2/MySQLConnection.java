package com.example.csit228f2_2;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class MySQLConnection {

    private static String url = "jdbc:mysql://localhost:3306/Hanzdb";
    private static String USERNAME ="Hanzhanz";
    private static String PASSWORD= "123456";
    public static Connection getConnection(){
        Connection connection = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url,USERNAME,PASSWORD);
            System.out.println("CONNECTED TO DATABASE");

        } catch (ClassNotFoundException e) {
            e.getMessage();
        }
        catch (SQLException e){
            e.getMessage();
        }
        return connection;
    }
}