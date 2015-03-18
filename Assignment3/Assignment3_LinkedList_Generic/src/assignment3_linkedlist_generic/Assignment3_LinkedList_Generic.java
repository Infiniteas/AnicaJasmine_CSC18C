/*
 * File: Assignment3_LinkedList_Generic
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 3/1/15
 */
package assignment3_linkedlist_generic;

public class Assignment3_LinkedList_Generic {


    public static void main(String[] args) {
        //Creates a LinkedList object
        LinkedList theLinkedList = new LinkedList();
        
        //pushes numbers onto the stack
        theLinkedList.insertNewLink(2.0);
        theLinkedList.insertNewLink(4.3);
        theLinkedList.insertNewLink(6.5);
        theLinkedList.insertNewLink(8.1);
        
        //pops number 8.1 from list
        theLinkedList.popLink();
        theLinkedList.printLinkedList();
    }
    
}
