import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame {
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JButton button;
	
	public MainFrame() {
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();
		this.frame.setTitle("Learning JLabel");
		this.frame.setSize(800, 500);
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setLocationRelativeTo(null);
		
		panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
		panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		panel.setBackground(Color.GRAY);
		frame.add(panel, BorderLayout.NORTH);
		
		label = new JLabel("My label");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Sans-serif", Font.BOLD, 20));
		panel.add(label);
		
		button = new JButton("Update Label");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("<html>My Cool App <br> Buy It</html>");
			}
		});
		
		frame.add(button, BorderLayout.SOUTH);
		
		
		this.frame.setVisible(true);
		
	}
}
