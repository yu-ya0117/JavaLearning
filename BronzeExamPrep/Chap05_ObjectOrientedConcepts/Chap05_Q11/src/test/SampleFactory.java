package test;

//SampleImplのインスタンスを生成するためのクラス(public)
public class SampleFactory {
    public static Sample create(){
        return new SampleImpl();
    }
}
