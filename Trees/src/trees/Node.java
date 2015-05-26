/*
 * File: Trees
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 5/25/15
 */
package trees;

/**
 *
 * @author Jasmine
 */
public class Node {
    
    //references 
    Node rightChild;
    Node leftChild;
    
    //hold value
    int key;
    
    //Constructor
    Node(int key){
        this.key = key;
    }
    
    /**
     * Prints out the key value
     */
    public void printKey(){
        System.out.println("Key: " + key);
    }
}
