import java.util.Scanner;

public class Julia_QA {
    public static void main(String[] args) {

       int num;
        System.out.println("Input number: ");

        Scanner input = new Scanner(System.in);
       num = input.nextInt();
       //checking the remainder for "0"
         if (num % 2 == 0)
             System.out.println("Even number");

         else
             System.out.println("Odd number");
    }
}