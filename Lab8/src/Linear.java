import java.awt.*;
import javax.swing.*;

public class Linear extends JFrame {

    Linear(String s){
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

        double k = 0.5;

        for(int x=-200;x<200;x++){
            int y = (int)(k*x);
            g.fillRect(w+x, h-y,2,2);
        }
    }
}