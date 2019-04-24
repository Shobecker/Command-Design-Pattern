/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tax;

import java.util.Date;
import Items.PurchasedItems;

/**
 *
 * @author Elias
 */
public abstract class TaxComputationMethod {
    public abstract double computeTax(PurchasedItems items, Date date);
    protected abstract boolean taxHoliday(Date date);
}
