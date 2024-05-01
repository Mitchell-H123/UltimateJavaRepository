package rpg_game;
import java.util.Scanner;

import Unit05.book5_2;

public class rpg_class {
//vars
    private String name;
    private int typenum;
    private String type;
    private int attack;
    private double hp;
    private int elementnum;
    private String element;
    private boolean alive=true;
//sets
    public void setname(String x){
        name=x;
    }
    public void settype(int x){
        if(x==1){
            typenum=x;
            type="Archer";
            attack=30;
            hp=20;
        }
        else if(x==2){
            typenum=x;
            type="Knight";
            attack=20;
            hp=30;
        }
        else if(x==3){
            typenum=x;
            type="Mage";
            attack=45;
            hp=10;
        }
        else{
            typenum=4;
            type="Thief";
            attack=15;
            hp=45;
        }
    }
    //fire>ice>earth>lightning
    public void setelement(int x){
        if(x==1){
            elementnum=x;
            element="fire";
        }
        else if(x==2){
            elementnum=x;
            element="ice";
        }
        else if(x==3){
            elementnum=x;
            element="earth";
        }
        else{
            elementnum=4;
            element="lightning";
        }
    }
//gets
    public String getname(){
        return name;
    }
    public String gettype(){
        return type;
    }
    public String getelement(){
        return element;
    }
    public int gettypenum(){
        return typenum;
    }
    public int geteleNum(){
        return elementnum;
    }
    public int getatt(){
        return attack;
    }
    public double gethp(){
        return hp;
    }
    public boolean alive(){
        return alive;
    }

//updating hp
    public void hurt(double dmg){
        hp=hp-dmg;
        if(hp<=0){
            alive=false;
            hp=0;
        }
    }
    public void heal(double amt){
        hp=hp+amt;
    }
}
