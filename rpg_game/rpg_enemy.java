package rpg_game;

public class rpg_enemy {
    private int score;
    private int attack;
    private double hp;
    private String name;
    private boolean alive=true;
    private int weakness;//0=none 1=fire 2=ice 3=earth 4=lightning

    public rpg_enemy(int n){
        if(n==1){
            name="zombie";
            attack=3;
            hp=100;
            weakness=1;
            score=10;
        }
        else if(n==2){
            name="skeleton";
            attack=5;
            hp=70;
            weakness=0;
            score=10;
        }
        else if(n==3){
            name="goblin";
            attack=5;
            hp=80;
            weakness=4;
            score=10;
        }
        else if(n==4){
            name="yeti";
            attack=15;
            hp=200;
            weakness=1;
            score=15;
        }
        else if(n==5){
            name="giant";
            attack=5;
            hp=600;
            weakness=3;
            score=20;
        }
        else if(n==6){
            name="witch";
            attack=15;
            hp=120;
            weakness=2;
            score=15;
        }
        else if(n==7){
            name="phantom";
            attack=20;
            hp=150;
            weakness=4;
            score=20;
        }
        else{
            name="DRAGON";
            attack=20;
            hp=500;
            weakness=0;
            score=50;
        }
    }
    
    public String getEname(){
        return name;
    }
    public int getEattack(){
        return attack;
    }
    public double getEhp(){
        return hp;
    }
    public int getweakness(){
        return weakness;
    }
    public int E_score(){
        if(getEhp()<=0){
            return score;
        }
        else{
            return 0;
        }
    }
    public boolean Ealive(){
        return alive;
    }

    public void attacked(int dmg){
        hp=hp-dmg;
        if(getEhp()<=0){
            alive=false;
            hp=0;
        }
    }

}
