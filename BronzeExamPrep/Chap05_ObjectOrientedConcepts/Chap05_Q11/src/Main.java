import test.Sample;
import test.SampleFactory;
//import test.SampleImpl;   違うパッケージでpublicではないためエラー

public class Main {
    public static void main(String[] args) {
        //Sample s = new SampleImpl();  SampleImpl();がpublicではないためエラー
        Sample s = SampleFactory.create();
        s.hello();
    }
}
