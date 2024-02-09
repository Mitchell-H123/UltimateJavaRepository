package Unit04;

public class vowels4_3 {
    public static void main(String[] args){
        String word="supercalifragilisticexpialidocious";
        int count=0;
        for(int i=0;i<word.length();i++){
            String letter=word.substring(i, i+1);
            if(letter.equals("a")||letter.equals("e")||letter.equals("i")||letter.equals("o")||letter.equals("u")){
                count++;
            }
        }
        System.out.println(word+" has "+count+" vowels");
    }
}
