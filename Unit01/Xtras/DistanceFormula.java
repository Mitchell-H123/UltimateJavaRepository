package Unit01.Xtras;

public class DistanceFormula {
    public static void main(String[] args) {
        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);
        int x2 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);
        double d=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1), 2));
        System.out.println(d);

    }
}
