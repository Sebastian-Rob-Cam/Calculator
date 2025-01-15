package main.java.dev.sebastian.calculator.GUI.interfaces;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public interface KeyboardTemplate {
        // Builder of buttons
        void buttonBuilder(String[] labels);

        /*
         * The array for set layout to keyboard panel only need four elements:
         * - 0: amount of rows
         * - 1: amount of columns
         * - 2: horizontal gaps between buttons
         * - 3: vertical gaps between buttons
         */
        JPanel keyboardBuilder(int[] layoutParameters, ArrayList<JButton> buttons);
}
