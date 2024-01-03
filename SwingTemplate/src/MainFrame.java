import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame {
	private JFrame frame;
	
	public MainFrame() {
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();
		this.frame.setTitle("Learning Border Layout");
		this.frame.setSize(800, 500);
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setLocationRelativeTo(null);
		this.frame.setLayout(new BorderLayout());
		
		this.frame.setVisible(true);
		
	}
}
