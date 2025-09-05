public class Document {
    private String title;   //アクセス修飾子 データ型　変数名の順番

    Document(String title){
        this.title = title;
    }

    public void print(){
        System.out.println(title);
    }
}
