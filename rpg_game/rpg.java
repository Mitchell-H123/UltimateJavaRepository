package rpg_game;
import java.util.Scanner;

public class rpg {

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        rpg_class p1= new rpg_class();
        rpg_class p2= new rpg_class();
        rpg_class p3= new rpg_class();
        rpg_class p4= new rpg_class();
        int score=0;

        System.out.println("Enter the first characters name:");
        p1.setname(s.next());
        System.out.println("Enter the first characters class number:\n1)Archer\n2)Knight\n3)Mage\n4)Thief");
        p1.settype(s.nextInt());
        System.out.println("Enter the first characters element number:\n1)fire\n2)ice\n3)earth\n4)lightning");
        p1.setelement(s.nextInt());
        System.out.println("Character 1: "+p1.getname()+" is a "+p1.getelement()+" "+p1.gettype());

        System.out.println("Enter the second characters name:");
        p2.setname(s.next());
        System.out.println("Enter the second characters class number:\n1)Archer\n2)Knight\n3)Mage\n4)Thief");
        p2.settype(s.nextInt());
        System.out.println("Enter the second characters element number:\n1)fire\n2)ice\n3)earth\n4)lightning");
        p2.setelement(s.nextInt());
        System.out.println("Character 2: "+p2.getname()+" is a "+p2.getelement()+" "+p2.gettype());

        System.out.println("Enter the third characters name:");
        p3.setname(s.next());
        System.out.println("Enter the third characters class number:\n1)Archer\n2)Knight\n3)Mage\n4)Thief");
        p3.settype(s.nextInt());
        System.out.println("Enter the third characters element number:\n1)fire\n2)ice\n3)earth\n4)lightning");
        p3.setelement(s.nextInt());
        System.out.println("Character 3: "+p3.getname()+" is a "+p3.getelement()+" "+p3.gettype());

        System.out.println("Enter the fourth characters name:");
        p4.setname(s.next());
        System.out.println("Enter the fourth characters class number:\n1)Archer\n2)Knight\n3)Mage\n4)Thief");
        p4.settype(s.nextInt());
        System.out.println("Enter the fourth characters element number:\n1)fire\n2)ice\n3)earth\n4)lightning");
        p4.setelement(s.nextInt());
        System.out.println("Character 3: "+p4.getname()+" is a "+p4.getelement()+" "+p4.gettype());

        //game
        do{

        }while(p1.alive()||p2.alive()||p3.alive()||p4.alive());

    }
}