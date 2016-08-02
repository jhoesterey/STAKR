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
public class InstructionPanel extends JPanel
{
    private GameButton6 button;
    /**
     * Constructor for objects of class Leaderboard
     */
    public InstructionPanel()
    {
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public void paintComponent(Graphics g)
    {
        
        super.paintComponent(g);

        //adds instruction text to panel
        g.setFont(new Font("TimesRoman", Font.PLAIN, 36));
        g.setColor(Color.BLACK);
        g.drawString("Instructions:" ,500, 75);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 28));
        g.drawString("The goal of STAKR is to keep stacking the blocks to build as big a tower as possible. To start you will be " , 5, 145);
        g.drawString("given a base, and a moving block of the same size as that base. When you press the spacebar, the moving  " , 5, 185);
        g.drawString("stop moving and drop onto the base. If your block drops perfectly onto the base, you will receive 5 points," , 5, 225);
        g.drawString("and otherwise you will get 1. If your drop is not perfect, the portion of the block which misses the base " , 5, 265);
        g.drawString("will be cut off, and the new base will consist of the overlap you created by stopping the moving block." , 5, 305);
        g.drawString("You will keep on doing this until the moving block completely misses the base." , 5, 345);
        g.drawString("Good luck and get Stacking!" , 450, 455);
        
        //creates button that will take user back to menu
        button= new GameButton6("Go Back to the Menu");
        
        //set color and position for button
        button.setBackground(Color.GREEN);
        button.setBounds(455, 600, 300, 100);
        button.setOpaque(true);
        button.setBorderPainted(false);
        //adds back to menu button to panel
        add(button);

        
    } 

}
