package colapoexercise2;
/**
 *
 * @author Jerome Colapo
 */
import java.util.Scanner;
import java.io.*;

public class ColapoExercise210 {
    public static void main(String[] args) throws IOException{
        File file = new File("C:\\Users\\jerome\\Documents\\NetBeansProjects\\ColapoExercise2\\input.txt");
        Scanner scan = new Scanner(file);
        
        int lineNum = scan.nextInt();
        double[] data = new double[lineNum];
        int index = 0;
        double sum = 0, avg, newSum = 0, newAvg;
        
        while(scan.hasNextDouble()){
            double input = scan.nextDouble();
            data[index] = input;
            index++;
        }
        for(int j = 0; j < data.length; j++){
            System.out.println("data[" + j + "] = " + data[j]);
            sum += data[j];
        }
        avg = sum / data.length;
        System.out.println("average: " + avg);
        System.out.print("most distant values: ");
        for(int j = 0; j < data.length; j++){
            if(data[j] <= (avg - 1)){
                System.out.print(data[j]);
                newSum = sum - data[j];
            }
        }
        System.out.println();
        newAvg = newSum / data.length;
        System.out.println("new average: " + newAvg);

    }
    
}
