import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class GameButton2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameButton2 extends JButton implements ActionListener
{
    private GameFrame2 frame;
    
    public GameButton2(String str)
    {
        super(str);
        addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        frame= new GameFrame2();
        frame.display();
        
        SampleMenuScreen.frame.dispose();
    }
}
