import java.util.Scanner;  

public class IT24102928Lab6Q2C {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int[] numbers = new int[10];
        
        System.out.println("Please enter 10 numbers: " );
        
        int i  = 0;
        int sum = 0;  
        while (i < 10) {
            System.out.print("Enter number " + (i + 1 )+ ": ");
            numbers[i] = input.nextInt();  

            sum += numbers[i];
            i ++;  
        }

        double average = sum / 10.0;
        System.out.println("\nThe numbers you entered are:"); 
        i = 0;
        while (i < 10){
            System.out.print(numbers[i] + " ");
            i++;   
        }

        System.out.println("\nSum of the numbers: " + sum); 
        System.out.println("Average of the numbers: " + average);   

    }
}