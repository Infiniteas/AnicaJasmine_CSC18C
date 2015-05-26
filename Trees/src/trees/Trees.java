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
public class Trees {
    
    public static void main(String args[]){
        
        BinaryTree binarySearchTree = new BinaryTree();
        
        binarySearchTree.addNode(50);
        binarySearchTree.addNode(40);
        binarySearchTree.addNode(60);
        binarySearchTree.addNode(20);
        binarySearchTree.addNode(35);
        binarySearchTree.addNode(80);
        binarySearchTree.addNode(75);
        
        System.out.println("InOrder:");
        binarySearchTree.inorderTraversalTree(binarySearchTree.root);
        System.out.println("PreOrder");
        binarySearchTree.preorderTraversalTree(binarySearchTree.root);
        System.out.println("PostOrder");
        binarySearchTree.postorderTraversalTree(binarySearchTree.root);
    }
    
    
    
}
