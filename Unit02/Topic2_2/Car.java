package Unit02.Topic2_2;

public class Car {
    private String make;
    private boolean isSports;
    private String owner;

    public Car(String mk, boolean sport, String own) {
        make = mk;
        isSports = sport;
        owner = own;
    }

    public static void main(String[] args) {
        Car car1 = new Car("ford", false, "person1");
        System.out.println(car1.make);
        System.out.println(car1.isSports);
        System.out.println(car1.owner);
    }
}
