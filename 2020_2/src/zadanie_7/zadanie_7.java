package zadanie_7;
import java.util.Scanner;
public class zadanie_7 {
    private static boolean isValid (String str)
    {
        if (str.matches("[0-9]+") && str.length() == 5)
            return true;
        else return false;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите индекс: ");
        String str = in.nextLine();
        System.out.println("Индекс действителен " + isValid(str));
        in.close();
    }

}