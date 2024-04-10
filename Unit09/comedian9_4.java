package Unit09;

public class comedian9_4 extends performer9_3 {
    public comedian9_4(String n, int a){
        super(n,a);
    }

    //this overrides the superclass perform but uses the super class perform with super.perform()
    public String perform(){
        return super.perform()+" by telling funny jokes";
    }
}
