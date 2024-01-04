import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame {
	private JFrame frame;
	private JPanel panel;
	private JTextField textField;
	private JLabel label;
	
	public MainFrame() {
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();
		this.frame.setTitle("Swing Template");
		this.frame.setSize(800, 500);
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setLocationRelativeTo(null);
		this.frame.setLayout(new BorderLayout());
		
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		textField = createTextField();
		panel.add(textField);
		
		label = new JLabel("");
		label.setFont(new Font("Arial", Font.BOLD, 24));
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		
		this.frame.setVisible(true);
		
	}

	private JTextField createTextField() {
		JTextField textField = new JTextField();
		return textField;
	}
	

}
