public class Main{
    public static void main(String[] args) {
        ClassA a = new ClassA();
        String str = a.doMethod();  //staticメソッドは「インスタンス変数名.staticメソッド」で呼び出し可能。
        //String str = ClassA.doMethod();でも結果は同じ（インスタンスの生成不要）
        System.out.println(str);    //hogeの文字が出力される。
    }
}

class ClassA{
    static String doMethod(){
            return "hoge";
    }
}