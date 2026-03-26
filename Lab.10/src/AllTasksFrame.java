import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AllTasksFrame extends JFrame {

    public AllTasksFrame() {
        setTitle("All Tasks Lab10");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        DrawPanel panel = new DrawPanel();
        add(panel, BorderLayout.CENTER);

        JPanel controls = new JPanel();

        JButton btnMessage = new JButton("Нажми меня");
        JButton btnCounter = new JButton("Счетчик");
        JButton btnHello = new JButton("Привет");
        JButton btnRed = new JButton("Red");
        JButton btnGreen = new JButton("Green");
        JButton btnBlue = new JButton("Blue");
        JButton btnMini = new JButton("Mini App");

        JTextField nameField = new JTextField(10);
        JTextField miniField = new JTextField(10);

        controls.add(btnMessage);
        controls.add(btnCounter);
        controls.add(nameField);
        controls.add(btnHello);
        controls.add(btnRed);
        controls.add(btnGreen);
        controls.add(btnBlue);
        controls.add(miniField);
        controls.add(btnMini);

        add(controls, BorderLayout.NORTH);

        btnMessage.addActionListener(e -> {
            panel.message = "Кнопка нажата!";
            panel.repaint();
        });

        btnCounter.addActionListener(e -> {
            panel.counter++;
            panel.repaint();
        });

        btnHello.addActionListener(e -> {
            panel.nameMessage = "Привет, " + nameField.getText();
            panel.repaint();
        });

        btnRed.addActionListener(e -> {
            panel.currentColor = Color.RED;
            panel.repaint();
        });

        btnGreen.addActionListener(e -> {
            panel.currentColor = Color.GREEN;
            panel.repaint();
        });

        btnBlue.addActionListener(e -> {
            panel.currentColor = Color.BLUE;
            panel.repaint();
        });

        btnMini.addActionListener(e -> {
            panel.miniText = miniField.getText();
            panel.currentColor = new Color(
                    (int)(Math.random()*255),
                    (int)(Math.random()*255),
                    (int)(Math.random()*255)
            );
            panel.repaint();
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new AllTasksFrame();
    }
}

class DrawPanel extends JPanel {

    int counter = 0;
    String message = "";
    String nameMessage = "";
    String miniText = "";

    Color currentColor = Color.RED;

    int circleX = 50;

    int clickX = -1, clickY = -1;

    Timer timer;

    public DrawPanel() {

        // Анимация
        timer = new Timer(50, e -> {
            circleX += 5;
            if (circleX > getWidth()) circleX = 0;
            repaint();
        });
        timer.start();

        // Мышь
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                clickX = e.getX();
                clickY = e.getY();
                repaint();
            }
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // 1
        g.setColor(Color.BLACK);
        g.drawRect(50, 50, 100, 50);
        g.drawString("Прямоугольник", 50, 45);

        g.drawOval(200, 50, 50, 50);
        g.drawString("Круг", 200, 45);

        g.drawLine(300, 50, 400, 100);
        g.drawString("Линия", 300, 45);

        // 2
        g.setColor(Color.RED);
        g.fillRect(50, 120, 50, 50);

        g.setColor(Color.GREEN);
        g.fillOval(120, 120, 50, 50);

        g.setColor(Color.BLUE);
        g.drawLine(200, 120, 250, 170);

        // 3
        g.setColor(Color.MAGENTA);
        g.drawString("Hello Java Applet", 50, 200);

        // 4
        g.setColor(Color.BLACK);
        g.drawString(message, 50, 230);

        // 5
        g.drawString("Счетчик: " + counter, 50, 260);

        // 6
        g.drawString(nameMessage, 50, 290);

        // 7
        g.setColor(currentColor);
        g.fillOval(50, 320, 50, 50);

        // 8
        g.setColor(Color.ORANGE);
        g.fillOval(circleX, 400, 40, 40);

        // 9
        if (clickX != -1) {
            g.setColor(Color.BLACK);
            g.fillOval(clickX, clickY, 10, 10);
        }

        // 10
        g.setColor(currentColor);
        g.fillRect(250, 320, 60, 60);

        g.setColor(Color.BLACK);
        g.drawString("Mini: " + miniText, 250, 300);
    }
}