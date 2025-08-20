public class Main{
    public static void main(String[] args) {
        Part p1 = new Part();   //countを0で初期化
        Part p2 = new Part();
        p1.count = 1;   //インスタンス変数p1を使用してstaticフィールドのcountを1にする
        System.out.println(p2.count);   //staticフィールドは全てのインスタンスで共有されるので1が出力される。
    }
}

class Part{
    public static int count = 0;    //このcountはヒープ領域ではなくstatic領域にある。
}