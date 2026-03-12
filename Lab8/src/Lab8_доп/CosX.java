
import java.awt.*;
import javax.swing.*;

public class CosX extends JFrame{

    CosX(String s){
        super(s);
        setSize(500,500);
        setVisible(true);
    }

    public void paint(Graphics g){

        g.setColor(Color.LIGHT_GRAY);

        for(int i=0;i<500;i+=20){
            g.drawLine(i,0,i,500);
            g.drawLine(0,i,500,i);
        }

        g.setColor(Color.BLACK);
        g.drawLine(250,0,250,500);
        g.drawLine(0,250,500,250);

        g.setColor(Color.BLUE);

        for(int x=-200;x<200;x++){
            double y = Math.cos(x-1) + x*0.05;
            g.drawLine(250+x,250-(int)(y*50),
                       250+x+1,250-(int)((Math.cos(x)*1 + (x+1)*0.05)*50));
        }
    }
}