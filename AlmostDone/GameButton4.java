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
 * Write a description of class GameButton2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameButton4 extends JButton implements ActionListener
{
    private SampleMenuScreen frame;
   

    public GameButton4(String str)
    {
        super(str);
        addActionListener(this);
    }

    

    public void actionPerformed(ActionEvent e)
    {
        frame= new SampleMenuScreen();
        frame.display();
        
        SourceFrame.frame.dispose();
    }
}

