/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

/**
 *
 * @author Elias
 */
public class StoreItem {

    private String itemCode; // e.g., 3010
    private String itemDescription; // e.g., Dell Laptop
    private double itemPrice;

    public StoreItem(String code, String descript, double price) {
        this.itemCode = code;
        this.itemDescription = descript;
        this.itemPrice = price;
    }

    // appropriate getters and setters
    public String getItemCode() {
        return itemCode;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void getString() {
        System.out.println(itemCode + " | " + itemDescription + " | $" + itemPrice);
    }
}
