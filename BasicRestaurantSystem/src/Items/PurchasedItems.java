/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

import Items.StoreItem;
import java.util.ArrayList;

/**
 *
 * @author Elias
 */
public class PurchasedItems {

    private ArrayList<StoreItem> items;

    public PurchasedItems() {
        items = new ArrayList();
    }

    public void addItem(StoreItem item) {
        items.add(item);
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (StoreItem item : items) {
            totalCost += item.getItemPrice();
        }
        return totalCost;
    }

    public boolean containsItem(String itemCode) {
        for (StoreItem item : items) {
            if (item.getItemCode().equals(itemCode)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public void printItems() {
        for (StoreItem item: items) {
            item.getString();
        }
    }
}
