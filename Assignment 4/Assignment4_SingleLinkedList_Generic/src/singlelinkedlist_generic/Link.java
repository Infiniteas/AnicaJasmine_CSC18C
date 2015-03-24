/*
 * File: Assignment4_SingleLinkedList_Generic
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 3/23/15
 */
package singlelinkedlist_generic;

public class Link<T> {
    //reference to the next link
    Link next;
    //reference to the previous link
    Link previous;

    //number in this link
    T item;
    
        
    //adds item to this link
    public void pushLink(T item) {
        this.item = item;
    }
    
    //displays item in this link
    public void printLink() {
        System.out.println("This Link contains item: " + item);
    }
    
}
