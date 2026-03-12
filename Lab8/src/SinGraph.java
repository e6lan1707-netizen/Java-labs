import java.awt.*;
import javax.swing.*;

public class SinGraph extends JFrame{

    SinGraph(String s){
        super(s);
        setSize(400,400);
        setVisible(true);
    }

    public void paint(Graphics g){

        int w=200;
        int h=200;

        g.drawLine(0,h,400,h);
        g.drawLine(w,0,w,400);

        g.setColor(Color.green);

        for(int i=-360;i<360;i++){

            double y = Math.sin(Math.PI*i/180);

            int px=i/2;
            int py=(int)(y*100);

            g.fillRect(w+px,h-py,2,2);
        }
    }
}