package colapoexercise2;
/**
 *
 * @author Jerome Colapo
 */
import java.io.*;

public class ColapoExercise208 {
    
    public static void main(String[] args) throws IOException{
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int temp;
        
        for(int j = 0; j < data.length / 2; j++){
            temp = data[j];
            data[j] = data[data.length - 1 - j];
            data[data.length - 1 - j] = temp;
        }          
        
        System.out.print("Reversed Data: ");
        for(int j = 0; j < data.length; j++){
            System.out.print(data[j] + " ");
        }
        System.out.println();
    }
}
