import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame{
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JTextField textField;
	private JButton button;
	
	public MainFrame() {
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();
		this.frame.setTitle("Nimbus Look and Feel");
		this.frame.setSize(800, 500);
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setLocationRelativeTo(null);
		this.frame.setLayout(new BorderLayout());
		
		panel = new JPanel();
		label = new JLabel("Enter your name: ");
		textField = new JTextField(20);
		button = new JButton("Save");
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Submitted");
				System.out.println("Name: "+textField.getText());
			}
		});
		
		panel.add(label);
		panel.add(textField);
		panel.add(button);
		
		
		frame.add(panel, BorderLayout.CENTER);
		
		this.frame.setVisible(true);
		
	}

}
