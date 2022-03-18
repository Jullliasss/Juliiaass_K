import java.util.Random;

/**
 * @author Julia Koroliova
 */

public class Hometask52 {
    public static void main(String[] args) {
        int[][] nums = new int[5][8];
        Random rnd = new Random();

        //fill two-dimensional array with random numbers from -99 to 99
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = rnd.nextInt(-99, 99);

                //output of two-dimensional array
                System.out.printf("%d ", nums[i][j]);
            }
            System.out.println();
        }

        //search for the maximum value
        int max;
        max = nums [0][0];
        for (int[] num : nums) {
            for (int i : num) {
                if (i > max) {
                    max = i;
                }
            }
        }
        System.out.println("Max value: " + max);
    }
}