import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите тест и нажмите <Enter>");
        String text = new Scanner(System.in).nextLine();
        System.out.println("Длинна текста: " + text.length());
        }
}
