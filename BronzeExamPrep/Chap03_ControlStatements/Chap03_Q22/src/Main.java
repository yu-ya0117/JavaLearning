public class Main {
    public static void main(String[] args) {
        String name = "cd";
        switch(name){
            case "book":
                System.out.print("本");
                break;
            case "game":
                System.out.print("ゲーム");
                break;
            default:
                System.out.println("その他");
        }
    }
}
