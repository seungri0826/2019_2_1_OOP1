import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TextFieldFrame extends JFrame {
	private JButton button;
	//private JTextField text, result;
	private JPasswordField text;
	private JTextField result;
	
	public TextFieldFrame() {
		setSize(300,150);
		setTitle("���� ����ϱ�");
		ButtonListener listener = new ButtonListener();
		
		JPanel panel = new JPanel();
		panel.add(new JLabel("���� �Է�: "));
		//text = new JTextField(15);
		text = new JPasswordField(15);
		text.addActionListener(listener);
		panel.add(text);
		
		panel.add(new JLabel("������ ��: "));
		result = new JTextField(15);
		result.setEditable(false);
		panel.add(result);
		
		button = new JButton("OK");
		button.addActionListener(listener);
		panel.add(button);
		add(panel);
		setVisible(true);
	}
	// ���� Ŭ�����μ� �ؽ�Ʈ �ʵ�� ��ư�� �׼� �̺�Ʈ ó��
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button || e.getSource() == text) {
				String name = text.getText();
				int value = Integer.parseInt(name);
				result.setText(" " + value * value);
				text.requestFocus();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextFieldFrame();

	}

}
