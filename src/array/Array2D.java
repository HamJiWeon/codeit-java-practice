package array;

import java.util.Arrays;

public class Array2D {

    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        arr[1][1] = 100;

        System.out.println(Arrays.deepToString(arr));

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
