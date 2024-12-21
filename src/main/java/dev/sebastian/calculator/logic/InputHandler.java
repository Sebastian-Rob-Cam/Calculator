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
    /*
     * // variables zone
     * private String input;
     *
     * public void takeInput(String str) {
     * this.input = str;
     * }
     *
     */
}
