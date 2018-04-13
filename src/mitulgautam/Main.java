package mitulgautam;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.URL;

public class Main implements KeyListener {
    private static final int HEIGHT = 576;
    private static final int WIDTH = 1024;

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(1024, 576));
        panel.setFocusable(true);
        panel.addKeyListener(new Main());
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        panel.requestFocus();
        Graphics graphics = panel.getGraphics();

        //Images tags
        Image pakiaOne = null;
        Image pakiaTwo = null;
        Image pakiaThree = null;
        Image pakiaFour = null;
        Image pakiaFive = null;
        Image pakiaSix = null;
        Image pakiaSeven = null;
        Image pakiaEight = null;
        Image backgroung = null;
        Image cloud = null;
        Image initialBlock = null;

        try {
            URL pakiaOneURL = Main.class.getResource("images/pakiaOne.png");
            URL pakiaTwoURL = Main.class.getResource("images/pakiaTwo.png");
            URL pakiaThreeURL = Main.class.getResource("images/pakiaThree.png");
            URL pakiaFourURL = Main.class.getResource("images/pakiaFour.png");
            URL pakiaFiveURL = Main.class.getResource("images/pakiaFive.png");
            URL pakiaSixURL = Main.class.getResource("images/pakiaSix.png");
            URL pakiaSevenURL = Main.class.getResource("images/pakiaSeven.png");
            URL pakiaEightURL = Main.class.getResource("images/pakiaEight.png");
            URL initialBlockURL = Main.class.getResource("images/log.png");
            URL backgroundURL = Main.class.getResource("images/clouds.png");
            pakiaOne = ImageIO.read(pakiaOneURL);
            pakiaTwo = ImageIO.read(pakiaTwoURL);
            pakiaThree = ImageIO.read(pakiaThreeURL);
            pakiaFour = ImageIO.read(pakiaFourURL);
            pakiaFive = ImageIO.read(pakiaFiveURL);
            pakiaSix = ImageIO.read(pakiaSixURL);
            pakiaSeven = ImageIO.read(pakiaSevenURL);
            pakiaEight = ImageIO.read(pakiaEightURL);
            initialBlock = ImageIO.read(initialBlockURL);
            backgroung = ImageIO.read(backgroundURL);
        } catch (IOException e) {
            e.printStackTrace();
        }
int index=0,counter=0,cloudX1=0,cloudX2=500,cloudX3=1000;

Image[] pakiaArray={pakiaOne,pakiaTwo,pakiaThree,pakiaFour,pakiaFive,pakiaSix,pakiaSeven,pakiaEight};
        while (true) {
            counter++;
            if(counter==2){
            index++;
            counter=0;
            }
            try {
                Thread.sleep(35);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(cloudX1<-500 )cloudX1=WIDTH;
            if (cloudX2<-500)cloudX2=WIDTH;
            if(cloudX3<-500)cloudX3=WIDTH;

            cloudX1+=5;
            cloudX2+=5;
            cloudX3+=5;
            graphics.setColor(new Color(187, 222, 251));
            graphics.fillRect(0,0,WIDTH,HEIGHT);
            graphics.drawImage(backgroung,cloudX1,0,null);
            graphics.drawImage(backgroung,cloudX2,0,null);
            graphics.drawImage(pakiaArray[index%8],WIDTH/2,HEIGHT/2,null);


        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
