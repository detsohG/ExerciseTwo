package colapoexercise2;
/**
 *
 * @author Jerome Colapo
 */
import java.io.*;

public class ColapoExercise209 {
    
    public static void main(String[] args) throws IOException{

        int[] signal = {5, 5, 4, 5, 6, 6, 7, 6, 5, 4, 1, 4};
        int[] smooth = new int[signal.length];
        
        System.out.print("Signal: ");
        for(int j = 0; j < signal.length; j++){
            System.out.print(signal[j] + " ");
        }
        
        // compute the smoothed value for each
        //  slot of the array smooth
        smooth[0] = (signal[0] + signal[0 + 1]) / 2;
        smooth[signal.length - 1] = (signal[signal.length - 1] + signal[signal.length - 2]) / 2;
        for(int j = 1; j < signal.length - 1; j++){
            smooth[j] = (signal[j - 1] + signal[j] + signal[j + 1]) / 3;
        }
        System.out.println();
        System.out.print("Smooth: ");
        // write out the input
        for(int j=0; j < smooth.length; j++){
            System.out.print(smooth[j] + " ");
        }
        
    }
    
    
}
