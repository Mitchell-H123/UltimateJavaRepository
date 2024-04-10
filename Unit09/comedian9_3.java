package Unit09;

public class comedian9_3 extends performer9_3 {
    public comedian9_3(String n, int a){
        super(n,a);
    }

    //this overrides the superclass perform
    public String perform(){
        return "telling funny jokes";
    }
}
