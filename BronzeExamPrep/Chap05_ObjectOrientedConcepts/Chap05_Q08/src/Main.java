public class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        //p.method("イクイノックス");   この行のコメントを外すとコンパイルエラーになる。
        p.method(); //「キタサンブラック」を表示

         Child c = new Child();
         c.method("イクイノックス");    //「イクイノックス」を表示
         c.method();    //「キタサンブラック」を表示
    }
}
