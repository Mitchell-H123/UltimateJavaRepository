package Unit07;
import java.util.ArrayList;
public class Topic7_5Searching {
    public static void main(String[] args){
        ArrayList<String> s=new ArrayList<String>();
        s.add("a");
        s.add("m");
        s.add("f");
        s.add("y");
        s.add("a");
        s.add("a");
        System.out.println(s);
        for(int i=s.size()-1;i>=0;i--){
            if(s.get(i).equals("a")){
                s.remove(i);
            }
        }
        System.out.println(s);
    }
}
