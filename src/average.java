import java.awt.*;
import java.util.Scanner;

public class average {
    public static float getAverage(int rangeStart, int rangeEnd) {
        if (rangeEnd < rangeStart) {
            System.out.println("Не корректные входные данные! Начало диапазона должно быть меньше конца");
            return -1;
        } else if (rangeStart == rangeEnd) {
            return rangeStart;
        } else {
            int rangeLength = rangeEnd - rangeStart + 1;
            float sum = 0;
            for (int i = rangeStart; i <= rangeEnd; i++) sum += i;
            return sum / rangeLength;
        }
    }

    public static float getEvenNumbersAverage(int rangeStart, int rangeEnd) {
        if (rangeEnd < rangeStart) {
            System.out.println("Не корректные входные данные! Начало диапазона должно быть меньше конца");
            return -1;
        } else if (rangeStart == rangeEnd) {
            if (rangeStart % 2 == 0) return rangeStart;
            else {
                System.out.println("Диапазон состоит только из нечетного числа!");
                return -1;
            }
        } else {
            float sum = 0;
            int evenNumbersCount = 0;

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

        System.out.println(getAverage(rangeStart, rangeEnd));
        System.out.println(getEvenNumbersAverage(rangeStart, rangeEnd));
    }
}
