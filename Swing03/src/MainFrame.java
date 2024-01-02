import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame {
	private JFrame frame;
	
	public MainFrame() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		this.frame.setLayout(new BorderLayout(10, 5));
		this.frame.setTitle("Java Swing JPanel demo");
		this.frame.setSize(800, 500);
		this.frame.setLocationRelativeTo(null);
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
		
		frame.add(panel, BorderLayout.CENTER);
		panel.setBackground(Color.RED);
		
		Button button = new Button("button");
		panel.add(button);
		
		Button button2 = new Button("button2");
		panel.add(button2);
		
		Button button3 = new Button("button3");
		panel.add(button3);
		
		panel.setPreferredSize(new Dimension(250, 250));
		
		this.frame.setVisible(true);
	}

}
