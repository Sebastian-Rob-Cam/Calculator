package main.java.dev.sebastian.calculator.GUI.components;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.java.dev.sebastian.calculator.GUI.interfaces.Keyboard;

public class DefaultKeyboard implements Keyboard {

    @Override
    public JPanel keyboardPanelBuilder(int[] layoutParameters, String[] labels) {
        
        validateLayoutParameters(layoutParameters, labels);

        JPanel keyboardPanel = new JPanel();

        // Set the layout for the panel
        keyboardPanel.setLayout(new GridLayout(
            layoutParameters[0], 
            layoutParameters[1], 
            layoutParameters[2], 
            layoutParameters[3]));

        for (JButton button : buttonBehaviorBuilder(labels)) {
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

            // button behavior
            button.addActionListener(e -> {
                System.out.println(button.getText());
            });

            buttons[i] = button;
        }

        return buttons;
    }

    private void validateLayoutParameters(int[] layoutParameters, String[] labels) {

        if(layoutParameters.length < 4) {
            throw new IllegalArgumentException("Layout parameters must contain exactly 4 elements.");
        }

        int rows = layoutParameters[0];
        int cols = layoutParameters[1];

        if(rows * cols < labels.length) {
            throw new IllegalArgumentException("GridLayout is too small for the number of labels provided.");
        }
    }
    
}
