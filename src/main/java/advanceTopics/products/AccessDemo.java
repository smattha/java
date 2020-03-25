/*
 * AccessDemo.java
 *
 * Created on 10 ������� 2007, 4:39 ��
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package advanceTopics.products;

/*
 * @author MAtthaiakis Stergios
 */

import advanceTopics.products.electronics.DVDPlayer;
import advanceTopics.products.products.InventoryItem;

public class AccessDemo {
    public static void main(String[] args) {
        InventoryItem x = new InventoryItem();

        InventoryItem y = new InventoryItem(5005678L, "cell phone");
        y.partNumber = -1;
        System.out.println(y.getPartNumber());

        DVDPlayer z = new DVDPlayer("Acme", "2000DV", 11223344L);
        z.setRetailPrice(199.99);
        //z.retailPrice = 199.99;

        DVDPlayer w = new DVDPlayer("Acme", "1000DV");
        System.out.println(w.getPartNumber());
        System.out.println(w.partNumber);
    }
}