public class Main {
    public static void main(String[] args) {
        System.out.println(args[0]);    
        System.out.println(args[1]);
        /* 
            javac -d bin src/Main.java　→　コンパイルは普通に通る
            java -cp bin Main Hello World　→　実行するとargsという配列変数に以下が代入される
            args[0] = "Hello";
            args[1] = "World";
        */
    }
}
