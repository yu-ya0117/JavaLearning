public class SubClass extends SuperClass{
    //private int num;  ここで宣言すると0になってしまう。
    public int getNum(){
        return this.num;
    }
}