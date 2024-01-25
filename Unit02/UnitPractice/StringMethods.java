package Unit02.UnitPractice;

public class StringMethods {

    public static String helloName(String name) {
        String message ="Hello "+name;
        return message;
    }

    public static String firstHalf(String str) {
        int num=str.length()/2;
        String word=str.substring(0, num);
        return word;
    }

    public static boolean endsLy(String str) {
        int num=str.length()-2;
        String end=str.substring(num);
        if (end.equals("ly")) {
            return true;
        }
        else{
            return false;
        }
    }

    public static String makeAbba(String a, String b) {
        String word=a+b+b+a;
        return word;
    }

    public static String withoutEnd(String str) {
        int num=str.length()-1;
        String word=str.substring(1, num);
        return word;
    }

    public static String nTwice(String str, int n) {
        String start=str.substring(0,n);
        String end = str.substring((str.length()-n) , str.length() );
        return start+end;
    }

    public static String makeTags(String tag, String word) {
        String message="<"+tag+">"+word+"</"+tag+">";
        return message;
    }

    public static String middleTwo(String str) {
        int num=str.length()/2;
        String letters=str.substring(num-1, num+1);
        return letters;
    }

    public static void main(String[] args) {
        // You can test your methods for specific inputs here. For example:
        System.out.println("helloName(\"Bella\") -> " + helloName("Bella"));
        System.out.println(helloName("bob"));
        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("abcdef"));
        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("oddy"));
        System.out.println(makeAbba("hello", "bye"));
        System.out.println(withoutEnd("Hello"));
        System.out.println(nTwice("Hello", 2));
        System.out.println(makeTags("i", "yay"));
        System.out.println(middleTwo("string"));
        System.out.println(middleTwo("code"));

    }
}
