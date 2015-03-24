/*
 * File: Assignment4_SingleLinkedList_Generic
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 3/23/15
 * Program: A single linked list that uses a reference to the previous Link
 * and a reference to the next Link.
 */
package singlelinkedlist_generic;

public class SingleLinkedList_Generic {


    public static void main(String[] args) {
        //Creates a LinkedList object
        LinkedList theLinkedList = new LinkedList();
        
        //pushes item onto the stack
        theLinkedList.insertNewLink(2.0);
        theLinkedList.insertNewLink(4.3);
        theLinkedList.insertNewLink(6.5);
        theLinkedList.insertNewLink(8.1);
        
        //pops item 8.1 from list
        theLinkedList.popLink();
        
        //add item into stack
        theLinkedList.insertNewLink(2.1);
        
        //uses the link.next
        System.out.println("This is the list printed in order");
        theLinkedList.printLinkedListInOrder();
        System.out.println();
        //uses the link.previous
        System.out.println("This is the list printed in reverse order");        
        theLinkedList.printLinkedListInReverseOrder();
        
    }
    
}
