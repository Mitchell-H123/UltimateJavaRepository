package Unit10;

public class Topic10_1Recursion {

    public static void simpleRecur(int n){
        System.out.println(n);
        if(n>2){
            simpleRecur(n-1);
        }
        System.out.println(n);
    }

    public static void simpleRecur2(int n){
        System.out.println(n);
        if(n>2){
            simpleRecur(n+1);
        }
        System.out.println(n);
    }

    public static int simpleRecur3(int n){
        System.out.println(n);
        if(n==0){
            return 0;
        }
        return n+ simpleRecur3(n/2);
    }

    public static void main(String[] args) {
        simpleRecur(4);
        System.out.println("");
        simpleRecur2(4);
        System.out.println("");
        System.out.println(simpleRecur3(8));
    }
}
