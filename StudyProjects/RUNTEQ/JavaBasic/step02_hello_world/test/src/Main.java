public class Main {
    public static void main(String[] args){
        System.out.println(profileInfo("太郎", 25));
        System.out.println(profileInfo("花子", 30));
    }

    public static String profileInfo(String name, int age) {
        return name + "は" + age + "歳です";
    }
}