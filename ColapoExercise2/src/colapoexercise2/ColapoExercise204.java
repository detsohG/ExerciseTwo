package colapoexercise2;
/**
 *
 * @author Jerome Colapo
 */
public class ColapoExercise204 {
    
    public static void main(String[] args) { 
        int[] valA   = { 13, -22,  82,  17};
        int[] valB   = {  0,   0,   0,   0};
        
        valB[0] = 25 - valA[0];
        valB[1] = 25 - valA[1];
        valB[2] = 25 - valA[2];
        valB[3] = 25 - valA[3];
        
        System.out.print( "valA:");
        for (int a = 0; a < valA.length; a++){
            System.out.print(" " + valA[a]);
        }
        System.out.print( "\nvalB:");
        for (int a = 0; a < valB.length; a++){
            System.out.print(" " + valB[a]);
        }
        System.out.print( "\nsum:");
        for (int a = 0; a < valB.length; a++){
            int temp =  valB[a] + valA[a];
            System.out.print(" " +temp );
        }
        
    }
}