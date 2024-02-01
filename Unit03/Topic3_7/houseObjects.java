package Unit03.Topic3_7;

public class houseObjects {
    private String color;
    private int squarefeet;
    private int bedrooms;

    public houseObjects(String c, int sf, int bed){
        color=c;
        squarefeet=sf;
        bedrooms=bed;
    }

    public static void main(String[] args){
        houseObjects myHouse= new houseObjects("Green", 1850, 3);
        houseObjects bobsHouse= new houseObjects("Blue", 1850, 3);
        houseObjects annasHouse= new houseObjects("Green", 1850, 3);
        houseObjects momsHouse= myHouse;
        houseObjects newHouse;
        if(myHouse==annasHouse){
            System.out.println("same house as anna");
        }
        if(myHouse==momsHouse){
            System.out.println("same house as mom");
        }
        if(myHouse.equals(bobsHouse)){
            System.out.println("similar house to bobs");
        }
        if(myHouse.equals(annasHouse)){
            System.out.println("similar house to annas");
        }
        System.out.println(myHouse.equals(bobsHouse)+" "+myHouse.equals(annasHouse));

    }
}
//myHouse.equals(annashouse) should be true according to video, but is returning false
