/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author ld_si
 */
import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
  private static Point point = new Point();

  public static void main(String[] args) {
    final JFrame frame = new JFrame();
    frame.setUndecorated(true);
    JButton button = new JButton("Close Me");
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });

    frame.addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        point.x = e.getX();
        point.y = e.getY();
      }
    });
    frame.addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent e) {
        Point p = frame.getLocation();
        frame.setLocation(p.x + e.getX() - point.x, p.y + e.getY() - point.y);
      }
    });

    frame.setSize(300, 300);
    frame.setLocation(200, 200);
    frame.setLayout(new BorderLayout());

    frame.getContentPane().add(button, BorderLayout.NORTH);
    frame.getContentPane().add(new JLabel("Drag Me", JLabel.CENTER), BorderLayout.CENTER);
    frame.setVisible(true);
  }
}

