public class loopFor {
    public static boolean isDivisibleByFour(int number) {
        return number % 4 == 0;
    }

    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--)
            if (isDivisibleByFour(i)) System.out.print(i + " ");
    }
}
