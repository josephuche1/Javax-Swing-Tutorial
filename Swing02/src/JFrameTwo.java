import javax.swing.JFrame;

public class JFrameTwo {
    private JFrame frame;
    
    public JFrameTwo() {
    	initialize();
    }
    
    private void initialize() {
    	frame = new JFrame();
		this.frame.setTitle("JFrameTwo"); // set title of frame
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // set behavior when the user tries to close the app
		this.frame.setSize(500, 400); // set the size of the JFrame
		this.frame.setVisible(true); // set the visibility of the  JFrame
		this.frame.setLocationRelativeTo(null); // Set the location of the JFrame. setting this to null centers it
		this.frame.setResizable(false);
    }
}
