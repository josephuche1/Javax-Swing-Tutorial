import java.awt.GridLayout;

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
		this.frame.setTitle("Learn GridLayout");
		this.frame.setSize(800, 500);
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setLocationRelativeTo(null);
		panel = new JPanel(new GridLayout(4, 5, 10,10));
		
		for(int i = 1; i <= 20; i++) {
			JButton button = new JButton("Button "+i);
			panel.add(button);
		}
		
		this.frame.add(panel);
		this.frame.pack();
		this.frame.setVisible(true);
		
	}
}
