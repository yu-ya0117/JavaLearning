public class Main {
    public static void main(String[] args) {
        Sample sb = new Sample(new B());
        Sample sc = new Sample(new C());
        sb.method();
        sc.method();
    }
}
