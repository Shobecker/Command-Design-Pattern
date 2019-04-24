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
public interface AddOn {
    public boolean applies(PurchasedItems items);
    public String getLines();
}
