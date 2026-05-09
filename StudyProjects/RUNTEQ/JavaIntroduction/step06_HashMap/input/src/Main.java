import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> items1 = new HashMap<>();
        items1.put("apple", 100);
        items1.put("banana", 200);
        items1.put("orange", 300);
        cashier(items1);

        System.out.println("---次のお客様---");

        HashMap<String, Integer> items2 = new HashMap<>();
        items2.put("milk", 150);
        items2.put("bread", 200);
        items2.put("egg", 250);
        items2.put("butter", 400);
        cashier(items2);
    }

    public static void cashier(HashMap<String, Integer> items){
        int total = 0;
        for(var entry : items.entrySet()){
            System.out.println(entry.getKey() + "が1点");
            total += entry.getValue();
        }
        System.out.println("合計金額は" + (int)(total * 1.1) + "円です");
    }
}
