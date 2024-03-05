package Unit06;

public class Topic6_1ArrayCreationAndAccess {
    public static void main(String[] args) {
        int [] list=new int[10];
        int x;
        for(int i=0;i<list.length;i++){
            x=(int)(Math.random()*10);
            list[i]=x;
            System.out.print(list[i]+" ");
        }
    }
}
