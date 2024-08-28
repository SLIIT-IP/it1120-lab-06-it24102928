import java.util.Scanner;

     public class IT24102928Lab6Q1 {

          public static void main(String[] args) {

            Scanner rs = new Scanner(System.in);
            System.out.println("Enter the number");
            int num = rs.nextInt();
      
            
            double square = num*num;
            double squareRoot = Math.sqrt(num);

            System.out.println("The square of"+num+"is:"+square);
            System.out.println("The square root of"+num+"is:"+squareRoot);

      }

}
            		