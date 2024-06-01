
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //приветствие
        System.out.println("Добро пожаловать в калькулятор");
        //выбор дейстивй в калькуляторе
        //+,-.*,:
        System.out.println("Выберите операцию: ");
        System.out.println(" 1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление");

        int a = new Scanner(System.in).nextInt();

        if (a == 1) {
            // 1 - сложение
            System.out.println("Введите число 1");
            double num1 = new Scanner(System.in).nextDouble();
            System.out.println("Введите число 2");
            double num2 = new Scanner(System.in).nextDouble();
            System.out.println(num1 + num2);
        }

        if (a == 2) {
            // 2 - вычитание
            System.out.println("Введите число 1");
            double num3 = new Scanner(System.in).nextDouble();
            System.out.println("Введите число 2");
            double num4 = new Scanner(System.in).nextDouble();
            System.out.println(num3 - num4); }

        if (a == 3) {
            // 3 - умножение
            System.out.println("Введите число 1");
            double num5 = new Scanner(System.in).nextDouble();
            System.out.println("Введите число 2");
            double num6 = new Scanner(System.in).nextDouble();
            System.out.println(num5 * num6);}

        if (a == 4) {
            // 4 - деление
            System.out.println("Введите число 1");
            double num7 = new Scanner(System.in).nextDouble();
            System.out.println("Введите число 2");
            double num8 = new Scanner(System.in).nextDouble();
            System.out.println(num7 / num8);}

        if (a >= 5) {
            System.out.println("ERROR");
        }


    }
}