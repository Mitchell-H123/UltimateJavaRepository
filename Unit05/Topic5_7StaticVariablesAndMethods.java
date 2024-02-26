package Unit05;

public class Topic5_7StaticVariablesAndMethods {
    private static int classID=1;
    private static int hwID=1;
    private String name;
    private int pointVal;
    public Topic5_7StaticVariablesAndMethods(String type, int pV){
        pointVal=pV;
        if(type.equals("classwork")){
            name=type+" "+classID;
            classID++;
        }
        else{
            name=type+" "+hwID;
            hwID++;
        }
    }

    public static void main(String[] args) {
        String a="classwork";
        int b=5;
        Topic5_7StaticVariablesAndMethods hw=new Topic5_7StaticVariablesAndMethods(a,b);

    }
}
