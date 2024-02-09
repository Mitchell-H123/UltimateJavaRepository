package Unit04;

public class Reversed4_3 {
    public static void main(String[] args){
        String original="backwards";
        String reversed="";
        for(int i=0;i<original.length();i++){
            String single=original.substring(i, i+1);
            reversed=single+reversed;
        }
        System.out.println(original+"\n"+reversed);
    }
}
