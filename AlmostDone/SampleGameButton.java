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
 * Creates game button for easy level
 */
public class SampleGameButton extends JButton implements ActionListener
{
    private SampleGameFrame frame;
    private Clip clip;
    public SampleGameButton(String str)
    {
        super(str);
        addActionListener(this);

    }

    
    public void actionPerformed(ActionEvent e)
    {
        frame = new SampleGameFrame();
        frame.display();
 
        
        SampleMenuScreen.frame.dispose();

    }
    
}
