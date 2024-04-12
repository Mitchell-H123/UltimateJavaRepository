package Unit09;

public class Topic9_7ObjectSuperclass {
    private int size;
    private String material;
    public Topic9_7ObjectSuperclass(int s,String m){
        size=s;
        material=m;
    }
    // overrides object tostring
    public String toString(){
        return "Hat size: "+size+", Hat material: "+ material;
    }

    //overrides equals
    public boolean equals(Object other){
        Topic9_7ObjectSuperclass that=(Topic9_7ObjectSuperclass)other;
        return this.size==that.size;
    }

    public static void main(String[] args) {
        Topic9_7ObjectSuperclass hat=new Topic9_7ObjectSuperclass(5, "wool");
        Topic9_7ObjectSuperclass hat2=new Topic9_7ObjectSuperclass(5, "leather");

        //prints the tostring
        System.out.println(hat);

        //uses the topic 9_7 class's .equals()
        System.out.println(hat.equals(hat2));
    }
}
