/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Korinne Ramcharitar
 */



package base;
import java.util.Scanner;
public class app {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        double LBAC = 0.08;
        double ounces =0;
        double weight = 0;
        double hours = 0;

        System.out.println("Enter a 1 if you are male or a 2 if you are female: ");

        System.out.println("How many ounces of alcohol did you have? ");
        ounces = Integer.parseInt(in.nextLine());

        System.out.println("What is your weight in pounds? ");
        weight = Double.parseDouble(in.nextLine());

        System.out.println("How many hours has it been since your last drink?");
        hours = Double.parseDouble(in.nextLine());
    }
}
