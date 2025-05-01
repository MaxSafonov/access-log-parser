import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите число 1 и нажмите <Enter>:");
        double firestNumber = new Scanner(System.in).nextDouble();
        System.out.println("Введите число 2 и нажмите <Enter>::");
        double secondNumber = new Scanner(System.in).nextDouble();
        double s = firestNumber + secondNumber;
        double n = firestNumber - secondNumber;
        double y = firestNumber * secondNumber;
        double q = firestNumber / secondNumber;
        System.out.println("Сумма: " + s);
        System.out.println("Разность: " + n);
        System.out.println("Произведение: " + y);
        System.out.println("Частное: " + q);


    }
}
