package Unit03.Topic3_6;

public class Main {
  public static void main(String[] args) {
    boolean a= true;
    boolean b=false;
    boolean i=!(a&&b);
    boolean j=(!a||!b);
    System.out.println(i+" "+j);
  }

}

// javac Unit03/Topic3_6/Main.java; java Unit03.Topic3_6.Main