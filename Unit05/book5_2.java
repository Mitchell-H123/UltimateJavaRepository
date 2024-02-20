package Unit05;

public class book5_2 {
    private String title;
    private String genre;
    private String author;
    private int numpages;

    public book5_2(){   //default constructor
        title="";
        genre="";
        author="";
        numpages=0;
    }

    public book5_2(String t, String g, String a, int np){  //overloaded constr.
        title=t;
        genre=g;
        author=a;
        numpages=np;
    }

}
