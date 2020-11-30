package zadanie_3;

import java.util.Scanner;

public class zadanie_3 {
    private static int animals (int a, int b, int c)
    {
        int chicken_legs = 2;
        int cow_legs = 4;
        int pig_legs = 4;
        return a*chicken_legs + b*cow_legs + c*pig_legs;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("The number of chickens: ");
        int chickens = in.nextInt();
        System.out.print("The number of cows: ");
        int cows = in.nextInt();
        System.out.print("The number of pigs: ");
        int pigs = in.nextInt();
        System.out.println("The number of legs: " + animals(chickens,cows,pigs));
        in.close();
    }
}
