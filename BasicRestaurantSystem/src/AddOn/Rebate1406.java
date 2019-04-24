/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddOn;

import AddOn.Rebate;
import Items.PurchasedItems;

/**
 *
 * @author Elias
 */
public class Rebate1406 implements Rebate {

    public boolean applies(PurchasedItems items) {
        return items.containsItem("1406");
    }

    public String getLines() {
        return "Mail-in Rebate for Item #1406\n" + "Name:\n" + ":Address:\n\n"
                + "Mail to: Best Buy Rebates, P.O. Box 1400, Orlando, FL\n";
        
    }
}
