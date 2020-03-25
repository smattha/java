package advanceTopics.products.electronics;

/**
 * @author MAtthaiakis Stergios
 */

import advanceTopics.products.products.InventoryItem;

public class DVDPlayer extends InventoryItem {
    private String make, model;
    private double retailPrice;

    public DVDPlayer(String make, String model, long partNumber) {
        super(partNumber, "DVD player");
        this.make = make;
        this.model = model;
    }

    public DVDPlayer(String make, String model) {
        super();
        this.make = make;
        this.model = model;
        // partNumber = 11223344L;	//does not compile
    }

    public void setRetailPrice(double p) {
        retailPrice = p;
        // System.out.println(getPartNumber());	//does not compile
    }
}