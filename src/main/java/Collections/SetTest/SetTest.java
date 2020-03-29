package Collections.SetTest;

import java.util.Set;
import java.util.HashSet;

/**
 * @author Matthaiakis Stergios
 */

public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Hello");
        if (set.add("Hello"))
            System.out.println("addition successful");
        else
            System.out.println("addition failed");
        set.add(null);
        for (Object object : set)
            System.out.println(object);

    }

}
