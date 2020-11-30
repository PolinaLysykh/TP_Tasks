package zadanie_7;
import java.util.Scanner;
public class zadanie_7 {
    private static int addUpTo (int a)
    {
        int sum = 0;
        for (int i=1;i<=a;i++)
        {
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = in.nextInt();
        System.out.printf("Sum of numbers from 1 to %d = %d", x, addUpTo(x));
        in.close();
    }

}
