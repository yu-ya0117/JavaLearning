import java.text.SimpleDateFormat;
import java.util.Date;

public class Reference {
    public static void main(String[] args) {
        String strObj = "参照型（オブジェクト型）：String、Dateなど";
        String strex = "（例1）Hello,World!";
        System.out.println(strObj);
        System.out.println(strex);
        
        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年M月d日");
        String dateex = "（例2）本日は" + dateFormat.format(today);
        System.out.println(dateex);

        String strArray = "参照型（配列型）：int[],char[]など";
        char[] array = {'t','o','k','y','o'};
        System.out.println(strArray);
        System.out.println("（例）");
        for(int i = 0; i < array.length; i++){
            System.out.println("array[" + i + "] = " + array[i]);
        }

        String strEnum = "参照型(列挙型)：classのかわりにenumで書かれた定数の集まり";
        System.out.println(strEnum);
        System.out.println("（例）"+ City.SHINJUKU + "、" + City.YOKOHAMA + "、" + City.UMEDA);

        System.out.println("intは整数を扱うプリミティブ型です。");
        System.out.println("booleanは真偽値を扱うプリミティブ型です。");
    }
}

enum City{
    SHINJUKU,
    YOKOHAMA,
    UMEDA
}
