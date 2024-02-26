package Unit05;

public class Topic5_6WritingMethods {

    private int value;
//class is called mutable in video (called mutable bc it has a mutator method)
    public Topic5_6WritingMethods(int start){
        value=start;
    }
    public static void incrementParam(){
        //value++;
    }
    public int getValue(){
        return value;
    }
    public static void main(String[] args) {
        
    }
}
