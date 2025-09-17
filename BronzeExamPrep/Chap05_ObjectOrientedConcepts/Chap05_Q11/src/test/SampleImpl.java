package test;

//Sampleクラスを実装したクラス(publicではない)
class SampleImpl implements Sample{ 
    SampleImpl(){
        //do something
    }
    public void hello(){
        System.out.println("Hello, world.");
    }
}
