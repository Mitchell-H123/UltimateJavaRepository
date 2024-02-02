package Unit03.Xtras;
import java.util.Scanner;
public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the coefficients to a quadratic formula to solve");
        System.out.print("a:");
        double a=s.nextDouble();
        System.out.print("b:");
        double b=s.nextDouble();
        System.out.print("c:");
        double c=s.nextDouble();
        double dis=Math.sqrt(Math.pow(b, 2)-4*a*c);
        if(dis>=0){
            double x1=((b*-1)+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
            double x2=((b*-1)-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
            System.out.println("The solutions to "+a+"x^2 + "+b+"x + "+c+" are x="+x1+", x="+x2);
        }
        else{
            System.out.println("The equation "+a+"x^2 + "+b+"x + "+c+" has no real solutions");
        }
    }
}

// javac Unit03\Xtras\QuadraticSolver.java
// java Unit03.Xtras.QuadraticSolver