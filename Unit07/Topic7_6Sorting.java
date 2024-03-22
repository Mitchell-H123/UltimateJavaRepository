package Unit07;
import java.util.ArrayList;
public class Topic7_6Sorting {
    public static void main(String[] args){
        ArrayList<Integer> x=new ArrayList<Integer>();
        x.add(3);
        x.add(5);
        x.add(1);
        x.add(9);
        x.add(5);

        for(int outer=1;outer<x.size();outer++){
            Integer tested = x.get(outer);
            int inner=outer-1;

            while(inner>=0 && tested.compareTo(x.get(inner))<0){
                x.set(inner+1, x.get(inner));
                inner--;
            }
            x.set(inner+1, tested);
        }

        System.out.println(x);
    }
}
