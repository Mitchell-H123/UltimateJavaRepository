package Unit02.Topic2_3;
//greeting is a method
public class Main {
  
  public void letter(){
    greeting();
  }
  
  public void greeting(){
    System.out.println("hello");
  }
  public static void main(String[] args) {
    Main hello= new Main();
    hello.greeting();
  }

}
