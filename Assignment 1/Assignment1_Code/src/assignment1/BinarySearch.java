
package assignment1;

/*
 * Finds a variable in array using a binary search
 */
public class BinarySearch extends BaseSort {
    int opEquals, opAddition, opLogic;
    
    int[] binaryArray;
    
    int find;

  
    public BinarySearch(int size) {
        super(size);
        binaryArray = array;
    }
    
        
    public void setArray(int[] array){
        binaryArray = array;
        find = binaryArray[size-6];
    }
    
    //Binary Seach uses recursion
    public int sortedBinarySearch(int min, int max) {
        opEquals++;
        int midpoint = midpoint(min, max);
        
        opLogic++;
        if (binaryArray[midpoint] > find) {
            opAddition++;
            return sortedBinarySearch(min, midpoint - 1);
        } else if (binaryArray[midpoint] < find) {
            opAddition++;
            opLogic++;
            return sortedBinarySearch(midpoint + 1, max);
        } else {
            return midpoint;
        }
    }

    public int midpoint(int min, int max) {
        opAddition += 3;
        return min + ((max - min) / 2);
    }
    
    public void printBinarySearch() {
        //Output the efficiency
        System.out.println("Analyze by Viewing Operations");
        System.out.println();
        System.out.println("N  = " + binaryArray.length);
        System.out.println("nEquals  = " + opEquals);
        System.out.println("nAdd  = " + opAddition);
        System.out.println("nLog  = " + opLogic);

        System.out.println("Total  = " + (opEquals + opAddition + opLogic));
    }
    
    
    
}
