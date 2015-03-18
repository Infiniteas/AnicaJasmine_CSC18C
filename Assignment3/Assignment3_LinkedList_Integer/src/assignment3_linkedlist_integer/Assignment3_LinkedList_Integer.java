/*
 * File: Assignment3_LinkedList_Integer
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 3/17/15
 */
package assignment3_linkedlist_integer;

public class Assignment3_LinkedList_Integer {


    public static void main(String[] args) {
        //Creates a LinkedList object
        LinkedList theLinkedList = new LinkedList();
        
        //pushes numbers onto the stack
        theLinkedList.insertNewLink(7);
        theLinkedList.insertNewLink(4);
        theLinkedList.insertNewLink(3);
        theLinkedList.insertNewLink(5);
        
        //pops number 5 from list
        theLinkedList.popLink();
        theLinkedList.printLinkedList();
    }
    
}
