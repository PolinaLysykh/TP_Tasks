package zadanie_9;
import java.util.Scanner;
public class zadanie_9 {

    private static int sumOfCubes(int[] arr)
    {
        int sum=0;
        for (int j : arr) sum += Math.pow(j, 3);
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Insert array elements: ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.printf("The sum of cubes = %d",sumOfCubes(arr));
        in.close();
    }
}
