import java.awt.*;
import javax.swing.*;

public class Y3X2 extends JFrame {

    Y3X2(String s){
        super(s);
        setSize(400,400);
        setVisible(true);
    }

    public void paint(Graphics g){

        int w = 200;
        int h = 200;

        g.drawLine(0,h,400,h);
        g.drawLine(w,0,w,400);

        g.setColor(Color.red);

        for(double x=-10; x<10; x+=0.01){

            double y = 3*x*x;

            int px = (int)(x*20);
            int py = (int)(y*5);

            g.fillRect(w+px,h-py,2,2);
        }
    }
}
