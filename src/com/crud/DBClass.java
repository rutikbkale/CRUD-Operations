package com.crud;

import java.sql.*;

public class DBClass {

    public static Connection con;

    public static Connection createConnection() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_db", "root", "1234");

        } catch (Exception e) {
            e.printStackTrace();
        }
        //System.out.println("testng.....");
        return con;
    }

}
