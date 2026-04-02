import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class SuperCalc extends JFrame implements ActionListener {

    JTextField display;
    JTextArea historyArea;
    ArrayList<String> history = new ArrayList<>();

    public SuperCalc() {
        setTitle("Супер Калькулятор");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 20));
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(6, 4));

        String[] buttons = {
                "7","8","9","/",
                "4","5","6","*",
                "1","2","3","-",
                "0",".","+","=",
                "sqrt","pow","%","C",
                "sin","cos","tan","hist"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);

        historyArea = new JTextArea(5, 20);
        historyArea.setEditable(false);
        add(new JScrollPane(historyArea), BorderLayout.SOUTH);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        try {
            if (cmd.matches("[0-9\\.]")) {
                display.setText(display.getText() + cmd);
            }

            else if (cmd.matches("[+\\-*/]")) {
                display.setText(display.getText() + " " + cmd + " ");
            }

            else if (cmd.equals("=")) {
                calculateExpression(display.getText());
            }

            else if (cmd.equals("C")) {
                display.setText("");
            }

            else if (cmd.equals("sqrt")) {
                double a = Double.parseDouble(display.getText());
                double res = Math.sqrt(a);
                addHistory("√" + a + " = " + res);
                display.setText(String.valueOf(res));
            }

            else if (cmd.equals("pow")) {
                display.setText(display.getText() + " ^ ");
            }

            else if (cmd.equals("%")) {
                display.setText(display.getText() + " % ");
            }

            else if (cmd.equals("sin")) {
                double a = Double.parseDouble(display.getText());
                double res = Math.sin(a);
                addHistory("sin(" + a + ") = " + res);
                display.setText(String.valueOf(res));
            }

            else if (cmd.equals("cos")) {
                double a = Double.parseDouble(display.getText());
                double res = Math.cos(a);
                addHistory("cos(" + a + ") = " + res);
                display.setText(String.valueOf(res));
            }

            else if (cmd.equals("tan")) {
                double a = Double.parseDouble(display.getText());
                double res = Math.tan(a);
                addHistory("tan(" + a + ") = " + res);
                display.setText(String.valueOf(res));
            }

            else if (cmd.equals("hist")) {
                historyArea.setText("");
                for (String h : history) {
                    historyArea.append(h + "\n");
                }
            }

        } catch (Exception ex) {
            display.setText("Ошибка");
        }
    }

    private void calculateExpression(String expr) {
        try {
            String[] parts = expr.trim().split(" ");

            if (parts.length < 3) {
                display.setText("Ошибка");
                return;
            }

            double a = Double.parseDouble(parts[0]);
            String op = parts[1];
            double b = Double.parseDouble(parts[2]);

            double result = 0;

            switch (op) {
                case "+": result = a + b; break;
                case "-": result = a - b; break;
                case "*": result = a * b; break;
                case "/":
                    if (b == 0) {
                        display.setText("Деление на 0");
                        return;
                    }
                    result = a / b;
                    break;
                case "^":
                    result = Math.pow(a, b);
                    break;
                case "%":
                    result = (a / 100) * b;
                    break;
                default:
                    display.setText("Ошибка");
                    return;
            }

            String record = expr + " = " + result;
            addHistory(record);
            display.setText(String.valueOf(result));

        } catch (Exception e) {
            display.setText("Ошибка");
        }
    }

    private void addHistory(String record) {
        history.add(record);
        historyArea.append(record + "\n");
    }

    public static void main(String[] args) {
        new SuperCalc();
    }
}