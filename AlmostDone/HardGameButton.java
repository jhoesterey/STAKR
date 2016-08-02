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
 * Creates button for hard game mode
 */
public class HardGameButton extends JButton implements ActionListener
{
    private HardGameFrame frame;
    private Clip clip;
    public HardGameButton(String str)
    {
        super(str);
        addActionListener(this);

    }


    
    public void actionPerformed(ActionEvent e)
    {
        frame = new HardGameFrame();
        frame.display();
     
        SampleMenuScreen.frame.dispose();
    }
}