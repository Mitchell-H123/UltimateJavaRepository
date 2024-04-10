package Unit09;

public class Topic9_3OverridingMethods {

    public static void main(String[] args) {
        comedian9_3 c=new comedian9_3("fred", 19);
        performer9_3 p=new performer9_3("freddy", 17);
        System.out.println(c.getName()+" is "+ c.perform());
        System.out.println(p.getName()+" is "+ p.perform());
    }
}
