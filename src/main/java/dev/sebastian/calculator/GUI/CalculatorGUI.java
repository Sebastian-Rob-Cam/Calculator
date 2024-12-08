package main.java.dev.sebastian.calculator.GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorGUI {
    // * Private variables;
    private JFrame window;
    private JPanel display;
    private JPanel keyboard;

    public void guiCreator() {
        window = new JFrame("Calculator");

        // * window properties
        window.setLayout(new BorderLayout(0, 10));
        window.setSize(300, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        JPanel container = new JPanel();
        container.setLayout(new BorderLayout(0, 15));
        container.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        // * display section
        JTextField values = createDisplay(container);

        // * keyboard section
        container.add(createKeyboard(values), BorderLayout.CENTER);

        window.add(container);
        window.setVisible(true);
    }

    // display creator method
    private JTextField createDisplay(JPanel container) {
        display = new JPanel();

        // * display properties
        display.setLayout(new BorderLayout());

        // * text area
        JTextField values = new JTextField(16);
        values.setPreferredSize(new Dimension(280, 40));
        values.setHorizontalAlignment(JTextField.RIGHT);

        display.add(values, BorderLayout.CENTER);
        container.add(display, BorderLayout.NORTH);

        return values;
    }

    // * Keyboard in progress...
    // method for create the keyboard
    private JPanel createKeyboard(JTextField valuesDisplay) {
        keyboard = new JPanel();

        // * Keyboard properties
        keyboard.setLayout(new GridLayout(4, 4, 5, 5));

        // Tags of buttons
        String[] tags = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                ".", "0", "=", "+"
        };

        JButton[] buttonBox = new JButton[tags.length];

        for (int i = 0; i < tags.length; i++) {
            String tag = tags[i];
            JButton button = new JButton(tag);
            buttonBox[i] = button;
            keyboard.add(button);
        }

        for (JButton jButton : buttonBox) {
            String t = jButton.getText();
            jButton.addActionListener(e -> {
                valuesDisplay.setText(t);
            });
        }

        return keyboard;
    }
}
