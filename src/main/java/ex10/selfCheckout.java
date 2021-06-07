/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Connor Stanley
 */


package ex10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class selfCheckout {
    static final double TAX = .055;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Asking for input in string form
        System.out.print("Enter the price of item 1. ");
        String priceOne = in.nextLine();
        System.out.print("Enter the quantity of item 1. ");
        String quantityOne = in.nextLine();
        System.out.print("Enter the price of item 2. ");
        String  priceTwo = in.nextLine();
        System.out.print("Enter the quantity of item 2. ");
        String quantityTwo = in.nextLine();
        System.out.print("Enter the price of item 3. ");
        String priceThree = in.nextLine();
        System.out.print("Enter the quantity of item 3. ");
        String quantityThree = in.nextLine();


        // Reformatting decimals to represent money
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        // Numerical Conversion from strings to ints and floats based on either price or amount and grouped for each item
        float itemOnePrice = Float.parseFloat(priceOne);
        int itemOneAmount = Integer.parseInt(quantityOne);

        float itemTwoPrice = Float.parseFloat(priceTwo);
        int itemTwoAmount = Integer.parseInt(quantityTwo);

        float itemThreePrice = Float.parseFloat(priceThree);
        int itemThreeAmount = Integer.parseInt(quantityThree);


        // Calculations using above variables
        float itemOneSubtotal = itemOneAmount * itemOnePrice;
        // Item 2
        float itemTwoSubtotal = itemTwoAmount * itemTwoPrice;
        // Item 3
        float itemThreeSubtotal = itemThreeAmount * itemThreePrice;
        // Subtotal
        float subtotal = itemOneSubtotal + itemTwoSubtotal + itemThreeSubtotal;
        // Tax Calculation
        double salesTax = TAX * subtotal;
        // Finally the total
        double  total = subtotal + salesTax;


        // Output
        System.out.print("Subtotal: $" + subtotal + ".\n");
        System.out.print("Tax: $" + salesTax + ".\n");
        System.out.print("Total: $" + total + ".\n");




    }

}







