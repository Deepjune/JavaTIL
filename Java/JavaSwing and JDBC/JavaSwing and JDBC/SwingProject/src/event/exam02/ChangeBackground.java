package event.exam02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeBackground extends JFrame {
  private JButton button1;
  private JButton button2;
  private JPanel panel;
  MyListener m = new MyListener();

  public ChangeBackground() {
    setSize(300, 200);
    setTitle("이벤트 예제");
    panel = new JPanel();

    button1 = new JButton("노란색");
    button1.addActionListener(m);

    button2 = new JButton("핑크색");
    button2.addActionListener(m);

    panel.add(button1);
    panel.add(button2);
    add(panel);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  private class MyListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
      if(e.getSource() == button1){
        panel.setBackground(Color.YELLOW);
      } else if(e.getSource() == button2){
        panel.setBackground(Color.PINK);
      }
    }
  }

  public static void main(String[] args) {
    ChangeBackground c = new ChangeBackground();
  }
}
