/*
 * File: Project 1
 * Programmer: Jasmine Anica
 * Class: CSC 18C
 * Date: 5/20/15
 */
package project1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.pow;
import java.util.HashMap;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jasmine
 */
public class Levels {
    
    private HashMap<Integer, String> easyLevels = new HashMap<Integer,String>();
    private HashMap<Integer, String> hardLevels = new HashMap<Integer,String>();

    private Vector easyLevelsIndex = new Vector();
    private Vector hardLevelsIndex = new Vector();
    
    /**
     * Constructor: loads the levels
     */
    Levels(){
        
        try {
            loadEasyLevels();
        } catch (IOException ex) {
            Logger.getLogger(Levels.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            loadHardLevels();
        } catch (IOException ex) {
            Logger.getLogger(Levels.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
        
    }
    
    /**
     * This method will open the Easy_Levels text file and store the levels as 
     * strings to a Hashmap. The keys are hashed and stored to a Vector.
     * @throws FileNotFoundException
     * @throws IOException 
     */
    private void loadEasyLevels() throws FileNotFoundException, IOException{
        
        // Open the file
        FileInputStream fstream = new FileInputStream("Easy_Levels.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;

        //Read File Line By Line
        while ((strLine = br.readLine()) != null)   {
            //hashes the make a key
            Integer value = hashing(strLine);
            
            //addes key to map with the string
            easyLevels.put(value, strLine);
            //addes key to vector
            easyLevelsIndex.add(value);
        }
        

        //Close the input stream
        br.close();
    }
    
    /**
     * This method will open the Hard_Levels text file and store the levels as 
     * strings to a Hashmap. The keys are hashed and stored to a Vector.
     * 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    private void loadHardLevels() throws FileNotFoundException, IOException{
        
        // Open the file
        FileInputStream fstream = new FileInputStream("Hard_Levels.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;

        //Read File Line By Line
        while ((strLine = br.readLine()) != null)   {
            //hashes the make a key
            Integer value = hashing(strLine);
            
            //addes key to map with the string
            hardLevels.put(value, strLine);
            //addes key to vector
            hardLevelsIndex.add(value);
        }
        

        //Close the input stream
        br.close();
    }
    
    /**
     * This method is used to create a unique index for the keys in the Hashmaps
     * that store the levels
     * 
     * @param puzzle - a string with the order of colors
     * @return Integer - the key to a Hashmap
     */
    private Integer hashing(String puzzle){

        double index = 0;
        
        for (int i = 0; i < puzzle.length(); i++){
            Character c = puzzle.charAt(i);
            index += c.charValue()* pow(5,i);
        }
        
        while (index > 200){
            index /= 10;
        }
       
        return (int) index;

    }
    
    /**
     * This method will return an easy level
     * 
     * @return String
     */
    public String getEasyLevel(){
        
        return easyLevels.get(getEasyLevelIndex());
    }
    
    /**
     * This method will return an hard level
     * 
     * @return String
     */
    public String getHardLevel(){
        
        return hardLevels.get(getHardLevelIndex());
    }
    
    /**
     * This method will choose a random index to pick in the Vector and return
     * the key value
     * 
     * @return Integer
     */
    private Integer getEasyLevelIndex(){
         
        Random rand = new Random();
        int upperBound = easyLevelsIndex.getSize();
        int lowerBound = 0;
        
        Integer index;
        index = rand.nextInt(upperBound - lowerBound) + lowerBound;
        
        index = easyLevelsIndex.getNumber(index);
        
        return index;
    }

    /**
     * This method will choose a random index to pick in the Vector and return
     * the key value
     * 
     * @return Integer
     */
    private Integer getHardLevelIndex(){
         
        Random rand = new Random();
        int upperBound = hardLevelsIndex.getSize();
        int lowerBound = 0;
        
        Integer index;
        index = rand.nextInt(upperBound - lowerBound) + lowerBound;
        
        index = hardLevelsIndex.getNumber(index);
        
        return index;
    }
    
}
