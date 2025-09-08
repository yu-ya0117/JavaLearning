public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        if (++a > 0 || ++b > 0) {   //++aがtrueなので、++bは評価されない。
             System.out.println("a=" + a);
             System.out.println("b=" + b);
        }
    }
}
