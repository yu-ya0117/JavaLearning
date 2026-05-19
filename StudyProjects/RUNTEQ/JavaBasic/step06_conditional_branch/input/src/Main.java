public class Main {
    public static void main(String[] args) {
        // if文
        int age = 20;
        if (age >= 18) System.out.println("成人です");

        // if-else文
        age = 15;
        if (age >= 18) System.out.println("成人です");
        else System.out.println("未成年です");

        // if-else if-else文
        int score = 75;
        if (score >= 90) System.out.println("評価: A");
        else if (score >= 70) System.out.println("評価: B");
        else if (score >= 50) System.out.println("評価: C");
        else System.out.println("評価: D");

        // 条件式の組み合わせ
        // &&（かつ）
        age = 25;
        boolean hasLicense = true;
        if (age >= 18 && hasLicense) System.out.println("運転できます");
        else System.out.println("運転できません");

        // ||（または）
        String day = "土曜日";
        if (day.equals("土曜日") || day.equals("日曜日")) System.out.println("休日です"); //文字列比較はequals
        else System.out.println("平日です");

        // ネストしたif文
        age = 20;
        boolean isStudent = true;
        if (age >= 18)
            if (isStudent) System.out.println("成人の学生です");
            else System.out.println("成人ですが学生ではありません");
        else System.out.println("未成年です");

        // switch文
        int dayNumber = 3;
        switch (dayNumber){
            case 1:
                System.out.println("月曜日");
                break;
            case 2:
                System.out.println("火曜日");
                break;
            case 3:
                System.out.println("水曜日");
                break;
            case 4:
                System.out.println("木曜日");
                break;
            case 5:
                System.out.println("金曜日");
                break;
            default:
                System.out.println("週末");
                break;
        }

        // 三項演算子
        age = 20;
        String status = age >= 18 ? "成年" : "未成年";
        System.out.println(status); //成年
        // if-else文と同じ
        // if(age >= 18) status = "成年";
        // else status = "未成年";

        // 実践例：税込価格と割引の計算
        int price = 5000;
        double taxRate = 0.10;
        double discountRate = 0.05; // 5%割引

        // 税込価格
        int taxIncludePrice = (int)(price * (1 + taxRate));

        // 3,000円以上なら割引適用
        int finalPrice;
        if (taxIncludePrice >= 3000) {
            finalPrice = (int)(taxIncludePrice * (1 - discountRate));
            System.out.println("割引が適用されました!");
        } else {
            finalPrice = taxIncludePrice;
            System.out.println("割引の対象外です");
        }

        System.out.println("税込価格: " + taxIncludePrice + "円");
        System.out.println("最終価格: " + finalPrice + "円");
    }
}