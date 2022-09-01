import java.util.Scanner;

public class digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        int number = scanner.nextInt();
        int sumOfDigits = 0;
        int sumOfOddDigits = 0;
        int maxDigit = 0;
        int buffer = 0;

        if (number > 0) {
            buffer = number;
        } else if (number < 0) {
            buffer = number * (-1);
        }

        while (buffer > 0) {
            sumOfDigits += buffer % 10;
            if (buffer % 10 % 2 != 0) sumOfOddDigits += buffer % 10;
            if (buffer % 10 > maxDigit) maxDigit = buffer % 10;
            buffer = buffer / 10;
        }

        System.out.println("Сумма цифр числа равна " + sumOfDigits);
        System.out.println("Сумма нечетных цифр числа равна " + sumOfOddDigits);
        System.out.println("Максимальная цифра числа равна " + maxDigit);
    }
}
