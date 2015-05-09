
package hashcomparisons;


import static java.lang.Math.pow;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author Jasmine
 */
public class Main {
    public static void main(String args[]) {
        
        
        //size of array 
        int size = (int) 1e6;
        System.out.println("Size:  " + size);
        System.out.println();
        
        //creates three sized  arrays 
        String[] array1 = new String[size];
        String[] array2 = new String[size];
        
        HashMap<String, Integer> map = new HashMap<>();
        
        //creates an array to store some of the strings 50/50
        //String[] searches =  new String[size];
        String[] searches =  new String[size];
        
        int searchesIndex = 0;
        for (int i = searches.length / 2 ; i < searches.length; i++){
            searches[i] = "abcdef";
        }
        
        
        String randChar = "";
        int num = 0;
        
        Random rand = new Random();
        
        int[] randomNum = new int[searches.length / 2];
        
        //creates random variable to determine which strings to store
        for (int i = 0; i < randomNum.length; i++){
            randomNum[i] = rand.nextInt(size - 1) + 1;
        }
        
        
        //Generate chars between a-z, A-Z
        for (int i = 1; i <= 20*size; i++) {
            
            //generates a number from 1-52
            int random = (int) (Math.random() * 52);
            
            //if random < 26, base is A
            //if random > 26, base is a
            char base = (random < 26) ? 'A' : 'a';
            
            //base holds random upper or lower case (dependent on above)
            base = (char) (base + random % 26);
            
            //adds each base character to a String
            randChar += base;
            
            //checks that 20 characters are added to the String
            if (i % 20 == 0){
                
                //adds the same 20 randChar string to each arrays
                array1[num] = randChar; 
                array2[num] = randChar;
               
                int index = createHashIndex(randChar, size);
                map.put(randChar, index);
                
                
                
                //holds a random string to search later
                for (int j = 0; j < randomNum.length; j++){
                    if(randomNum[j] == num){
                        searches[searchesIndex] = randChar;
                        searchesIndex++;
                    }
                }
                
                randChar = "";                 //restarts string
                num++;
               
            }
        }
        
        /*
        
        int key;
        int linearIndex;
        long startTime = System.currentTimeMillis();
        
        //begins the linear search
        for (int i = 0; i < searches.length; i++){
            
            if (linearSearch(array1, searches[i]) > 0){
                //index found
            }
        }
        
        
        long endTime = System.currentTimeMillis();
       System.out.println("Linear Search took " + (endTime - startTime) / 1000f + " seconds");
        
        System.out.println("Sorting starts");
        array2 = sortStringArray(array2);
        System.out.println("Sorting ends");
        System.out.println();
        
        int results;
        int binaryIndex;
        long startTime2 = System.currentTimeMillis();
        
        //this scans for the index of the searches[] strings in array2
        for (int i = 0; i < searches.length; i++) {
            
            //the key was found
            if (binarySearchString(array2, searches[i]) >= 0) {
                //index found
            }
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Binaray Search took " + (endTime2 - startTime2) / 1000f + " seconds");
        
        */
        
        Integer mapIndex = 0;
        long startTime3 = System.currentTimeMillis();
        
        for (int i = 0; i < searches.length; i++){         
            if (map.get(searches[i]) != null){
                //index found
            }           
        }
        
        
        long endTime3 = System.currentTimeMillis();
        System.out.println("Hash Search took " + (endTime3 - startTime3) / 1000f + " seconds");
        System.out.println();
        
        //System.out.println("Linear Search took " + (endTime - startTime) / 1000f + " seconds");
        //System.out.println("Binaray Search took " + (endTime2 - startTime2) / 1000f + " seconds");
        System.out.println("Hash Search took " + (endTime3 - startTime3) / 1000f + " seconds");
  }
    
    public static int createHashIndex(String randChar, int size){
        
        double index = 0;
        
        for (int i = 0; i < randChar.length(); i++){
            Character c = randChar.charAt(i);
            index += c.charValue()* pow(52,i);
        }
        
        while (index > size){
            index /= 10;
        }
       
        return (int) index;
    }
    
    public static int linearSearch(String[] array , String search){
        
        for (int i = 1; i < array.length ; i++){
            if (array[i].equals(search)){
                return i;                          //returns the key
            } 
        }

        return 0;  //returns 0 if index not found
    }
    
    /**
     *
     * This function will wort the array and output the results
     * 
     * @param array
     */
    public static String[] sortStringArray(String[] array) {
        
         for (int j = 0; j < array.length; j++) {
            for (int i = j + 1; i < array.length; i++) {
                if (array[i].compareTo(array[j]) < 0) {
                  String temp = array[j];
                  array[j] = array[i];
                  array[i] = temp;
                }
            }
        }
        return array;
    }
    
    //this will return the index of the array 
    public static int binarySearchString(String[] sorted, String searches) {
            int first = 0;
            int last  = sorted.length;
            
            //first is less then String array length
            while (first < last) {
                
                int mid = first + ((last - first) / 2);
                
                //searches is less than sorted
                if (searches.compareTo(sorted[mid]) < 0) {
                    last = mid;
                  //searches is greater than sorted
                } else if (searches.compareTo(sorted[mid]) > 0) {
                    first = mid + 1;
                } else {
                    return mid;
                }
            }
            return -(first + 1);
    }
   
    public static void printStringArray(String[] arr){
            
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
            System.out.println();
        }
    
    }
    
}
