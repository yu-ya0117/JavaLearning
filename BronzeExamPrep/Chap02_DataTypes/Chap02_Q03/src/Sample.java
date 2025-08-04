public class Sample{
    public static void main(String[] args) {
        char c1 = 65;   //変数c1に文字コード65を初期化
        int num1 = c1;  //16進数の文字コードを10進数に変換（暗黙の型変換）
        int nextNum = c1 + 1;   //次の文字コードをint型変数nextNumに代入
        char nextChar = (char)nextNum;  //文字へ変換、キャスト（明示的な型変換）
        System.out.println(c1);
        System.out.println(num1);
        System.out.println(nextChar);
        System.out.println(nextNum);

        char c2 = 'a';  //変数c2を文字aで初期化
        int num2 = c2;
        System.out.println(c2);
        System.out.println(num2);
    }
}
