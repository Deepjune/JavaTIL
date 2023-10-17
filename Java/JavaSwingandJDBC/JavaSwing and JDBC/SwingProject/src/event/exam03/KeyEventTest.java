package event.exam03;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventTest extends JFrame implements KeyListener {
  public KeyEventTest(){
    setTitle("인벤트 예쩨");
    setSize(300, 200);
    JTextField txt = new JTextField(20);
    txt.addKeyListener(this);
    add(txt);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  @Override
  public void keyTyped(KeyEvent e) {
    display(e, "KeyTyped");
  }

  @Override
  public void keyPressed(KeyEvent e) {
    display(e, "KeyPressed");
  }

  @Override
  public void keyReleased(KeyEvent e) {
    display(e, "Key Released");
  }

  protected  void display(KeyEvent e, String s) {
    char c = e.getKeyChar();
    int keyCode = e.getKeyCode();
    String modifiers = e.isAltDown() + " "+ e.isControlDown() + " " + e.isShiftDown();
    System.out.println(s +" "+c+" "+keyCode+" "+modifiers);
  }

  public static void main(String[] args) {
    KeyEventTest f = new KeyEventTest();
  }
}
