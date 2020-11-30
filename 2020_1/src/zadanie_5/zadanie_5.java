package zadanie_5;
import java.util.Scanner;
public class zadanie_5 {
    private static String operation(int N, int a, int b)
    {
        String result = "none";
        if (a+b==N)
            result="added";
        if(a-b==N)
            result="subtracted from a";
        if(b-a==N)
            result="subtracted from b";
        if(a*b==N)
            result="multiplied";
        if(a/b==N)
            result="divided by b";
        if(b/a==N)
            result="divided by a";
        return result;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("N: ");
        int N = in.nextInt();
        System.out.print("a: ");
        int a = in.nextInt();
        System.out.print("b: ");
        int b = in.nextInt();
        System.out.printf("If N is %d and a is %d and b is %d then %s", N, a, b, operation(N, a, b));
        in.close();
    }

}
