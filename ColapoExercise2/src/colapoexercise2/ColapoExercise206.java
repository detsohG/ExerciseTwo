package colapoexercise2;
/**
 *
 * @author Jerome Colapo
 */
import java.io.* ;

public class ColapoExercise206 {
    
    public static void main ( String[] args ) throws IOException{
        int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
        int totalSum = 0, evenSum = 0, oddSum = 0;
      
      
        for(int index=0; index < data.length; index++){
            if(data[index]%2 == 0){
                evenSum += data[index];
            }else{
                oddSum += data[index];
            }
        }
        totalSum = evenSum + oddSum;
        System.out.println("Sum of Even: " + evenSum);
        System.out.println("Sum of Odd: " + oddSum);
        System.out.println("Total Sum: " + totalSum);
    } 
}      