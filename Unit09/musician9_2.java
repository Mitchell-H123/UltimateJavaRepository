package Unit09;

public class musician9_2 extends performer9_2 {
    private String instrument;

    public musician9_2(){
        super();
        instrument="piano";
    }

    public musician9_2(String i){
        super();
        instrument=i;
    }

    public musician9_2(String n,int a, String i){
        super(n,a);
        instrument=i;
    }

    public String getInst(){
        return instrument;
    }
}
