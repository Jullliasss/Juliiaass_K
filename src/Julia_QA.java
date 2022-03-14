import java.util.Scanner;

public class Julia_QA {
    public static void main(String[] args) {

       int num;
        System.out.println("Input: ");

        Scanner input = new Scanner(System.in);
       num = input.nextInt();

         if (num % 2 == 0)
             System.out.println("Число четное");
         else
             System.out.println("Число нечетное");
    }
}