public class Main {
  public static void main(String[] args) {
    greet();  // こんにちは！
    greet();  // こんにちは！
    greet("太郎");  // こんにちは、太郎さん！
    greet("花子");  // こんにちは、花子さん！
    introduce("太郎", 25);  // 太郎さんは25歳です
    introduce("花子", 22);  // 花子さんは22歳です
    int result = add(10, 20); // 30がresultに入る
    System.out.println(result); // 30が画面に表示される
    System.out.println(checkAge(20)); // "成人"が画面に表示される
    System.out.println(add(1, 2));  // int版のaddが呼び出される → 3
    System.out.println(add(1.5, 2.5)); // double版のaddが呼び出される → 4.0
    System.out.println(add(1, 2, 3)); // 引数が3つ版のaddが呼び出される → 6

    //スコープ
    for (int i = 1; i < 5; i++){
      System.out.println(i);  // これはOK（ローカル変数）
    }
    // System.out.println(i); // コンパイルエラー

    // 実践例：商品の税込価格と割引を計算するプログラム
    int price = 4500;

    int taxIncluded = calculateTax(price);
    System.out.println("税込価格: " + taxIncluded + "円");

    if (isDiscountTarget(taxIncluded)){
      int finalPrice = applyDiscount(taxIncluded, 0.05);
      System.out.println("割引適用後: " + finalPrice + "円");
    } else {
      System.out.println("割引対象外です");
    }
  }

  // 基本形はpublic static 戻り値の型 メソッド名(引数の型 引数名){}
  // 引数なし・戻り値なしのメソッド
  public static void greet() {
    System.out.println("こんにちは！");
  }

  // 引数あり・戻り値なしのメソッド（ここではオーバーロードしている）
  // オーバーロードについては下記参照
  public static void greet(String name) {
    System.out.println("こんにちは、" + name + "さん！");
  }

  public static void introduce(String name, int age)  {
    System.out.println(name + "さんは" + age + "歳です");
  }
  
  //戻り値
  public static int add(int a, int b) {
    return a + b; // 値を返すだけで画面には表示されない
  }

  // returnが実行されるとその時点でメソッドの処理が終了する
  public static String checkAge(int age) {
    if(age >= 18) return "成人";  // 文字列を返すだけで画面には表示されない
    return "未成年";  // 同上
  }

  // メソッドのオーバーロード
  public static double add(double a, double b) {
    return a + b;
  }

  public static int add(int a, int b, int c) {
    return a + b + c;
  }

  // スコープについて
  // public static void methodA(){
  //   int x = 10;
  //   System.out.println(x);  // これはOK(10)
  // }

  // public static void methodB(){
  //   // System.out.println(x);  // コンパイルエラー (x は methodA のローカル変数)
  //   int x = 20; // methodA の x とは別の変数
  //   System.out.println(x);  // 20
  // }

  // メソッドの命名規則
  // メソッド名必ずはキャメルケースで書く。
  // calculateTotal   // 合計を計算する
  // isValid          // 有効かどうかを判定する（boolean を返す場合は is で始めることが多い）
  // getName          // 名前を取得する
  // printResult      // 結果を表示する

  // 実践例：商品の税込価格と割引を計算するプログラム
  public static int calculateTax(int price) {
    return (int)(price * 1.10);
  }

  public static boolean isDiscountTarget(int price) {
    return price >= 3000;
  }

  public static int applyDiscount(int price,double discountRate) {
    return (int)(price * (1 - discountRate));
  }

}