import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton[] numberButton = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton decimalButton, equButton, delButton, clrButton;
    JPanel panel;

    Font myfont = new Font("Arial",Font.BOLD,30);

    double num1 = 0, num2 = 0, result = 0;
    char operator;


    Calculator() {

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
