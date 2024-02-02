package Unit03.Xtras;
import java.util.Scanner;
public class DiscordTagGenerator {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Please enter you desired discord username: ");
        String username=s.nextLine();
        int num1=(int)(Math.random()*10);
        int num2=(int)(Math.random()*10);
        int num3=(int)(Math.random()*10);
        int num4=(int)(Math.random()*10);
        String name=username+"#"+num1+num2+num3+num4;
        System.out.println("Your username is: "+name);
    }
}

// javac Unit03\Xtras\DiscordTagGenerator.java
// java Unit03.Xtras.DiscordTagGenerator