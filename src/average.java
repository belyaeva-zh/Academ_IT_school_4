import java.awt.*;
import java.util.Scanner;

public class average {
    public static double getAverage(int rangeStart, int rangeEnd) {
        if (rangeStart == rangeEnd)
            return rangeStart;
        else {
            int rangeLength = rangeEnd - rangeStart + 1;
            double sum = 0;
            for (int i = rangeStart; i <= rangeEnd; i++) sum += i;
            return sum / rangeLength;
        }
    }

    public static double getEvenNumbersAverage(int rangeStart, int rangeEnd) {
        double sum = 0;
        int evenNumbersCount = 0;

        if (rangeStart == rangeEnd && rangeStart % 2 != 0) {
            System.out.println("Диапазон состоит из единственного нечетного числа");
            return (-1);
        } else {
            for (int i = rangeStart; i <= rangeEnd; i++) {
                if (i % 2 == 0) {
                    sum += i;
                    evenNumbersCount++;
                }
            }
            return sum / evenNumbersCount;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начало диапазона");
        int rangeStart = scanner.nextInt();

        System.out.println("Введите конец диапазона");
        int rangeEnd = scanner.nextInt();

        if (rangeStart > rangeEnd)
            System.out.println("Данные введены не корректно! Начало диапазона должно быть меньше конца");
        else {
            System.out.println("Среднее арифметическое: " + getAverage(rangeStart, rangeEnd));
            System.out.println("Среднее арифметическое четных чисел: " + getEvenNumbersAverage(rangeStart, rangeEnd));
        }
    }

}

