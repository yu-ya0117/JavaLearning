public class Main{
    public static void main(String[] args) {
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j += i){  //i = 0;のとき、j += i;　→ j += 0;
                System.out.println("LOOP");
                break;  //i = 0;のとき、ここでbreak;しないと無限ループになる
            }
        }
    }
}