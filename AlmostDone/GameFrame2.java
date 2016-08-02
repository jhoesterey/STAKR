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
public class GameFrame2 extends JFrame
{
    // instance variables - replace the example below with your own
    public static JFrame frame;
    JLabel label;
    private LeaderboardPanel panel;

    /**
     * Constructor for objects of class GameFrame2
     */
    public GameFrame2()
    {
        frame= new JFrame("Highscore");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.WHITE);
        
        panel = new LeaderboardPanel();
        panel.setPreferredSize(new Dimension(1200,1200));
        frame.getContentPane().add(panel);
        
    }
    

    public void display()
    {
        frame.pack();
        frame.setVisible(true);
    }
    
    
}
