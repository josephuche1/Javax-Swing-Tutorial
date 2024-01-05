import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class MainFrame {
	private JFrame frame;
	private JLabel label;
	private JPasswordField passwordField;
	private JButton button;
	
	public MainFrame() {
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();
		this.frame.setTitle("JPassword");
		this.frame.setSize(800, 500);
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setLocationRelativeTo(null);
		this.frame.setLayout(new BorderLayout());
		
		FlowLayout layout = new FlowLayout();
		layout.setAlignment(FlowLayout.LEFT);
		layout.setHgap(10);
		layout.setVgap(10);
		
		frame.setLayout(layout);
		
		label = new JLabel("Enter Password: ");
		passwordField = new JPasswordField(10);
		button = new JButton("Check");
		
		passwordField.setText("Mwahahaha");
		passwordField.setEchoChar('#');
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				char[] pf = passwordField.getPassword();
				String value = new String(pf);
				System.out.println("Password: "+value);
			}
		});
		
		frame.add(label);
		frame.add(passwordField);
		frame.add(button);
		
		
		this.frame.setVisible(true);
		
	}
}
