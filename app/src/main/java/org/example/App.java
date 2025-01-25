package org.example;

import java.util.Scanner;

public class App {
    public int getInput(int lowerBound, int upperBound, String userPrompt, String errorMessage) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(userPrompt);
        int userInput = scanner.nextInt();

        while (userInput < lowerBound || userInput > upperBound) {
            System.out.println(errorMessage);
            System.out.println(userPrompt);
            userInput = scanner.nextInt();
        }

        return userInput;
    }

    public static void main(String[] args) {

        App app1 = new App();
        int userInput = app1.getInput(10, 50, "Please enter an integer value:", "That input is invalid.");
        System.out.println("You entered: " + userInput);
    }
}
