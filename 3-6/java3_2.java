import java.util.Scanner;
public class zadanie_2 {
    private static int findZip (String str)
    {
        String zip = "zip";
        int first = str.indexOf("zip");
        int second = str.indexOf("zip", first + 1);
        return second;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String a = in.nextLine();
        System.out.println("Позиция второго вхождения zip:  "+ findZip(a));
        in.close();
    }
}