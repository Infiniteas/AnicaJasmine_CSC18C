/*
 * File: Assignment2_Challenge
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 3/11/15
 */
package assignment2_challenge;

public class Assignment2_Challenge {


    public static void main(String[] args) {
   
        //set size of array
        int size = 5;
        Integer value1 = 2;
        Float value2 = 2.3F;
        
        
        //creates Stack classes that handles Integers
        Stack<Integer> wrapperIntegerStack = new Stack<Integer>(size);
        
        //pushes Integers {2,4,6} onto the stack
        wrapperIntegerStack.push(value1);
        wrapperIntegerStack.push(value1 = 4);
        wrapperIntegerStack.push(value1 = 6);

        //prints out current stack
        System.out.println("Current Stack:");
        wrapperIntegerStack.printStack();
        System.out.println();

        //pops Integer 6 off
        wrapperIntegerStack.pop();

        System.out.println("Current Stack:");
        wrapperIntegerStack.printStack();
        System.out.println();
        
        //create stack class that handles Floats
        Stack<Float> wrapperFloatStack = new Stack<Float>(size);
        
        //pushes Floats {2.3, 6.3, 7.8}
        wrapperFloatStack.push(value2);
        wrapperFloatStack.push(value2 = 6.3F);
        wrapperFloatStack.push(value2 = 7.8F);
        
        //prints out current stack
        System.out.println("Current Stack:");
        wrapperFloatStack.printStack();
        System.out.println();

        //pops Float 7.8 off
        wrapperFloatStack.pop();

        System.out.println("Current Stack:");
        wrapperFloatStack.printStack();
        System.out.println();
        
        //adds {8.4, 5.1, 7.5}
        wrapperFloatStack.push(value2 = 8.4F);
        wrapperFloatStack.push(value2 = 5.1F);
        wrapperFloatStack.push(value2 = 7.5F);
        //this reaches the limit, will ask user to resize array
        wrapperFloatStack.push(value2 = 6.9F);
        
        System.out.println("Current Stack:");
        wrapperFloatStack.printStack();
        System.out.println();

    }
}
