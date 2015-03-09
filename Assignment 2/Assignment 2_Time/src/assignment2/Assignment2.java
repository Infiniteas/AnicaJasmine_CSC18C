/*
 * File: Assignment 2
 * //////////////////////////////
 * Programmer: Jasmine Anica
 * //////////////////////////////
 * Class: CSC-18C
 * //////////////////////////////
 * Date: 3/08/2015
 *
 */
package assignment2;

import java.util.Scanner;

public class Assignment2 {
    
    public static void main(String[] args) {
        
        //create the size of the array
        int size = 400;
        
        /*
        //create BinarySearch Object 
        BinarySearch search = new BinarySearch(size);

        System.out.println("This is the Original array: ");
        search.fillArray(); //uses Basesort methods
        search.print(10);
        
        System.out.println("This is the Sorted array: ");      
        search.setArray(search.sortArray());
        search.print(10);

        Scanner input = new Scanner(System.in);
        
        //allows the user to input the number they want to find
        System.out.println("Enter number you want found in array: ");
        int find = input.nextInt();
        
        long startTime = System.currentTimeMillis();
        System.out.print(startTime);
        //binary search is used to find a variable in an array
        search.sortedBinarySearch(find, 0, size);
        long endTime = System.currentTimeMillis();
        System.out.print(endTime);

        System.out.println();
        
        System.out.println("That took " + (endTime - startTime)/1000.0f + " seconds");

        */
        
        
        //creates the object BubbleSort
        BubbleSort bubble = new BubbleSort(size);
        
        System.out.println("This is the Original array: ");     
        bubble.setArray(bubble.fillArray());
        bubble.print(50);
        
        long startTime = System.currentTimeMillis();
        //bubble sort is used to sort array
        bubble.bubbleSort();
        long endTime = System.currentTimeMillis();
        
        System.out.println("This is the Original array: "); 
        bubble.print(50);
        
        System.out.println("That took " + (endTime - startTime)/1000.0f + " seconds");
        
        System.out.println();
 

    }
    
}
