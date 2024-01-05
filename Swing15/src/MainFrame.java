import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class MainFrame {
	private JFrame frame;
	private JPanel panel;
	private JCheckBox checkBox;
	
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
		
		Font f = new Font("sans-serif", Font.PLAIN, 24);
		UIManager.put("CheckBox.font", f);
		
		panel = new JPanel();
		checkBox = new JCheckBox();
		checkBox.setText("Checkbox");
		System.out.println(checkBox.getText());
		checkBox.setMnemonic(KeyEvent.VK_C);
		
		panel.add(checkBox);
		frame.add(panel);
		
		this.frame.setVisible(true);
		
	}
}
