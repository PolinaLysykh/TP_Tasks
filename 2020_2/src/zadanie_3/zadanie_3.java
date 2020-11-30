package zadanie_3;
import java.util.Scanner;
public class zadanie_3 {
    private static boolean isAvgWhole (int [] array)
    {
        int sum = 0;
        int n = array.length;
        for (int number : array)
            sum+=number;
        if (sum%n==0) return true;
        else return false;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.print("Insert array elements: ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Is Avgerage Whole? " + isAvgWhole (arr));
        in.close();
    }
}
