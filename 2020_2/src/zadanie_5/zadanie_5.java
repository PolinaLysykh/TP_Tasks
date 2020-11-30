package zadanie_5;
import java.util.Scanner;
public class zadanie_5 {
    private static int getDecimalPlaces (String str)
    {
        int n=0;
        if (str.contains(".")) {
            String after = str.substring(str.indexOf('.'));
            char[] a_num = after.toCharArray();
            n = a_num.length - 1;
        }
        else
            System.out.println("There are no decimals");
        return n;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        String str = in.nextLine();
        System.out.println("Number of decimal places " + getDecimalPlaces(str));
        in.close();
    }
}
