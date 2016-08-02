import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Creates new game frame
 */
public class SampleGameFrame extends JFrame 
{
    public static JFrame frame;
    private SampleGamePanel panel;

    public SampleGameFrame()
    {
        frame = new JFrame("STAKR");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new SampleGamePanel(300, 300, 300, 300);
        panel.setPreferredSize(new Dimension(1200,1200));
        panel.setScore();

        panel.setBackground(Color.DARK_GRAY);

        frame.getContentPane().add(panel);
        
        
    }


    public void display()
    {
        frame.pack();
        frame.setVisible(true);
    }
    
    
}
