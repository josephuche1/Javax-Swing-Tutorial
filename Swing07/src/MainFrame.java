import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MainFrame {
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	
	
	public MainFrame() {
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();
		this.frame.setTitle("Learning JButton");
		this.frame.setSize(800, 500);
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setLocationRelativeTo(null);
		this.frame.setLayout(new BorderLayout());
		this.frame.setLayout(new BorderLayout(5,5));
		
		panel = new JPanel();
		frame.add(panel, BorderLayout.CENTER);
		button = createButton("new button");
		panel.add(button);
		
		
		
		this.frame.setVisible(true);
		
	}
	
	private JButton createButton(String buttonName) {
		JButton button =  new JButton(buttonName);
		button.setFocusable(false);
		
		ImageIcon newIcon = new ImageIcon("images.png");
		button.setIcon(newIcon);
		button.setIconTextGap(10);
		
		button.setMnemonic(KeyEvent.VK_N);
		button.setToolTipText("Press Alt + p");
		
		button.setFont(new Font("Arial", Font.PLAIN, 24));
		button.setMargin(new Insets(10, 10, 10, 10));
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("new button");
			}
		});
		
		button.setEnabled(true);
		button.doClick();
//		button.setVerticalTextPosition(SwingConstants.BOTTOM);
//		button.setVerticalTextPosition(SwingConstants.CENTER);
		button.setHorizontalTextPosition(SwingConstants.LEFT);
		button.setVerticalTextPosition(SwingConstants.CENTER);
		
		button.setPreferredSize(new Dimension(200, 75));
		return button;
	}
}
