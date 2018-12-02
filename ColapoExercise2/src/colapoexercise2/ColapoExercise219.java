package colapoexercise2;
/**
 *
 * @author Jerome Colapo
 */
import java.io.*;
import java.util.Scanner;

public class ColapoExercise219 {

    public static void main(String[] args) throws IOException{
        File file = new File("C:\\Users\\jerome\\Documents\\NetBeansProjects\\ColapoExercise2\\input2.txt");
        File outputFile = new File("C:\\Users\\jerome\\Documents\\NetBeansProjects\\ColapoExercise2\\outputFile2.txt");
        Scanner scan = new Scanner(file);
        PrintWriter output = new PrintWriter(outputFile);
        
        char brightNess;
        
        while(scan.hasNextInt()){
            int input = scan.nextInt();
                        
            switch(input / 8){
                case 0: brightNess = ' ';
                break;
                case 1: brightNess = '.';
                break;
                case 2: brightNess = ',';
                break;
                case 3: brightNess = '-';
                break;
                case 4: brightNess = '+';
                break;
                case 5: brightNess = 'o';
                break;
                case 6: brightNess = 'O';
                break;
                case 7: brightNess = 'X';
                break;
                default: brightNess = '!';
                break;
            }
            
            for(int a = 1; a <= 128; a++){
                output.print(brightNess);
            }
            output.println();
                       
        }
        output.close();
        
    }
}
