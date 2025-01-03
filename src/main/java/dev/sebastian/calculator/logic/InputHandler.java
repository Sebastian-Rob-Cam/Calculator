package main.java.dev.sebastian.calculator.logic;

public class InputHandler {
    // Variables zone
    private static InputHandler instance;
    private String input = "";

    private InputHandler() {
    };

    public static InputHandler getInstance() {
        if (instance == null) {
            instance = new InputHandler();
        }
        return instance;
    }

    public String appendInput(String input) {
        this.input += input;
        handler();

        return this.input;
    }

    private double handler() {
        char[] inputArray = input.toCharArray();
        double result = 0;

        if (inputArray.length > 2) {
            for (char c : inputArray) {
                switch (c) {
                    case '+':
                        result = BasicOperations.add(Double.parseDouble(inputArray[0] + ""),
                                Double.parseDouble(inputArray[2] + ""));

                        System.out.println("debugAdd: " + result);
                        break;
                    case '-':
                        result = BasicOperations.subtract(Double.parseDouble(inputArray[0] + ""),
                                Double.parseDouble(inputArray[2] + ""));

                        System.out.println("tempSubtract: " + result);
                        break;
                    case '*':
                        result = BasicOperations.multiply(Double.parseDouble(inputArray[0] + ""),
                                Double.parseDouble(inputArray[2] + ""));

                        System.out.println("tempMultiply: " + result);
                        break;
                    case '/':
                        result = BasicOperations.divide(Double.parseDouble(inputArray[0] + ""),
                                Double.parseDouble(inputArray[2] + ""));

                        System.out.println("tempDivide: " + result);
                        break;
                }
            }
        }

        return result;
    }
}
