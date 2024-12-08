package main.java.dev.sebastian.calculator.logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonsInput implements ActionListener {

    private String value;

    public ActionListener handleButtonPress(JButton buttonFromGUI, String textFromGui) {
        value = textFromGui;
        return this;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        System.out.println(value);
        // throw new UnsupportedOperationException("Unimplemented method
        // 'actionPerformed'");
    }
}
