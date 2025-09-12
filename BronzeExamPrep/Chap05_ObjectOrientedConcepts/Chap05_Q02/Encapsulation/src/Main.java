public class Main {
    public static void main(String[] args) {
        Corporate coporate = new Corporate("株式会社ABC","神奈川県横浜市西区みなとみらいX-YY-ZZ");
        Employee employee = new Employee(39,"鈴木");
        employee.greet();
        
        System.out.println("会社名：" + coporate.getName());
        System.out.println("住所：" + coporate.getAddress());
    }
}