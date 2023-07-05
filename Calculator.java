import javax.swing.*;
//to make use of the gui components
import java.awt.*;
//again to make useo f gui classes such as color, container and all
import java.awt.event.*;
//to make use of the action listener 
public class Calculator implements ActionListener
{
    JFrame jf; //frame
    String s0, s1, s2; //store operator and operands
    JLabel displayLabel; //label for output
    JButton sevenButton,eightButton,nineButton,sixButton,fiveButton,fourButton,threeButton,twoButton,zeroButton,minusButton,plusButton,dotButton,divButton,mulButton,clearButton,oneButton,equalButton;
    // all the buttons for our calculator
    public Calculator()
    {
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(300,150);
        jf.add(displayLabel);
        //setting up the frame
        displayLabel = new JLabel();
        displayLabel.setBounds(30,50,540,40);
        displayLabel.setBackground(Color.white);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setOpaque(true);
        displayLabel.setForeground(Color.black);
        //setting up the label
        s0 = s1 = s2 = "";
        //putting empty strings to the variables

        sevenButton = new JButton("7"); //button creation
        sevenButton.setBounds(30,130,80,80); //button height width and positioning
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 40)); //size and font
        jf.add(sevenButton); //adding button to the frame
        sevenButton.addActionListener(this); //making the button functionable using action listener
        // seventh button
        eightButton = new JButton("8");
        eightButton.setBounds(130,130,80,80);
        eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(eightButton);
        eightButton.addActionListener(this); 
        // eight button
        nineButton = new JButton("9");
        nineButton.setBounds(230,130, 80,80);
        nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
        nineButton.addActionListener(this);
        jf.add(nineButton);
        //ninth Button
        // 1st three buttons


        fourButton = new JButton("4");
        fourButton.setBounds(30,230,80,80);
        fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
        fourButton.addActionListener(this); 
        jf.add(fourButton);
        // fourth button
        fiveButton = new JButton("5");
        fiveButton.setBounds(130,230,80,80);
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
        fiveButton.addActionListener(this); 
        jf.add(fiveButton);
        // fifth button
        sixButton = new JButton("6");
        sixButton.setBounds(230,230,80,80);
        sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
        sixButton.addActionListener(this); 
        jf.add(sixButton);
        //sixth Button
        // 2nd three buttons


        oneButton = new JButton("1");
        oneButton.setBounds(30,330,80,80);
        jf.add(oneButton);
        oneButton.addActionListener(this); 
        oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
        // one button
        twoButton = new JButton("2");
        twoButton.setBounds(130,330,80,80);
        jf.add(twoButton);
        twoButton.addActionListener(this); 
        twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
        // twobutton
        threeButton = new JButton("3");
        threeButton.setBounds(230,330,80,80);
        jf.add(threeButton);
        threeButton.addActionListener(this); 
        threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
        //three Button
        // 3rd three buttons

        dotButton = new JButton(".");
        dotButton.setBounds(30,430,80,80);
        jf.add(dotButton);
        dotButton.addActionListener(this); 
        dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
        // dot button
        zeroButton = new JButton("0");
        zeroButton.setBounds(130,430,80,80);
        jf.add(zeroButton);
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
        zeroButton.addActionListener(this); 
        // zero button
        equalButton = new JButton("=");
        equalButton.setBounds(230,430, 80,80);
        jf.add(equalButton);
        equalButton.addActionListener(this); 
        equalButton.setFont(new Font("Arial", Font.PLAIN, 40));
        //equal Button
        // 4th set of three buttons


        divButton = new JButton("/");
        divButton.setBounds(330,130,80,80);
        jf.add(divButton);
        divButton.addActionListener(this); 
        divButton.setFont(new Font("Arial", Font.PLAIN, 40));
        // div button
        mulButton = new JButton("*");
        mulButton.setBounds(330,230,80,80);
        jf.add(mulButton);
        mulButton.addActionListener(this); 
        mulButton.setFont(new Font("Arial", Font.PLAIN, 40));
        // multiplication button
        minusButton = new JButton("-");
        minusButton.setBounds(330,330, 80,80);
        jf.add(minusButton);
        minusButton.addActionListener(this); 
        minusButton.setFont(new Font("Arial", Font.PLAIN, 40));
        // subtraction button
        plusButton = new JButton("+");
        plusButton.setBounds(330,430,80,80);
        jf.add(plusButton);
        plusButton.setFont(new Font("Arial", Font.PLAIN, 40));
        plusButton.addActionListener(this); 
        // addition button

        clearButton = new JButton("Clear");
        clearButton.setBounds(430,430,80,80);
        jf.add(clearButton);
        clearButton.setFont(new Font("Arial", Font.BOLD, 15));
        clearButton.addActionListener(this); 
        //clear button


        jf.setVisible(true); //to make the frame visible to the user
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to terminate the program when the frame is closed
    }
    public static void main(String[]args) {
         new Calculator();
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();

		// if the value is a number
		if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
			// if operand is present then add to second number
			if (!s1.equals("")) {
				s2 = s2 + s;
			} else {
				s0 = s0 + s;
			}

			// set the value of text
			displayLabel.setText(s0 + s1 + s2);
		} else if (s.charAt(0) == 'C') {
			// clear all the fields
			s0 = s1 = s2 = "";

			// set the value of text
			displayLabel.setText(s0 + s1 + s2);
		} else if (s.charAt(0) == '=') {
			if (!s0.equals("") && !s1.equals("") && !s2.equals("")) {
				double te;

				// store the value in the 1st operand
				if (s1.equals("+")) {
					te = (Double.parseDouble(s0) + Double.parseDouble(s2));
				} else if (s1.equals("-")) {
					te = (Double.parseDouble(s0) - Double.parseDouble(s2));
				} else if (s1.equals("/")) {
					te = (Double.parseDouble(s0) / Double.parseDouble(s2));
				} else {
					te = (Double.parseDouble(s0) * Double.parseDouble(s2));
				}

				// set the value of text
				displayLabel.setText(s0 + s1 + s2 + "=" + te);

				// convert it to string
				s0 = Double.toString(te);

				s1 = s2 = "";
			}
		} else {
			// if there was no operand
			if (s1.equals("") || s2.equals("")) {
				s1 = s;
			}
			// else evaluate the expression
			else {
				double te;

				// store the value in the 1st operand
				if (s1.equals("+")) {
					te = (Double.parseDouble(s0) + Double.parseDouble(s2));
				} else if (s1.equals("-")) {
					te = (Double.parseDouble(s0) - Double.parseDouble(s2));
				} else if (s1.equals("/")) {
					te = (Double.parseDouble(s0) / Double.parseDouble(s2));
				} else {
					te = (Double.parseDouble(s0) * Double.parseDouble(s2));
				}

				// convert it to string
				s0 = Double.toString(te);

				// place the operator
				s1 = s;

				// make the operand blank
				s2 = "";
			}

			// set the value of text
			displayLabel.setText(s0 + s1 + s2);
		}
	}
}
    
