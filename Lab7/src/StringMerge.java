public class StringMerge {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "Java";
        String s4 = "Test";
        String s5 = "Test";

        String result;
        if (s4.equals(s5)) {
            result = s1 + s2; // или s1 + s3 — зависит от условий
            System.out.println("Объединение: " + result);
        } else {
            System.out.println("Строки s4 и s5 не равны");
        }
    }
}