package Unit10;
import java.util.ArrayList;
public class Topic10_2RecursiveSearchingAndSorting {

    public void mergeSort(ArrayList arr,int low,int high){
        if(low<high){
            int middle=(low+high)/2;
            mergeSort(arr, low, middle);
            mergeSort(arr, middle+1, high);
            mergeSort(arr, low, high);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(3);
        a.add(-5);
        a.add(1);
        a.add(9);
        a.add(5);
        a.add(3);
        //mergeSort(a,0,10);
    }
}
