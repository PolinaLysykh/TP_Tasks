package zadanie_9;
import java.util.Scanner;
public class zadanie_9 {
    private static boolean isPrefix (String str, String prefix)
    {
        if (str.startsWith(prefix))
        return true;
        else return false;
    }

    private static boolean isSuffix (String str, String suffix)
    {
        if (str.endsWith(suffix))
            return true;
        else return false;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String str1 = in.nextLine();
        System.out.print("Введите суффикс: ");
        String str2 = in.nextLine();
        System.out.print("Введите префикс: ");
        String str3 = in.nextLine();
        System.out.println("Строка содержит суффикс " + isSuffix(str1,str2));
        System.out.println("Строка содержит префикс " + isPrefix(str1,str3));
        in.close();
    }
}
