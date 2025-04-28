import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите число 1 и нажмите <Enter>:");
        int firestNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите число 2 и нажмите <Enter>::");
        int secondNumber = new Scanner(System.in).nextInt();
        double q = (double) firestNumber / secondNumber;
        System.out.println(q);

    }
}
