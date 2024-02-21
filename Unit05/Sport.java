package Unit05;
//5.4 sports example
public class Sport {
    private String name;
    private int numAthletes;

    public Sport(String n, int num){
        name=n;
        numAthletes=num;
    }
    public String getName(){
        return name;
    }
    public int getNumAthletes(){
        return numAthletes;
    }

    public String toString(){
        return "Sport: "+name+"\nNumber of Athletes: "+numAthletes;
    }

        public static void main(String[] args){
            Sport volley=new Sport("Volleyball", 12);
            System.out.println(volley);
        }
}
