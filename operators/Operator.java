public class Operator {
    public static void main(String args[]) {
        System.out.println(-11 & -5);
        System.out.println(16 & 64);
        System.out.println(-29 | 14);
        int x, y;
        x = -10;
        y = -34;
        x += 100;
        System.out.println(x);
        y += 50;
        System.out.println(y);
        System.out.println(x & y);
        System.out.println(y | x);
        System.out.println(x == y && y == 16);
    }
}