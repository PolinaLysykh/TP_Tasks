package zadanie_10;
import java.util.Scanner;
public class zadanie_10 {
    private static boolean abcmath(int a, int b, int c)
    {
        int sum_a = a;
        for (int i=1;i<=b;i++)
        {
            sum_a=sum_a*2;
        }
         return sum_a%c==0;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("a: ");
        int a = in.nextInt();
        System.out.print("b: ");
        int b = in.nextInt();
        System.out.print("c: ");
        int c = in.nextInt();
        System.out.println("The answer is " + abcmath(a,b,c));
        in.close();
    }
}
