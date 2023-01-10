import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Input: ");

        int max = s.nextInt();

        if (max > 1) {
            fib(0, 1, 0, max);
        } else if (max < 0) {
            throw new ArrayIndexOutOfBoundsException("Your input does not belong to this array.");
        } else {
            System.out.println("0, 1");
        }

    }

    public static void fib(int a, int b, int current, int max) {
        if (current < max) {
            System.out.print(a + ", ");
            fib(b, a + b, current + 1, max);
        }
    }
}
