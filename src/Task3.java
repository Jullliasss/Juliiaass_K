import static java.lang.Math.max;

public class Task3 {
        public static void main(String[] args) {

            //generate numbers from 99 to 999
            int a = (int) (99 + Math.random() * 900);

    System.out.println("New generated number: " + a);

            //divide number
            int b =  a / 100;
            int c = a / 10 % 10;
            int d = a % 10;

            System.out.println("Max digit: " + max(max (b, c), d));
    }
}
