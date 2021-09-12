/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 alden bagarra
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnN = new Scanner(System.in);
        System.out.print( "Enter the principal: " );
        double principal = scnN.nextDouble();
        System.out.print( "Enter the rate of interest: " );
        double rateOI = scnN.nextDouble();
        System.out.print( "Enter the number of years: " );
        double year = scnN.nextDouble();
        int invest = (int) ((principal)*(1+((rateOI/100)*year)));
        System.out.print( "After "+ year +" years at "+ rateOI +
                "%, the investment will be worth $"+ invest +"." );
    }
}
