import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.util.Random;
import javax.sound.sampled.*;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.URI;

/**
 * Creates button to take user back to menu from instruction frame
 */
public class GameButton6 extends JButton implements ActionListener
{
    private SampleMenuScreen frame;
    
    public GameButton6(String str)
    {
        super(str);
        
        addActionListener(this);
    }

    

    public void actionPerformed(ActionEvent e)
    {
        frame= new SampleMenuScreen();
        frame.display();
        
        InstructionFrame.frame.dispose();
        
        
        
        
    }
}
