package colapoexercise2;

/**
 *
 * @author Jerome Colapo
 */
public class ColapoExercise202 {
    
    public static void main(String[] args) { 
         int[] val = {13, -4, 82, 17};
         int[] twice = {0, 0, 0, 0};
         
         System.out.println( "Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
 
            for(int i = 0; i < val.length; i++){
                twice[i] = val[i] * 2;
            }
                    
        System.out.println( "New Array: " + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
    }
}
