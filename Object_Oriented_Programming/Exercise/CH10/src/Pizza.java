import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class WelcomePanel extends JPanel {
	private JLabel message;
	public WelcomePanel() {
		message = new JLabel("�ڹ� ���ڿ� ���Ű��� ȯ���մϴ�.");
	}
	add(message);
}

class TypePanel extends JPanel {
	private JRadioButton combo, potato, bulgogi;
	public TypePanel() {
		setLayout(new GridLayout(3,1));
		combo = new JRadioButton("�޺�", true);
		potato = new JRadioButton("��������");
		bulgogi = new JRadioButton("�Ұ��");
		ButtonGroup bg  = new ButtonGroup();
		bg.add(combo);
		bg.add(potato);
		bg.add(bulgogi);
		setBorder(BorderFactory.createTitledBorder("����"));
		add(combo);
		add(potato);
		add(bulgogi);
	}
}

class ToppingPanel extends JPanel {
	private JCheckBox pepper, cheese, pepperoni, bacon;
	public ToppingPanel() {
		setLayout(new GridLayout(4,1));
		pepper = new JCheckBox("�Ǹ�", true);
		cheese = new JCheckBox("ġ��");
		pepperoni = new JCheckBox("���۷δ�");
		bacon = new JCheckBox("������");
		setBorder(BorderFactory.createTitledBorder("�߰�����"));
		
	}
}
public class Pizza {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
