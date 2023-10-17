package event.exam01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest4 extends JFrame {
  private  JButton button;
  private JLabel label;
  int counter = 0;

  public EventTest4() {
    setSize(400, 150);
    setTitle("이벤트 예제");

    JPanel panel = new JPanel();
    button = new JButton("증가");
    label = new JLabel("현재의 카운터값: "+counter);

    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        counter++;
        label.setText("현재의 카운터값: "+counter);
      }
    });
    panel.add(label);
    panel.add(button);
    add(panel);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    EventTest4 e = new EventTest4();
  }
}
