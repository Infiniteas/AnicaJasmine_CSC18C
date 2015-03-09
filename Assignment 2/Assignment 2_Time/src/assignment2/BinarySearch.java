
package assignment2;

/*
 * Finds a variable in array using a binary search
 */
public class BinarySearch extends BaseSort {
    
    int[] binaryArray;
  
    public BinarySearch(int size) {
        super(size);
        binaryArray = array;
    }
    
        
    public void setArray(int[] array){
        binaryArray = array;
    }

    public int sortedBinarySearch(int key, int min, int max) {
        int midpoint = midpoint(min, max);
     
        if (binaryArray[midpoint] > key) {
            System.out.println("Number in array was too high:  " 
                    + binaryArray[midpoint]);
            
            return sortedBinarySearch(key, min, midpoint - 1);
        } else if (binaryArray[midpoint] < key) {
            System.out.println("Number in array was too low:   " 
                    + binaryArray[midpoint]);
            return sortedBinarySearch(key, midpoint + 1, max);
        } else {
            System.out.println("Found index key:  " + midpoint);
            return midpoint;
        }
    }

    public int midpoint(int min, int max) {

        return min + ((max - min) / 2);
    }
    
    public void printBinarySearch() {
        //Output the efficiency
        System.out.println("Analyze by comparing operations");
        System.out.println();
        System.out.println("N  = " + binaryArray.length);
        System.out.println("nEquals  = " );
    }
    
    
    
}
