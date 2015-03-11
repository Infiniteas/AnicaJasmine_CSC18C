/*
 * File: Assignment2_Stack
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 3/11/15
 */
package assignment2_stack;

public class Assignment2_Stack {

    public static void main(String[] args) {
        Stack first = new Stack();
        
        //set stack size
        first.setStackArraySize(5);
        
        if (first.isStackEmpty()) {
            System.out.println("Stack Array is empty");
        }
        
        //add numbers {11,6,8} unto the stack
        first.push(11);
        first.push(6);
        first.push(8);
        
        //prints out stack
        System.out.println("Current Stack: ");
        first.printStack();
        System.out.println();
        
        
        //deletes the top number off the cap
        first.pop();
        
        System.out.println("Current Stack: ");
        first.printStack();
        

    }
    
}
