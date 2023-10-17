package event.exam02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KeyPad extends JFrame implements ActionListener {
  private JTextField txt;
  private JPanel panel;

  public KeyPad() {
    txt = new JTextField();
    add(txt, BorderLayout.NORTH);
    panel = new JPanel();
    panel.setLayout(new GridLayout(3,3));
    add(panel, BorderLayout.CENTER);
    for(int i = 1; i <= 9; i++) {
      JButton bnt = new JButton("" + i);
      bnt.addActionListener(this);
      bnt.setPreferredSize(new Dimension(100,30));
      panel.add(bnt);
    }
      pack();
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);

  }
  public void actionPerformed(ActionEvent e) {
    String actionCommand = e.getActionCommand();
    txt.setText(txt.getText()+ actionCommand);
  }
  public static void main(String[] args) {
    KeyPad f = new KeyPad();
  }
}
