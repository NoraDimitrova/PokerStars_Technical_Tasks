package Horizontal_Input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// if the numbers is in this input format:
//      23
//      0
//      56
//      0
//      78
//      45
//      65
//      32
//      0
//      7

        int numberOfOdd = 0;
        int numberOfEven = 0;
        int numberOfZero = 0;

        for (int i = 1; i <= 10; i++) {
            int number = scanner.nextInt();
            if (number == 0) {
                numberOfZero++;
            } else if (number % 2 == 0) {
                numberOfEven++;
            } else {
                numberOfOdd++;

            }

        }

        System.out.println("Number of odd numbers - " + numberOfOdd);
        System.out.println("Number of even numbers - " + numberOfEven);
        System.out.println("Number of 0s - " + numberOfZero);
    }
}
