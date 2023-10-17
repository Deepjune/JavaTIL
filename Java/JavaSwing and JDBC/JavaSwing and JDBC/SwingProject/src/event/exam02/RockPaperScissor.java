package event.exam02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RockPaperScissor extends JFrame implements ActionListener {
  final int SCISSOR = 0;
  final int ROCK = 1;
  final int PAPER = 2;

  private  JPanel panel;
  private JLabel output, information;
  private JButton rock, paper, scissor;

  public RockPaperScissor() {
    setTitle("가위, 바위, 보");
    setSize(400, 150);

    panel = new JPanel();
    panel.setLayout(new GridLayout());

    information = new JLabel("아래의 버튼 중에서 하나를 클릭하시오!");
    output = new JLabel("Good Luck!");

    rock = new JButton("0: 바위");
    paper = new JButton("1: 보");
    scissor = new JButton("2: 가위");
    rock.addActionListener(this);
    paper.addActionListener(this);
    scissor.addActionListener(this);

    panel.add(rock);
    panel.add(paper);
    panel.add(scissor);

    add(information, BorderLayout.NORTH);
    add(panel, BorderLayout.CENTER);
    add(output, BorderLayout.SOUTH);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
  public void actionPerformed(ActionEvent e){
    JButton b = (JButton) e.getSource();
    int user = Integer.parseInt(""+b.getText().charAt(0));
    Random random = new Random();
    int computer = random.nextInt(3);
    if(user == computer){
      output.setText("인간과 컴퓨터가 비겼음");
    } else if(user == (computer + 1) % 3) {
      output.setText("인간: "+user+" 컴퓨터: "+computer+" 인간 승리");
    } else {
      output.setText("인간: "+user+" 컴퓨터: "+computer+" 컴퓨터 승리");
    }
  }

  public static void main(String[] args) {
    RockPaperScissor r = new RockPaperScissor();
  }
}
