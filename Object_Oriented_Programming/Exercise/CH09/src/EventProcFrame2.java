import javax.swing.*;
import java.awt.event.*;

public class EventProcFrame2 extends JFrame {
	private JButton button;
	private JLabel label;
	int counter = 0;
	
	public EventProcFrame2() {
		this.setSize(400, 150);
		this.setTitle("이벤트 예제");
		
		JPanel panel = new JPanel();
		button = new JButton("증가");
		label = new JLabel("현재의 카운터값: " + counter);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter++;
				label.setText("현재의 카운터값: " + counter);
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
