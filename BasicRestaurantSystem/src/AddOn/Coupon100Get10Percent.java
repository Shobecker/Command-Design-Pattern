/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddOn;

import AddOn.Coupon;
import Items.PurchasedItems;

/**
 *
 * @author Elias
 */
public class Coupon100Get10Percent implements Coupon {

    public boolean applies(PurchasedItems items) {
        if(items.getTotalCost() >= 100){
            return true;
        }
        return false;
    }

    public String getLines() {
        return "Coupon with 10% off \n";
    }
}
