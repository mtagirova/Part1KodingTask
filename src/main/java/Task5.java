//Write a program to swap 2 numbers without a temporary variable?
public class Task5 {
    public static void main(String[] args) {
        int d = 6;
        int m = 4;

        System.out.println("Before swapping:");
        System.out.println("d = " + d);
        System.out.println("m = " + m);

        d = d + m;
        d = d - m;
        d = d - m;

        System.out.println("\nAfter swapping:");
        System.out.println("d = " + d);
        System.out.println("m = " + m);

    }
}
