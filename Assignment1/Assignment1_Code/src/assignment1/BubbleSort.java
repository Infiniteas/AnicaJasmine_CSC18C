/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author Jasmine
 */
public class BubbleSort extends BaseSort {
    
    int opEquals, opAddition, opLogic;
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
        
        opEquals++;
        for(int i = 0; i < compare1 ; i++){
        opLogic++;
        opAddition++;
        opEquals++;
            for(int j = 1; j < compare1; j++){
            opLogic += 2;
            opAddition += 2;
                if(bubbleArray[j - 1] > bubbleArray[j]){
                    temp = bubbleArray[j - 1];
                    bubbleArray[j - 1] = bubbleArray[j];
                    bubbleArray[j] = temp;
                    opAddition += 2;
                    opEquals += 3;
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
        System.out.println("nEquals  = " + opEquals);
        System.out.println("nAdd  = " + opAddition);
        System.out.println("nLog  = " + opLogic);
        System.out.println("Total  = " + (opEquals + opAddition + opLogic));
    }
    
}
