package Unit04;

public class Topic4_1WhileLoops {
    public static void main(String[] args) {
        int num=5384;
        int sum=0;
        while (num>0) {
            int digit=num%10;
            sum+=digit;
            num=num/10;
        }
        System.out.println("sum: "+sum);


        double total=200;
        int year=0;
        while(total<1000){
            total=total+(total*.1);
            year++;
            System.out.println("Year "+year+": $"+total);
        }
        
    }
}
// javac Unit04\Topic4_1WhileLoops.java; java Unit04.Topic4_1WhileLoops