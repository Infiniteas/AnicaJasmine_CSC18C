/*
 * File: Assignment4_CircularDoublyLinkedList_Generic
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 4/10/15
 *
 */
package circulardoublylinkedlist_generic;

/**
 *
 * @author Jasmine
 */
public class LinkedList {
    public static void main(String[] args) {
        //Creates a LinkedList object
        CircularDoublyLinkedList_Generic theLinkedList = new CircularDoublyLinkedList_Generic();
        
        
        //pushes item onto the stack
        theLinkedList.insertNewLink(2.0);
        theLinkedList.insertNewLink(4);
        theLinkedList.insertNewLink(6.5);
        theLinkedList.insertNewLink(7);
        
        //connects head to end of list
        theLinkedList.connectHeadToNewestLink();

        System.out.println("This is the list printed in order");
        theLinkedList.printLinkedList();
        System.out.println();

        
        System.out.println("Add number 5.2 to the front of the List");
        theLinkedList.insertHeadLink(5.2);
        
        System.out.println();
        
        System.out.println("Add number 7.4 to the end of the List");
        theLinkedList.insertNewLink(7.4);
        
        System.out.println();
        System.out.println("Add number 1.5 after 4");
        theLinkedList.insertAfter(1.5, 4);
        System.out.println();
        
        System.out.println("Delete number 7");
        theLinkedList.deleteItem(7);
        System.out.println();
        
        //Connects head to end of list.
        theLinkedList.connectHeadToNewestLink();

        
        System.out.println("This is the list printed in order");
        theLinkedList.printLinkedList();
        System.out.println();

        
    }
}
