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
public class hGameFrame2 extends JFrame
{
    // instance variables - replace the example below with your own
    public static JFrame frame;
    JLabel label;
    private hLeaderboardPanel panel;

    /**
     * Constructor for objects of class GameFrame2
     */
    public hGameFrame2()
    {
        frame= new JFrame("Hard Highscore");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.WHITE);
        
        panel = new hLeaderboardPanel();
        panel.setPreferredSize(new Dimension(1200,1200));
        frame.getContentPane().add(panel);
        
    }
    

    public void display()
    {
        frame.pack();
        frame.setVisible(true);
    }
    
    
}
