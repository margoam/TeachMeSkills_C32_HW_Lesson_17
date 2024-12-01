package com.teachmeskills.hw.lesson_17.task1.operation;

import com.teachmeskills.hw.lesson_17.task1.util.Transformer;

import java.util.Scanner;

public class InputOperation {


    public static void analyzeUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1 or 2: ");
        String userInput = scanner.nextLine();

        if (!userInput.isEmpty()) {
            if (userInput.equals("1")) {
                reverseString();
            } else if (userInput.equals("2")) {
                factorialCalculation();
            } else {
                System.out.println("Incorrect value is entered.");
            }
        } else {
            System.out.println("Incorrect value is entered.");
        }
    }

    private static void reverseString() {
        Transformer<String> transformer;
        System.out.print("Please enter a string to reverse: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();


        transformer = (str) -> new StringBuilder(str).reverse().toString();
        System.out.println("Reversed entered string is: " + transformer.doOperation(userInput));
    }

    private static void factorialCalculation() {
        Transformer<Integer> transformer;
        System.out.print("Please enter a number to calculate its factorial: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        transformer = (integer) -> factorialRecursive(integer);
        System.out.println("Factorial of the entered number is: " + transformer.doOperation(userInput));
    }

    private static int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }
}
