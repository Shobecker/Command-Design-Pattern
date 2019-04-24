/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tax;

import Items.PurchasedItems;
import Tax.TaxComputationMethod;
import Items.PurchasedItems;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author Elias
 */
public class MDTaxComputation extends TaxComputationMethod {

    @Override
    public double computeTax(PurchasedItems items, Date date) {
        double tax;

        //if items contain item code with 1406 and it is in tax holiday, return 0.
        if ((taxHoliday(date)) && (items.containsItem("1406"))) {
            tax = 0;
        } else {
            tax = 0.06;
        }
        return tax;
        // calls private method taxHoliday as part of this computation
    }

    @Override
    protected boolean taxHoliday(Date date) {
        // returns true if date of receipt within the state’s tax free holiday,
        // else returns false. Supporting method of method computeTax
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
        
        if (month == 8 && (day >= 14 && day <= 20)) {
            return true;
        } else {
            return false;
        }
    }
}
