import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class exercise5 extends JFrame implements ActionListener {
	private JTextField field1, field2, result;
	private JButton button;
	
	public exercise5() {
		setTitle("���� ����");
		setSize(400,150);
		setLayout(new FlowLayout());
		
		field1 = new JTextField(5);
		field2 = new JTextField(5);
		button = new JButton("��ȯ");
		button.addActionListener(this);;
		result = new JTextField(15);
		result.setEditable(false);
		
		add(new JLabel("������ �Է��Ͻÿ�"));
		add(field1);
		add(new JLabel("������ �Է��Ͻÿ�"));
		add(field2);
		add(button);
		add(result);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exercise5 p = new exercise5();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int money = Integer.parseInt(field1.getText());
		double interest = Double.parseDouble(field2.getText());
		result.setText("���ڴ� �� " + ((int)((money * interest) / 100) + "���� �Դϴ�."));
	}
}
