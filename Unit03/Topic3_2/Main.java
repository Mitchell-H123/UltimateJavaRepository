package Unit03.Topic3_2;

public class Main {

  public String greeting(){
    return "Hello, lets talk";
  }
  public String response(String statement){
    String response="thanks";
    if(statement.length()==0){
      response="say something";
    }
    return response;
  }
  public static void main(String[] args) {
    Main magpie= new Main();
    System.out.println(magpie.greeting());
    System.out.println(magpie.response(""));
    System.out.println(magpie.response("hello"));

  }

}

// javac Unit03/Topic3_2/Main.java; java Unit03.Topic3_2.Main