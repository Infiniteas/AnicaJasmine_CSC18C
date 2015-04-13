/*
 * File: Assignment5_Recursion
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 4/13/15
 *
 */
package recursion;

import java.text.DecimalFormat;

/**
 *
 * @author Jasmine
 */
public class Main {
    
    public static void main(String[] args) {
        Sum function = new Sum();
        
        //number
        int n = 12;
        
        //sum from 1 to number
        int sum = n + function.sum1toN(1,n);
        
        //Print out results
        System.out.println("Total sumfrom 1 to " + n + ":  " + sum);
        System.out.println();
        
        
        Savings account = new Savings();
        System.out.println("Total amount in bank"
                + " after 3 years with 5% interest rate");
        
        double futureSavings = account.Savings(100, 0.05, 3);
        
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        
        System.out.println("$" + numberFormat.format(futureSavings));
    }
}
