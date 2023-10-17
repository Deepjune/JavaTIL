package event.exam01;

import org.w3c.dom.events.Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyListener implements ActionListener {
  EventTest2 e2;
  JButton button;
  public MyListener(EventTest2 e) {
    e2 = e;
  }
  public void actionPerformed(ActionEvent e){
    button = (JButton) e.getSource();
    System.out.println(button.getText());
    if(button.getText().equals("증가")) {
      e2.setCounter(e2.getCounter() + 1);
      e2.getLabel().setText("현재의 카운터값 : "+e2.getCounter());
    }

    if(button.getText().equals("초기화")) {
      e2.setCounter(0);
      System.out.println(e2.getCounter());
      e2.getLabel().setText("현재의 카운터값 : "+e2.getCounter());
    }
  }
}

public class EventTest2 extends JFrame{
  private JButton button;
  private  JButton button2;
  private JLabel label;
  private int counter = 0;

  public EventTest2() {
    setSize(400, 150);
    setTitle("이벤트 예제");
    setLayout(new FlowLayout());
    button = new JButton("증가");
    button2 = new JButton("초기화");
    label = new JLabel("현재의 카운터값 : "+ counter);

    button.addActionListener(new MyListener(this));
    add(label, "Center");
    add(button, "East");
    add(button2, "East");
    setVisible(true);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    EventTest2 e2 = new EventTest2();
  }

  public JButton getButton() {
    return button;
  }

  public void setButton(JButton button) {
    this.button = button;
  }

  public JLabel getLabel() {
    return label;
  }

  public void setLabel(JLabel label) {
    this.label = label;
  }

  public int getCounter() {
    return counter;
  }

  public void setCounter(int counter) {
    this.counter = counter;
  }
}