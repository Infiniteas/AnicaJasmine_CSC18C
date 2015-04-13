/*
 * File: Assignment5_Recursion
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 4/13/15
 *
 */
package recursion;

/**
 *
 * @author Jasmine
 */
public class Savings {
    
    /**
     * 
     * FV=PV*(1+i)^n
     * 
     * pv = present value
     * 
     * i = interest rate % / year
     * 
     * n = number of years.
     * 
     * @param PV
     * @param i
     * @param n
     * @return 
     */
    
    public double Savings(double PV, double i, double n) {
       
        //base case
        if (n == 0) {
            return PV;
        }
        
        PV += PV*i;
        
        return Savings(PV, i , n-1);
    }
}
