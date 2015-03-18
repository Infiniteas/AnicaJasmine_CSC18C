package assignment3_linkedlist_int;


public class LinkedList {
    //Link reference that will point to newestLink added
    Link newestLink;
    
    //Constructor
    LinkedList() {
        newestLink = null;
    }
    
    //Checks for null
    public boolean isLinkedListEmpty() {
        return newestLink == null;
    }
    
    //passes in Name of link and number
    public void insertNewLink(int number) {
        //Creates a new Link object
        Link newLink = new Link();
        //Sets a number into the Link object
        newLink.pushLink(number);
        //newLink.previous is pointing to the newestLink
        newLink.previous = newestLink;
        //newestLink is now pointing to the recenetly added link;
        newestLink = newLink;
    }
    
    public void popLink() {
        //if LinkedList is not empty
        if(!isLinkedListEmpty()) {
            //newestLink will point to the previous link
            newestLink = newestLink.previous;
        } else {
            System.out.println("Empty Linked List");
        }
    }
    
    //Will print in reverse order to numbers added
    public void printLinkedList() {
        //starts from the newestLink added to the Link List
        Link theLink = newestLink;
        
        while(theLink != null) {
            //prints out number in each Link as it passes
            theLink.printLink();

            //sets the link to the previous
            theLink = theLink.previous;
        
            System.out.println(); 
        }
        
    }
}
