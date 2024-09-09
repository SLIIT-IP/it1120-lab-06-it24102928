import java.util.Scanner;   

public class IT24102928Lab6Q3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        double sumOfSquares = 0.0;
        int count = 0;
        boolean condition = true;
        int number=0;
        double rms;

        System.out.println("Enter positive integers (terminate input with -99):");

        while(true) {
            System.out.print("Enter a number: ");
            number = input.nextInt();
            
            if(number == -99) {
                break;  
            }
            
            if(number > 0){
                sumOfSquares = sumOfSquares + (number*number);
                count++;   
            }
            else {
                System.out.println("Invalid input. Enter a positive integer or -99 to terminate");
            }
        }
        
        if(count > 0){
            rms =Math.sqrt(sumOfSquares / count);
            System.out.print("The Root Mean Square (RMS) is: " + rms);   
        }
        else {
            System.out.print("No Number were entered");
        }



    }
}