/*
 * File: Assignment1
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 3/05/15
 */
package assignment1;

import java.util.Scanner;


public class Assignment1 {
    
    public static void main(String[] args) {
        
        
        //create the size of the array
        int size = 400;
        
        /*
        //create BinarySearch Object 
        BinarySearch search = new BinarySearch(size);
        
        search.fillArray(); //uses Basesort methods
        
        System.out.println("This is the Sorted array: ");      
        search.setArray(search.sortArray());
        search.print(10);
        
        //binary search is used to find a variable in an array
        search.sortedBinarySearch(0, size);
        System.out.println();
        
        //print out binary algorithm analysis
        search.printBinarySearch();
        */
        
        //creates the object BubbleSort
        BubbleSort bubble = new BubbleSort(size);
        
        System.out.println("This is the Original array: ");     
        bubble.setArray(bubble.fillArray());
        bubble.print(10);
        
        //bubble sort is used to sort array
        bubble.bubbleSort();
        System.out.println();
        
        //print out bubbleS analysis
        bubble.printBubbleSort();
       

    }
    
}
