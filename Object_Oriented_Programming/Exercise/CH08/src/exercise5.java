import java.awt.*;
import javax.swing.*;

public class exercise5 extends JFrame {
	public exercise5() {
		
		setSize(470, 175);
		setTitle("My Frame");
		setLayout(new GridLayout(4,5));
		
		for(int i = 0; i < 20; i++) {
			int R = (int)(Math.random()*256);
			int G = (int)(Math.random()*256);
			int B = (int)(Math.random()*256);
			Color color = new Color(R,G,B);
			//JButton button = new JButton(""+i);
			JButton button = new JButton(Integer.toString(i));
			button.setBackground(color);
			add(button);
		}
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exercise5 f = new exercise5();
	}

}
