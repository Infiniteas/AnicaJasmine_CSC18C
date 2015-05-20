/*
 * File: Assignment4_DoublyLinkedList_Generic
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 4/17/15
 */
package project1;


/**
 *
 * @author Jasmine
 */
public class Link {
    //reference to the next link
    Link next;
    //reference to the previous link
    Link previous;
    
    //number in this link
    private Integer index;
    private Character color;
    
        
    //adds index to this link
    public void addLink(Integer index, Character color) {
        this.index = index;
        this.color = color;
    }
    
    public Integer getIndex(){
        return index;
    }
    
    public Character getCharacter(){
        return color;
    }
    
    public void setCharacter(Character color){
        this.color = color;
    }
    
    //displays index in this link
    public void printLinkIndex() {
        System.out.print(index + " ");
    }
    
    public void printLinkColor(){
        System.out.print(color + " ");
    }
}
