package Unit04;

public class Topic4_5InformalCodeAnalysis {
    public static void main(String[] args) {
        int count=0;
        for(int o=5;o>0;o--){
            for(int i =0;i<o;i++){
                count++;
                System.out.println(count);
            }
        }
    }
}

// javac Unit04\Topic4_5InformalCodeAnalysis.java
// java Unit04.Topic4_5InformalCodeAnalysis