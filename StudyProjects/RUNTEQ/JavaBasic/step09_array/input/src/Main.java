public class Main {
    public static void main(String[] args) {
        // 配列の宣言と初期化
        // 値を直接列挙する場合
        // int[] prices = {100, 200,300,400,500};
        // String[] names = {"太郎", "花子", "次郎"};

        // newキーワードを使って要素だけを指定する場合
        // int[] prices = new int[5];  //要素数5のint型の配列（初期値は全て0）

        // 配列の要素へのアクセス
        // int[] prices = {100, 200, 300};
        // for(int i = 0; i < prices.length; i++) {
        //   System.out.println(prices[i]); // prices[0] = 100, prices[1] = 200, prices[2] = 300
        // }

        // prices[1] = 250; // 配列の要素を上書き
        // System.out.println(prices[1]); // 250
        
        // 要素の長さを取得
        // int[] prices = {100, 200, 300, 400, 500};
        // System.out.println(prices.length); // 5

        // String型におけるlength()とint[]のlengthの違い
        String text = "Hello";
        System.out.println(text.length()); // 5（String型のlength()メソッド → 括弧あり）
        int[] numbers = {1, 2, 3};
        System.out.println(numbers.length); // 3（配列のフィールド → 括弧なし）

        // 配列の範囲外にアクセスしようとすると例外が発生する
        // int[] prices = {100, 200, 300};
        // System.out.println(prices[3]); // ArrayIndexOutOfBoundsException（インデックスは0〜2まで）
        // 例外はコンパイルエラーとは違い、プログラム実行時に発生するため注意！

        // for文による配列の反復処理
        int[] prices = {100, 200, 300, 400, 500};
        for (int i = 0; i < prices.length; i++) {
          System.out.println("prices[" + i + "] = " + prices[i]);
        }

        // 拡張for文を使う場合
        for (int price : prices){
          System.out.println(price);
        }
        // ただし拡張for文の場合はインデックスを使うことができない。
        // 何番目の要素かを知りたい場合は通常のfor文を使う必要がある。
        String[] names = {"太郎", "花子", "次郎"};
        for (int i = 0; i < names.length; i++) {
          System.out.println((i + 1) + "番目: " + names[i]);
        }

        // 配列を使った集計パターン
        // 合計を求める
        // int[] scores = {85, 72, 90, 68, 95};
        // int sum = 0;
        // for (int score : scores) {
        //     sum += score;
        // }
        // System.out.println("合計: " + sum); // 410

        // 平均を求める
        // int[] scores = {85, 72, 90, 68, 95}; // 同上のためコメントアウト
        // int sum = 0;
        // for (int score : scores) {
        //   sum += score;
        // }
        // double average = (double) sum / scores.length;
        // System.out.println("平均: " + average); // 82.0

        // 最大値を求める
        // int[] scores = {85, 72, 90, 68, 95}; // 同上のためコメントアウト
        // int max = scores[0];  // 最初の要素を暫定の最大値とする
        // for (int i = 0; i < scores.length; i++) {
        //   if (scores[i] > max) max = scores[i];
        // }
        // System.out.println("最高点: " + max); // 最高点: 95

        // 多次元配列
        int[][] matrix = {
          {1, 2, 3},
          {4, 5, 6},
          {7, 8, 9}
        };
        System.out.println(matrix[0][0]);  // 1（0行0列）
        System.out.println(matrix[1][2]);  // 6（1行2列）
        System.out.println(matrix[2][1]);  // 8（2行1列）

        // 二次元配列の処理は二重ループを使用する
        for (int i = 0; i < matrix.length; i++) {
          for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
          }
          System.out.println(); // 行ごとに改行
        }
        // 多次元配列は表やグリッドのようなデータを扱う時に役立つ

        // 実践例: テストの点数から平均点と最高点を求める
        int[] scores = {85, 72, 90, 68, 95, 78, 88};

        int sum = 0;
        int max = scores[0];
        int min = scores[0];

        for (int score : scores) {
          sum += score;
          if (score > max) max = score;
          if (score < min) min = score;
        }
        double average = (double) sum / scores.length;
        System.out.println("受験者数: " + scores.length + "人");
        System.out.println("合計: " + sum + "点");
        System.out.println("平均: " + String.format("%.1f", average) + "点");
        System.out.println("最高点: " + max + "点");
        System.out.println("最低点: " + min + "点");
    } 
}