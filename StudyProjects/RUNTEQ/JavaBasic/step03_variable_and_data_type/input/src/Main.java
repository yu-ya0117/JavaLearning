public class Main {
    public static void main(String[] args) {
        //プリミティブ型
        int age = 25; //整数
        int temperature = -5; //負の整数
        int count = 0; //0

        int a = 10;
        int b = 3;
        System.out.println(a / b); //整数の割り算は小数点以下切り捨て

        double height = 170.5; //小数
        double pi = 3.14159;  //円周率
        double rate = 0.1; //割合

        double c = 10.0;
        System.out.println(c / b); //小数の割り算は小数点以下も表示

        boolean isStudent = true; //真偽値
        boolean isAdult = false; //真偽値

        char grade = 'A'; //文字
        char initial = 'T'; //文字

        /* その他プリミティブ型としては、long（長整数）、float（単精度浮動小数点数）、byte（バイト）、short（短整数）などが存在する。
         実際の開発現場では、int、double、booleanが頻繁に使われる。*/

        //参照型（プリミティブ型ではなくオブジェクト）
        String name = "太郎";
        String greeting = "こんにちは";
        System.out.println("名前： " + name); //文字列の結合
        System.out.println("年齢： " + age + "歳");  //文字列と数値の結合 

        //型安全
        //OKパターン
        int x = 10;
        
        //NGパターン
        //int y = 5.5; //コンパイルエラー：小数点以下の値を整数に代入できない
        //int z = "Hello"; //コンパイルエラー：文字列を整数に代入できない
        //String name = 100; //コンパイルエラー：String型に数値は代入できない

        //変数の命名規則
        //良い例（キャメルケース）
        int totalPrice = 1000;
        String userName = "太郎";

        //一般的ではない例（スネークケース）
        //int total_price = 1000;

        //定数（値を変更したくない場合に使う）
        final int TAX_RATE = 10;  //最初にfinal、大文字のスネークケース
        final String APP_NAME = "My Application";
        final int MAX_RETRY_COUNT = 3;
        final double PI = 3.14159;
    }
}