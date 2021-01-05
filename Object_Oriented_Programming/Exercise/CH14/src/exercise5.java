import java.awt.*;
import java.util.*;

import javax.swing.*;

public class exercise5 extends JFrame {
	private JLabel label;
	class MyThread extends Thread{
		
		public MyThread() {		}
		
		public void run() {
			while(true) {
				Calendar now = Calendar.getInstance();
				int hrs = now.get(Calendar.HOUR_OF_DAY);
				int min = now.get(Calendar.MINUTE);
				int sec = now.get(Calendar.SECOND);
				String time = hrs + ":" + min + ":" + sec;
				label.setText(time);;
				repaint();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public exercise5() {
		setTitle("Digital Clock");
		setSize(600, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		label = new JLabel();
		label.setFont(new Font("Dialog", Font.BOLD, 100));
		add(label);
		(new MyThread()).start();
		Calendar now = Calendar.getInstance();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exercise5 t = new exercise5();
	}

	
	// 스레드 2개 돌고 있는 것임.
}
