/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import AddOn.AddOn;
import Receipt.Receipt;

/**
 *
 * @author Elias
 */
public class PreDecorator extends Decorator {

    private AddOn a;

    public PreDecorator(Receipt r, AddOn a) {
        super(r, a);
        this.a = a;
    }

    @Override
    public void prtReceipt() {
        System.out.println(a.getLines());
        callTrailer();
    }
}
