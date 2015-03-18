/*
 * File: Assignment3_LinkedList_int
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 3/15/15
 */
package assignment3_linkedlist_int;


public class Assignment3_LinkedList {

    public static void main(String[] args) {
        
        //Creates a LinkedList object
        LinkedList theLinkedList = new LinkedList();
        
        //pushes numbers onto the stack
        theLinkedList.insertNewLink(2);
        theLinkedList.insertNewLink(4);
        theLinkedList.insertNewLink(6);
        theLinkedList.insertNewLink(8);
        
        //pops number 8 from list
        theLinkedList.popLink();
        
        //prints linked list
        theLinkedList.printLinkedList();
        
        
    }
    
}
