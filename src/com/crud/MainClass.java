package com.crud;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        boolean i = true;
        Scanner sc = new Scanner(System.in);

        InsertClass inst = new InsertClass();

        UpdateClass upd = new UpdateClass();

        DeleteClass del = new DeleteClass();

        SearchClass sech = new SearchClass();

        while (i) {
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------\n");
            System.out.println("\t\t\t\t\t********** CRUD Operations Projects **********\n");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------\n");

            System.out.println("Press 1 For Insert Record :");
            System.out.println("Press 2 For Update Record :");
            System.out.println("Press 3 For Delete Record :");
            System.out.println("Press 4 For Display Record :");
            System.out.println("Press 5 For Exit From Project :\n");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------\n");

            System.out.println("Enter Your Choice To Perform Which Type Of Operation : \n");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 ->
                    inst.saveData();

                case 2 ->
                    upd.updateData();

                case 3 ->
                    del.deleteData();

                case 4 ->
                    sech.displayData();

                case 5 -> {
                    i = false;
                    System.out.println("\t\t\t THANK YOU FOR THE USING OUR APPLICATIONS .....\n");
                }

                default ->
                    System.out.println("\t Please Enter Valid Choice ");

            }
        }
        sc.close();
    }
}
