package main.java.dev.sebastian.calculator.GUI;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.java.dev.sebastian.calculator.GUI.components.BasicKeyboard;

public class CalculatorGUI {
    // Singleton instance
    private static CalculatorGUI instance;

    // * Private variables;
    private JFrame window;
    private JPanel display;
    private BasicKeyboard basicKeyboard;

    private CalculatorGUI() {
        guiCreator();
    }

    public static CalculatorGUI getInstance() {
        if (instance == null) {
            instance = new CalculatorGUI();
        }

        return instance;
    }

    private void guiCreator() {
        window = new JFrame("Calculator");

        // window properties
        window.setLayout(new BorderLayout(0, 10));
        window.setSize(300, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        JPanel container = new JPanel();
        container.setLayout(new BorderLayout(0, 15));
        container.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        // Display to show the values of the keyboards
        JTextField valuesDisplay = createDisplay(container);
        // Building basic keyboard section
        basicKeyboard = new BasicKeyboard();
        container.add(basicKeyboard.createBasicKeyboard());

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
}
