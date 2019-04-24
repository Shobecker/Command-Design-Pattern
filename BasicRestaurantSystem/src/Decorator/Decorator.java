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
public abstract class Decorator implements Receipt {

    private Receipt trailer;
    private AddOn AddOn;

    public Decorator(Receipt r) {
        trailer = r;
    }

    public Decorator(Receipt r, AddOn a) {
        trailer = r;
        AddOn = a;
    }

    protected void callTrailer() {
        trailer.prtReceipt();
    }

    public abstract void prtReceipt();
}
