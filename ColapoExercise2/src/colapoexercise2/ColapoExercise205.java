package colapoexercise2;
/**
 *
 * @author Jerome Colapo
 */
public class ColapoExercise205 {
    
    public static void main(String[] args) { 
        int[] val = {0, 1, 2, 3};
        int temp;
 
        System.out.println( "Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
 
        for(int a = 0; a < 2; a++){
            temp = val[a];              //temporary holder for value
            val[a] = val[3 - a];
            val[3 - a] = temp;
        }
 
        System.out.println( "Reversed Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
    }
}