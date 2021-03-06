package Collections.List;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Matthaiakis Stergios
 */

public class ListTest {
    public static void main(String[] args) {
        List<java.io.Serializable> myList = new ArrayList<java.io.Serializable>();
        String s1 = "Hello";
        String s2 = "Hello";
        myList.add(100);
        myList.add(s1);
        myList.add(s2);
        myList.add(s1);
        myList.add(1);
        myList.add(2, "World");
        myList.set(3, "Yes");
        myList.add(null);
        System.out.println("Size: " + myList.size());
        for (Object object : myList) {
            System.out.println(object);
        }
    }
}
