
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class GameButton2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SourceButton extends JButton implements ActionListener
{
    private SourceFrame frame;
    
    public SourceButton(String str)
    {
        super(str);
        addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        frame= new SourceFrame();
        frame.display();
        
        SampleMenuScreen.frame.dispose();
    }
}
