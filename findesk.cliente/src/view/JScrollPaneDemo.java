package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

/**
 * A complete Java class to demonstrate the use of a JScrollPane.
 * 
 * @author alvin alexander, devdaily.com.
 *
 */
public class JScrollPaneDemo
{
  public static void main(String[] args)
  {
    new JScrollPaneDemo();
  }
  
  public JScrollPaneDemo()
  {
    SwingUtilities.invokeLater(new Runnable()
    {
      public void run()
      {
        // create a jtextarea
        JTextArea textArea = new JTextArea();
        
        // add text to it; we want to make it scroll
        textArea.setText("xx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\fff\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nfffffffffffffffnxx\nxx\nxx\nxx\nxx\n");
        
        // create a scrollpane, givin it the textarea as a constructor argument
        JScrollPane scrollPane = new JScrollPane(textArea);

        // now add the scrollpane to the jframe's content pane, specifically
        // placing it in the center of the jframe's borderlayout
        JFrame frame = new JFrame("JScrollPane Test");
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        // make it easy to close the application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set the frame size (you'll usually want to call frame.pack())
        frame.setSize(new Dimension(240, 180));
        
        // center the frame
        frame.setLocationRelativeTo(null);
        
        // make it visible to the user
        frame.setVisible(true);
      }
    });
  }
}