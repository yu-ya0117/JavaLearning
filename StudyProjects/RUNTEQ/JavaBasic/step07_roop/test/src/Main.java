public class Main {
  public static void main (String[] args) {
    System.out.println(applyDiscount(1000, 20));
  }

  public static int applyDiscount(int price, int discountPercent) {
      final int HUNDRED = 100;
      // double discountRate = 1 - (double)discountPercent / HUNDRED;
      // return (int)(price * discountRate);
      return price - price * discountPercent / HUNDRED;
    }
}