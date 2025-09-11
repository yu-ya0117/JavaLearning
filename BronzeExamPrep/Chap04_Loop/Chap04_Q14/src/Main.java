public class Main{
    public static void main(String[] args) {
        int i = 0;
        //do (i < 3)だとコンパイルエラー
        do{
            System.out.print(i + " ");
            i++;
        }while(i < 3);
        //}while;だけだとコンパイルエラー
    }
}