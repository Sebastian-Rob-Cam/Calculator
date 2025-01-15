package main.java.dev.sebastian.calculator.GUI.components;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

import main.java.dev.sebastian.calculator.GUI.interfaces.KeyboardTemplate;

public class BasicKeyboard implements KeyboardTemplate {
    private ArrayList<JButton> buttonsHolder = new ArrayList<>();

    // Constructor for the basic keyboard.
    public JPanel createBasicKeyboard() {
        // In this array we have the layout parameters for the keyboard.
        int[] layoutParameters = { 4, 4, 5, 5 };
        // Labels for the buttons
        String[] labels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                ".", "0", "=", "+"
        };
        // Doing buttons with the labels
        buttonBuilder(labels);
        // Calling keyboard builder with the above parameters.
        return keyboardBuilder(layoutParameters, buttonsHolder);

    }

    @Override
    public void buttonBuilder(String[] labelsParameter) {
        for (String label : labelsParameter) {
            JButton button = new JButton(label);
            button.setForeground(Color.WHITE);
            button.setBackground(new Color(51, 51, 51)); // Gris oscuro
            button.setBorder(BorderFactory.createEmptyBorder());
            button.setFocusPainted(false);
            buttonsHolder.add(button);
        }
    }

    @Override
    public JPanel keyboardBuilder(int[] layoutParameters, ArrayList<JButton> buttons) {
        JPanel keyboard = new JPanel();
        keyboard.setLayout(
                new GridLayout(layoutParameters[0], layoutParameters[1], layoutParameters[2], layoutParameters[3]));

        for (JButton button : buttons) {
            keyboard.add(button);
        }

        return keyboard;
    }
}
