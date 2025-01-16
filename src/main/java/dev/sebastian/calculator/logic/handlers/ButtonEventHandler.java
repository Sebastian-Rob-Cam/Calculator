package main.java.dev.sebastian.calculator.logic.handlers;

import java.util.ArrayList;

import javax.swing.JButton;

public class ButtonEventHandler {
    // This class is created with singleton pattern.
    private static ButtonEventHandler instance;

    public static ButtonEventHandler getInstance() {
        if (instance == null) {
            instance = new ButtonEventHandler();
        }
        return instance;
    }

    public void keyboardReader(ArrayList<JButton> buttonHolderParameter) {
        for (JButton jButton : buttonHolderParameter) {
            jButton.addActionListener(e -> {
                System.out.println("Button pressed: " + jButton.getText());
            });
        }
    }
}
