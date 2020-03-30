package Collections;

import java.util.*;

/**
 * @author Matthaiakis Stergios
 */
class CollectionConvertTest {

    public static void main(String[] args) {
        // convert Queue to List
        Queue<String> queue = new LinkedList<String>();
        queue.add("Hello");
        queue.add("World");
        List<String> list = new ArrayList<String>(queue);
        for (Object object : list)
            System.out.println(object);

        // convert List to Set, duplicates will be removed
        List<String> myList = new ArrayList<String>();
        myList.add("Hello");
        myList.add("World");
        myList.add("World");
        System.out.println("------");
        for (Object object : myList)
            System.out.println(object);

        System.out.println("-------------------------");
        Set<String> set = new HashSet<String>(myList);
        for (Object object : set)
            System.out.println(object);
    }

}
