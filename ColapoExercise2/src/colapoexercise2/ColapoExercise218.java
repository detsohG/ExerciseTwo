package colapoexercise2;
/**
 *
 * @author Jerome Colapo
 */
import java.io.*;
import java.util.Scanner;

public class ColapoExercise218 {
    
    public static void main(String[] args) throws IOException{
        File file = new File("C:\\Users\\jerome\\Documents\\NetBeansProjects\\ColapoExercise2\\input.txt");
        File outputFile = new File("C:\\Users\\jerome\\Documents\\NetBeansProjects\\ColapoExercise2\\outputFile.txt");
        Scanner scan = new Scanner(file);
        PrintWriter output = new PrintWriter(outputFile);
        
        while(scan.hasNextInt()){
            int input = scan.nextInt();
            
            for(int a = 1; a <= 64; a++){
                output.print(input + " ");
            }
            output.println();
        }
        output.close();
    }
    
}
