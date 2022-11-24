package Vertical_Input;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// if the numbers is in this input format: 23 0 56 0 78 45 65 32 0 7

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int numberOfOdd = 0;
        int numberOfEven = 0;
        int numberOfZeroo = 0;

        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] != 0) {
                numberOfEven++;
            } else if (numbers[i] % 2 == 1) {
                numberOfOdd++;
            } else if (numbers[i] == 0) {
                numberOfZeroo++;
            }
        }

        System.out.println("Number of odd numbers - " + numberOfOdd);
        System.out.println("Number of even numbers - " + numberOfEven);
        System.out.println("Number of 0s - " + numberOfZeroo);

    }
}
