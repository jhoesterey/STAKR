import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.io.*;
import javax.imageio.*;
/**
 * creates sampleMenu Panel
 */
public class SampleMenuPanel extends JPanel
{
    //sets up all buttons that will be on menu
    private SampleGameButton button;
    private GameButton2 button2;
    private InstructionButton button3;
    private HardGameButton button4;
    private SourceButton button5;
    private GameButton9 button6;
    private Image img;

    public SampleMenuPanel()
    {
        setLayout(null);
        //sets desired background color for menu
        setBackground(Color.DARK_GRAY);
        
        //creates text and species location for buttons
        button= new SampleGameButton("Easy Stacking!");
        button.setBounds(295,160,300,150);

        button2= new GameButton2("Easy Leaderboard");
        button2.setBounds(295,560,300,150);
        
        button6= new GameButton9("Hard Leaderboard");
        button6.setBounds(605,560,300,150);
        
        
        button3= new InstructionButton("Instructions");
        button3.setBounds(295,360,300,150);
        
        button4= new HardGameButton("Hard Stacking!");
        button4.setBounds(605,160, 300,150);
        
        button5= new SourceButton("Sources");
        button5.setBounds(605, 360, 300,150);

        button.setBackground(Color.GREEN);
        button.setOpaque(true);
        button.setBorderPainted(false);
        
        button5.setBackground(Color.GREEN);
        button5.setOpaque(true);
        button5.setBorderPainted(false);
        
        button4.setBackground(Color.GREEN);
        button4.setOpaque(true);
        button4.setBorderPainted(false);
        
        button2.setBackground(Color.GREEN);
        button2.setOpaque(true);
        button2.setBorderPainted(false);
        
        button6.setBackground(Color.GREEN);
        button6.setOpaque(true);
        button6.setBorderPainted(false);
        
        button3.setBackground(Color.GREEN);
        button3.setOpaque(true);
        button3.setBorderPainted(false);
        
        //adds buttons to menuPanel
        add(button);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);

    }
    
    public void paintComponent(Graphics g)
    {
        //adds our dope logo to the top of the menu
        img = new ImageIcon("/Users/jackhoesterey/Desktop/STAKR FINAL/Images/STAKR LOGO.png").getImage();
        Graphics2D g26 = (Graphics2D) g;
        g26.drawImage(img,360,-150,null);
    }

}

