package sizedFrame;

import java.awt.*;
import javax.swing.*;
/**
 * Created by Zero on 2017/3/5.
 */
public class SizedFrameTest {
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable()
        {
            public void run(){
                JFrame frame=new JFrame();
                frame.setTitle("SizedFrame");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

class SizedFrame extends JFrame{
    public SizedFrame(){
        Toolkit kit =Toolkit.getDefaultToolkit();
        Dimension screenSize=kit.getScreenSize();
        int screenHeight=screenSize.height;
        int screenWidth=screenSize.width;

        setSize(screenWidth/2,screenHeight/2);
        setLocationByPlatform(true);

        Image img=new ImageIcon("icon.jpg").getImage();
        setIconImage(img);
    }

}
