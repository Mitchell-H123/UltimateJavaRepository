package Unit09;

public class performer9_3 {
    private String name;
    private int age;
    public performer9_3(String n, int a){
        name=n;
        age=a;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    //is overriden
    public String perform(){
        return "performing for the audence";
    }
}
