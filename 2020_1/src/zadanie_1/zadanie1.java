package zadanie_1;
import java.util.Scanner;
public class zadanie1 {

    private static int remainder(int a, int b)
    {
        return a%b;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("The dividend is ");
        int dividend = in.nextInt();
        System.out.print("The divisor is ");
        int divisor = in.nextInt();
        System.out.printf("If the dividend is %d and the divisor is %d then the remainder is %d", dividend, divisor, remainder(dividend,divisor));
        //System.out.println("If the dividend is 3 and the divisor 4 then the remainder is " +remainder(3,4)+"\n");
        //System.out.println("If the dividend is -9 and the divisor 45 then the remainder is " +remainder(-9,45)+"\n");
        //System.out.println("If the dividend is 5 and the divisor 5 then the remainder is " +remainder(5,5)+"\n");
    }

}
