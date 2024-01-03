import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame {
	private JFrame frame;
	private JPanel panel;
	
	public MainFrame() {
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();
		panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10,5));
		this.panel.setBackground(Color.PINK);
		
		for(int i = 0; i < 5; i++) {
			JButton button = new JButton("Button"+i);
			this.panel.add(button);
		}
		
		this.frame.setTitle("Learning Flow Layout");
		this.frame.setSize(800, 500);
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setLocationRelativeTo(null);
		this.frame.setLayout(new BorderLayout());
		
		this.frame.add(panel, BorderLayout.NORTH);
		
		this.frame.setVisible(true);
		
	}
}
