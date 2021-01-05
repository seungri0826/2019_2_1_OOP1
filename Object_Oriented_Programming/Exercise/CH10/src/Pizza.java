import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class WelcomePanel extends JPanel {
	private JLabel message;
	public WelcomePanel() {
		message = new JLabel("자바 피자에 오신것을 환영합니다.");
	}
	add(message);
}

class TypePanel extends JPanel {
	private JRadioButton combo, potato, bulgogi;
	public TypePanel() {
		setLayout(new GridLayout(3,1));
		combo = new JRadioButton("콤보", true);
		potato = new JRadioButton("포테이토");
		bulgogi = new JRadioButton("불고기");
		ButtonGroup bg  = new ButtonGroup();
		bg.add(combo);
		bg.add(potato);
		bg.add(bulgogi);
		setBorder(BorderFactory.createTitledBorder("종류"));
		add(combo);
		add(potato);
		add(bulgogi);
	}
}

class ToppingPanel extends JPanel {
	private JCheckBox pepper, cheese, pepperoni, bacon;
	public ToppingPanel() {
		setLayout(new GridLayout(4,1));
		pepper = new JCheckBox("피망", true);
		cheese = new JCheckBox("치즈");
		pepperoni = new JCheckBox("페퍼로니");
		bacon = new JCheckBox("베이컨");
		setBorder(BorderFactory.createTitledBorder("추가토핑"));
		
	}
}
public class Pizza {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
