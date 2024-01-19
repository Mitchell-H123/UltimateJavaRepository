package Unit02.Topic2_4;

public class frog {
    public void move(int hops){
        System.out.println("the frog moved forward "+hops+" hops");
    }
    public void move(String direction, int hops){
        System.out.println("the frog moved "+direction+" "+hops+" hops");
    }
    public void move(){
        System.out.println("The frog moved forward 3 hops");
    }
    public static void main(String[] args){
        frog frog1= new frog();
        frog frog2=new frog();
        frog1.move();
        frog2.move("right", 5);
        frog1.move(8);
    }
}
