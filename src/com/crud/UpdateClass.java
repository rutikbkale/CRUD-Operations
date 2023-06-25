package com.crud;

import java.sql.*;
import java.util.Scanner;

public class UpdateClass {

    Scanner sc = new Scanner(System.in);
    Connection con = DBClass.createConnection();
    Statement st;

    private int rollno;
    private String name;
    private String address;
    private String email;
    private int age;

    public void updateData() {

        System.out.println("\t\t\t UPDATE A STUDENT RECORDS : \n");

        System.out.println("Enter Student Roll Number :");
        rollno = sc.nextInt();
        System.out.println();

        System.out.println("Enter Student Name :");
        name = sc.next();
        System.out.println();

        System.out.println("Enter Student Address :");
        address = sc.next();
        System.out.println();

        System.out.println("Enter Student Email :");
        email = sc.next();
        System.out.println();

        System.out.println("Enter Student Age :");
        age = sc.nextInt();
        System.out.println();

        try {

            st = con.createStatement();

            String sql = "update student set name = '" + name + "', address = '" + address + "', email = '" + email + "', age = '" + age + "' where rollno = '" + rollno + "'";

            int i = st.executeUpdate(sql);

            if (i == 1) {
                System.out.println("\t1 RECORD UPDATED SUCCESSFULLY ..... ");
            } else {
                System.out.println("oops ! Something Went Wrong ?");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
