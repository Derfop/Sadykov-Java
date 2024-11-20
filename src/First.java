import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число(a): ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число(b): ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println("Сложение: a + b = " + (a + b));
        System.out.println("Вычитание: a - b = " + (a - b));
        System.out.println("Умножение: a * b = " + (a * b));

        if (b != 0) {
            System.out.println("Деление: a / b = " + ((double)a / b));
        } else {
            System.out.println("Деление на ноль невозможно.");
        }
        scanner.close();
    }
}