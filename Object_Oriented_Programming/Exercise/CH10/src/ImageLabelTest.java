import java.awt.*;
import javax.swing.*;

public class ImageLabelTest extends JFrame {
	private JPanel panel;
	private JLabel label;
	private JButton button;
	
	public ImageLabelTest() {
		setTitle("���̺� �׽�Ʈ");
		setSize(400,300);
		
		panel = new JPanel();
		label = new JLabel("Dog");
		label.setFont(new Font("Arial", Font.ITALIC, 30));
		label.setForeground(Color.ORANGE);
		
		ImageIcon icon = new ImageIcon("dog.jpg");
		label.setIcon(icon);
		
		button = new JButton("�ڼ��� ������ ������ Ŭ���ϼ���!");
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageLabelTest t = new ImageLabelTest();

	}

}
