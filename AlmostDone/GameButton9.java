import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class GameButton2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameButton9 extends JButton implements ActionListener
{
    private hGameFrame2 frame;
    
    public GameButton9(String str)
    {
        super(str);
        addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        frame= new hGameFrame2();
        frame.display();
        
        SampleMenuScreen.frame.dispose();
    }
}