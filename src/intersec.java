import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class intersec {
    public static int[] solve(int [] A, int [] B)
    {
        Set<Integer> s = new HashSet<>();
        for(int i=0; i<A.length; i++)
        {
            s.add(A[i]);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0; i< B.length; i++)
        {
            if(s.contains(B[i]))
            {
                list.add(B[i]);
            }
        }
        int arr[] = new int[list.size()];
        for(int i=0; i<list.size(); i++)
        {
            arr[i] = list.get(i);
        }
        return arr;

    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9};
        int [] b = {2,3,5,9,6};
        int c[] = solve(a,b);
        for (int ele:c)
        {
            System.out.println(ele);

        }
    }
}
