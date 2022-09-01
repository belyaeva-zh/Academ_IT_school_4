public class cycleFor {
    public static boolean isAliquotFour(int x) {
        return x % 4 == 0;
    }

    public static void main(String[] args){
        for(int i = 100; i >= 1; i--){
            if(isAliquotFour(i)) System.out.print(i + " ");
        }
    }
}
