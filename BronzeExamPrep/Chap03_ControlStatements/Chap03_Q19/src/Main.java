public class Main {
    public static void main(String[] args) {
        //double b = 1.5; double型、float型、boolean型は使用不可
        int b = 2;
        switch(b){  //switch文ではboolean型、float型、double型は使用不可
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
        }
    }
}
