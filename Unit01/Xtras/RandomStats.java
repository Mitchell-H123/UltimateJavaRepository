package Unit01.Xtras;

public class RandomStats {
    public static void main(String[] args) {
        double x1=Math.random();
        double x2=Math.random();
        double x3=Math.random();
        double x4=Math.random();
        double x5=Math.random();
        double avg=(x1+x2+x3+x4+x5)/5;
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);
        System.out.print("Average: ");
        System.out.println(avg);
        double min1=Math.min(x1, x2);
        double min2=Math.min(min1, x3);
        double min3=Math.min(min2, x4);
        double min=Math.min(min3, x5);
        System.out.print("Min: ");
        System.out.println(min);
        double max1=Math.max(x1, x2);
        double max2=Math.max(max1, x3);
        double max3=Math.max(max2, x4);
        double max=Math.max(max3, x5);
        System.out.print("Max: ");
        System.out.println(max);
    }
}
