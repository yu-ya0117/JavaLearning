public class Main {
  public static void main(String[] args) {
    // for文（繰り返し回数が決まっている場合、配列を全て処理する場合などはこちらを使う）
    for (int i = 0; i < 5; i++){
      System.out.println("i = " + i);
    }

    // while文（条件に応じて繰り返しを終了する場合や特定の値が見つかるまで探す場合などはこちらを使う）
    int count = 1;
    while (count <= 5){
      System.out.println("count = " + count);
      count++;
    }

    // do-while文
    int number = 10;  // numberの初期値は10

    do {
      System.out.println("number = " + number);
      number++;
    } while (number < 5); // 条件をdo {} の後ろに書く
    // number < 5なので、numberの値は初期値の段階でfalse
    // しかしdo-while文は最低1回は実行される。
    // まずは処理を実行してから条件を判定したい場合に使われる

    // breakの使い方
    for (int i = 0; i < 10; i++){
      if (i == 5){
        break;  // ループから抜ける
      }
      System.out.println("i = " + i); // i = 0からi = 4まで出力される
    }

    // continue
    for (int i = 0; i < 10; i++){
      if (i % 2 == 0){
        continue;  // 偶数の場合はスキップする
      }
      System.out.println("i = " + i);// i = 1, i = 3, i = 5, i = 7, i = 9
    }

    // 無限ループ
    // breakを使って抜ける
    count = 0;

    while (true) {
      count++;
      System.out.println("count = " + count);

      if (count >= 5){
        break;  // countが5以上になったらループから抜ける
      }
    }

    // ネストされたループ（二重ループ）
    // 例：九九の計算
    for (int i = 1; i <= 9; i++){
      for (int j = 1; j <= 9; j++){
        System.out.println("i × j = " + i * j);
      }
    }

    // ループを使ってデータを集計する
    // 合計を求める
    int sum = 0;
    for (int i = 1; i <= 100; i ++) {
      sum += i;
    }
    System.out.println("1〜100までの合計: " + sum); // 5050

    //条件に合うものを数える
    count = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 3 == 0) {
        count++;
      }
    }

    System.out.println("1〜100までの3の倍数の個数: " + count); // 33

    // 3の倍数の合計
    count = 0;
    sum = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 3 == 0) {
        sum += i;
        count++;
      }
    }

    System.out.println("1〜100までの3の倍数の合計: " + sum); // 1683
  }
}