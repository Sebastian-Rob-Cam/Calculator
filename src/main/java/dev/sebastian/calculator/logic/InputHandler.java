package main.java.dev.sebastian.calculator.logic;

public class InputHandler {
    private static InputHandler instance;

    private InputHandler() {
    };

    public static InputHandler getInstance() {
        try {
            instance = new InputHandler();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
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
