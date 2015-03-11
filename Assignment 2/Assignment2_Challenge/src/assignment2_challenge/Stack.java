package assignment2_challenge;  
import java.util.Scanner;


public class Stack<T> {

    private T[] stackArray;
    int index;
    
    //sets stackArray to size
    public Stack(int size) {
        T[] array = (T[]) new Object[size];
        this.stackArray = array;
        index = -1;
    }
    
    //returns true if stack is not initialized or empty
    public boolean isStackEmpty() {
        return (stackArray == null) || (index == -1);
    }
    
    //adds T variable to the stack
    public void push(T variable) {
        
        //check to see if there is room to add
        if (checkPush()) {
           index++;
           stackArray[index] = variable;
        } else {
            System.out.println("Stack is full!");
            resizeStack();
            index++;
            stackArray[index] = variable;
        }
    }
    
    public boolean checkPush() {
        return index != stackArray.length - 1;
    }
    
    //takes a number off the stack
    public void pop() {
        //checks to see the stack is not empty
        if (!isStackEmpty()){
           stackArray[index] = null;
           index--;
        } else {
            System.out.println("Stack is already empty!");
        }
    }
    
    public void resizeStack() {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Resize Array to :  ");
        int newSize = input.nextInt();
        System.out.println();
        
        T[] array = (T[]) new Object[newSize];

        for (int i = 0; i < stackArray.length; i++) {
            array[i] = stackArray[i];
        }

        this.stackArray = array;
        
    }
    
     //prints out stack
    public void printStack() {
        for (T variable : stackArray) {
            if (variable != null) {
                System.out.println(variable);
            }
        }
    }
 
}
