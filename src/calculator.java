import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class calculator {
	int dec;
	double answer;
	double number1;
	double number2;
	char opCode;
	String secondNumber;
	private JFrame frame;
	private JTextField field;
	private JTextField field2;
	boolean periodCheck;

	/**
	 * trying to test why it doesn't appear as changed.
	 * Launches the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}
	
	public calculator() {
		initialize();
	}
	public void setField(int num) {
		field.setText(field.getText()+num);
	}
	
	public void opCodeChecker() {
		if (opCode == 'a') {
			answer = number1 + number2;
		}
		else if (opCode == 'm') {
			answer = number1 * number2;
		}
		else if (opCode == 'd') {
			answer = number1 / number2;
		}
		else if (opCode == 's') {
			answer = number1 - number2;
		}
		else System.out.print("oops");
	}

	public void storeFirstNumber() {
		String firstNumber = field.getText();
		number1 = Double.parseDouble(firstNumber);
		System.out.println(number1);
	}
	
	public void storeSecondNumber() {
		secondNumber = field.getText();
		number2 = Double.parseDouble(secondNumber);
	}
	
	public void showAnswer() {
		answer = Math.round(answer * 100000d) / 100000d;
		String ansString = Double.toString(answer);
		field.setText(ansString);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Calc");
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 267, 474);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		field = new JTextField();
		field.setHorizontalAlignment(SwingConstants.TRAILING);
		field.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 30));
		field.setBackground(Color.WHITE);
		field.setEditable(false);
		field.setBounds(12, 11, 236, 50);
		frame.getContentPane().add(field);
		field.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setField(7);
			}
		});
		btn7.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		btn7.setForeground(Color.BLACK);
		btn7.setBackground(Color.WHITE);
		btn7.setBounds(12, 132, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		btn8.setForeground(Color.BLACK);
		btn8.setBackground(Color.WHITE);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			setField(8);
			}
		});
		btn8.setBounds(74, 132, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setField(9);	
			}
		});
		btn9.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		btn9.setForeground(Color.BLACK);
		btn9.setBackground(Color.WHITE);
		btn9.setBounds(136, 132, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			field.setText(null);
			field2.setText(null);
			periodCheck = false;
			}
		});
		btnC.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		btnC.setForeground(Color.BLACK);
		btnC.setBackground(Color.WHITE);
		btnC.setBounds(136, 321, 50, 50);
		frame.getContentPane().add(btnC);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setField(6);
			}
		});
		btn6.setForeground(Color.BLACK);
		btn6.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		btn6.setBackground(Color.WHITE);
		btn6.setBounds(136, 195, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setField(4);
			}
		});
		btn4.setForeground(Color.BLACK);
		btn4.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		btn4.setBackground(Color.WHITE);
		btn4.setBounds(12, 195, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setField(5);
			}
		});	
		btn5.setForeground(Color.BLACK);
		btn5.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		btn5.setBackground(Color.WHITE);
		btn5.setBounds(74, 195, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setField(3);
			}
		});
		btn3.setForeground(Color.BLACK);
		btn3.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		btn3.setBackground(Color.WHITE);
		btn3.setBounds(136, 258, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setField(1);
			}
		});
		btn1.setForeground(Color.BLACK);
		btn1.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		btn1.setBackground(Color.WHITE);
		btn1.setBounds(12, 258, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setField(2);
			}
		});
		btn2.setForeground(Color.BLACK);
		btn2.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		btn2.setBackground(Color.WHITE);
		btn2.setBounds(74, 258, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton divisionbtn = new JButton("/");
		divisionbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				opCode = 'd';
				storeFirstNumber();
				field2.setText(field.getText()+" / ");
				field.setText(null);
				periodCheck = false;
			}
		});
		divisionbtn.setForeground(Color.BLACK);
		divisionbtn.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		divisionbtn.setBackground(Color.WHITE);
		divisionbtn.setBounds(198, 195, 50, 50);
		frame.getContentPane().add(divisionbtn);
		
		JButton subtractbtn = new JButton("-");
		subtractbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opCode = 's';
				storeFirstNumber();
				field2.setText(field.getText()+" - ");
				field.setText(null);
				periodCheck = false;
			}
		});
		subtractbtn.setForeground(Color.BLACK);
		subtractbtn.setBackground(Color.WHITE);
		subtractbtn.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		subtractbtn.setBounds(198, 321, 50, 50);
		frame.getContentPane().add(subtractbtn);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setField(0);
			}
		});
		btn0.setForeground(Color.BLACK);
		btn0.setBackground(Color.WHITE);
		btn0.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		btn0.setBounds(74, 321, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton perdiobtn = new JButton("\u00B7");
		perdiobtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (periodCheck == false)
				field.setText(field.getText()+".");
				periodCheck = true;
			}
		});
		perdiobtn.setForeground(Color.BLACK);
		perdiobtn.setBackground(Color.WHITE);
		perdiobtn.setFont(new Font("Yu Gothic UI", Font.BOLD, 19));
		perdiobtn.setBounds(12, 321, 50, 50);
		frame.getContentPane().add(perdiobtn);
		
		JButton additionbtn = new JButton("+");
		additionbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				opCode = 'a';
				storeFirstNumber();
				field2.setText(field.getText()+" + ");
				field.setText(null);
				periodCheck = false;
			}
		});
		additionbtn.setForeground(Color.BLACK);
		additionbtn.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		additionbtn.setBackground(Color.WHITE);
		additionbtn.setBounds(198, 258, 50, 50);
		frame.getContentPane().add(additionbtn);
		
		JButton multiplicationbtn = new JButton("x");
		multiplicationbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opCode = 'm';
				storeFirstNumber();
				field2.setText(field.getText()+" x ");
				field.setText(null);
				periodCheck = false;
			}
		});
		multiplicationbtn.setForeground(Color.BLACK);
		multiplicationbtn.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		multiplicationbtn.setBackground(Color.WHITE);
		multiplicationbtn.setBounds(198, 132, 50, 50);
		frame.getContentPane().add(multiplicationbtn);
		
		JButton equalsbutton = new JButton("=");
		equalsbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			storeSecondNumber();
			opCodeChecker();
			if (number2 == 0) {
				showAnswer();
				field2.setText(field2.getText()+secondNumber+" = DNE");
				field.setText(null);
			}
			else {
			showAnswer();
			field2.setText(field2.getText()+secondNumber+" = "+answer);
			field.setText(null);
			}
			periodCheck = false;
			}
			
		});
		equalsbutton.setBackground(Color.WHITE);
		equalsbutton.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		equalsbutton.setBounds(12, 384, 236, 50);
		frame.getContentPane().add(equalsbutton);
		
		field2 = new JTextField();
		field2.setHorizontalAlignment(SwingConstants.TRAILING);
		field2.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 30));
		field2.setBackground(Color.WHITE);
		field2.setEditable(false);
		field2.setBounds(12, 71, 236, 50);
		frame.getContentPane().add(field2);
		field2.setColumns(10);
	}
}
