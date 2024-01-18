package Unit02.Topic2_2;

public class House {
    private String size;
    private double cost;

    public House(String s,double price){
        size=s;
        cost=price;
    }
    public static void main(String[] args){
        House home=new House("medium", 501234.77);
        System.out.println(home.size);
        System.out.println(home.cost);
    }
}
