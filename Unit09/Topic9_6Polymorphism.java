package Unit09;

public class Topic9_6Polymorphism {
    public static void main(String[] args) {
        performer9_2 p=new musician9_2();
        System.out.println(((musician9_2)p).getInst());
    }
}
