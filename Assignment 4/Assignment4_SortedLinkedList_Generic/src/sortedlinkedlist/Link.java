/*
 * File: Assignment4_SortedLinkedList_Generic
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 4/12/15
 *
 * Added comparable function
 */
package sortedlinkedlist;

/**
 *
 * @author Jasmine
 * @param <T>
 */
public class Link<T extends Comparable<T>> implements Comparable<Link<T>> {
    //reference to the next link
    Link next;
    //reference to the previous link
    Link previous;

    //number in this link
    T item;
    
        
    //adds item to this link
    public void pushLink(T item) {
        this.item = item;
    }
    
    //displays item in this link
    public void printLink() {
        System.out.println("This Link contains item: " + item);
    }
    
    public T getItem(){
        return item;
    }
    
    @Override
    public int compareTo(Link<T> that) {
       //will return 0 if item are equal
       //will return 1 if item is greater
       //will return -1 if item is less
       return getItem().compareTo(that.getItem());
    }
    
        
}
