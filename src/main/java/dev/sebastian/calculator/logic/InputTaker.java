package main.java.dev.sebastian.calculator.logic;

public class InputTaker  {
    private static InputTaker instance;
    private String stringUserInput = new String();

    private InputTaker() {};

    public static InputTaker getInstance() {
        if (instance == null) {
            instance = new InputTaker();
        }
        return instance;
    }

    public String inputsGathering(String input) {
        this.stringUserInput += input;
        return this.stringUserInput;
    }

}
