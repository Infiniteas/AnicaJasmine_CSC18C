/*
 * File: Assignment4_SingleLinkedList_Generic
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 3/23/15
 * Program: A single linked list that uses a reference to the previous Link
 * and a reference to the next Link.
 */
package singlelinkedlist_generic;

public class SingleLinkedList_Generic<T> {
    //remembers the first link ONLY
    Link headLink;
    
    //Link reference that will point to newestLink added
    Link newestLink;
    
    //Constructor
    SingleLinkedList_Generic() {
        newestLink = null;
        headLink = null;
    }
    
    //Checks for null
    public boolean isLinkedListEmpty() {
        return newestLink == null || headLink == null;
    }
    
    //passes in Name of link and item
    public void insertNewLink(T item) {
        //Creates a new Link object
        Link newLink = new Link();
        //Sets a item into the Link object
        newLink.pushLink(item);
        
        //newLink.previous is pointing to the newestLink
        newLink.previous = newestLink;
        
        //if the link is empty, assigns the first link to headLink
        if (isLinkedListEmpty()) {
            //assigns headLink to the first link
            headLink = newLink;
            //newLink.previous is pointing to null
            newestLink = headLink;
        } else if (newestLink == headLink) {
            //if the headLink is already assigned, adds the next link
            headLink.next = newLink; 

        } else {
            //assigns the previous's link.next to the new link through newestLink
            newestLink.next = newLink;
        }
        
        //newestLink is now pointing to the recenetly added link;
        newestLink = newLink;
    }
    
    public void popLink() {
        //if LinkedList is not empty
        if(!isLinkedListEmpty()) {
            //newestLink will point to the previous link
            newestLink = newestLink.previous;
            //will delete the newest link added
            newestLink.next = null;
        } else {
            System.out.println("Empty Linked List");
        }
    }
    
    //this will print from the first item added
    public void printLinkedListInOrder() {   
        
         //starts from the headLink 
        Link theLink = headLink;
             
        while(theLink != null) {
            //prints item in each Link as it passes
            theLink.printLink();

            //sets the link to the previous Link
            theLink = theLink.next; 
        
            System.out.println(); 
        }
    }
    
    //this will print from the most recently added item
    public void printLinkedListInReverseOrder() {

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
