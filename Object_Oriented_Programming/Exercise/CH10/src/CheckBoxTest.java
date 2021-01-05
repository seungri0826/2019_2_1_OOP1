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
		
		JCheckBox checkbox1 = new JCheckBox("사과", false);
		JCheckBox checkbox2 = new JCheckBox("바나나", false);
		JCheckBox checkbox3 = new JCheckBox("포도", false);
		JCheckBox checkbox4 = new JCheckBox("오렌지", false);
		JCheckBox checkbox5 = new JCheckBox("배", false);
		
		checkbox1.addItemListener(this);
		checkbox2.addItemListener(this);
		checkbox3.addItemListener(this);
		checkbox4.addItemListener(this);
		checkbox5.addItemListener(this);
		
		panel.setBorder(BorderFactory.createTitledBorder("과일"));
		
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
			System.out.println("사과 : " + checkbox1.isSelected());
		else if(e.getSource() == checkbox2)
			System.out.println("바나나 : " + checkbox2.isSelected());
		else if(e.getSource() == checkbox3)
			System.out.println("포도 : " + checkbox3.isSelected());
		else if(e.getSource() == checkbox4)
			System.out.println("오렌지 : " + checkbox4.isSelected());
		else if(e.getSource() == checkbox5)
			System.out.println("배 : " + checkbox5.isSelected());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxTest();

	}

}
