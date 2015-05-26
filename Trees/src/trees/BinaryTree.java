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
public class BinaryTree {
    //Top Node
    Node root;
    
    /**
     * Adds a Node to the Binary Tree
     * @param key
     */
    public void addNode(int key){
        
        //create a newNode
        Node newNode = new Node(key);
        
        if(root == null){ //if root node has not been initialized
            
            //creates root node
            root = newNode;
            
        } else { //if root node HAS been initialized: create child node
            
            //node we will focus on
            Node focusNode = root;
            
            //temporarily stores parent node info
            Node parent;
            
            while(true){
                
                //current node focused on
                parent = focusNode;
                
                if(key < focusNode.key){ //checks if Node key is smaller
                    
                    focusNode = focusNode.leftChild;
                    
                    if(focusNode == null){
                        
                        parent.leftChild = newNode;
                        
                        return; //exit out of while loop
                    }
                } else { // Node key is bigger
                    
                    focusNode = focusNode.rightChild;
                    
                    if(focusNode == null){
                        
                        parent.rightChild = newNode;
                        
                        return; //exit out of while loop
                    }
                }
            }
        }
    }
    
    public void inorderTraversalTree(Node focusNode){
        
        if(focusNode != null){
            
            inorderTraversalTree(focusNode.leftChild);
            
            focusNode.printKey();
            
            inorderTraversalTree(focusNode.rightChild);
            
        }
        
    }
    
    public void preorderTraversalTree(Node focusNode){
        
        if(focusNode != null){
            
            focusNode.printKey();
            
            preorderTraversalTree(focusNode.leftChild);
            
            preorderTraversalTree(focusNode.rightChild);
            
        }
        
    }
    
    public void postorderTraversalTree(Node focusNode){
        
        if(focusNode != null){
            
            postorderTraversalTree(focusNode.leftChild);
            
            postorderTraversalTree(focusNode.rightChild);
            
            focusNode.printKey();
            
        }
        
    }
    
}
