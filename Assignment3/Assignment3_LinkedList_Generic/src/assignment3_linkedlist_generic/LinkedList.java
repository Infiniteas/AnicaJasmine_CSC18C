/*
 * File: Assignment3_LinkedList_Generic
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 3/17/15
 */
package assignment3_linkedlist_generic;

public class LinkedList<T> {
    //Link reference that will point to newestLink added
    Link newestLink;
    
    //Constructor
    LinkedList() {
        newestLink = null;
    }
    
    //Checks for null
    public boolean isLinkedListEmpty() {
        return newestLink == null;
    }
    
    //passes in Name of link and item
    public void insertNewLink(T item) {
        //Creates a new Link object
        Link newLink = new Link();
        //Sets a item into the Link object
        newLink.pushLink(item);
        //newLink.previous is pointing to the newestLink
        newLink.previous = newestLink;
        //newestLink is now pointing to the recenetly added link;
        newestLink = newLink;
    }
    
    public void popLink() {
        //if LinkedList is not empty
        if(!isLinkedListEmpty()) {
            //newestLink will point to the previous link
            newestLink = newestLink.previous;
        } else {
            System.out.println("Empty Linked List");
        }
    }
    
    //Will print in reverse order to numbers added
    public void printLinkedList() {
        //starts from the newestLink added to the Link List
        Link theLink = newestLink;
        
        while(theLink != null) {
            //prints item in each Link as it passes
            theLink.printLink();

            //sets the link to the previous Link
            theLink = theLink.previous; 
        
            System.out.println(); 
        }
    }
}
