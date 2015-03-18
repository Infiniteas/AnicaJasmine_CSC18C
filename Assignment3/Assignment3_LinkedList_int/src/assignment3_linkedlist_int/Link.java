/*
 * File: Assignment3_LinkedList_int
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 3/15/15
 */
package assignment3_linkedlist_int;


public class Link {
    //reference to the previous link
    Link previous;

    //number in this link
    int number;
    
    //sets number to this link
    public void pushLink(int number) {
        this.number = number;
    }
    
    //displays number in this link
    public void printLink() {
        System.out.println("This Link contains number: " + number);
    }
    
}
