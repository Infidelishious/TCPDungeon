
/*
String Author = "Luke Halle"
Class: BoxDodge
*/



import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.text.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;
import javax.*;
import javax.net.ssl.ExtendedSSLSession;

public class BoxDodge extends Room
{
    
        public String getAuthor()
        {
            return "Luke Halle";
        }
        public String getRoomName()
        {
            return "Box Dodge";
        }
        
        static boolean wpress;
        static boolean apress;
        static boolean spress;
        static boolean dpress;
        static boolean finish;
        static boolean timeout;
        static int speed = 2;
        static int herolocX;
        static int herolocY;
        static int mvbad1X;
        static int mvbad1Y;
        static int mvbad2X;
        static int mvbad2Y;
        static int mvbad3X;
        static int mvbad3Y;
        static int mvtime;
        static int timeleft = 200;
        static JLabel hero = new JLabel();
        static JLabel baddy1 = new JLabel(); 
        static JLabel baddy2 = new JLabel(); 
        static JLabel baddy3 = new JLabel(); 
        static JLabel baddy4 = new JLabel(); 
        static JLabel baddy5 = new JLabel(); 
        static JLabel baddy6 = new JLabel();
        static JLabel baddy7 = new JLabel();
        static JLabel baddy8 = new JLabel();
        static JLabel baddy9 = new JLabel();
        static JLabel baddy10 = new JLabel();
        static JLabel goal = new JLabel();
        static JLabel mvbad1 = new JLabel();
        static JLabel mvbad2 = new JLabel();
        static JLabel mvbad3 = new JLabel();
        static JLabel mvbad4 = new JLabel();
        static JLabel winScreen = new JLabel();






 
        public boolean playerEnters(Player player) throws Exception
        {
            dungeon.fancyOutput("You enter a room with a locked door on the other side.\nYou notice a joystick controller on the floor, with a wire leading to a giant screen on the wall.\nA note resides on the controller \"Play or Die!\"\nthe screen starts up and you pick up the controller.");
            BoxDodgeTimer timerTask = new BoxDodgeTimer();
            new Timer().scheduleAtFixedRate(timerTask, 0, 7);
            MonsterMovement timerMove = new MonsterMovement();
            new Timer().scheduleAtFixedRate(timerMove, 0, 7);
            GamerTimer timergame = new GamerTimer();
            new Timer().scheduleAtFixedRate(timergame, 0, 1000);
            JFrame frame = new JFrame("BoxDodge");
            frame.setLayout(null);
            frame.setVisible(true);
            frame.setResizable(false);
            frame.setSize(2000,1000);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.addKeyListener(new KeyListener()
            {
                @Override
                public void keyTyped(KeyEvent e){}

                @Override
                public void keyPressed(KeyEvent e)
                {
                    if(e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == 38)
                    {
                        wpress = true;
                    }
                    else if(e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == 37)
                    {
                        apress = true;
                    }
                    else if(e.getKeyCode() == KeyEvent.VK_S || e.getKeyCode() == 40)
                    {
                        spress = true;
                    }
                    else if(e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == 39)
                    {
                        dpress = true;
                    }
                    else if(e.getKeyCode() == KeyEvent.VK_SHIFT)
                    {
                        speed = 3;
                    }
                    else if(e.getKeyCode() == KeyEvent.VK_CONTROL)
                    {
                        speed = 1;
                    }
                }
                
                @Override
                public void keyReleased(KeyEvent e)
                {
                    if(e.getKeyCode() == KeyEvent.VK_W||e.getKeyCode() == 38)
                    {
                        wpress = false;
                    }
                    else if(e.getKeyCode() == KeyEvent.VK_A||e.getKeyCode() == 37)
                    {
                        apress = false;
                    }
                    else if(e.getKeyCode() == KeyEvent.VK_S||e.getKeyCode() == 40)
                    {
                        spress = false;
                    }
                    else if(e.getKeyCode() == KeyEvent.VK_D||e.getKeyCode() == 39)
                    {
                        dpress = false;
                    }
                    else if(e.getKeyCode() == KeyEvent.VK_SHIFT)
                    {
                        speed = 2;
                    }
                    else if(e.getKeyCode() == KeyEvent.VK_CONTROL)
                    {
                        speed = 2;
                    }
                }
            });       
            baddy1.setOpaque(true);
            baddy1.setBackground(Color.red);
            baddy1.setSize(800,400);
            baddy1.setVisible(true);
            baddy1.setLocation(0,0);
            baddy2.setOpaque(true);
            baddy2.setBackground(Color.red);
            baddy2.setSize(2000,5);
            baddy2.setVisible(true);
            baddy2.setLocation(0,0);
            baddy3.setOpaque(true);
            baddy3.setBackground(Color.red);
            baddy3.setSize(2000,50);
            baddy3.setVisible(true);
            baddy3.setLocation(0,925);
            baddy4.setOpaque(true);
            baddy4.setBackground(Color.red);
            baddy4.setSize(5,1000);
            baddy4.setVisible(true);
            baddy4.setLocation(0,0);
            baddy5.setOpaque(true);
            baddy5.setBackground(Color.red);
            baddy5.setSize(5,1000);
            baddy5.setVisible(true);
            baddy5.setLocation(1990,0);
            baddy6.setOpaque(true);
            baddy6.setBackground(Color.red);
            baddy6.setSize(900,450);
            baddy6.setVisible(true);
            baddy6.setLocation(0,600);
            baddy6.setText("Key:\n W,A,S,D/ArrowKeys: Move \n Shift: Sprint \n Control: Crawl");
            baddy6.setFont(baddy6.getFont().deriveFont(30.0f));
            baddy6.setHorizontalAlignment(SwingConstants.CENTER);
            baddy7.setOpaque(true);
            baddy7.setBackground(Color.red);
            baddy7.setSize(100,1500);
            baddy7.setVisible(true);
            baddy7.setLocation(900,50);
            baddy8.setOpaque(true);
            baddy8.setBackground(Color.red);
            baddy8.setSize(400,200);
            baddy8.setVisible(true);
            baddy8.setLocation(1000,50);
            baddy9.setOpaque(true);
            baddy9.setBackground(Color.red);
            baddy9.setSize(700,450);
            baddy9.setVisible(true);
            baddy9.setLocation(1060,400);
            baddy9.setForeground(Color.black);
            baddy9.setText("Time left: "+timeleft);
            baddy9.setFont(winScreen.getFont().deriveFont(100.0f));
            baddy9.setHorizontalAlignment(SwingConstants.CENTER);
            baddy10.setOpaque(true);
            baddy10.setBackground(Color.red);
            baddy10.setSize(50,600);
            baddy10.setVisible(true);
            baddy10.setLocation(1710,0);
            goal.setOpaque(true);
            goal.setBackground(Color.green);
            goal.setSize(240,100);
            goal.setVisible(true);
            goal.setLocation(1760,5);
            mvbad1.setOpaque(true);
            mvbad1.setBackground(Color.red);
            mvbad1.setSize(100,50);
            mvbad1.setVisible(true);
            mvbad1.setLocation(1600,800);
            mvbad2.setOpaque(true);
            mvbad2.setBackground(Color.red);
            mvbad2.setSize(100,50);
            mvbad2.setVisible(true);
            mvbad2.setLocation(1200,800);
            mvbad3.setOpaque(true);
            mvbad3.setBackground(Color.red);
            mvbad3.setSize(200,200);
            mvbad3.setVisible(true);
            mvbad3.setLocation(2000,500);
        

            herolocX = 50;
            herolocY = 500;
            mvbad1X = 1600;
            mvbad1Y = 800;
            mvbad2X = 1200;
            mvbad2Y = 800;
            mvbad3X = 2000;
            mvbad3Y = 500;
            mvtime = 1;
            hero.setBounds(herolocX, herolocY, 20,20);
            hero.setOpaque(true);
            hero.setBackground(Color.blue);
            hero.setVisible(true);
            frame.add(hero);
            frame.add(baddy1);
            frame.add(baddy2);
            frame.add(baddy3);
            frame.add(baddy4);
            frame.add(baddy5);
            frame.add(baddy6);
            frame.add(baddy7);
            frame.add(baddy8);
            frame.add(baddy9);
            frame.add(baddy10);
            frame.add(goal);
            frame.add(mvbad1);
            frame.add(mvbad2);
            frame.add(mvbad3);
            frame.add(mvbad4);
            frame.add(winScreen);
            
            while(true)
            {    
                System.out.print("");
                if(finish)
                {
                    System.out.print("");
                    try 
                    {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException ie)
                    {
                    }
                    frame.setVisible(false);
                    dungeon.fancyOutput("The Screen turns off and the door opens. You can progress now.", 50);
                    return true;
                }
                else if(timeout)
                {
                    frame.setVisible(false);
                    dungeon.fancyOutput("The Screen shuts off and you hear a beeping form the controller.\nThe controller Explodes in your hand.", 50);
                    return false;
                }
            }            
        }
        
        public static class BoxDodgeTimer extends TimerTask
        {
            public void run()
            {
                if(wpress==true)
                {
                    moveup();
                }
                if(apress==true)
                {
                    moveleft();
                }
                if(spress==true)
                {
                    movedown();
                }
                if(dpress==true)
                {
                    moveright();
                }
            }
            public void moveup()
            {
                herolocY= herolocY-speed;
                hero.setLocation(herolocX, herolocY);
                if(finish==false)
                {
                    checkOverlap();
                }
            }
            public void moveleft()
            {
                herolocX= herolocX-speed;
                hero.setLocation(herolocX, herolocY);
                if(finish==false)
                {
                    checkOverlap();
                }

            }
            public void movedown()
            {
                herolocY= herolocY+speed;
                hero.setLocation(herolocX, herolocY);
                if(finish==false)
                {
                    checkOverlap();
                }
                

            }
            public void moveright()
            {
                herolocX= herolocX+speed;
                hero.setLocation(herolocX, herolocY);
                if(finish==false)
                {
                    checkOverlap();
                }
            }
            public void checkOverlap()
            {
                Rectangle baddybound = baddy1.getBounds();
                Rectangle result = SwingUtilities.computeIntersection(hero.getX(), hero.getY(), hero.getWidth(), hero.getHeight(), baddybound);
                Boolean collide = (result.getWidth() > 0 && result.getHeight() > 0);
                if(collide==true)
                {
                    herolocX = 50;
                    herolocY = 500;
                    hero.setLocation(herolocX, herolocY);
                }
                baddybound = baddy2.getBounds();
                result = SwingUtilities.computeIntersection(hero.getX(), hero.getY(), hero.getWidth(), hero.getHeight(), baddybound);  
                collide = (result.getWidth() > 0 && result.getHeight() > 0);
                if(collide==true)
                {
                    herolocX = 50;
                    herolocY = 500;
                    hero.setLocation(herolocX, herolocY);
                }
                baddybound = baddy3.getBounds();
                result = SwingUtilities.computeIntersection(hero.getX(), hero.getY(), hero.getWidth(), hero.getHeight(), baddybound);  
                collide = (result.getWidth() > 0 && result.getHeight() > 0);
                if(collide==true)
                {
                    herolocX = 50;
                    herolocY = 500;
                    hero.setLocation(herolocX, herolocY);
                }
                baddybound = baddy4.getBounds();
                result = SwingUtilities.computeIntersection(hero.getX(), hero.getY(), hero.getWidth(), hero.getHeight(), baddybound);  
                collide = (result.getWidth() > 0 && result.getHeight() > 0);
                if(collide==true)
                {
                    herolocX = 50;
                    herolocY = 500;
                    hero.setLocation(herolocX, herolocY);
                }
                baddybound = baddy5.getBounds();
                result = SwingUtilities.computeIntersection(hero.getX(), hero.getY(), hero.getWidth(), hero.getHeight(), baddybound);  
                collide = (result.getWidth() > 0 && result.getHeight() > 0);
            
                if(collide==true)
                {
                    herolocX = 50;
                    herolocY = 500;
                    hero.setLocation(herolocX, herolocY);
                }
                baddybound = baddy6.getBounds();
                result = SwingUtilities.computeIntersection(hero.getX(), hero.getY(), hero.getWidth(), hero.getHeight(), baddybound);  
                collide = (result.getWidth() > 0 && result.getHeight() > 0);
                if(collide==true)
                {
                    herolocX = 50;
                    herolocY = 500;
                    hero.setLocation(herolocX, herolocY);
                }
                baddybound = baddy7.getBounds();
                result = SwingUtilities.computeIntersection(hero.getX(), hero.getY(), hero.getWidth(), hero.getHeight(), baddybound);  
                collide = (result.getWidth() > 0 && result.getHeight() > 0);
                if(collide==true)
                {
                    herolocX = 50;
                    herolocY = 500;
                    hero.setLocation(herolocX, herolocY);
                }
                baddybound = baddy8.getBounds();
                result = SwingUtilities.computeIntersection(hero.getX(), hero.getY(), hero.getWidth(), hero.getHeight(), baddybound);  
                collide = (result.getWidth() > 0 && result.getHeight() > 0);
                if(collide==true)
                {
                    herolocX = 50;
                    herolocY = 500;
                    hero.setLocation(herolocX, herolocY);
                }
                baddybound = baddy9.getBounds();
                result = SwingUtilities.computeIntersection(hero.getX(), hero.getY(), hero.getWidth(), hero.getHeight(), baddybound);  
                collide = (result.getWidth() > 0 && result.getHeight() > 0);
                if(collide==true)
                {
                    herolocX = 50;
                    herolocY = 500;
                    hero.setLocation(herolocX, herolocY);
                }
                baddybound = baddy10.getBounds();
                result = SwingUtilities.computeIntersection(hero.getX(), hero.getY(), hero.getWidth(), hero.getHeight(), baddybound);  
                collide = (result.getWidth() > 0 && result.getHeight() > 0);
                if(collide==true)
                {
                    herolocX = 50;
                    herolocY = 500;
                    hero.setLocation(herolocX, herolocY);
                }
                baddybound = mvbad1.getBounds();
                result = SwingUtilities.computeIntersection(hero.getX(), hero.getY(), hero.getWidth(), hero.getHeight(), baddybound);  
                collide = (result.getWidth() > 0 && result.getHeight() > 0);
                if(collide==true)
                {
                    herolocX = 50;
                    herolocY = 500;
                    hero.setLocation(herolocX, herolocY);
                }
                baddybound = mvbad2.getBounds();
                result = SwingUtilities.computeIntersection(hero.getX(), hero.getY(), hero.getWidth(), hero.getHeight(), baddybound);  
                collide = (result.getWidth() > 0 && result.getHeight() > 0);
                if(collide==true)
                {
                    herolocX = 50;
                    herolocY = 500;
                    hero.setLocation(herolocX, herolocY);
                }
                baddybound = mvbad3.getBounds();
                result = SwingUtilities.computeIntersection(hero.getX(), hero.getY(), hero.getWidth(), hero.getHeight(), baddybound);  
                collide = (result.getWidth() > 0 && result.getHeight() > 0);
                if(collide==true)
                {
                    herolocX = 50;
                    herolocY = 500;
                    hero.setLocation(herolocX, herolocY);
                }
                baddybound = goal.getBounds();
                result = SwingUtilities.computeIntersection(hero.getX(), hero.getY(), hero.getWidth(), hero.getHeight(), baddybound);  
                collide = (result.getWidth() > 0 && result.getHeight() > 0);
                if(collide==true)
                {
                    winScreen.setOpaque(true);
                    winScreen.setBackground(Color.green);
                    winScreen.setForeground(Color.black);
                    winScreen.setText("WINNER!!!");
                    winScreen.setFont(winScreen.getFont().deriveFont(100.0f));
                    winScreen.setHorizontalAlignment(SwingConstants.CENTER);
                    winScreen.setSize(2000,1000);
                    winScreen.setVisible(true);
                    winScreen.setLocation(0,0);
                    baddy1.setVisible(false);
                    baddy2.setVisible(false);
                    baddy3.setVisible(false);
                    baddy4.setVisible(false);
                    baddy5.setVisible(false);
                    baddy6.setVisible(false);
                    baddy7.setVisible(false);
                    baddy8.setVisible(false);
                    baddy9.setVisible(false);
                    baddy10.setVisible(false);
                    mvbad1.setVisible(false);
                    mvbad2.setVisible(false);
                    mvbad3.setVisible(false);
                    finish = true;
                    
                }
            
        }

    
    }
    public static class MonsterMovement extends TimerTask
    {
        public void run()
        {
        if(mvtime>0)
        {
            mvbad1Y++;
            mvbad1Y++;
            mvbad1.setLocation(mvbad1X, mvbad1Y);
            mvbad2Y++;
            mvbad2.setLocation(mvbad2X, mvbad2Y);
            mvbad3X--;
            mvbad3X--;
            mvbad3.setLocation(mvbad3X, mvbad3Y);
            mvtime--;
        } 
        else if(mvtime==0)
        {
            mvtime = 200;    
        }
        if(mvbad1Y>990)
        {
        mvbad1Y = 800;
        mvbad1.setLocation(mvbad1X, mvbad1Y);
        }
        else if(mvbad2Y>960)
        {
            mvbad2Y = 800;
            mvbad2.setLocation(mvbad2X, mvbad2Y);
        }
        else if(mvbad3X<1500)
        {
            mvbad3.setLocation(mvbad3X, mvbad3Y);
            mvbad3X = 2000;
            
        }
            if(finish==false)
            {
                Rectangle baddybound = mvbad1.getBounds();
            Rectangle result = SwingUtilities.computeIntersection(hero.getX(), hero.getY(), hero.getWidth(), hero.getHeight(), baddybound);  
            Boolean collide = (result.getWidth() > 0 && result.getHeight() > 0);
            if(collide==true)
            {
                herolocX = 50;
                herolocY = 500;
                hero.setLocation(herolocX, herolocY);
            }
            baddybound = mvbad2.getBounds();
            result = SwingUtilities.computeIntersection(hero.getX(), hero.getY(), hero.getWidth(), hero.getHeight(), baddybound);  
            collide = (result.getWidth() > 0 && result.getHeight() > 0);
            if(collide==true)
            {
                herolocX = 50;
                herolocY = 500;
                hero.setLocation(herolocX, herolocY);
            }
            baddybound = mvbad3.getBounds();
            result = SwingUtilities.computeIntersection(hero.getX(), hero.getY(), hero.getWidth(), hero.getHeight(), baddybound);  
            collide = (result.getWidth() > 0 && result.getHeight() > 0);
            if(collide==true)
            {
                herolocX = 50;
                herolocY = 500;
                hero.setLocation(herolocX, herolocY);
            }
            }
        }
    }
        public class GamerTimer extends TimerTask
        {
            public void run()
            {
                timeleft--;
                baddy9.setText("Time left: "+timeleft);
                if(timeleft<=0)
                {
                    timeout = true;
                }
            }
        }
    
}