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
public class Sum {
    
    int sum1toN(int beg,int end) {
        
        if((end - beg) == 1){
            return beg;
        }
        
        int half = (beg + end) / 2;
        
        int sum1 = sum1toN(beg, half);
        int sum2 = sum1toN(half, end);
        
        return sum1 + sum2;
    }
    
}
