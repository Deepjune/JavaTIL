package basic.exam01;

import javax.swing.*;
import java.awt.*;

public class MyFrame02 extends JFrame{
	public MyFrame02() {
		setSize(300, 200);
		setTitle("MyFrame");
		
		setLayout(new FlowLayout());
		JButton button = new JButton("버튼");
		add(button);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		MyFrame02 f = new MyFrame02();

	}

}
