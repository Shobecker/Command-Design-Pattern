/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddOn;

import Items.PurchasedItems;

/**
 *
 * @author Elias
 */
public class SummerSales implements SecondaryHeading{

    public boolean applies(PurchasedItems items) {
        return true; // SecondaryHeading decorators always applied
    }

    public String getLines() {
        return "* Summer Sales are Hot at Best Buy *";
    }
}
