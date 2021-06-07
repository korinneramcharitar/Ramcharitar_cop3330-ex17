/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Korinne Ramcharitar
 */



package base;

import java.text.DecimalFormat;
import java.util.Scanner;
public class app {

    public static void main(String[] args) {

        double LBAC = 0.08;
        double measure = 5.14;
        double measure2 = 0.15;
        double ounces;
        double weight;
        int hours;
        double women = .73;
        double men = .66;
        int gender;
        Scanner input = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#0.00000");
        System.out.println("Enter a 1 if you are male or a 2 if you are female: ");
        gender = input.nextInt();

        System.out.println("How many ounces of alcohol did you have? ");
        ounces = input.nextInt();

        System.out.println("What is your weight in pounds? ");
        weight = input.nextDouble();

        System.out.println("How many hours has it been since your last drink?");
        hours = input.nextInt();
        double BAC1 = (ounces * measure) / (weight * women) - (measure2 * hours);
        double BAC2 = ounces * measure / (weight * men) - (measure2 * hours);
        if (gender == 1){

            if(BAC2 < LBAC)
            {
                System.out.println("Your BAC is " + formatter.format(BAC1) +"\nIt is legal for you to drive");
    }
    if(BAC1 > LBAC)
    {
        System.out.println("Your BAC is " +formatter.format(BAC2) +"\nIt is not legal for you to drive");
    }
}
        if(gender == 2){
            if(BAC1 < LBAC)
            {
                System.out.println("Your BAC is " +formatter.format(BAC1) + "\nIt is legal for you to drive");
            }
            if(BAC2 > LBAC)
            {
                System.out.println("Your BAC is " + formatter.format(BAC1) + "\nIt is not legal for you to drive");
            }
        }
    }
}
