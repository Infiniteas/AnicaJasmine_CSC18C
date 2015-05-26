/*
 * File: Project 1
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 5/20/15
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
    
    /**
     * This method returns true if array is empty or false if it is filled
     * 
     * @return boolean
     */
    public boolean isEmpty() {
        return (index == -1);
    }
    
    /**
     * This method sets the size of this Vector
     * 
     * @param size of Vector
     */
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
    
    /**
     * This method adds a number to the Vector and will double size if needed
     * 
     * @param number to add to the Vector
     */
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
    
    /**
     * This method checks to make sure the index does not go out of bounds.
     * It will return true if not out of bounds, it will return false if index
     * is out of bounds.
     * 
     * @return boolean
     */
    public boolean checkAdd() {
        return index != dynamicArray.length-1;
    }
    
    /**
     * This method will sort the array in the Vector and return an int array.
     * 
     * @return int[]
     */
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
    
    /**
     * This function sets the passed in array to this Vector's array
     * 
     * @param arr - an integer array
     */
    public void setArray(int[] arr){
        this.dynamicArray = arr;
    }
  
    
    /**
     * This method will check for any multiple numbers in the Vector and return
     * true if there is not a duplicate or return false if there is a duplicate
     * 
     * @param num value to check in the array
     * @return boolean
     */
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
    
    /**
     * This method will return the number at a specific index in the Vector.
     * 
     * @param index to a number in the Vector
     * @return int - number in the Vector at passed in index
     */
    public int getNumber(int index){
        return dynamicArray[index];
    }
    
    /**
     * This method will empty the Vector
     */
    public void emptyVector(){
        
        //initialize the elements in the array to -1
        for(int i = 0; i < dynamicArray.length; i++){
            dynamicArray[i] = -1;
        }
        
        index = -1;
    }
    
    /**
     * This method will return the size of this Vector
     * 
     * @return int - size of Vector
     */
    public int getSize(){
        return (index + 1);
    }
      
    
    /**
     * This method will print out the values in the Vector
     * 
     * @param perLine number to display in a row
     */
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
