import javax.swing.SwingUtilities;

public class JFramDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public  void run() {
				JFrameOne main1 = new JFrameOne();
				JFrameTwo main2 = new JFrameTwo();
			}
		});

	}

}
