package Unit05;

public class Topic5_8ScopeAndAccess {

    private int num=1;

    public void PrintNum(int i){
        int num=i;  //makes a local num var not the private num var
        System.out.println(num);
    }
    public static void main(String[] args) {
        Topic5_8ScopeAndAccess a=new Topic5_8ScopeAndAccess();
        a.PrintNum(5);
    }
}
