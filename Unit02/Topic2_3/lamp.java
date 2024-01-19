package Unit02.Topic2_3;

public class lamp {
    private boolean isOn;

    public void turnOn(){
        isOn=true;
        System.out.println("the lamp is on");
    }

    public void turnOff(){
        isOn=false;
        System.out.println("the lamp is off");
    }

    public static void main (String[] args){
        lamp lamp1 = new lamp();
        lamp1.turnOn();
        lamp lamp2=new lamp();
        lamp2.turnOff();
    }
}
