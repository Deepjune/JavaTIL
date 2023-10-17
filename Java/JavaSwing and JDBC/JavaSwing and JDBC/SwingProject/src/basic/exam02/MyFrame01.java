package basic.exam02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame01 extends JFrame {
	public MyFrame01() {
		setTitle("FlowLayoutTest");
		setSize(300, 150);
		
		setLayout(new FlowLayout());
		
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("Button4"));
		add(new JButton("Button5"));
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		MyFrame01 f = new MyFrame01();

	}

}
