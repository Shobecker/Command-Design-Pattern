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
public class PostDecorator extends Decorator {

    private AddOn a;

    public PostDecorator(Receipt r, AddOn a) {
        super(r, a);
        this.a = a;
    }

    @Override
    public void prtReceipt() {
        callTrailer();
        System.out.println(a.getLines());
        // similar, except that prtReceipt print the add on information
        // after the other parts of the receipt are printed
    }
}
