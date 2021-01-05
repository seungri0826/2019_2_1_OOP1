import java.awt.*;
import javax.swing.*;

public class exercise4 extends JFrame {
	public exercise4() {
		setSize(500,300);
		setTitle("My Frame");
		setLayout(null);
		
		for(int i = 0; i<20; i++) {
			int num = (int) (Math.random() * 100);
			String str = Integer.toString(num);
			
			int hloc = (int) (Math.random() * 450);	// frame의 가로 사이즈 - 글자 크기
			int vloc = (int) (Math.random() * 250);	// frame의 세로 사이즈 - 글자 크기
			
			JLabel label = new JLabel(str);
			add(label);
			label.setLocation(hloc, vloc);
			label.setSize(30,30);	// 글자 크기 = 30
		}
		
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exercise4 f = new exercise4();
	}

}
