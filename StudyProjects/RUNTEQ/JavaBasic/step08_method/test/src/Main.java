public class Main {
    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
          if (numbers[i] > max) max = numbers[i];
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMax(new int[]{3, 7, 2, 8, 1}));
    }
}