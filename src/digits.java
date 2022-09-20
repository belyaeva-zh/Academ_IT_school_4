import java.util.Scanner;

public class digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        int number = scanner.nextInt();
        int sumOfDigits = 0;
        int sumOfOddDigits = 0;
        int maxDigit = 0;

        if (number < 0) {
            number = Math.abs(number);
        }

        while (number > 0) {
            sumOfDigits += number % 10;
            if (number % 10 % 2 != 0) sumOfOddDigits += number % 10;
            if (number % 10 > maxDigit) maxDigit = number % 10;
            number = number / 10;
        }

        System.out.println("Сумма цифр числа равна " + sumOfDigits);
        System.out.println("Сумма нечетных цифр числа равна " + sumOfOddDigits);
        System.out.println("Максимальная цифра числа равна " + maxDigit);
    }
}
