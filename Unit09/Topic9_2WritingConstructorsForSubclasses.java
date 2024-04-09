package Unit09;

public class Topic9_2WritingConstructorsForSubclasses {
    public static void main(String[] args) {
        performer9_2 person1=new performer9_2("jeff",21);
        performer9_2 person2=new performer9_2();
        musician9_2 person3=new musician9_2();
        musician9_2 person4=new musician9_2("drum");
        musician9_2 person5=new musician9_2("bob",18,"saxophone");

        System.out.println(person1.getName());
        System.out.println();
        System.out.println(person2.getName());
        System.out.println();
        System.out.println(person3.getInst());
        System.out.println(person3.getAge());
        System.out.println();
        System.out.println(person4.getName());
        System.out.println(person4.getAge());
        System.out.println(person4.getInst());
        System.out.println();
        System.out.println(person5.getName());
        System.out.println(person5.getAge());
        System.out.println(person5.getInst());
    }
}
