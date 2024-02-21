package Unit05;

public class Topic5_4AccessorMethods {
    private int calories=55;

    //accessor method
    public int getCalories(){
        int c=calories;
        return c;
    }
    
    public static void main(String[] args) {
        Topic5_4AccessorMethods i=new Topic5_4AccessorMethods();
        System.out.println(i.getCalories());
    }
}
