public class Main{
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        while (i < 10){
            i = j * i;
        }
        System.out.println("i=" + i + ", j = " + j);
    }
}