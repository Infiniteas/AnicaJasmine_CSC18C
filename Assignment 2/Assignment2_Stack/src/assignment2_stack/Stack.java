
package assignment2_stack;


public class Stack {
    
    int[] stackArray;
    int index;
    
    Stack() {
        index = -1;
    }
    
    //returns true if stack is not initialized or empty
    public boolean isStackEmpty() {
        return (stackArray == null) || (index == -1);
    }
    
    //sets stack size
    public void setStackArraySize(int size) {
        stackArray = new int[size];
    }
    
    //adds number to the stack
    public void push(int number) {
        //check to see if there is room to add
        if (checkPush()) {
           index++;
           stackArray[index] = number;
        } else {
            System.out.println("Stack is full!");
        }
    }
    
    //takes a number off the stack
    public void pop() {
        //checks to see the stack is not empty
        if (!isStackEmpty()){
           stackArray[index] = 0;
           index--;
        } else {
            System.out.println("Stack is already empty!");
        }
        
    }
    public boolean checkPush() {
        return index != stackArray.length-1;
    }
    
    //prints out stack
    public void printStack() {
        for (int num : stackArray) {
            if (num != 0) {
                System.out.println(num);
            }
        }
    }
    
}
