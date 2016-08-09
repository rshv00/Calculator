package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created by Рома on 09.08.2016.
 */
public class WindowMode implements ActionListener {
    JTextField jtf;
    JButton jbtnRev;
    JLabel jlabPrompt, jlabContents;

    WindowMode() {
        JFrame jfrm = new JFrame("Calculator");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(440, 100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jtf = new JTextField(20);
        jtf.setActionCommand("myTF");
        JButton jbtnRev = new JButton("Calculate");
        jtf.addActionListener(this);
        jbtnRev.addActionListener(this);
        jlabPrompt = new JLabel("Enter expression: ");
        jlabContents = new JLabel("");
        jfrm.add(jlabPrompt);
        jfrm.add(jtf);
        jfrm.add(jbtnRev);
        jfrm.add(jlabContents);
        jfrm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Calculator calculator = new Calculator();
        try {
            jlabContents.setText("Result is: "+ calculator.calculate(jtf.getText()));
        } catch (Exception exc){
            jlabContents.setText("Expression is false. Please correct it");

        }
    }
}
