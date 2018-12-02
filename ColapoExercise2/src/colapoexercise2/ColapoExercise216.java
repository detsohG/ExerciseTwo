package colapoexercise2;

/**
 *
 * @author Jerome Colapo
 */

import java.io.*;

public class ColapoExercise216{
    public static void main(String[] args) throws IOException{
        int[][] data = {
            {3, 2, 5}, 
            {1, 4, 4, 8, 13}, 
            {9, 1, 0, 2}, 
            {0, 2, 6, 3, -1, -8}
        };
        int temp;
        
        for(int row = 0; row < data.length; row++){
            for(int col = 0; col < data[row].length / 2; col++){
                temp = data[row][col];
                data[row][col] = data[row][data[row].length - 1 - col];
                data[row][data[row].length - 1 - col] = temp;
            }     
        }
        System.out.println("Reversed Data:");
        for(int row = 0; row < data.length; row++){
            System.out.print("{");
            for(int col = 0; col < data[row].length; col++){
                System.out.print(data[row][col] + ", ");
            }
            System.out.println("}");
        }
    } 
    
}
