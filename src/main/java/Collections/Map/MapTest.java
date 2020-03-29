package Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Matthaiakis Stergios
 */

public class MapTest {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1", "one");
        map.put("2", "two");

        System.out.println(map.size()); // print 2
        System.out.println(map.get("1")); // print "one"

        Set keys = map.keySet();
        // print the keys
        for (Object object : keys)
            System.out.println(object);
    }

}
