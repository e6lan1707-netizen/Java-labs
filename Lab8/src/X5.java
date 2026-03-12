import java.awt.*;
import javax.swing.*;

public class X5 extends JFrame {

    X5(String s){
        super(s);
        setSize(400,400);
        setVisible(true);
    }

    public void paint(Graphics g){

        int w = 200;
        int h = 200;

        g.drawLine(0,h,400,h);
        g.drawLine(w,0,w,400);

        g.setColor(Color.magenta);

        for(double x=-2; x<2; x+=0.01){

            double y = Math.pow(x,5);

            int px = (int)(x*80);
            int py = (int)(y*40);

            g.fillRect(w+px,h-py,2,2);
        }
    }
}