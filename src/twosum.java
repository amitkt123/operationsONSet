import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class twosum {
    public static boolean twosum(int A[], int k)
    {

    Set<Integer> hs = new HashSet<>();

    for(int i=0; i< A.length; i++)
    {
        int diff = (k - A[i]);
        System.out.println(diff);
        if (!hs.contains(diff))
        {
            hs.add(A[i]);
        }
        else
            return true;

    }
        System.out.println(hs);
    return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int A[] = new int[size];
        for(int i =0; i< size; i++)
        {
            A[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        boolean x = twosum(A, k);
        System.out.println(x);
    }
}
