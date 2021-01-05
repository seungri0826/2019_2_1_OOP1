import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BouncingBall extends JFrame implements ActionListener {
	int x, y;
	private int xSpeed = 3, ySpeed = 3;
	private static final int WIDTH = 600;
	private static final int HEIGHT = 200;
	private static final int PERIOD = 10;
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.ORANGE);
			g.fillOval(x,y,40,40);
		}
	}
	
	public void update() {
		x += xSpeed;
		y += ySpeed;
		if (x > WIDTH - 80 || x < 0) {
			xSpeed = - xSpeed;
		}
		if ( y > HEIGHT -80 || y < 0) {
			ySpeed = - ySpeed;
		}
	}
	
	public BouncingBall() {
		setSize(WIDTH, HEIGHT);
		setTitle("Bouncing Ball");
		setVisible(true);
		add(new MyPanel());
		Timer timer = new Timer(PERIOD, this);
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		update();
		repaint();
	}
	
	public static void main(String[] args) {
		BouncingBall f = new BouncingBall();
	}

}
