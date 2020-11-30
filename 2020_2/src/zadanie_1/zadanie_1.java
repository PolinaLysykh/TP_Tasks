package zadanie_1;
import java.util.Scanner;
public class zadanie_1 {
    private static String repeat(String ex_str, int N)
    {
        int length = ex_str.length();
        String new_str = "";
        for(int iDx = 0; iDx < length; iDx++)
            for (int j=0;j<N;j++)
        {
            new_str+=ex_str.charAt(iDx);
        }
        return new_str;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("String: ");
        String ex_str = in.nextLine();
        System.out.print("N: ");
        int n = in.nextInt();
        System.out.println("Result: " + repeat(ex_str,n));
        in.close();
    }
}
