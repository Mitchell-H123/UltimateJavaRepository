package Unit03.Topic3_5;

public class Main {
  public static void main(String[] args) {
    boolean cake=true;
    boolean icecream=false;
    if (cake&&icecream){
      System.out.println("Awesome party");
    }
    else if(cake||icecream){
      System.out.println("Good party");
    }
    else{
      System.out.println("Bad party");
    }
  }

}

// javac Unit03/Topic3_5/Main.java; java Unit03.Topic3_5.Main