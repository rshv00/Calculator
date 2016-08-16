package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Рома on 09.08.2016.
 */
public class WindowMode implements ActionListener {
    JTextField tf;
    JButton equals, one, two, three, four, five, six, seven, eight, nine, zero, add, minus, multiple, divide, openbracket, closebracket, clear;
    JLabel jlabContents;


    WindowMode() {
        JFrame jfrm = new JFrame("Calculator");
        jfrm.setLayout(null);
        jfrm.setSize(400, 500);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tf = new JTextField(30);
        tf.setActionCommand("myTF");
//        jfrm.setResizable(false);
        equals = new JButton("=");
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        zero = new JButton("0");
        add = new JButton("+");
        minus = new JButton("-");
        multiple = new JButton("*");
        divide = new JButton("/");
        openbracket = new JButton("(");
        closebracket = new JButton(")");
        clear = new JButton("C");

        tf.addActionListener(this);
        equals.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        add.addActionListener(this);
        minus.addActionListener(this);
        multiple.addActionListener(this);
        divide.addActionListener(this);
        openbracket.addActionListener(this);
        closebracket.addActionListener(this);
        clear.addActionListener(this);

        tf.setBounds(30, 40, 280, 30);
        clear.setBounds(315, 36, 50, 40);
        seven.setBounds(40, 100, 50, 40);
        eight.setBounds(110, 100, 50, 40);
        nine.setBounds(180, 100, 50, 40);
        divide.setBounds(250, 100, 50, 40);
        four.setBounds(40, 170, 50, 40);
        five.setBounds(110, 170, 50, 40);
        six.setBounds(180, 170, 50, 40);
        multiple.setBounds(250, 170, 50, 40);
        one.setBounds(40, 240, 50, 40);
        two.setBounds(110, 240, 50, 40);
        three.setBounds(180, 240, 50, 40);
        minus.setBounds(250, 240, 50, 40);
        openbracket.setBounds(40, 310, 50, 40);
        zero.setBounds(110, 310, 50, 40);
        closebracket.setBounds(180, 310, 50, 40);
        add.setBounds(250, 310, 50, 40);
        equals.setBounds(180, 380, 100, 40);

        jfrm.add(tf);
        jfrm.add(seven);
        jfrm.add(eight);
        jfrm.add(nine);
        jfrm.add(divide);
        jfrm.add(four);
        jfrm.add(five);
        jfrm.add(six);
        jfrm.add(multiple);
        jfrm.add(one);
        jfrm.add(two);
        jfrm.add(three);
        jfrm.add(minus);
        jfrm.add(openbracket);
        jfrm.add(zero);
        jfrm.add(closebracket);
        jfrm.add(add);
        jfrm.add(equals);
        jfrm.add(clear);
        jfrm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Calculator calculator = new Calculator();//
        if (e.getActionCommand().equals("1")) {
            tf.setText(tf.getText() + "1");
        } else if (e.getActionCommand().equals("2")) {
            tf.setText(tf.getText() + "2");
        } else if (e.getActionCommand().equals("3")) {
            tf.setText(tf.getText() + "3");
        } else if (e.getActionCommand().equals("4")) {
            tf.setText(tf.getText() + "4");
        } else if (e.getActionCommand().equals("5")) {
            tf.setText(tf.getText() + "5");
        } else if (e.getActionCommand().equals("6")) {
            tf.setText(tf.getText() + "6");
        } else if (e.getActionCommand().equals("7")) {
            tf.setText(tf.getText() + "7");
        } else if (e.getActionCommand().equals("8")) {
            tf.setText(tf.getText() + "8");
        } else if (e.getActionCommand().equals("9")) {
            tf.setText(tf.getText() + "9");
        } else if (e.getActionCommand().equals("0")) {
            tf.setText(tf.getText() + "0");
        } else if (e.getActionCommand().equals("/")) {
            tf.setText(tf.getText() + "/");
        } else if (e.getActionCommand().equals("*")) {
            tf.setText(tf.getText() + "*");
        } else if (e.getActionCommand().equals("-")) {
            tf.setText(tf.getText() + "-");
        } else if (e.getActionCommand().equals("+")) {
            tf.setText(tf.getText() + "+");
        } else if (e.getActionCommand().equals("(")) {
            tf.setText(tf.getText() + "(");
        } else if (e.getActionCommand().equals(")")) {
            tf.setText(tf.getText() + ")");
        } else if (e.getActionCommand().equals("C")) {
            tf.setText("");
        } else {
            try {
                tf.setText(calculator.calculate(tf.getText()));
            } catch (Exception exc) {
                tf.setText(exc.getLocalizedMessage());
            }
        }
    }
}
