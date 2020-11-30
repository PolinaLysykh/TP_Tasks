package zadanie_2;
import java.util.Scanner;
public class zadanie_2 {
    private static int triArea (int a, int b)
    {
        return (a*b)/2;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("The base is ");
        int base = in.nextInt();
        System.out.print("The height is ");
        int height = in.nextInt();
        System.out.printf("If the base is %d and the height is %d then area of a triangle is %d", base, height, triArea(base,height));
        in.close();
    }
}
