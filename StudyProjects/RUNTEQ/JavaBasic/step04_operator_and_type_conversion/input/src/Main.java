public class Main{
  public static void main(String[] args){
    // //算術演算子
    // int a = 10;
    // int b = 3;
    // System.out.println(a + b);  // 13
    // System.out.println(a - b);  // 7
    // System.out.println(a * b);  // 30
    // System.out.println(a / b);  // 3 (小数点以下切り捨て)
    // System.out.println(a % b);  // 1（10 ÷ 3 のあまり）

    // //演算の優先順位
    // int result = 10 + 3 * 2;
    // System.out.println(result); // 16（3 * 2　= 6 → 10 + 6の順番）
    // result = (10 + 3) * 2;
    // System.out.println(result); // 26（10 + 3 = 13 → 13 * 2の順番）

    // //複合代入演算子
    // //省略しない書き方
    // int price = 500;
    // price = price + 100;  // priceに100を加算する
    // System.out.println(price);

    // //複合代入演算子を使った書き方
    // price = 500;
    // price += 100;  // price = price + 100; と同じ意味
    // System.out.println(price);

    // int value = 100;
    // value -= 30;  // value = value - 30; → 70
    // System.out.println(value);
    // value *= 2;   // value = value * 2; → 140
    // System.out.println(value);
    // value /= 7;   // value = value / 7; → 20
    // System.out.println(value);
    // value %= 3;   // value = value % 3;  → 2
    // System.out.println(value);

    // //インクリメントとデクリメント
    // int count = 0;
    // count++; // count = count + 1; と同じ意味 → 1
    // count++; // 2
    // count--; // count = count - 1; と同じ意味 → 1

    // //比較演算子
    // a = 10;
    // b = 5;
    // System.out.println(a == b); // 等しいか → false
    // System.out.println(a != b); // 等しくないか → true
    // System.out.println(a > b);  // aがbより大きいか → true
    // System.out.println(a < b);  // aがbより小さいか → false
    // System.out.println(a >= b);  // aがb以上か → true
    // System.out.println(a <= b);  // aがb以下か → false

    // //論理演算子
    // int age = 20;
    // int score = 80;
    // System.out.println(age >= 18 && score >= 70); // 両方とも満たすためtrue
    // System.out.println(age >= 18 || score >= 90); // age >= 18（片方）を満たしているのでtrue
    // System.out.println(!(age >= 18)); // trueを反転するのでfalse

    // //自動型変換（暗黙的変換）
    // int c = 10;
    // double d = 3.0;
    // double result2 = c + d; // cが自動的に10.0に変換される
    // System.out.println(result2); //13.0
    // // double result = 10;  //int → doubleは自動的に型変換される
    // // int result = 10.5;   //コンパイルエラー、double → intは自動型変換されない

    // //明示的な型変換（キャスト）
    // double pi = 3.14;
    // int rounded = (int)pi;  // double → intに明示的に型変換
    // System.out.println(rounded);  // 3 → int型のため小数点以下切り捨て

    // a = 10;
    // b = 3;
    // System.out.println(a / b);  // 3 → 型がintため小数点以下切り捨て
    // System.out.println((double)a / b);  // 3.33333... → aをdouble型にしてから計算しているため、計算結果がdouble型になる

    // //Stringと数値の変換
    // //整数の場合
    // String priceText = "100"; // "100"という文字列
    // price = Integer.parseInt(priceText);  //  文字列をint型に変換
    // System.out.println(price + 50);  // 150

    // //小数の場合
    // String rateText = "0.1";  // "0.1"という文字列
    // double rate = Double.parseDouble(rateText); // 文字列をdouble型に変換
    // System.out.println(rate * 1000); // 100.0(double型)

    // //数値→文字列に変換
    // price = 100;
    // priceText = String.valueOf(price);
    // System.out.println("価格は" +  price + "円です"); // "価格は100円です"
    // //今回の場合、数値が自動的に文字列に変換されるため、明示的に呼ばないことの方が多い

    int price = 1980;
    double taxRate = 0.10;

    //税込価格を計算する
    double taxIncluded = price * (1 + taxRate);
    System.out.println(taxIncluded);

    //小数点以下を切り捨て
    int taxIncludedInt = (int)taxIncluded;
    System.out.println(taxIncludedInt);
  }
}