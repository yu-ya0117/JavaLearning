public class Main{
    public static void main(String[] args) {
        int i = 0;
        while(i < 2){
            i++;
            for(int j = 0; j < 2; j++){
                System.out.print(i * j + " ");
            }
        }
    }
}