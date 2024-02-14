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
        for(int i=1;i<str.length()-1;i++){
            if(str.substring(i, i+1).equals("*")){
                if(str.substring(i-1,i).equals(str.substring(i+1,i+2))){
                    same=true;
                }
            }
        }
        return same;
    }

    public static String starOut(String str) {
        return "";
    }

    public static int countHi(String str) {
        return 0;
    }

    public static boolean endOther(String a, String b) {
        return false;
    }

    public static boolean xyBalance(String str) {
        return false;
    }

    public static String plusOut(String str, String word) {
        return "";
    }

    public static boolean catDog(String str) {
        return false;
    }

    public static String mixString(String a, String b) {
        return "";
    }

    public static String repeatSeparator(String word, String sep, int count) {
        return "";
    }

}
