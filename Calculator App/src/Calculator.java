//14:52

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator implements ActionListener {
	
	//things we need declare
	JFrame frame;
	JTextField textfield;
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[8];
	JButton addButton, subButton, mulButton, divButton;
	JButton decButton, equButton, delButton, clrButton;
	JPanel panel;
	
	Font myFont = new Font("Ink Free", Font.BOLD,30);
	
	double num1 =0, num2 =0, result=0;
	char operator;
	
	Calculator() {
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,550);
		frame.setLayout(null);
		
		// create check box
		textfield = new JTextField();
		textfield.setBounds(50, 50, 300, 50);
		textfield.setFont(myFont);
		textfield.setEditable(false); // cant add text
		
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("Del");
		clrButton = new JButton("Clr");
		
		
		functionButtons[0]= addButton;
		functionButtons[1]= subButton;
		functionButtons[2]= mulButton;
		functionButtons[3]= divButton;
		functionButtons[4]= decButton;
		functionButtons[5]= equButton;
		functionButtons[6]= delButton;
		functionButtons[7]= clrButton;
		
		
		//call things out
		frame.add(textfield);
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
