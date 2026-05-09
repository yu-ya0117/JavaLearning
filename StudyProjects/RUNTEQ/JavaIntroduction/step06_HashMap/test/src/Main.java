import java.util.HashMap;

public class Main {
    public static int totalPrice(HashMap<String, Integer> items) {
        int total = 0;
        for(var entry : items.entrySet()){
            total += entry.getValue();
        }
        return (int)(total * 1.1);
    }

    public static void main(String[] args) {
        HashMap<String, Integer> items = new HashMap<>();
        items.put("apple", 100);
        items.put("banana", 200);
        items.put("orange", 300);
        System.out.println(totalPrice(items));
    }
}