package Unit07;
import java.util.ArrayList;
public class Topic7_4DevelopingAlgorithmsUsingArrayLists {
    public static void main(String[] args){
        ArrayList<Integer> x=new ArrayList<Integer>();
        x.add(43);
        x.add(65);
        x.add(42);
        x.add(76);
        int max=Integer.MIN_VALUE;
        for(int i:x){
            if(i>max){
                max=i;
            }
        }
        System.out.println(max);
    }
}
