package event.exam03;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MoveCar02 extends JFrame{
    int img_x = 150;
    int img_y = 150;
    JButton button;

    public MoveCar02() {
        setSize(600,300);
        button = new JButton("");
        ImageIcon icon = new ImageIcon("car.png");

        button.setIcon(icon);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        button.setLocation(img_x, img_y);
        button.setSize(200, 100);
        panel.add(button);
        panel.requestFocus();
        panel.setFocusable(true);

        panel.addMouseListener(new MouseListener() {
            @Override
            public void mousePressed(MouseEvent e) {
                img_x = e.getX();
                img_y = e.getY();
                button.setLocation(img_x,img_y);
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

           @Override
           public void mouseClicked(MouseEvent e){}
        });

        add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MoveCar02 f = new MoveCar02();
    }
}
