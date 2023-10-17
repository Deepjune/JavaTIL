package event.exam01;

import javax.swing.*;

public class EventTest5 extends JFrame {
  private JButton button;
  private JButton button2;
  private JLabel label;
  int counter = 0;
  public EventTest5() {
    setSize(400, 150);
    setTitle("이벤트 예제");
    JPanel panel = new JPanel();
    button = new JButton("증가");
    button2 = new JButton("초기화");
    label = new JLabel("현재의 카운터값: "+counter);

    button.addActionListener(e -> {
      counter++;
      label.setText("현재의 카운터값: "+counter);
    });
    button2.addActionListener(e->{
      counter = 0;
      label.setText("현재의 카운터값: "+counter);
    });
    panel.add(label);
    panel.add(button);
    panel.add(button2);
    add(panel);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

  }
  public static void main(String[] args) {
    EventTest5 e = new EventTest5();
  }
}
