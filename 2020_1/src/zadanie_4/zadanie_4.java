package zadanie_4;

import java.util.Scanner;

public class zadanie_4 {
    private static boolean profitableGamble(float a, float b, float c)
    {
        return a * b > c;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Prob: ");
        float prob = in.nextFloat();
        System.out.print("Prize: ");
        float prize = in.nextFloat();
        System.out.print("Pay: ");
        float pay = in.nextFloat();
        System.out.println("Is Gambling Profitable? \n"+profitableGamble(prob,prize,pay));
        in.close();
    }
}
