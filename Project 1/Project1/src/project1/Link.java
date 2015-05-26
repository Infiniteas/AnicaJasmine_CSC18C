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
public class Link {
    //reference to the next link
    Link next;
    //reference to the previous link
    Link previous;
    
    //number in this link
    private Integer index;
    private Character color;
    
        
    
    /**
     * This method sets the index and color to this Link
     * 
     * @param index Integer of Link
     * @param color Character of Link
     */
    public void addLink(Integer index, Character color) {
        this.index = index;
        this.color = color;
    }
    
    /**
     * This method returns the Link's index Integer
     * 
     * @return Integer
     */
    public Integer getIndex(){
        return index;
    }
    
    /**
     * This method returns the Link's color Character
     * 
     * @return Character
     */
    public Character getCharacter(){
        return color;
    }
    
    /**
     * This method sets the Link's color Character
     * 
     * @param color Character of Link
     */
    public void setCharacter(Character color){
        this.color = color;
    }
    
    /**
     * This method displays the index of this Link
     */
    public void printLinkIndex() {
        System.out.print(index + " ");
    }
    
    /**
     * This method displays the color of this Link
     */
    public void printLinkColor(){
        System.out.print(color + " ");
    }
}
