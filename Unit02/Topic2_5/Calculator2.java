package Unit02.Topic2_5;

public class Calculator2 {
    public double average(int num1,double num2){
        double avg = (num1+num2)/2;
        return avg;
    }
    
    public double average(int num1,double num2,double num3){
        double avg=(num1+num2+num3)/3;
        return avg;
    }
    public static void main(String[] args){
        Calculator2 math = new Calculator2();
        math.average(2, 3);
        System.out.println(math.average(2, 3));
    }
}

