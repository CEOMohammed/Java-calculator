/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author moo
 */
public class Interface {

    JFrame frame;
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton("off");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("x");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonSqrt = new JButton("\u221A");

    public void GUI() {
        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(300, 490);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);//center the calculator
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents() {
        label.setBounds(250, 0, 50, 50);
        frame.add(label);

        textField.setBounds(10, 40, 270, 40);
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        onRadioButton.setBounds(10, 95, 60, 40);
        onRadioButton.setSelected(true);
        frame.add(onRadioButton);

        offRadioButton.setBounds(10, 120, 60, 40);
        offRadioButton.setSelected(false);
        frame.add(offRadioButton);

        buttonSeven.setBounds(10, 230, 60, 40);
        frame.add(buttonSeven);

        buttonEight.setBounds(80, 230, 60, 40);
        frame.add(buttonEight);

        buttonNine.setBounds(150, 230, 60, 40);
        frame.add(buttonNine);

        buttonFour.setBounds(10, 290, 60, 40);
        frame.add(buttonFour);

        buttonFive.setBounds(80, 290, 60, 40);
        frame.add(buttonFive);

        buttonSix.setBounds(150, 290, 60, 40);
        frame.add(buttonSix);

        buttonOne.setBounds(10, 350, 60, 40);
        frame.add(buttonOne);

        buttonTwo.setBounds(80, 350, 60, 40);
        frame.add(buttonTwo);

        buttonThree.setBounds(150, 350, 60, 40);
        frame.add(buttonThree);

        buttonDot.setBounds(150, 410, 60, 40);
        frame.add(buttonDot);
        buttonZero.setBounds(10, 410, 130, 40);
        frame.add(buttonZero);
        buttonEqual.setBounds(220, 350, 60, 100);
        frame.add(buttonEqual);
        buttonDiv.setBounds(220, 110, 60, 40);
        frame.add(buttonDiv);

        buttonSqrt.setBounds(10, 170, 60, 40);
        frame.add(buttonSqrt);

        buttonMul.setBounds(220, 230, 60, 40);

        frame.add(buttonMul);

        buttonMinus.setBounds(150, 170, 130, 40);

        frame.add(buttonMinus);

        buttonPlus.setBounds(220, 290, 60, 40);

        frame.add(buttonPlus);

        buttonSquare.setBounds(80, 170, 60, 40);

        frame.add(buttonSquare);

        buttonDelete.setBounds(150, 110, 60, 40);

        frame.add(buttonDelete);

        buttonClear.setBounds(80, 110, 60, 40);
        frame.add(buttonClear);
    }

}
