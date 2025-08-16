package test;

public class SampleFactory {
    public static Sample create(){
        return new SampleImpl();
    }
}
