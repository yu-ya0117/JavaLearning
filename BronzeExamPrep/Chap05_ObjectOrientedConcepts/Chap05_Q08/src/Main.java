public class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        //p.method("Child");    ここでコンパイルエラー
        p.method();   
    }
}
