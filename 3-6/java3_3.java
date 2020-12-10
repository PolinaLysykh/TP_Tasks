import java.util.Scanner;
public class zadanie_3 {
    private static boolean checkPerfect(int num) {
        int sum=0;
        for (int j = 1; j < num; j++) {
                if (num % j == 0)
                    sum += j;
            }
        if (sum == num)
            return true;
        else return false;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in.nextInt();
        System.out.println("Число явялется совершенным  "+ checkPerfect(a));
        in.close();
    }
}