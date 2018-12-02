package colapoexercise2;
/**
 *
 * @author Jerome Colapo
 */
import java.io.*;

public class ColapoExercise207 {
    
    public static void main(String[] args) throws IOException{
       
        int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
        int largestNum = 0, secondLargest = 0;
                
        for(int index = 0; index < data.length; index++){
            if(data[index] > largestNum){
                secondLargest = largestNum;
                largestNum = data[index];
            }else if(data[index] > secondLargest){
                secondLargest = data[index];
            }
        }
        
        System.out.println("Largest number is " + largestNum);
        System.out.println("Second largest number is " + secondLargest);
    }
    
}
