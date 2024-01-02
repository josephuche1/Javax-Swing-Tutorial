import javax.swing.JFrame;

public class JFrameOne extends JFrame{
	public JFrameOne() {
		initialize();
	}
	
	public void initialize() {
		setTitle("JFrameOne"); // set title of frame
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // set behavior when the user tries to close the app
		setSize(500, 400); // set the size of the JFrame
		setVisible(true); // set the visibility of the  JFrame
		setLocationRelativeTo(null); // Set the location of the JFrame. setting this to null centers it
		setResizable(false);
	}
}
