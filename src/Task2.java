import java.util.Scanner;

import static java.lang.Math.abs;


public class Task2 {
    public static void main(String[] args) {

        //enter first number from keyboard
        double num1;
        System.out.println("Input first number: ");

        Scanner input1 = new Scanner(System.in);
        num1 = input1.nextDouble();

        //enter second number from keyboard
        double num2;
        System.out.println("Input second number: ");

        Scanner input2 = new Scanner(System.in);
        num2 = input2.nextDouble();

        double num = 10;

      // compare difference of absolute numbers, which closer to num (10)
          System.out.println(abs((num1 - num)) < abs((num2 - num)) ? num1 : num2);

    }
}
