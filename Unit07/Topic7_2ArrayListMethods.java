package Unit07;
import java.util.ArrayList;

public class Topic7_2ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> h= new ArrayList<String>();
        h.add("Hello");
        h.add(0,"hi");
        h.add("Howdy");
        h.add("Hey");
        h.remove(3);
        for(String x:h){
            System.out.println(x);
        }
        System.out.println(h.size());
        System.out.println(h.get(0));
        h.set(0,"HELLO!");
        System.out.println(h.get(0));
    }
    
}
