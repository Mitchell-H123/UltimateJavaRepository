package Unit09;

public class Topic9_5CreatingReferencesUsingInheritanceHierarchies {
    public static void main(String[] args) {
        performer9_3[] list=new performer9_3[3];
        list[0]=new comedian9_4("fred", 0);
        list[1]=new performer9_3("jeff", 0);
        System.out.println(list[0].getName()+" is "+list[0].perform());
        System.out.println(list[1].getName()+" is "+list[1].perform());


        performer9_3 afafd=new comedian9_3("aahfdagfagfa", 0);
        list[2]=afafd;
        System.out.println(list[2].getName()+" is "+list[2].perform());
    }
}
