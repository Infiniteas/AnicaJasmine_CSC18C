package assignment2;

/**
 *
 * @author Jasmine
 */
public class BubbleSort extends BaseSort {

    int[] bubbleArray;

    public BubbleSort(int size) {
        super(size);
    }
    
    public void setArray(int[] array){
        bubbleArray = array;
    }
 
    public int[] bubbleSort(){
        
        int temp;
        int compare1 = bubbleArray.length - 1;
        
        for(int i = 0; i < compare1 ; i++){
            for(int j = 1; j < bubbleArray.length; j++){
                if(bubbleArray[j - 1] > bubbleArray[j]){
                    temp = bubbleArray[j - 1];
                    bubbleArray[j - 1] = bubbleArray[j];
                    bubbleArray[j] = temp;
                }
            }
        }
        return bubbleArray;
    }
    
     public void printBubbleSort() {
        //Output the efficiency
        System.out.println("Analyze by comparing operations");
        System.out.println();
        System.out.println("N = " + bubbleArray.length);
        System.out.println("nEquals  = " );
    }
    
}
