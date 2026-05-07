package basic.array;

import java.util.Arrays;

public class ArrayBasic {

    public static void main(String[] args) {

        int[] numbers;

        numbers = new int[5];

        numbers[0] = 50;
        numbers[1] = 77;
        numbers[2] = (int) Math.PI;
        numbers[3] = numbers[0] + 20;
        numbers[4] = 'A' - '0';

        for (int i = 0; i < numbers.length; i++) {
            System.out.println((i + 1) + "번째 값: " + numbers[i]);
        }

        System.out.println(numbers.length);

        System.out.println("================================");

        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println(Arrays.toString(numbers));

        int[] pointList = {1, 2, 3, 4};

        String[] pets = {"dog", "cat", "bird", "rabbit"};

        pets = new String[]{"dog", "cat", "bird"};
    }
}
