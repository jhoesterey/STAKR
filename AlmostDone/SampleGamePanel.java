import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.util.Random;
import javax.sound.sampled.*;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.URI;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

/**
 * Creates Game panel for easy level
 */
public class SampleGamePanel extends JPanel implements ActionListener, KeyListener
{
    private int locx=440;
    private int locy=270;
    private double changeX= 1.5;
    private double changeY=0;
    private Timer time = new Timer(5,this);
    private int ysize;
    private int xsize;

    private int locx2=0;
    private int locy2=270;
    private double changeX2= 1.5;
    private double changeY2= 0;
    private int ysize2;
    private int xsize2;

    private int xspot;
    private int yspot;

    // Lines 38- 40 Generates RGB values for color
    int red = (int)(Math.random() * 256);
    int green = (int)(Math.random() * 256);
    int blue = (int)(Math.random() * 256);

    //lines 43-47 set up instance variables for the start of the game settings
    int turn = 1;
    static int Score= 0;
    int perfectScore = 0;
    private double speed= 2;
    boolean GameOver=false;

    //Creates new audio clip which will be used to play background music in playMusic();
    private Clip clip;

    //Creates new image which will be used as game background
    private Image img;

    //instance varibles that will later be used to control current status of music (muted or paused)
    private boolean paused= false;
    private boolean isPlaying1=false;
    private boolean isPlaying2=false;
    private GameButton3 button;
    private boolean mute;
    private int m=0;

    public SampleGamePanel(int x, int y, int x2, int y2)
    {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        xsize=x;
        ysize=y;
        xsize2=x2;
        ysize2=y2;

    }
    // draw the panel
    public void paintComponent(Graphics g)
    {

        //Makes Background black
        super.paintComponent(g);

        //sets background to image
        img = new ImageIcon("/Users/jackhoesterey/Desktop/STAKR FINAL/Images/construction_site.jpg").getImage();
        Graphics2D g26 = (Graphics2D) g;
        g26.drawImage(img,0,0,null);

        //sets base to specified green value
        Color sColor = new Color(255, 204, 0);
        g.setColor(sColor);
        g.fillRect(locx, locy, xsize, ysize);

        //Makes Moving panel specified transparency
        int alpha = 225; 
        Color color = new Color(red, green, blue, alpha);  

        //makes moving panel specific color
        g.setColor(color); 
        g.fillRect(locx2, locy2, xsize2, ysize2);

        //reset color back to black
        g.setColor(Color.black);

        //displays player score
        String score= " " + Score;
        g.setColor(Color.white);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 28));
        g.drawString("Score: " + Score, 800, 30);

        //displays player perfect score count
        String perfectscore= " " + perfectScore;
        g.setColor(Color.WHITE);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 28));
        g.drawString("Perfect Move Counter: " + perfectScore, 100, 30);

        time.start();

        //gives game over stats and options + ability to go back to the menu
        if(GameOver==true)
        {
            g.setColor(Color.WHITE);
            g.setFont(new Font("TimesRoman", Font.PLAIN, 38));
            g.drawString("Game Over: Your Score is:" + Score, 400, 300);
            button= new GameButton3("Go Back to the Menu");
            button.setBounds(475,400,300,300);
            button.setBackground(Color.YELLOW);
            button.setOpaque(true);
            button.setBorderPainted(false);
            add(button);
            Leaderboard.writeScores();
            stopMusic();

        }
        //sets settings to un-pause game
        if (paused && !GameOver)
        {
            g.setColor(Color.white);
            g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
            g.drawString("PAUSED", 500, 400);
            g.drawString("Press P to resume", 420, 475);
            changeX2=0;
            changeY2=0;

        }
        //sets settings and options to pause game
        if(!paused && !GameOver)
        {
            g.setColor(Color.white);
            changeX2= changeX;
            changeY2= changeY;
            g.drawString("Press P to pause", 775, 80);

        }
        //makes sure music if music is not playing to start it, as well as make sure that it doesn't start music when already playing
        if(turn==1 && !isPlaying1)
        {
            playMusic();
            isPlaying1=true;
        }
        //sets up settings for mute
        if(mute && !GameOver)
        {
            g.drawString("M to Unmute", 775, 120);
        }
        else if(!mute && !GameOver)
        {
            g.drawString("M to Mute", 775, 120);
        }
        //sets up settings after mute has been initiated
        if(mute && m==0)
        {
            stopMusic();
            m=1;
        }
        //sets settings for when mute is not active
        if(!mute && m==1)
        {
            playMusic();
            m=0;
        }
    }
    //allows score to be used in leaderboard
    public static int getScore()
    {
        return Score;
    }
    //allows for music to be played
    public void playMusic()
    {
        try
        {
            //sets up new file from specified path
            File file = new File("/Users/jackhoesterey/Desktop/STAKR FINAL/Audio/HardLevelMusic.wav");
            //converts file to URI
            URI uri = file.toURI();
            //converts URI to URL 
            URL url = uri.toURL();
            //sets up clip
            clip = AudioSystem.getClip();
            //gets audio from url (file)
            AudioInputStream ais = AudioSystem.getAudioInputStream(url);
            clip.open(ais);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        }
        catch(Exception e)
        {
            //notifies user when music file can not be found
            System.out.print("NO MUZIC FOUND");
        }
    }
    //stops music
    public void stopMusic()
    {
        clip.stop();
    }

    public void actionPerformed(ActionEvent e)
    {
        if (locx2>1200-xsize)
        {
            changeX2= -changeX2;
            changeX= -changeX;
        }
        if (locx2<-1)
        {
            changeX2= -changeX2;
            changeX= -changeX;
        }
        if (locy2>800-ysize)
        {
            changeY2= -changeY2;
            changeY= -changeY;
        }
        if (locy2<-1)
        {
            changeY2= -changeY2;
            changeY= -changeY;
        }
        locx2 += changeX2;
        locy2 += changeY2;
        repaint();
    }

    public void keyPressed(KeyEvent e)
    {
        int c= e.getKeyCode();

        if(c== KeyEvent.VK_SPACE)
        {
            //resets start point for moving tile
            changeX2=0;
            changeY2=0;
            
            //makes new moving block size overlap from previous turn
            xsize-= Math.abs(locx-locx2);
            ysize-=Math.abs(locy-locy2);
            xsize2-=Math.abs(locx-locx2);
            ysize2-=Math.abs(locy-locy2);

            if(xsize>0)
            {
                if (locx == locx2 && locy==locy2)
                {
                    Score+=5;
                    perfectScore++;
                }
                else
                {
                    Score++;
                }
            }
            if(turn%2==0)
            {
                //sets start xcoordinate (all the way left)
                locx2=0;
                locy2=270;
                changeX2=speed;
            }
            else
            {
                //sets start ycoordinate  (all the way top)
                locx2=440;
                locy2=0;
                changeY2=speed;
            }
            //increments turn every time user takes turn (presses spacebar)
            turn++;
            if(turn % 5 ==0)
            {
                //increases speed if user is on turn that is multiple of 5
                speed+=0.25;
            }

            if (locx2==1200-xsize)
            {
                changeX2= -changeX2;
            }
            if (locx2==-1)
            {
                changeX2= -changeX2;
            }
            if (locy2==800-ysize)
            {
                changeY2= -changeY2;
            }
            if (locy2==-1)
            {
                changeY2= -changeY2;
            }
            if (xsize2<=0 || ysize2<=0)
            {
                //if no overlap is accomplished, end game
                GameOver=true;
            }
            locx2 += changeX2;
            locy2 += changeY2;
            repaint();
            
           //generate random rgb value
            red = (int)(Math.random() * 256);
            green = (int)(Math.random() * 256);
            blue = (int)(Math.random() * 256);
            
            //add transparency value
            int alpha = 225; 
            Color color = new Color(red, green, blue, alpha);  

            changeX=changeX2;
            changeY=changeY2;

        }

        if (c== KeyEvent.VK_P)
        {
            paused=!paused;
        }

        if(c== KeyEvent.VK_M)
        {
            mute=!mute;
        }

    }

    public void keyReleased (KeyEvent e)
    {

    }

    public void keyTyped(KeyEvent e)
    {

    }

    public void setScore()
    {
        //resets score after game over
        Score=0;
        perfectScore=0;
    }

}
