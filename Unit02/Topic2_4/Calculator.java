package Unit02.Topic2_4;

public class Calculator {
    public void average(int num1,double num2){
        double avg = (num1+num2)/2;
        System.out.println("average = "+avg);
    }
    
    public void average(int num1,double num2,double num3){
        double avg=(num1+num2+num3)/3;
        System.out.println("average = "+avg);
    }
    public static void main(String[] args){
        Calculator math = new Calculator();
        math.average(2, 3);
        math.average(22, 4,5);
    }
}
