package main.java.dev.sebastian.calculator.logic;

import javax.swing.JTextField;

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
        return this.input;
    }
}
