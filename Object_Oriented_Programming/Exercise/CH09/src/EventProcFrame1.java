import javax.swing.*;
import java.awt.event.*;

public class EventProcFrame1 extends JFrame implements ActionListener {
	private JButton button;
	private JLabel label;
	int counter=0;
	
	public void actionPerformed(ActionEvent e) {
		counter++;
		label.setText("������ ī���Ͱ�: " + counter);
	}
	
	public EventProcFrame1() {
		this.setSize(400,150);
		this.setTitle("�̺�Ʈ ����");
		
		JPanel panel = new JPanel();
		button = new JButton("����");
		label = new JLabel("������ ī���Ͱ�: " + counter);
		button.addActionListener(this);
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventProcFrame1 t = new EventProcFrame1();
	}

}
