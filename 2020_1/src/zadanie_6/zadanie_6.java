package zadanie_6;
import java.util.Scanner;
public class zadanie_6 {
    private static int ctoa (char a)
    {
        return a;
        //int ascii = (int) a;
        //return ascii;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char x = in.next().charAt(0);
        System.out.printf("The ASCII code of %c is %d ", x, ctoa(x));
        in.close();
    }
}
