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

    private void handler() {
        char[] inputArray = input.toCharArray();
        double result = 0;

        if (inputArray.length > 2) {
            for (char c : inputArray) {
                switch (c) {
                    case '+':
                        double tempAdd = BasicOperations.add(Double.parseDouble(inputArray[0] + ""),
                                Double.parseDouble(inputArray[2] + ""));

                        System.out.println("tempAdd: " + tempAdd);
                    default:
                        // return result;
                }
            }
        }

        // return result;
    }
}
