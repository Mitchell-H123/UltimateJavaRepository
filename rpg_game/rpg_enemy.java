package rpg_game;

public class rpg_enemy {
    private int score;
    private int attack;
    private int hp;
    private String name;
    private int weakness;//0=none 1=fire 2=ice 3=earth 4=lightning

    public rpg_enemy(int n){
        if(n==1){
            name="zombie";
            attack=3;
            hp=100;
            weakness=1;
        }
    }
    
}
