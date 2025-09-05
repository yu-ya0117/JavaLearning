public class Main {
    public static void main(String[] args) {
        int[] array1 = {3, 8, 4};
        int[] array2 = array1;  //array1の保持している参照をarray2へコピー、array2はarray1と同じ配列を参照するようになる。
        System.out.println(array2[0]);  //array1[0]と同じ値が出力される
    }
}
