public class Main {
  public static void main(String[] args){
    // Stringはイミュータブル（不変）
    String name = "太郎"; // このオブジェクトの内容は変更できない
    name = "花子";  // 新しい文字列オブジェクトを作って変数の参照先を変更した

    // 文字列の結合
    String firstName = "太郎";
    String lastName = "山田";
    String fullName = lastName + firstName;
    int age = 25;
    System.out.println(fullName + "さんは" + age + "歳です");

    // 結合結果の違い
    System.out.println("結果： " + 10 + 20);  // 文字列の結合（"1020"という文字列）
    System.out.println("結果： " + (10 + 20));  // 先に括弧内を数値として計算（30という数値）

    // 文字列の長さ
    String message = "こんにちは";
    System.out.println(message.length()); // 5
    String empty = "";
    System.out.println(empty.length()); // 0

    // 文字列の比較
    String a = "Hello";
    String b = "Hello";
    String c = "hello";
    System.out.println(a.equals(b));  // 値が等しいためtrue
    System.out.println(a.equals(c));  // 大文字と小文字が異なるためfalse
    System.out.println(a.equalsIgnoreCase(c));  // 大文字小文字を無視するためtrue

    //文字の一部を取得
    String text = "Hello World";
    System.out.println(text.substring(0, 5));  // Hello（開始位置が0番目、終了位置が5番目の手前まで）
    System.out.println(text.substring(6));  // World(開始位置6番目から最後まで)

    //文字列の検索
    String message2 = "今日の天気が良いです";
    System.out.println(message2.contains("天気")); // "天気"という文字列が含まれているのでtrue
    System.out.println(message2.contains("明日")); // "明日"という文字列は含まれていないのでfalse
    
    String text2 = "abcdefg";
    System.out.println(text2.indexOf("cd"));  // 2（0番目から検索して2番目に見つかった)
    System.out.println(text2.indexOf("xyz"));  // -1（見つからない場合は-1）

    //文字列の一部を置換
    String original = "I like cats";
    String replaced = original.replace("cats", "dogs");
    System.out.println(original); // "I like cats"（元の文字列）
    System.out.println(replaced); // "I like dogs"（置換後の文字列）

    //文字列を配列に分割
    String csv = "りんご,みかん,ぶどう";
    String[] fruits = csv.split(","); // カンマ区切りで分割し、配列へ
    for(var fruit : fruits){  
      System.out.println(fruit);  // りんご→みかん→ぶどう（拡張forループで配列を1つずつ出力）
    }

    //その他のメソッド
    String text3 = "Hello World";
    System.out.println(text3.toUpperCase());  // HELLO WORLD（全て大文字になる）
    System.out.println(text3.toLowerCase());  // hello world（全て小文字になる）
    String input = "   こんにちは   ";
    System.out.println(input.trim());  // こんにちは（空白がなくなる）

    //書式付き文字列
    //変数は上記のものを使用する
    name = "太郎";
    age = 25;
    String message3 = String.format("名前： %s、年齢： %d歳", name, age);
    System.out.println(message3); // "名前： 太郎、年齢： 25歳"
    // %sは文字列、%dは整数。%fは小数の値を埋め込むためのプレースホルダー
    double price = 1234.5;
    System.out.println(String.format("価格： %.0f円", price));  // 小数点以下四捨五入
    System.out.println(String.format("価格： %.2f円", price));  // 小数点2位まで出力
  }
}