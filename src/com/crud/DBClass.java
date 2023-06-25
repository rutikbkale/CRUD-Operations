package com.crud;

import java.sql.*;

public class DBClass {

    public static Connection con;

    public static Connection createConnection() {
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_db", "root", "12345");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

}
