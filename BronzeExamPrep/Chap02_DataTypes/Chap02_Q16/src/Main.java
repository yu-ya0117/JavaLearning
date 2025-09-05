public class Main {
    public static void main(String[] args) {
        int a = 3;
        int total = 0;
        for(int i = 0; i < 3; i++){
            // int total = 0;   //for文の中でやるとコンパイルエラー
            total += a;
        }
        System.out.println(total);  //9が出力される
    }
}
