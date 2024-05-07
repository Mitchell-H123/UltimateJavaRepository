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
        int turn=1;

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
            rpg_enemy e=new rpg_enemy((int)(Math.random()*8)+1);
            rpg_board board = new rpg_board(p1, p2, p3, p4, e,score);
            do{
                if(turn==0){
                    board.printBoard();
                    int e_choice=(int)(Math.random()*4)+1;
                    if(e_choice==1){
                        System.out.println(e.getEname()+" attacked "+p1.getname());
                        p1.hurt(e.getEattack());
                        turn++;
                        if(p1.alive()==false&&p2.alive()==false&&p3.alive()==false&&p4.alive()==false){
                            break;
                        }
                    }
                    else if(e_choice==2){
                        System.out.println(e.getEname()+" attacked "+p2.getname());
                        p2.hurt(e.getEattack());
                        turn++;
                        if(p1.alive()==false&&p2.alive()==false&&p3.alive()==false&&p4.alive()==false){
                            break;
                        }
                    }
                    else if(e_choice==3){
                        System.out.println(e.getEname()+" attacked "+p3.getname());
                        p3.hurt(e.getEattack());
                        turn++;
                        if(p1.alive()==false&&p2.alive()==false&&p3.alive()==false&&p4.alive()==false){
                            break;
                        }
                    }
                    else{
                        System.out.println(e.getEname()+" attacked "+p4.getname());
                        p4.hurt(e.getEattack());
                        turn++;
                        if(p1.alive()==false&&p2.alive()==false&&p3.alive()==false&&p4.alive()==false){
                            break;
                        }
                    }
                    
                }
                else if(turn==1){
                    if(p1.alive()==true){
                        board.printBoard();
                        System.out.println(p1.getname()+"'s turn: 1)heal or 2)attack");
                        int choice=s.nextInt();
                        if(choice==1){
                            p1.heal(5.5);
                        }
                        else{
                            if(p1.geteleNum()==e.getweakness()){
                                System.out.println(p1.getname()+" uses a "+p1.getelement()+" attack");
                                e.attacked(p1.getatt()+10);
                            }
                            else{
                                System.out.println(p1.getname()+" attacks the enemy");
                                e.attacked(p1.getatt());
                            }
                        }
                        turn++;
                        score+=e.E_score();
                    }
                    else{
                        turn++;
                    }
                }
                else if(turn==2){
                    if(p2.alive()==true){
                        board.printBoard();
                        System.out.println(p2.getname()+"'s turn: 1)heal or 2)attack");
                        int choice=s.nextInt();
                        if(choice==1){
                            p2.heal(5.5);
                        }
                        else{
                            if(p2.geteleNum()==e.getweakness()){
                                System.out.println(p2.getname()+" uses a "+p2.getelement()+" attack");
                                e.attacked(p2.getatt()+10);
                            }
                            else{
                                System.out.println(p2.getname()+" attacks the enemy");
                                e.attacked(p2.getatt());
                            }
                        }
                        turn++;
                        score+=e.E_score();
                    }
                    else{
                        turn++;
                    }
                }
                else if(turn==3){
                    if(p3.alive()==true){
                        board.printBoard();
                        System.out.println(p3.getname()+"'s turn: 1)heal or 2)attack");
                        int choice=s.nextInt();
                        if(choice==1){
                            p3.heal(5.5);
                        }
                        else{
                            if(p3.geteleNum()==e.getweakness()){
                                System.out.println(p3.getname()+" uses a "+p3.getelement()+" attack");
                                e.attacked(p3.getatt()+10);
                            }
                            else{
                                System.out.println(p3.getname()+" attacks the enemy");
                                e.attacked(p3.getatt());
                            }
                        }
                        turn++;
                        score+=e.E_score();
                    }
                    else{
                        turn++;
                    }
                }
                else if(turn==4){
                    if(p4.alive()==true){
                        board.printBoard();
                        System.out.println(p4.getname()+"'s turn: 1)heal or 2)attack");
                        int choice=s.nextInt();
                        if(choice==1){
                            p4.heal(5.5);
                        }
                        else{
                            if(p4.geteleNum()==e.getweakness()){
                                System.out.println(p1.getname()+" uses a "+p4.getelement()+" attack");
                                e.attacked(p4.getatt()+10);
                            }
                            else{
                                System.out.println(p4.getname()+" attacks the enemy");
                                e.attacked(p4.getatt());
                            }
                        }
                        turn=0;
                        score+=e.E_score();
                    }
                    else{
                        turn=0;
                    }
                }
            }while(e.Ealive());
        }while(p1.alive()||p2.alive()||p3.alive()||p4.alive());
        System.out.println("\nFINAL SCORE: "+score);
    }
}

