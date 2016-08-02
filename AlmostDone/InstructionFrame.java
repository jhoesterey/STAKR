
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
/**
 * sets up instruction frame
 */
public class InstructionFrame extends JFrame
{
    
    public static JFrame frame;
    JLabel label;
    private InstructionPanel panel;
   

    /**
     * Constructor for objects of class GameFrame2
     */
    public InstructionFrame()
    {
        frame= new JFrame("Instructions");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        panel= new InstructionPanel();
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