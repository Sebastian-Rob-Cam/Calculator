package main.java.dev.sebastian.calculator.GUI.components;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.java.dev.sebastian.calculator.GUI.interfaces.Keyboard;
import main.java.dev.sebastian.calculator.logic.InputHandler;

public class DefaultKeyboard implements Keyboard {
    private InputHandler inputHandler = InputHandler.getInstance();

    @Override
    public JPanel keyboardPanelBuilder(int[] layoutParameters, String[] labels, JTextField display) {

        validateLayoutParameters(layoutParameters, labels);

        JPanel keyboardPanel = new JPanel();

        // Set the layout for the panel
        keyboardPanel.setLayout(new GridLayout(
                layoutParameters[0], // amount of rows
                layoutParameters[1], // amount of columns
                layoutParameters[2], // horizontal gaps between buttons
                layoutParameters[3])); // vertical gaps between buttons

        for (JButton button : buttonBehaviorBuilder(labels)) {
            button.addActionListener(e -> {
                String inputTEMP = inputHandler.appendInput(button.getText());
                display.setText(inputTEMP);
            });
            keyboardPanel.add(button);
        }

        return keyboardPanel;
    }

    @Override
    public JButton[] buttonBehaviorBuilder(String[] labels) {

        JButton[] buttons = new JButton[labels.length];

        for (int i = 0; i < labels.length; i++) {
            String label = labels[i];
            JButton button = new JButton(label);

            buttons[i] = button;
        }

        return buttons;
    }

    private void validateLayoutParameters(int[] layoutParameters, String[] labels) {

        if (layoutParameters.length < 4) {
            throw new IllegalArgumentException("Layout parameters must contain exactly 4 elements.");
        }

        int rows = layoutParameters[0];
        int cols = layoutParameters[1];

        if (rows * cols < labels.length) {
            throw new IllegalArgumentException("GridLayout is too small for the number of labels provided.");
        }
    }

}
