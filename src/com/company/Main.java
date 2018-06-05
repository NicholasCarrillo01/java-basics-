package com.company;

import java.util.Scanner;

public class Main {

     static  Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
	//
        boolean  hasadog =  false;

        char     favoriteletter = 'A';

        String   weather = "it is a hot day today";

        int      numberofstudentsinlesson =  115;
        double   average  =  4.0;
        boolean  candrive = true;
        char     favoritenumber = '3';
        String   hobbies = "Basketball";
//        int      age     = 17;
        int      numberOfStudentsInClassroom;
        int      daysOfWeek = 7;
//        int      addition  =age + 12 ;
        double   myTotal =11.56;
        boolean  itishotoutside = true;
        int      divide = 4 /5 ;

        System.out.println(divide);

//      System.out.println("this is the modulo" + (4 % 5));

        String  hello = "hello";
        String  name  = "nick";

        System.out.println(hello + "  "  + name);

        Scanner input = new Scanner(System.in);

        System.out.println("what is your name?");

        name = input.nextLine();

        System.out.println(hello + "  "  + name);

        System.out.println("what is your age?");

        int  age = input.nextInt();

        name = input.nextLine();

        System.out.println(hello + " !  " + "you are" + age);
        


    };
}
