package com.crud;

import java.sql.*;
import java.util.Scanner;

public class SearchClass {

    Scanner sc = new Scanner(System.in);
    Connection con = DBClass.createConnection();
    Statement st;
    ResultSet rs;

    private int rollno;

    void displayData() {

        System.out.println("\t\t\t DISPLAY THE STUDENT RECORDS : \n");
        System.out.println("Enter Student Roll Number To Be Displayed :");
        rollno = sc.nextInt();
        System.out.println();

        try {

            st = con.createStatement();

            String sql = "select * from student where rollno = '" + rollno + "'";

            rs = st.executeQuery(sql);

            if (rs.next()) {

                System.out.println("\n----------------------------------------------------------------------------------------------------------------------------\n\n");
                System.out.println("STUDENT INFORMATION ARE  :\n");
                System.out.println("\n----------------------------------------------------------------------------------------------------------------------------\n");
                System.out.println("\t\tSTUDENT ROLL NUMBER IS  :    " + rs.getInt(1) + "\n");
                System.out.println("\t\tSTUDENT NAME IS  :           " + rs.getString(2) + "\n");
                System.out.println("\t\tSTUDENT ADDRESS IS  :        " + rs.getString(3) + "\n");
                System.out.println("\t\tSTUDENT EMAIL ID IS  :       " + rs.getString(4) + "\n");
                System.out.println("\t\tSTUDENT AGE IS  :            " + rs.getInt(5) + "\n");
                System.out.println("\n----------------------------------------------------------------------------------------------------------------------------\n");

            } else {
                System.out.println("No Such Record Found !");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
