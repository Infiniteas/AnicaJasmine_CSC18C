/*
 * File: Assignment4_SortedLinkedList_Generic
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 4/12/15
 *
 * This Linked List will sort automatically and will not add duplicate values
 */
package sortedlinkedlist;

/**
 *
 * @author Jasmine
 */
public class LinkedList {
     public static void main(String[] args) {
        //Creates a LinkedList object
        SortedLinkedList_Generic theLinkedList = new SortedLinkedList_Generic();
        
        //pushes item onto the stack
        theLinkedList.insertNewLink(2);
        theLinkedList.insertNewLink(7);
        theLinkedList.insertNewLink(3);
        theLinkedList.insertNewLink(5);
        theLinkedList.insertNewLink(4);
       

        System.out.println("Sorted list:");
        theLinkedList.printSortedLinkedList();
        System.out.println();
        
        //check duplicate
        theLinkedList.insertNewLink(4);
        System.out.println();
        
        System.out.println("Delete the first and last link in the sorted list");
        System.out.println();
        
        //this deletes the first link in the sorted list
        theLinkedList.deleteHeadLink();
        //this deletes the last link in the sorted list
        theLinkedList.deleteTailLink();
        
    
        System.out.println("Sorted list:");
        theLinkedList.printSortedLinkedList();
     }
}
