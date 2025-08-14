public class Employee{
    private int no;
    private String name;
    private Corporate corporate;

    public Employee(int no, String name){
        this.no = no;
        this.name = name;
        this.corporate = new Corporate("株式会社ABC","横浜市西区X-YY-Z 2F");
    }

    public void hello(){    
        System.out.println("おはようございます。従業員No:" + no + "の" + name + "さん！");
        System.out.println("会社名：" + corporate.getName());
        System.out.println("住所：" + corporate.getAddress());
    }
}