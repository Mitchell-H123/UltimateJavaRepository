package Unit04;

public class Topic4_2ForLoops {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
        for(int num=0;num<=10;num++){
            System.out.print(num*3+" ");
        }
        System.out.println("\n");
        int years=50;
        double total=200;
        for(int year=1;year<=years;year++){
            total=total+(total*.1);
            System.out.println("$"+total);
        }
    }
}

// javac Unit04\Topic4_2ForLoops.java; java Unit04.Topic4_2ForLoops