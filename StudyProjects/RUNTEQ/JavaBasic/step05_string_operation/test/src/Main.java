public class Main {
    public static String evaluateScore(int score) {
        if (score >= 90) return  "A";
        else if(score >= 70) return "B";
        else if(score >= 50) return "C";
        else return "D";
    }

    public static void main(String[] args) {
        System.out.println(evaluateScore(85));
    }
}