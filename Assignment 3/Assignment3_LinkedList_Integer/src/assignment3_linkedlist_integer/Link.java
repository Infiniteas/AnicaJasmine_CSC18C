/*
 * File: Assignment3_LinkedList_Integer
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 3/17/15
 */
package assignment3_linkedlist_integer;


public class Link {
    //reference to the previous link
    Link previous;
    
    //number in this link
    Integer number;
    
    //adds number to this link
    public void pushLink(Integer number) {
        this.number = number;
    }
    
    //displays number in this link
    public void printLink() {
        System.out.println("This Link contains number: " + number);
    }

}
