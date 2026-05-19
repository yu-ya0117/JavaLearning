public class Main{
  public static void main(String[] args){
    System.out.println(extractDomain("hanako@test.co.jp"));
  }

  public static String extractDomain(String email){
    int atMark = email.indexOf("@");
    return email.substring(atMark + 1);
  }
}