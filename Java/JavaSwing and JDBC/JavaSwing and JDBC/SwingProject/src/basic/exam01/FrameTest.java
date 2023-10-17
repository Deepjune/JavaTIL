package basic.exam01;

import javax.swing.JFrame;

public class FrameTest extends JFrame {
	public static void main(String[] args) {
		JFrame f = new JFrame("Frame Test");
		
		f.setTitle("My Frame");
		f.setSize(300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
