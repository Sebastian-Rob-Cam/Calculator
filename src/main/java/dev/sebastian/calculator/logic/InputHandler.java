package main.java.dev.sebastian.calculator.logic;

import java.util.ArrayList;

public class InputHandler {
    // Variables zone
    private static InputHandler instance;
    private ArrayList<Character> input = new ArrayList<Character>();
    private double result = 0;

    public static InputHandler getInstance() {
        if (instance == null) {
            instance = new InputHandler();
        }
        return instance;
    }

    public ArrayList<Character> appendInput(Character input) {
        this.input.add(input);
        handler();

        return this.input;
    }

    private double handler() {
        if (input.size() > 2) {
            if (result == 0) {
                for (Character character : input) {
                    System.out.println("Input char: " + character);
                }
                basicOperations(input);
            } else {
                System.out.println("Result is: " + result);
                input.clear();
                input.add((char) result);
                result = 0;
            }
        } else {
            System.out.println("Not enough input");
        }

        return result;
    }

    // TODO: Code the way to take the result of one operation and use it to continue
    // opertaing.
    public void basicOperations(ArrayList<Character> inputArray) {
        for (char c : inputArray) {
            switch (c) {
                case '+':
                    result = BasicOperations.add(Double.parseDouble(inputArray.get(0) + ""),
                            Double.parseDouble(inputArray.get(2) + ""));

                    System.out.println("debugAdd: " + result);
                    break;
                case '-':
                    result = BasicOperations.subtract(Double.parseDouble(inputArray.get(0) + ""),
                            Double.parseDouble(inputArray.get(2) + ""));

                    System.out.println("tempSubtract: " + result);
                    break;
                case '*':
                    result = BasicOperations.multiply(Double.parseDouble(inputArray.get(0) + ""),
                            Double.parseDouble(inputArray.get(2) + ""));

                    System.out.println("tempMultiply: " + result);
                    break;
                case '/':
                    result = BasicOperations.divide(Double.parseDouble(inputArray.get(0) + ""),
                            Double.parseDouble(inputArray.get(2) + ""));

                    System.out.println("tempDivide: " + result);
                    break;
            }
        }
    }

}
