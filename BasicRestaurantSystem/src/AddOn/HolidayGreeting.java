/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddOn;

import AddOn.SecondaryHeading;
import Items.PurchasedItems;
import java.util.Date;

/**
 *
 * @author Elias
 */
public class HolidayGreeting implements SecondaryHeading{

    public boolean applies(PurchasedItems items) {
        return true; // SecondaryHeading decorators always applied
    }
    
    public boolean applies(Date date) {
        return true;
    }

    public String getLines() {
        return "* Happy Holidays from Best Buy *";
    }
}
