package main.java.dev.sebastian.calculator.GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.java.dev.sebastian.calculator.GUI.components.DefaultKeyboard;
import main.java.dev.sebastian.calculator.logic.InputTaker;

public class CalculatorGUI {
    // Singleton instance
    private static CalculatorGUI instance;

    // * Private variables;
    private JFrame window;
    private JPanel display;
    private JPanel keyboard;
    private InputTaker inputTaker;

    private CalculatorGUI() {
        guiCreator();
    }

    public static CalculatorGUI getInstance() {
        if(instance == null) {
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

        // display section
        JTextField values = createDisplay(container);

        // keyboard section
        int[] layoutParameters = {4, 4, 5, 5};
        String[] labels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            ".", "0", "=", "+"
        };
        container.add(new DefaultKeyboard().keyboardPanelBuilder(layoutParameters, labels));

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
