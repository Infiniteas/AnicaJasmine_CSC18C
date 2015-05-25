/*
 * File: Project 1
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 5/20/15
 */
package project1;

/**
 *
 * @author Jasmine
 */
public class DoublyLinkedList {
    //remembers the first link ONLY
    Link headLink;
    
    //Link reference that will point to newestLink added (or last link)
    Link newestLink;
    
    //Constructor
    DoublyLinkedList() {
        newestLink = null;
        headLink = null;
    }
    
    /**
     * This method checks if LinkedList is empty or filled
     * 
     * @return boolean
     */
    public boolean isLinkedListEmpty() {
        return newestLink == null || headLink == null;
    }
    
    
   /**
    * This method adds a Link from the front of the List 
    * 
    * @param index Integer of newLink
    * @param color Character of newLink
    */
    public void insertHeadLink(Integer index , Character color) {
        
        //Ex: add 3 to front of
        //LinkedList: 5, 2, 7
        
        //in ex. above newLink = 3
        Link newLink = new Link(); 
        newLink.addLink(index, color);
        

        if (isLinkedListEmpty()) { //check for empty list
            newestLink = newLink; //updates newLink
        }
        else {
            // in ex. above headLink = 5
            //sets current headlink.previous = 3
            headLink.previous = newLink; 
        }
        
        //newLink = 3
        //makes newLink.next = 5
        newLink.next = headLink; 
        
        headLink = newLink; //updates headLink to the added Link
    }
    
    /**
     * This method adds a Link to the List from the end by passing
     * in an index to add
     * 
     * @param index Integer of newLink
     * @param color Character of newLink
     */
    public void insertNewLink(Integer index , Character color){
        
        //Ex: add 8 to 
        //List: 6, 4, 12, 1
        
        //in ex. above newLink = 8 
        Link newLink = new Link(); 
        newLink.addLink(index, color);
        
        if (isLinkedListEmpty()) { //check is link is empty
            headLink = newLink;
        } else { //if there is a newestLink
            //newestLink = 1
            newestLink.next = newLink; // sets the reference to the newLink
            //we want newLink.previous = 1
            newLink.previous = newestLink; 
        }
        newestLink = newLink; //updates the newestLink
        
        //List: 6, 4, 12, 1, 8
    }
    
    
   
    /**
     * This method deletes the head (very first) Link of list
     * 
     * @return Link - headLink
     */
    public Link deleteHeadLink(){
        
        // Example:
        // List: 1, 2, 3, 4
        
        //headLink.next above is 2
        //headLink is the first Link in the LinkedList
        if (headLink.next == null) { //true if headLink is the only link
            newestLink = null; //there is no newestLink
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
    
    /**
     * This method deletes the newestLink added(or in other terms: the last Link
     * added) to the LinkedList.
     * 
     * @return Link - newestLink
     */
    public Link deleteNewestLink() {
 
        // Example:
        // List: 1, 2, 3, 4
        
        //headLink.next above is 2
        //headLink is the first Link in the LinkedList
        if (headLink.next == null) { //true if headLink is the only link
            headLink = null; //deletes newestLink (which happens to be the head)
        } else {
            //in ex. above, newestLink = 4
            //newestLink.previous = 3
            //newestLink.previous.next = 4 but we want to delete this reference
            newestLink.previous.next = null;
        }
        //makes newestestLink = 3
        newestLink = newestLink.previous;
        
        //list is now: 1, 2, 3
        
        return newestLink;
    }
    
    /**
     * This method empties the DoublyLinkedList
     */
    public void clearList(){
        newestLink = null;
        headLink = null;
    }
    
    /**
     * This method inserts an index after indexInLink
     * 
     * ex: insertAfter(3,7) = inserts 3 after 7
     * 
     * @param index Integer to add to Link to add to DoublyLinkedList
     * @param indexInLinkedList value of existent Integer in DoublyLinkedList
     * @param color - Character of Link in given index of DoublyLinekdList
     * @return boolean
     */
    public boolean insertAfter(Integer index, Integer indexInLinkedList , Character color){
        // Example:
        // add 5 after 8 in
        // List: 3, 8, 7, 6
        
        //current starts at 3 in example above
        //current begins at the start of the LinkedList
        Link current = headLink;
        
        //Check to see if the index exists in the LinkedList using current
        while (current.getIndex() != indexInLinkedList) { //breaks when current = indexInLinkedList
            
            current = current.next;
            
            //if current hits the end
            if(current == null) {
                System.out.println("Index in LinkedList not found");
                return false;
            }
        }

        //newLink = 5;
        Link newLink = new Link();
        newLink.addLink(index, color);
        
        //current is 8 in example above
        //current now equals indexInLinkedList
        if (current == newestLink) {
            newLink.next = null; // newLink is the newestLink so no next available
            newestLink = newLink; //updates the newestLink with newLink
        } else {
            
            // List: 3, 8, 7, 6
            // current = 8, current.next = 7
            // newLink = 5;
            
            //makes newLink.next = 7 
            newLink.next = current.next; 
            //makes (current.next(= 7).previous = 8) = 5
            current.next.previous = newLink;
            
        }
        //makes newLink.prevous = 8
        newLink.previous = current; 
        //makes current.next = 5
        current.next = newLink;
        // now: 3, 8, 5, 7 ,6
        
        return true;
    }
    
    /**
     *
     * This function lets the user change the letter in the board
     * by selecting the row and column and then replacing the current color with
     * the color passed in.
     * 
     * @param row value of the row in List
     * @param column value of column in List
     * @param color Character of Link
     */
    public void changeColor(Integer row, Integer column, Character color){
        
        int index = 1;
        
        //check is list is empty
        if (isLinkedListEmpty()){
            System.out.println("LinkedList is empty. Cannot delete index");   
        }
        
        if (row != 1){
            index += 6*(row - 1);
        }
        
        //calculated the index
        index += column - 1;
        
        Link current = headLink;
        
        while(current.getIndex() != index){
            
            current = current.next;
            
            if (current == null) {
                System.out.println("Index not found in LinkedList");
            }
            
        }
        
        current.setCharacter(color);
        
    }
    
    /**
     * This method return the character corresponding to the position of row and
     * column in a 6x6 board.
     * 
     * @param row value of row in DoublyLinkedList
     * @param column value of column DoublyLinkedList
     * @return Character - color of Link
     */
    public Character findCharacter(Integer row, Integer column){
        int index = 1;
        
        //check is list is empty
        if (isLinkedListEmpty()){
            System.out.println("LinkedList is empty. Cannot delete index");   
        }
        
        if (row != 1){
            index += 6*(row - 1);
        }
        
        //calculated the index
        index += column - 1;
        
        Link current = headLink;
        
        while(current.getIndex() != index){
            
            current = current.next;
            
            if (current == null) {
                System.out.println("Index not found in LinkedList");
            }
            
        }
        
        return current.getCharacter();
    }
    
    /**
     * This method deletes a link in LinkedList by passing in desired index.
     * 
     * @param index Integer in Link to be deleted
     * @return boolean
     */
    public boolean deleteLink(Integer index){
        
        if (isLinkedListEmpty()){
            System.out.println("LinkedList is empty. Cannot delete index");
            return false;
        }
        
        Link current = headLink;
        
        while(current.getIndex() != index){
            current = current.next;
            if (current == null) {
                System.out.println("Index not found in LinkedList");
                return false;
            }
        }
        
        if(current == headLink){
            deleteHeadLink();
        } else if (current == newestLink){
            deleteNewestLink();
        } else {
            //sets the current's previous Link and next Link referencing each other.
            current.next.previous = current.previous;
            current.previous.next = current.next;
        }
        
        return true;
    }
    
    /**
     * This method will print from the first index added and check how many per
     * line to display by passing in an int value.
     * 
     * @param perLine number of displays in a row
     */
    public void printLinkedListIndex(int perLine) {   
        
         //starts from the headLink 
        Link theLink = headLink;
             
        while(theLink != null) {
            
            //prints index in each Link as it passes
            theLink.printLinkIndex();

            Integer number = theLink.getIndex() % perLine;
            if (number.equals(0)) {
                System.out.println();
            }
            
            //sets the link to the previous Link
            theLink = theLink.next;
            
        }
    }
    
    /**
    * This method will print the characters from beginning and check how many per
    * line to display by passing in an int value.
    * 
    * @param perLine number of displays in a row
    */
    public void printLinkedListColor(int perLine) {   
        
         //starts from the headLink 
        Link theLink = headLink;
          
        while(theLink != null) {
            
            //prints index in each Link as it passes
            theLink.printLinkColor();

            Integer number = theLink.getIndex() % perLine;
            if (number.equals(0)) {
                System.out.println();
            }
            
            //sets the link to the previous Link
            theLink = theLink.next;
            
        }
    }

    /**
     * This method will print the DoublyLinkedList in order of a board rotated 
     * to the right
     * 
     * @param perLine number of displays in a row
     */
    public void printLinkedListCol(int perLine) {   
        
         //starts from the headLink 
        Link theLink = headLink;
        
        int counter = 1;
        while(theLink != null) {
            
            //prints index in each Link as it passes
            theLink.printLinkColor();

            if (counter % 6 == 0) {
                System.out.println();
            }
            
            //sets the link to the previous Link
            theLink = theLink.next;
            counter++;
        }
    }
    
    /**
     * This method will print from the most recently added index
     */
    public void printLinkedListInReverseOrder() {

        //starts from the newestLink added to the Link List
        Link theLink = newestLink;
        
        while(theLink != null) {
            //prints index in each Link as it passes
            theLink.printLinkIndex();

            //sets the link to the previous Link
            theLink = theLink.previous; 
        
            System.out.println(); 
        }
    }
        
}
