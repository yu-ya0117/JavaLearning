public class Employee{
    private int no;
    private String name;

    public Employee(int no, String name){
        this.no = no;
        this.name = name;
    }

    public void greet(){    
        System.out.println("こんにちは、私は" +  name + "(従業員No：" + no +")さん！");
    }
}