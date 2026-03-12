import java.awt.*;
import javax.swing.*;

public class CosShift extends JFrame {

    CosShift(String s){
        super(s);
        setSize(400,400);
        setVisible(true);
    }

    public void paint(Graphics g){

        int w = 200;
        int h = 200;

        g.drawLine(0,h,400,h);
        g.drawLine(w,0,w,400);

        g.setColor(Color.green);

        for(double x=-10; x<10; x+=0.01){

            double y = Math.cos(x-1) + x;

            int px = (int)(x*20);
            int py = (int)(y*20);

            g.fillRect(w+px,h-py,2,2);
        }
    }
}
