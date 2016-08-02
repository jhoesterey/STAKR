import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * sets up hardgameframe
 */
public class HardGameFrame extends JFrame 
{
    public static JFrame frame;
    private HardGamePanel panel;

    public HardGameFrame()
    {
        frame = new JFrame("STAKR");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new HardGamePanel(250, 250, 250, 250);
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
