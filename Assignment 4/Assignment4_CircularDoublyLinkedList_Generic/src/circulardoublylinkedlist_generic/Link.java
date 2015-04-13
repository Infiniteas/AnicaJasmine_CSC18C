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
    
