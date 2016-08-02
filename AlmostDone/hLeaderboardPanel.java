import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
/**
 * Write a description of class Leaderboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hLeaderboardPanel extends JPanel
{
    private hLeaderboard l;
    private GameButton8 button;
    /**
     * Constructor for objects of class Leaderboard
     */
    public hLeaderboardPanel()
    {
        l= new hLeaderboard();
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }
    
    int score = HardGamePanel.getScore();

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
       
        
        //l.loadScores();
        //l.addScore(score);
        //l.writeScores();
        l.display();
       g.setFont(new Font("TimesRoman", Font.PLAIN, 69));
        g.drawString(l.display() ,350, 300);
        
        //creates button that will take user back to menu
        button= new GameButton8("Go Back to the Menu");
        
        //set color and position for button
        button.setBackground(Color.GREEN);
        button.setBounds(455, 600, 300, 100);
        button.setOpaque(true);
        button.setBorderPainted(false);
        //adds back to menu button to panel
        add(button);
    } 
    
    
}
