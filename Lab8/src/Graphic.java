import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Graphic extends JFrame {

    Graphic(String s){
        super(s);

        setLayout(null);
        setSize(200,250);
        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        Button linear = new Button("y = kx");
        linear.setBounds(30,30,130,30);
        add(linear);

        Button x3 = new Button("x³+x²+x");
        x3.setBounds(30,80,130,30);
        add(x3);

        Button sin = new Button("sin(x)");
        sin.setBounds(30,130,130,30);
        add(sin);
        
        Button y3x2 = new Button("3x²");
        y3x2.setBounds(30,180,130,30);
        add(y3x2);

        Button minus = new Button("-x²+x³");
        minus.setBounds(30,230,130,30);
        add(minus);

        Button x5 = new Button("x⁵");
        x5.setBounds(30,280,130,30);
        add(x5);

        Button cos = new Button("cos(x-1)+x");
        cos.setBounds(30,330,130,30);
        add(cos);
        
        y3x2.addActionListener(e -> new Y3X2("y = 3x²"));
        minus.addActionListener(e -> new MinusX2X3("y = -x² + x³"));
        x5.addActionListener(e -> new X5("y = x⁵"));
        cos.addActionListener(e -> new CosShift("y = cos(x-1) + x"));
        
        linear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new Linear("y = kx");
            }
        });

        x3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new X3("x³ + x² + x");
            }
        });

        sin.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new SinGraph("sin(x)");
            }
        });
    }

    public static void main(String[] args){
        new Graphic("Построитель графиков");
    }
}