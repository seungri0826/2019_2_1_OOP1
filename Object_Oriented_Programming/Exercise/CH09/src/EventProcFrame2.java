import javax.swing.*;
import java.awt.event.*;

public class EventProcFrame2 extends JFrame {
	private JButton button;
	private JLabel label;
	int counter = 0;
	
	public EventProcFrame2() {
		this.setSize(400, 150);
		this.setTitle("�̺�Ʈ ����");
		
		JPanel panel = new JPanel();
		button = new JButton("����");
		label = new JLabel("������ ī���Ͱ�: " + counter);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter++;
				label.setText("������ ī���Ͱ�: " + counter);
			}
		});
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventProcFrame2 f = new EventProcFrame2();
	}

}
