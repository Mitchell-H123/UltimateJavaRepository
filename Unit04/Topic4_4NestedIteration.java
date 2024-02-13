package Unit04;

public class Topic4_4NestedIteration {
    public static void main(String[] args) {
        for(int outer=4;outer>=1;outer--){
            for(int inner=outer;inner>0;inner--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// javac Unit04\Topic4_4NestedIteration.java
// java Unit04.Topic4_4NestedIteration