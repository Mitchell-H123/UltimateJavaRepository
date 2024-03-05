package Unit06;

public class Topic6_2TraversingArrays {
    public static void main(String[] args) {
        String [] list={"red","yellow","blue"};
        int i=0;
        while(i<list.length){
            System.out.print(list[i].length()+"_");
            i++;
        }
    }
}
