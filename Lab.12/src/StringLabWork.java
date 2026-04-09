import javax.swing.*;
import java.awt.*;
import java.util.*;

public class StringLabWork {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Labwork 12 Tolya");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] tasks = {
                "1. Длина строки",
                "2. Верхний/нижний регистр",
                "3. Подсчёт слов",
                "4. Разворот слов",
                "5. Поиск слова",
                "6. Замена слова",
                "7. Палиндром",
                "8. Сравнение строк",
                "9. Разделение строки",
                "10. Гласные и согласные"
        };

        JComboBox<String> comboBox = new JComboBox<>(tasks);
        JButton button = new JButton("Выполнить");

        JTextArea resultArea = new JTextArea(10, 40);
        resultArea.setLineWrap(true);

        JPanel panel = new JPanel();
        panel.add(comboBox);
        panel.add(button);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(new JScrollPane(resultArea), BorderLayout.CENTER);

        button.addActionListener(e -> {
            String input = JOptionPane.showInputDialog("Введите строку:");
            if (input == null) return;

            int choice = comboBox.getSelectedIndex();
            String result = "";

            switch (choice) {
                case 0:
                    result = "Длина: " + input.length();
                    break;

                case 1:
                    result = "Верхний: " + input.toUpperCase() +
                             "\nНижний: " + input.toLowerCase();
                    break;

                case 2:
                    String[] words = input.trim().split("\\s+");
                    result = "Количество слов: " + words.length;
                    break;

                case 3:
                    StringBuilder reversedWords = new StringBuilder();
                    for (String w : input.split(" ")) {
                        reversedWords.append(new StringBuilder(w).reverse()).append(" ");
                    }
                    result = reversedWords.toString();
                    break;

                case 4:
                    String word = JOptionPane.showInputDialog("Введите слово для поиска:");
                    result = "Содержится: " + input.contains(word);
                    break;

                case 5:
                    String oldWord = JOptionPane.showInputDialog("Что заменить:");
                    String newWord = JOptionPane.showInputDialog("На что заменить:");
                    result = input.replace(oldWord, newWord);
                    break;

                case 6:
                    String cleaned = input.replaceAll("\\s+", "").toLowerCase();
                    String reversed = new StringBuilder(cleaned).reverse().toString();
                    result = "Палиндром: " + cleaned.equals(reversed);
                    break;

                case 7:
                    String second = JOptionPane.showInputDialog("Введите вторую строку:");
                    result = "Равны: " + input.equals(second);
                    break;

                case 8:
                    result = Arrays.toString(input.split(" "));
                    break;

                case 9:
                    int vowels = 0, consonants = 0;
                    String v = "aeiouAEIOUаеёиоуыэюяАЕЁИОУЫЭЮЯ";
                    for (char c : input.toCharArray()) {
                        if (Character.isLetter(c)) {
                            if (v.indexOf(c) != -1) vowels++;
                            else consonants++;
                        }
                    }
                    result = "Гласные: " + vowels + ", Согласные: " + consonants;
                    break;
            }

            resultArea.setText(result);
        });

        frame.setVisible(true);
    }
}