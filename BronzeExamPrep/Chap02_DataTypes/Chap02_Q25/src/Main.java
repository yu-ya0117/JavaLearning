public class Main {
    public static void main(String[] args) {
        System.out.println(args.length);
        //System.out.println(args[0]);
        /*
            javac -d bin src/Main.java　→　コンパイルは普通に通る
            java -cp bin Main　→　0が出力される
            この状態でSystem.out.println(args[0]);を実行すると例外が発生する 
        */
    }
}
