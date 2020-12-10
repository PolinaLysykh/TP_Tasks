import java.util.Scanner;
public class zadanie_1 {
    private static int solutions (int a, int b, int c)
    {
        int sol=0;
        if (b*b-4*a*c==0)
            sol=1;
        else if (b*b-4*a*c>0)
            sol=2;
        return sol;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите коэффициент a: ");
        int a = in.nextInt();
        System.out.print("Введите коэффициент b: ");
        int b = in.nextInt();
        System.out.print("Введите коэффициент c: ");
        int c = in.nextInt();
        System.out.printf("Уравнение имеет %d решений ", solutions(a,b,c));
        in.close();
    }
}