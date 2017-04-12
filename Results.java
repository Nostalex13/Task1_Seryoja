import java.util.List;

/**
 * Created by Nostalex on 10.10.2016.
 */
public class Results {
    public void OchenNuzniyMetod(List<Integer> list) {
        if (!list.isEmpty()) {
            for (Integer i : list) {
                System.out.println(i);
            }
        } else {
            System.out.println("\t\n !!!There`s no palindrome values in this range!!!");
        }
    }
}
