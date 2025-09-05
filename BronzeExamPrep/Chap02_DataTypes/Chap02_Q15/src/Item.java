public class Item {
    static private int count = 0;   //もしくはprivateを外す

    public Item(){
        count++;
    }

    public static int getCount() {
        return count;
    }
}
