package zadanie_4;
import java.util.Arrays;
import java.util.Scanner;
public class zadanie_4 {
    private static String cumulativeSum(int[] arr)
    {
        int n = arr.length;
        for (int i=0;i<n;i++) {
            for (int j=1;j<=i;j++) {
                arr[i] += arr[i - j];
            }
        }
        String arrStr = Arrays.toString(arr);
        return arrStr;
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
        System.out.println("New Array" + cumulativeSum(arr));
        in.close();
    }
}
