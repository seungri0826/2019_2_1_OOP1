import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextAreaFrame extends JFrame implements ActionListener {
	protected JTextField textField;
	protected JTextArea textArea;
	//protected JScrollPane scrollPane;
	
	public TextAreaFrame() {
		setTitle("Text Area Test");
		
		textField = new JTextField(30);
		textField.addActionListener(this);
		
		textArea = new JTextArea(10, 30);
		textArea.setEditable(false);
		
		//scrollPane = new JScrollPane(textArea);
		
		add(textField, BorderLayout.NORTH);
		add(textArea, BorderLayout.CENTER);
		//add(scrollPane, BorderLayout.EAST);
		
		pack();
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent evt) {
		String text = textField.getText();
		textArea.append(text + "\n");
		textField.selectAll();
		textArea.setCaretPosition(textArea.getDocument().getLength());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextAreaFrame();

	}

}
