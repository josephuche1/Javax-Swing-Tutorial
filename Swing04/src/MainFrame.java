import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
		this.frame.setLayout(new BorderLayout(5, 5));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.add(new JButton("NORTH"));
		frame.add(panel, BorderLayout.NORTH);
		
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.RED);
		panel2.add(new JButton("SOUTH"));
		this.frame.add(panel2, BorderLayout.SOUTH);
		
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.YELLOW);
		panel3.add(new JButton("WEST"));
		this.frame.add(panel3, BorderLayout.WEST);
		
		
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.GREEN);
		panel4.add(new JButton("EAST"));
		this.frame.add(panel4, BorderLayout.EAST);
		
		JPanel panel5 = new JPanel();
		panel5.setBackground(Color.PINK);
		panel5.add(new JButton("CENTER"));
		this.frame.add(panel5, BorderLayout.CENTER);
		
		this.frame.setVisible(true);
		
	}
}
