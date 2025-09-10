public class Main{
    public static void main(String[] args) {
        int i = 1;
        int j = 10;
        int count = 0;
        while (i < j){
            System.out.println("LOOP");
            count++;
            i *= 2;
            j /= 2;
        }
        System.out.println("表示回数："+ count + "回");
    }
}