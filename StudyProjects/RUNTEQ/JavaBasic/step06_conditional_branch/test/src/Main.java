public class Main {
    public static int sumRange(int start, int end) {
        int total = 0;
        for(int i = start; i <= end; i++) total += i;
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sumRange(1, 5));
    }
}