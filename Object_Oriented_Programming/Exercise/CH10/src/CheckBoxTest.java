import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CheckBoxTest extends JFrame implements ItemListener {
	JCheckBox checkbox1, checkbox2, checkbox3, checkbox4, checkbox5;
	
	public CheckBoxTest() {
		setTitle("CheckBox Test");
		setSize(500, 150);
		
		JPanel panel = new JPanel();
		add(panel);
		
		JCheckBox checkbox1 = new JCheckBox("���", false);
		JCheckBox checkbox2 = new JCheckBox("�ٳ���", false);
		JCheckBox checkbox3 = new JCheckBox("����", false);
		JCheckBox checkbox4 = new JCheckBox("������", false);
		JCheckBox checkbox5 = new JCheckBox("��", false);
		
		checkbox1.addItemListener(this);
		checkbox2.addItemListener(this);
		checkbox3.addItemListener(this);
		checkbox4.addItemListener(this);
		checkbox5.addItemListener(this);
		
		panel.setBorder(BorderFactory.createTitledBorder("����"));
		
		panel.add(checkbox1);
		panel.add(checkbox2);
		panel.add(checkbox3);
		panel.add(checkbox4);
		panel.add(checkbox5);
		
		add(panel);
		setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() == checkbox1)
			System.out.println("��� : " + checkbox1.isSelected());
		else if(e.getSource() == checkbox2)
			System.out.println("�ٳ��� : " + checkbox2.isSelected());
		else if(e.getSource() == checkbox3)
			System.out.println("���� : " + checkbox3.isSelected());
		else if(e.getSource() == checkbox4)
			System.out.println("������ : " + checkbox4.isSelected());
		else if(e.getSource() == checkbox5)
			System.out.println("�� : " + checkbox5.isSelected());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxTest();

	}

}
