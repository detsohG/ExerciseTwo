package colapoexercise2;
/**
 *
 * @author Jerome Colapo
 */
import java.io.*;

public class ColapoExercise215{
    
    public static void main(String[] args) throws IOException{
        int[][] data = {
            {3, 2, 5}, 
            {1, 4, 4, 8, 13}, 
            {9, 1, 0, 2}, 
            {0, 2, 6, 3, -1, -8}
        };
        int largestNum;
        
        for(int row = 0; row < data.length; row++){
            largestNum = 0;
            for(int col = 0; col < data[row].length; col++){
                if(data[row][col] > largestNum){
                    largestNum = data[row][col];
                }
            }
            System.out.println("Largest number in data row[" + row + "]: " + largestNum);
        }
        

        
    }   
    
}
