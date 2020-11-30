package zadanie_6;
import java.util.Scanner;
public class zadanie_6 {
    private static int Fibonacci (int n)
    {
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; ++i) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = in.nextInt();
        System.out.printf("%d-oe число Фибоначчи: %d ",n,Fibonacci(n));
        in.close();
    }
}
