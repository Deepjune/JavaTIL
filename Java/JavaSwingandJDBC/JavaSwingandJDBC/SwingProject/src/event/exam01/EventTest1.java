package event.exam01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest1 extends JFrame {
  private JButton button;
  private JButton button2;
  private JLabel label;
  int count = 0;

  public EventTest1() {
    setSize(400, 150);
    setTitle("이벤트 예제");
    setLayout(new FlowLayout());
    button = new JButton("증가");
    button2 = new JButton("초기화");
    label = new JLabel("현재의 카운터값: "+count);

    button.addActionListener(new MyListener());
    add(label, "Center");
    add(button, "East");
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  class MyListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        count++;
        label.setText("현재의 카운터값:"+count);

    }
  }

  public static void main(String[] args) {
    EventTest1 e = new EventTest1();
  }
}
