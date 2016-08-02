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
public class SourcePanel extends JPanel
{
    private GameButton4 button;
    /**
     * Constructor for objects of class Leaderboard
     */
    public SourcePanel()
    {
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public void paintComponent(Graphics g)
    {
        
        super.paintComponent(g);

        
        g.setFont(new Font("TimesRoman", Font.PLAIN, 36));
        g.setColor(Color.BLACK);
        g.drawString("Sources:" ,500, 100);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 28));
        g.drawString("https://www.youtube.com/watch?v=ViTYnKiH5S8" , 200, 145);
        g.drawString("https://www.youtube.com/watch?v=WJRoRt155mA" , 200, 190);
        g.drawString("https://www.youtube.com/watch?v=qKggnBh2Mdw" , 200, 235);
        g.drawString("http://firebornform.deviantart.com/art/Hell-Surfacing-Background-352588830" , 200, 280);


        button= new GameButton4("Go Back to the Menu");
        
        button.setBackground(Color.GREEN);
        button.setBounds(455, 600, 300, 100);
        button.setOpaque(true);
        button.setBorderPainted(false);
        add(button);

        
    } 

}

