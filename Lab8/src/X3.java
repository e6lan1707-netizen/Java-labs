import java.awt.*;
import javax.swing.*;

public class X3 extends JFrame {

    X3(String s){
        super(s);
        setSize(400,400);
        setVisible(true);
    }

    public void paint(Graphics g){

        int w=200;
        int h=200;

        g.drawLine(0,h,400,h);
        g.drawLine(w,0,w,400);

        g.setColor(Color.blue);

        for(double x=-5;x<5;x+=0.01){

            double y = x*x*x + x*x + x;

            int px = (int)(x*40);
            int py = (int)(y*10);

            g.fillRect(w+px,h-py,2,2);
        }
    }
}