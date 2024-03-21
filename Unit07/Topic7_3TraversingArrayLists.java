package Unit07;
import java.util.ArrayList;
public class Topic7_3TraversingArrayLists {
    public static void main(String[] args){
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("abcdefghijklmnopqrstuvwxyz");
        arr.add("1234567890");

        int sum=0,i=0;
        while(i<arr.size()){
            sum += arr.get(i).length();
            i++;
        }
        System.out.println(sum);

        for(String s:arr){
            System.out.print(s);
        }
        for(String x:arr){
            sum+=x.length();
        }
        System.out.println("\n"+sum);

    }
}
