import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame {
	int x,y;
	
	class MyPanel extends JPanel {
		public MyPanel() {
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					x = e.getX();
					y = e.getY();
					repaint();
				}
			});
		}
		
		protected void paintComponent(Graphics g) {
			super.paintComponents(g);
			g.setColor(Color.ORANGE);
			g.fillRect(x, y, 100, 100);
		}
	}
	
	public MyFrame() {
		setTitle("Basic Painting");
		setSize(600, 200);
		add(new MyPanel());
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f = new MyFrame();
	}

}
