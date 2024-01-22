package Unit02.Topic2_5;

public class lunch {
    public double divideBill(int friends, double totalBill){
        double cost=totalBill/friends;
        return cost;
    }
    public static void main(String[] args){
        System.out.print("your lunch cost: ");
        lunch cost=new lunch();
        System.out.println(cost.divideBill(4,50));
    }
}
