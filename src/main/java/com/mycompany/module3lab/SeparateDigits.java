/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.module3lab;

/**
 *
 * @author behlt
 */
public class SeparateDigits {
    //Calculate the integer part of the quotient when integer a is divided by integer b
    public static int integerQuotient(int a, int b) {
        return a / b;
    }

    //Calculate the integer remainder when integer a is divided by integer b
    public static int integerRemainder(int a, int b) {
        return a % b;
    }

    //Display an integer as a sequence of digits, separating each pair of digits by two spaces
    public static void displayDigits(int number) {
        int divisor = 10000; 

        while (divisor >= 1) {
            int digit = integerQuotient(number, divisor); 
            System.out.print(digit + "  "); 
            number = integerRemainder(number, divisor); 
            divisor = integerQuotient(divisor, 10); 
        }

        System.out.println(); 
    }

   
    public static void main(String[] args) {
        int number = 4562;
        System.out.print("The digits of " + number + " are: ");
        displayDigits(number);
    }
    
}
