package com.crud;

import java.sql.*;
import java.util.Scanner;

public class InsertClass {

    Scanner sc = new Scanner(System.in);
    Connection con = DBClass.createConnection();
    PreparedStatement pst;

    private int rollno;
    private String name;
    private String address;
    private String email;
    private int age;

    public void saveData() {

        System.out.println(con+"\n\n\n");

        System.out.println("\t\t\tINSERT A STUDENT RECORDS : \n");
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
            String sql = "insert into student(rollno, name, address, email, age) values(?,?,?,?,?)";

            pst = con.prepareStatement(sql);

            pst.setInt(1, rollno);
            pst.setString(2, name);
            pst.setString(3, address);
            pst.setString(4, email);
            pst.setInt(5, age);

            int i = pst.executeUpdate();

            if (i == 1) {
                System.out.println("\t1 RECORD INSERTED SUCCESSFULLY ..... ");
            } else {
                System.out.println("oops ! Something Went Wrong ?");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
