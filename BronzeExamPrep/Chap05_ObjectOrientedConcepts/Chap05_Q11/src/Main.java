import test.Sample;
import test.SampleFactory;
//import test.SampleImpl;   この行のコメントを外すとコンパイルエラー 

public class Main {
    public static void main(String[] args) {
        Sample s = SampleFactory.create();
        s.hello();
    }
}
