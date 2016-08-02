import javax.swing.*;
import java.awt.*;
/**
 * Sets up menu screen
 *
 */
public class SampleMenuScreen extends JFrame
{
    public static JFrame frame;
    private SampleMenuPanel panel;
    
    public SampleMenuScreen()
    {
        frame = new JFrame("STAKR");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new SampleMenuPanel();
        panel.setPreferredSize(new Dimension(1200,1200));
        
        frame.getContentPane().add(panel);
    }
    
    public void display()
    {
        frame.pack();
        frame.setVisible(true);
    }
    
}
