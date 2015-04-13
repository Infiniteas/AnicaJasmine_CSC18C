/*
 * File: Assignment4_DoublyLinkedList_Generic
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 4/10/15
 */
package doublylinkedlist_generic;

/**
 *
 * @author Jasmine
 */
public class LinkedList {
    public static void main(String[] args) {
        //Creates a LinkedList object
        DoublyLinkedList_Generic theLinkedList = new DoublyLinkedList_Generic();
        
        //pushes item onto the stack
        theLinkedList.insertNewLink(2.0);
        theLinkedList.insertNewLink(4.12);
        theLinkedList.insertNewLink(6.5);
        theLinkedList.insertNewLink(8.1);
        

        System.out.println("This is the list printed in order");
        theLinkedList.printLinkedListInOrder();
        System.out.println();

        
        System.out.println("Add number 5.2 to the front of the List");
        theLinkedList.insertHeadLink(5.2);
        
        System.out.println();
        
        System.out.println("Add number 7.4 to the end of the List");
        theLinkedList.insertNewLink(7.4);
        
        System.out.println();
        System.out.println("Add number 1.5 after 4.12");
        theLinkedList.insertAfter(1.5,4.12);
        System.out.println();
        
        //System.out.println("Add num")
        
         
        System.out.println("This is the list printed in order");
        theLinkedList.printLinkedListInOrder();
        System.out.println();
        
        //uses the link.previous
        System.out.println("This is the list printed in reverse order");        
        theLinkedList.printLinkedListInReverseOrder();
        
    }
    
}
