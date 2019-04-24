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
public class MATaxComputation extends TaxComputationMethod {

    @Override
    public double computeTax(PurchasedItems items, Date date) {
        double tax;

        //if items contain item code with 1406 and it is in tax holiday, return 0.
        if ((taxHoliday(date)) && (items.containsItem("1406"))) {
            tax = 0;
        } else {
            tax = 0.10;
        }
        return tax;
        // calls private method taxHoliday as part of this computation
    }

    @Override
    protected boolean taxHoliday(Date date) {
        return false;
    }
}
