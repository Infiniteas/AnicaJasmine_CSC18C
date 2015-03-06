
package assignment1;

/*
 * Finds a variable in array using a binary search
 */
public class BinarySearch extends BaseSort {
    int opEquals, opAddition, opLogic, opSubtraction, opDivision;
    
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
        opEquals++;
        opLogic++;
        if (binaryArray[midpoint] > key) {
            System.out.println("Number in array was too high:  " 
                    + binaryArray[midpoint]);
            opSubtraction++;
            return sortedBinarySearch(key, min, midpoint - 1);
        } else if (binaryArray[midpoint] < key) {
            System.out.println("Number in array was too low:   " 
                    + binaryArray[midpoint]);
            opAddition++;
            opLogic++;
            return sortedBinarySearch(key, midpoint + 1, max);
        } else {
            System.out.println("Found index key:  " + midpoint);
            opLogic++;
            return midpoint;
        }
    }

    public int midpoint(int min, int max) {
        opAddition++;
        opSubtraction++;
        opDivision++;
        return min + ((max - min) / 2);
    }
    
    public void printBinarySearch() {
        //Output the efficiency
        System.out.println("Analyze by comparing operations");
        System.out.println();
        System.out.println("N  = " + binaryArray.length);
        System.out.println("nEquals  = " + opEquals);
        System.out.println("nAdd  = " + opAddition);
        System.out.println("nLog  = " + opLogic);
        System.out.println("nSubtraction  = " + opSubtraction);
        System.out.println("nDivision  = " + opDivision);
        System.out.println("Total  = " + (opEquals + opAddition + opLogic 
                + opSubtraction + opDivision));
    }
    
    
    
}
