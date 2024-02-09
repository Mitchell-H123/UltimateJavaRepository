package Unit04;

public class Topic4_3AlgorithmsUsingStrings {
    public static void main(String[] args) {
        //EX finding a sub in a word
        String word="sunflower";
        String sub="er";
        boolean found=false;
        for(int i=0;i<=word.length()-sub.length();i++){
            String portion=word.substring(i, i+sub.length());
            if(portion.equals(sub)){
                found=true;
            }
        }
        if(found==true){
            System.out.println("found the smaller string");
        }
        else{
            System.out.println("did not find smaller string");
        }
    }
}

// javac Unit04\Topic4_3AlgorithmsUsingStrings.java
// java Unit04.Topic4_3AlgorithmsUsingStrings