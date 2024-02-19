package Unit04;

public class StringLoops {

    public static boolean xyzThere(String str) {

        for (int i = 0; i <= str.length() - 3; i++) {
            // found an "xyz"
            if (str.substring(i, i + 3).equals("xyz")) {
                // if it's a ".xyz"
                if (i > 0 && str.substring(i - 1, i).equals(".")) {
                    // do nothing
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public static String zipZap(String str) {
        String result = "";

        for (int i = 0; i <= str.length() - 3; i++) {
            // if I find zip, zap, zsp, etc
            if (str.substring(i, i + 1).equals("z") &&
                    str.substring(i + 2, i + 3).equals("p")) {
                result += "zp";
                i += 2;
            } else {
                result += str.substring(i, i + 1);
            }
        }

        if (str.length() < 3) {
            result += str;
        } else if (str.substring(str.length() - 3, str.length() - 2).equals("z") &&
                str.substring(str.length() - 1).equals("p")) {
            // do nothing
        } else {
            result += str.substring(str.length() - 2);
        }

        return result;
    }

    public static String doubleChar(String str) {
        String s="";
        String letter;
        for(int i=0;i<str.length();i++){
            if(i<str.length()-1){
                letter=str.substring(i, i+1);
                s=s+letter+letter;
            }
            else{
                letter=str.substring(i);
                s=s+letter+letter;
            }
        }
        return s;
    }

    public static int countCode(String str) {
        int count=0;
        for(int i=0;i<str.length()-3;i++){
            if(str.substring(i, i+1).equals("c")){
                if((str.substring(i+1,i+2).equals("o"))&&(str.substring(i+3,i+4).equals("e"))){
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean bobThere(String str) {
        boolean bob=false;
        for(int i=0;i<str.length()-2;i++){
            if(str.substring(i, i+1).equals("b")){
                if(str.substring(i+2, i+3).equals("b")){
                    bob=true;
                    break;
                }
            }
        }
        return bob;
    }

    public static boolean prefixAgain(String str, int n) {
        boolean again=false;
        String a=str.substring(0, n);;
        for(int i=n;i<str.length()-n + 1;i++){
            if(str.substring(i, i+n).equals(a)){
                again=true;
                break;
            }
        }
        return again;
    }

    public static boolean sameStarChar(String str) {
        boolean same=false;
        if(str.length()!=0){
            for(int i=1;i<str.length()-1;i++){
                if(str.substring(i, i+1).equals("*")){
                    if(str.substring(i-1,i).equals(str.substring(i+1,i+2))){
                        same=true;
                  }
                  else{
                    same=false;
                  }
             }
            }
        }
        else{
            same=true;
        }
        if(str.contains("*")==false){
            same=true;
        }
        String stars="";
        for(int j=0;j<str.length();j++){
            stars=stars+"*";
        }
        if(str.substring(0).equals(stars)){
            same=true;
        }

        return same;
    }

    public static String starOut(String str) {
        String x="";
        if(str.length()!=0){
            for(int i=0;i<str.length();i++){
                if(i==str.length()-1){
                    if(str.length()==1){
                        if((str.substring(i).equals("*"))==false){
                            x=x+str.substring(i);
                        }
                    }
                    else{
                        if(((str.substring(i).equals("*"))==false)&&(str.substring(i-1,i).equals("*")==false)){
                            x=x+str.substring(i);
                        }
                    }
                }
                else if(i==0){
                    if((str.substring(i+1,i+2).equals("*")==false)&&(str.substring(i,i+1).equals("*")==false)){
                        x=x+str.substring(i,i+1);
                    }
                }
                else{
                    if((str.substring(i+1,i+2).equals("*") || str.substring(i, i+1).equals("*") || str.substring(i-1, i).equals("*"))==false){
                        x=x+str.substring(i,i+1);
                    }
                    
                }
            }
        }
        return x;
    }

    public static int countHi(String str) {
        int count=0;
        for(int i=0;i<str.length()-1;i++){
            if(str.length()!=0){
                if(str.substring(i, i+2).equals("hi")){
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean endOther(String a, String b) {
        boolean end=false;
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(a.length()>b.length()){
            int num=a.length()-b.length();
            if(a.substring(num).equals(b)){
                end=true;
            }
        }
        else{
            int num=b.length()-a.length();
            if(b.substring(num).equals(a)){
                end=true;
            }
        }
        return end;
    }

    public static boolean xyBalance(String str) {
        boolean balance=false;
        int positionX,x=0,y=0,positionY;
        String letter;
        if(str.length()!=0){
            for(int i=0;i<str.length();i++){
                if(i!=str.length()-1){
                    letter=str.substring(i, i+1);
                    if(letter.equals("x")){
                        x++;
                        positionX=i;
                    }
                    else if(letter.equals("y")){
                        y++;
                        positionY=i;
                    }
                }
                else{

                }
            }
        }
        else{
            balance=true;
        }
        return balance;
    }
//fix
    public static String plusOut(String str, String word) {
        String newword="";
        for(int i=0;i<str.length()-word.length()-1;i++){
            if(str.substring(i, word.length()).equals(word)){
                newword=newword+word;
            }
            else{
                newword=newword+"+";
            }
        }
        return newword;
    }
//fix
    public static boolean catDog(String str) {
        int cat=0,dog=0;
        boolean equal=false;
        for(int i=0;i<str.length()-2;i++){
            if(str.substring(i, i+3).equals("cat")){
                cat++;
            }
            else if(str.substring(i,i+3).equals("dog")){
                dog++;
            }
        }
        if(cat==dog){
            equal=true;
        }
        return equal;
    }

    public static String mixString(String a, String b) {
        int turn=0,i=0;
        String s="";
        boolean go1=true,go2=true;
        while(go1||go2){
            if(turn==0){
                if(i<a.length()-1){
                    s=s+a.substring(i, i+1);
                    turn=1;
                }
                else if(i==a.length()-1){
                    s=s+a.substring(i);
                    turn=1;
                }
                else{
                    turn=1;
                    go1=false;
                }
            }
            else{
                if(i<b.length()-1){
                    s=s+b.substring(i, i+1);
                    turn=0;
                    i++;
                }
                else if(i==b.length()-1){
                    s=s+b.substring(i);
                    turn=0;
                    i++;
                }
                else{
                    turn=0;
                    go2=false;
                    i++;
                }
            }
        }
        return s;
    }

    public static String repeatSeparator(String word, String sep, int count) {
        String s="";
        for(int i=0;i<count;i++){
            if(i==count-1){
                s=s+word;
            }
            else{
                s=s+word+sep;
            }
        }
        return s;
    }

}
