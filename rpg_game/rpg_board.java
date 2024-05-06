package rpg_game;

public class rpg_board {
    private rpg_class p1;
    private rpg_class p2;
    private rpg_class p3;
    private rpg_class p4;
    private rpg_enemy e;
    private int s;
    public rpg_board(rpg_class pA,rpg_class pB,rpg_class pC,rpg_class pD,rpg_enemy enemy,int score){
        p1=pA;
        p2=pB;
        p3=pC;
        p4=pD;
        e=enemy;
        s=score;
    }
    public void printBoard(){
        System.out.println("");
        System.out.println("SCORE: "+s);
        System.out.println(p1.getname()+" ("+p1.gethp()+")                    "+e.getEname()+" ("+e.getEhp()+")");
        System.out.println(p2.getname()+" ("+p2.gethp()+")");
        System.out.println(p3.getname()+" ("+p3.gethp()+")");
        System.out.println(p4.getname()+" ("+p4.gethp()+")");
        System.out.println("");
    }
}
