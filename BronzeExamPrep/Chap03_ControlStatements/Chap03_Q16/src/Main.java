public class Main {
    public static void main(String[] args) {
        int a = 80;
        int b = 60;
        if (a >= 80 && b>= 80) {
            System.out.println("A");
        } else if (a >= 80 || b>= 80) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
