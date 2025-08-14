public class StringComparisonSample {
    /**
 * Java SE Bronze 対策：文字列比較のひっかけ例まとめ
 * 
 * Q1〜Q5の挙動をすべて1ファイルで確認できるサンプル。
 * 実行すると、それぞれの結果と理由が表示されます。
 */
    public static void main(String[] args) {
        System.out.println("===== Q1: リテラル同士 =====");
        String a1 = "Java";
        String b1 = "Java";
        System.out.println("a1 == b1 : " + (a1 == b1));       // true（同じプール参照）
        System.out.println("a1.equals(b1) : " + a1.equals(b1)); // true（内容も同じ）
        
        System.out.println("\n===== Q2: new String() =====");
        String a2 = "Java";
        String b2 = new String("Java");
        System.out.println("a2 == b2 : " + (a2 == b2));       // false（別インスタンス）
        System.out.println("a2.equals(b2) : " + a2.equals(b2)); // true（内容は同じ）
        
        System.out.println("\n===== Q3: リテラル結合（定数畳み込み） =====");
        String a3 = "Ja" + "va"; // コンパイル時に "Java" にまとめられる
        String b3 = "Java";
        System.out.println("a3 == b3 : " + (a3 == b3));       // true（同じプール参照）
        
        System.out.println("\n===== Q4: 変数を使った結合（実行時結合） =====");
        String part = "va";
        String a4 = "Ja" + part; // 実行時に新しいString生成
        String b4 = "Java";
        System.out.println("a4 == b4 : " + (a4 == b4));       // false（別インスタンス）
        System.out.println("a4.equals(b4) : " + a4.equals(b4)); // true（内容は同じ）
        
        System.out.println("\n===== Q5: intern() メソッド =====");
        String a5 = new String("Java"); // ヒープ上に新しいString
        String b5 = a5.intern();        // プールにある"Java"の参照を取得
        String c5 = "Java";             // プール内の"Java"
        System.out.println("b5 == c5 : " + (b5 == c5));       // true（同じプール参照）
    }
}
