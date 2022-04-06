import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(21);
        hs.add(2);//duplicate entries do not exist in the set
        System.out.println(hs.contains(3));

        System.out.println(hs);
        for(int i=0; i< 5; i++)
        {
            hs.add(i);
        }
        System.out.println(hs);
    }
}
