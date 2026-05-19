public class Main {
  public static void main(String[] args){
    System.out.println(calculateTaxIncluded(1000, 0.10));
    System.out.println(calculateTaxIncluded(1980, 0.10));
  }

  public static int calculateTaxIncluded(int price, double taxRate){
    final double TAX_RATE = 1 + taxRate;
    return (int)(price * TAX_RATE);
  }
}