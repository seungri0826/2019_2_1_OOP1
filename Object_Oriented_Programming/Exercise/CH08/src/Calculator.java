import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame {
	private String[] labels = {
			"Backspace", "", "", "CE", "C", "7", "8", "9", "/", "sqrt", "4", "5", 
			"6", "x", "%", "1", "2", "3", "-", "1/x", "0", "+/-", ".", "+", "=",};
	
	public Calculator() {
		setSize(462, 182);
		setTitle("Calculator");
		
		JPanel masterpanel = new JPanel();
		masterpanel.setLayout(new BorderLayout());
		
		JPanel buttonpanel = new JPanel();
		buttonpanel.setLayout(new GridLayout(0, 5, 3, 3));
		
		JPanel fieldpanel = new JPanel();
		JTextField field = new JTextField(48);
		
		fieldpanel.setLayout(new GridLayout());	// BorderLayout???
		fieldpanel.add(field);
		
		JButton[] buttons;
		buttons = new JButton[25];
		
		int index = 0;
		for(int rows = 0; rows < 5; rows++) {
			for(int cols = 0; cols < 5; cols++) {
				buttons[index] = new JButton(labels[index]);
				buttons[index].setBackground(Color.yellow);
				buttonpanel.add(buttons[index]);
				index++;
			}
		}
		add(masterpanel);
		masterpanel.add(fieldpanel, BorderLayout.NORTH);
		masterpanel.add(buttonpanel, BorderLayout.SOUTH);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
	}

}
