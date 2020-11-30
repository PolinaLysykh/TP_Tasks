package zadanie_8;
import java.util.Scanner;
public class zadanie_8 {
    private static boolean isStrangePair (String str1, String str2)
    {
        int last1 = str1.length()-1;
        int last2 = str2.length()-1;
        if (str1.charAt(0)==str2.charAt(last2) && str1.charAt(last1)==str2.charAt(0))
            return true;
        else return false;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое слово: ");
        String str1 = in.nextLine();
        System.out.print("Введите второе слово: ");
        String str2 = in.nextLine();
        System.out.println("Строка является странной " + isStrangePair(str1,str2));
        in.close();
    }

}
