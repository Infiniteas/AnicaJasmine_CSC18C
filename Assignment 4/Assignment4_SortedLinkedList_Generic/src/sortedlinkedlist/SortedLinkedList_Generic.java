/*
 * File: Assignment4_SortedLinkedList_Generic
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 4/12/15
 *
 */
package sortedlinkedlist;

/**
 *
 * @author Jasmine
 * @param <T>
 */
public class SortedLinkedList_Generic<T extends Comparable<T>>{
    //remembers the first link ONLY
    Link headLink;
    
    //Link reference that will point to tailLink added 
    Link tailLink;
    
    //Constructor
    SortedLinkedList_Generic() {
        tailLink = null;
        headLink = null;
    }
    
    //Checks for null
    public boolean isLinkedListEmpty() {
        return tailLink == null|| headLink == null;
    }
    
    
    /**
     * This method adds a Link to the List from the end by passing
     * in an item to add
     * @param item 
     */
    public void insertNewLink(T item){

        Link newLink = new Link(); 
        newLink.item = item;
        
        Link current = headLink;
        
        if (isLinkedListEmpty()) { //check is link is empty
            headLink = newLink;
            tailLink = newLink;
        } else if (current.next == null) {
           if (current.compareTo(newLink) == 0){
                //does not add a duplicate value
                System.out.println("There is already an equivalent value in the list null");
           } else if (current.compareTo(newLink) == -1) {
                current.next = newLink;
                newLink.previous = current;
                newLink.next = null;
                tailLink = newLink;
           } else if (current.compareTo(newLink) == 1) {
               current.previous = newLink;
               newLink.next = current;
               newLink.previous = null;
               headLink = newLink;
           }
        } else {
            
             while(current.next != null){
                
                if (current.compareTo(newLink) == -1 && 
                        current.next.compareTo(newLink) == 1) {
                    //the Link with greater value than the newLink is now infront
                    current.next.previous = newLink; 
                    //the newLink is position between a smaller and bigger value
                    newLink.previous = current;
                    newLink.next = current.next;
                    //the Link with samller value than newLink is now behind
                    current.next = newLink;
                    break;
                } else if (current.compareTo(newLink) == 0) {
                    //does not add a duplicate value
                    System.out.println("There is already an equivalent value in the list loop");
                    break;
                }
        
                current = current.next;
            }
             
            if (current.next == null) {
                current.next = newLink;
                newLink.previous = current;
                newLink.next = null;
                tailLink = newLink;
           } 
             
        }
    }
    
    
   
    /*
     * This method deletes the head (very first) Link of list
     * 
    */
    public Link deleteHeadLink(){
        
        // Example:
        // List: 1, 2, 3, 4
        
        //headLink.next above is 2
        //headLink is the first Link in the LinkedList
        if (headLink.next == null) { //true if headLink is the only link
            tailLink = null; //there is no tailLink
        } else {
            //headLink.next = 2
            //headLink.next.previous = 1 but we want to delete that reference
            headLink.next.previous = null;
        }
        
        //makes headlink now 2
        headLink = headLink.next;
        
        //List is now: 2, 3, 4, 
        
        return headLink;
    }
    
    /*
     * This method deletes the tailLink added(or in other terms the last link
     * added) to the LinkedList.
     * @return 
     */
    public Link deleteTailLink() {
 
        // Example:
        // List: 1, 2, 3, 4
        
        //headLink.next above is 2
        //headLink is the first Link in the LinkedList
        if (headLink.next == null) { //true if headLink is the only link
            headLink = null; //deletes tailLink (which happens to be the head)
        } else {
            //in ex. above, tailLink = 4
            //newestLink.previous = 3
            //newestLink.previous.next = 4 but we want to delete this reference
            tailLink.previous.next = null;
        }
        //makes newestestLink = 3
        tailLink = tailLink.previous;
        
        //list is now: 1, 2, 3
        
        return tailLink;
    }
    
    
    /**
     * This method deletes an item in LinkedList by passing in desired item.
     * 
     * @param item 
     */
    public boolean deleteItem(T item){
        
        if (isLinkedListEmpty()){
            System.out.println("LinkedList is empty. Cannot delete item");
            return false;
        }
        
        Link current = headLink;
        
        while(current.item != item){
            current = current.next;
            if (current == null) {
                System.out.println("Item not found in LinkedList");
                return false;
            }
        }
        
        if(current == headLink){
            deleteHeadLink();
        } else if (current == tailLink){
            deleteTailLink();
        } else {
            //sets the current's previous Link and next Link referencing each other.
            current.next.previous = current.previous;
            current.previous.next = current.next;
        }
        
        return true;
    }
    
    //this will print from the first item added
    public void printSortedLinkedList() {   
        
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
}
