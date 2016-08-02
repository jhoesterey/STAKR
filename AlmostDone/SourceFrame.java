
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
/**
 * Write a description of class GameFrame2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SourceFrame extends JFrame
{
    // instance variables - replace the example below with your own
    public static JFrame frame;
    JLabel label;
    private SourcePanel panel;
   

    /**
     * Constructor for objects of class GameFrame2
     */
    public SourceFrame()
    {
        frame= new JFrame("Sources");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        panel = new SourcePanel();
        panel.setPreferredSize(new Dimension(1200,1200));
        panel.setBackground(Color.WHITE);
        frame.getContentPane().add(panel);
        
    }
    

    public void display()
    {
        frame.pack();
        frame.setVisible(true);
    }
    
    
}
