import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Creates a new instruction frame
 */
public class InstructionButton extends JButton implements ActionListener
{
    private InstructionFrame frame;
    
    public InstructionButton(String str)
    {
        super(str);
        addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        frame= new InstructionFrame();
        frame.display();
        SampleMenuScreen.frame.dispose();
    }
}

