public class Main {
    public static void main(String[] args) {
        try{
            int[] array = {1, 0, 2, 3};
            System.out.println(array[4]);   //ここで例外発生
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("例外：要素がありません");
        }
    }
}
