/*
 * File: Assignment4_DoublyLinkedList_Generic
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 4/17/15
 */
package project1;

/**
 *
 * @author Jasmine
 */
public class Vector {
        
    private int[] dynamicArray;
    private int size;
    private int index = -1; 
    
    //Constructor
    Vector(){
        //size of array
        size = 12;
        
        //initialize the size of the dynamic array 
        dynamicArray = new int[size];
        
        //initialize the elements in the array to -1
        for(int i = 0; i < dynamicArray.length; i++){
            dynamicArray[i] = -1;
        }
    }
    
    //returns true if array is empty
    public boolean isEmpty() {
        return (index == -1);
    }
    
    //sets array size
    public void setArraySize(int size) {
        
        //size of array
        this.size = size;
        
        //initialize the size of the dynamic array 
        dynamicArray = new int[size];
        
        //initialize the elements in the array to -1
        for(int i = 0; i < dynamicArray.length; i++){
            dynamicArray[i] = -1;
        }
    }
    
    //adds number to the array & will double size if needed
    public void add(int number) {
        
        //check to see if there is room to add
        if (checkAdd()) {
            
            index++;                          
            dynamicArray[index] = number; //add number to array
            
        } else {
            
            int[] temp = new int[size];
            temp = dynamicArray;
            
            // doubles the size of array
            size *= 2;
            
            //resizes array
            dynamicArray = new int[size];
            
            //initialize the elements in the array to -1
            for(int i = 0; i < dynamicArray.length; i++){
                dynamicArray[i] = -1;
            }            
            //set previous array values to new array
            for (int i = 0; i < temp.length; i++) {
                dynamicArray[i] = temp[i];
            }
            
            index++;
            dynamicArray[index] = number; //adds number to array
        }
    }
    
    //check to make sure the index does not go out of bounds
    public boolean checkAdd() {
        return index != dynamicArray.length-1;
    }
    
    
    public int[] sortArray(){
        int temp;
        int[] sorted;
        
        sorted = dynamicArray;
        
        int loopBound = sorted.length;
        
        //top refers the the top number of the array as it loops
        for (int top = 0; top < loopBound; top++) {
            
            //next refers to the numbers after the top in this loop
            for(int next = top + 1; next < loopBound; next++) {
                
                if(sorted[top] != -1 && sorted[next] != -1) {
                    
                    if (sorted[top] > sorted[next]) {
                        
                       //temp stores the smaller value
                       temp = sorted[next];
                       
                       //swaps the smaller number to the bigger number
                       sorted[next] = sorted[top];
                       
                       //swaps from bigger number to smaller number
                       sorted[top] = temp;
                    }
                }
            }
        } 
        
        return sorted;
    }
    
    
    public void setArray(int[] arr){
        this.dynamicArray = arr;
    }
  
    
    //This function compares the mode array to the sorted array
    //making sure there are no duplictaes in the mode array
    public boolean checkNoMuliple(int num){
        
        //searches the array to find a duplicate
        for (int i = 0; i < dynamicArray.length; i++){
            
            //there already exists a num value in the array
            if(num == dynamicArray[i]){ 
               return false; 
            }
        }

        return true;
    }
    
    public int getNumber(int index){
        return dynamicArray[index];
    }
    
    public void emptyVector(){
        
        //initialize the elements in the array to -1
        for(int i = 0; i < dynamicArray.length; i++){
            dynamicArray[i] = -1;
        }
        
        index = -1;
    }
    
    
    public int getSize(){
        return (index + 1);
    }
        
    public void print(int perLine){
        for (int i = 0; i < dynamicArray.length; i++) {
            if(dynamicArray[i] != -1) {
                if(dynamicArray[i] < 10) {
                    System.out.print(dynamicArray[i] + "   ");

                } else {
                    System.out.print(dynamicArray[i] + "  ");
                }
                if(i % perLine == (perLine - 1)) {
                    System.out.println();
                }
            }
        }
    }
}
