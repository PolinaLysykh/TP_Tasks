package zadanie_8;
import java.util.Scanner;
public class zadanie_8 {
    private static int nextEdge (int x, int y)
    {
        int z_max;
        z_max = (x+y)-1;
        return z_max;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("The first edge: ");
        int x = in.nextInt();
        System.out.print("The second edge: ");
        int y = in.nextInt();
        System.out.println("Maximum possible length of the third side of a triangle is " + nextEdge (x,y));
        in.close();
    }
}
