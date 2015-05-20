/*
 * File: Project 1
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 5/17/15
 */
package project1;

/**
 *
 * @author Jasmine
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoublyLinkedList board = new DoublyLinkedList();
        DoublyLinkedList boardCol = new DoublyLinkedList();
        
        
        //creates a LinkedList
        for (int i = 1; i <= 36; i++) {
            board.insertNewLink(i, 'G');
        }
        
        int counter = 1;
        for (int i = 1; i <= 6; i++){
            boardCol.insertNewLink(i, 'G');
            for (int j = 7; j <= 36; j+=6){
                boardCol.insertNewLink(i+(j-1), 'G');
            }
        }
        
        System.out.println("1 % 6:  " + 1 % 6);
        System.out.println("2 % 6:  " + 2 % 6);
        System.out.println("3 % 6:  " + 3 % 6);
        System.out.println("4 % 6:  " + 4 % 6);
        System.out.println("5 % 6:  " + 5 % 6);
        
    }
    
    
    
}
