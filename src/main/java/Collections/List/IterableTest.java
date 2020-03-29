package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Matthaiakis Stergios
 */
public class IterableTest {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("Yes");
        myList.add("Hello");
        myList.add("World");

        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        for (Iterator<String> iterator2 = myList.iterator(); iterator2.hasNext();) {
            String element = iterator2.next();
            System.out.println(element);
        }
        for (Object object : myList) {
            System.out.println(object);
        }
    }
}
