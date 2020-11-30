package zadanie_2;
import java.util.Scanner;
import java.util.ArrayList;
public class zadanie_2 {
    private static int differenceMaxMin(ArrayList <Integer> array)
    {
        int max = array.get(0);
        int min = array.get(0);
        for (final int i : array) {
            if (i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }
        return max - min;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Array: ");
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (in.hasNextInt())
        {
            int i = in.nextInt();
            arrayList.add(i);
        }
        System.out.println("The difference between maximum and minimum = " + differenceMaxMin(arrayList));
        in.close();
    }
}
