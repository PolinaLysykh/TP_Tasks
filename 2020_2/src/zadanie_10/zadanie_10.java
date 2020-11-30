package zadanie_10;
import java.util.Scanner;
public class zadanie_10 {
    private static int boxSeq (int x)
    {
        if (x%2!=0)
            x+=2;
        return x;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите шаг: ");
        int a = in.nextInt();
        System.out.printf("Количество полей на %d-ом шаге = %d ", a, boxSeq(a));
        in.close();
    }
}
