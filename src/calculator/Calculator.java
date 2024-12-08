/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

//imports section
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Sebastian
 */
public class Calculator {
    static void guiMaker(String section) {

        switch (section) {
            case "values":
                // Frame section
                JFrame frame = new JFrame("Calculator");

                frame.setSize(300, 400);// 300 width and 400 height
                frame.setLayout(null);// using no layout managers
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);// making the frame visible

                frame.repaint();

                // Display of numbers and simbols for operate
                JPanel valuesPanel = new JPanel();

                int widthOfVP = frame.getContentPane().getWidth() - 30; // width of the panel
                int xPos = (frame.getContentPane().getWidth() - widthOfVP) / 2; // x position of the panel.

                valuesPanel.setBounds(xPos, 15, widthOfVP, 80); // Dimensions
                valuesPanel.setBackground(Color.lightGray); // Color
                frame.add(valuesPanel); // adding panel to frame

                break;

            case "buttons":
                System.out.println("buttons, yay!");
                break;

            default:
                break;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        guiMaker("values");
        guiMaker("buttons");
    }

}
