import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyFrame extends JFrame {
	private JButton button;
	private JLabel label;
	int counter=0;
	
	class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			counter++;
			label.setText("������ ī���Ͱ�: " + counter);
		}
	}
	
	public MyFrame() {
		setSize(400,150);
		setTitle("�̺�Ʈ ����");
		setLayout(new FlowLayout());
		button = new JButton("����");
		label = new JLabel("������ ī���Ͱ�: " + counter);
		button.addActionListener(new MyListener());
		add(label);
		add(button);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame t = new MyFrame();
	}

}
