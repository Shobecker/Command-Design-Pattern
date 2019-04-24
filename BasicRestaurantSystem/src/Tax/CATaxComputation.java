/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tax;

import Items.PurchasedItems;
import java.util.Date;

/**
 *
 * @author Elias
 */
public class CATaxComputation extends TaxComputationMethod {

    @Override
    public double computeTax(PurchasedItems items, Date date) {
        double tax;
        tax = 0.0725;
        return tax;
    }

    @Override
    protected boolean taxHoliday(Date date) {
        return false;
    }
}
