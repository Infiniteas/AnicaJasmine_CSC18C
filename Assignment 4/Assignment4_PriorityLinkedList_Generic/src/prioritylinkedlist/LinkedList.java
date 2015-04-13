/*
 * File: Assignment4_PriorityLinkedList_Generic
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 4/12/15
 *
 */
package prioritylinkedlist;

/**
 *
 * @author Jasmine
 */
public class LinkedList {
    
         public static void main(String[] args) {
        //Creates a LinkedList object
        PriorityLinkedList_Generic theLinkedList = new PriorityLinkedList_Generic();
        
        //pushes item onto the stack
        theLinkedList.insertNewLink(2);
        theLinkedList.insertNewLink(7);
        theLinkedList.insertNewLink(3);
        theLinkedList.insertNewLink(5);
        theLinkedList.insertNewLink(4);
       

        System.out.println("Linked list:");
        theLinkedList.printLinkedList();
        System.out.println();

        System.out.println("Find LinkedList key for 5");
        System.out.println();
        
        int key = theLinkedList.findLinkKey(5);
        System.out.println("Key is:" + key);
        System.out.println();
        
        
        System.out.println("Linked list:");
        theLinkedList.printLinkedList();
        
        System.out.println("Find LinkedList key for 7");
        System.out.println();
        
        key = theLinkedList.findLinkKey(7);
        System.out.println("Key is:" + key);
        System.out.println();
        
        System.out.println("Linked list:");
        theLinkedList.printLinkedList();
        
     }
    
}
