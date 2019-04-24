/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Receipt;

import Receipt.Receipt;
import Receipt.BasicReceipt;
import Receipt.StoreHeader;
import Tax.*;
import AddOn.*;
import Decorator.*;
import Items.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Elias
 */
public class ReceiptFactory {

    StoreHeader store_header; // contains street_addr, zip_code, state_code, phone num, store num
    private TaxComputationMethod[] taxComputationsObjs; // tax computation objs (for each state)
    private TaxComputationMethod taxComputationObj;
    private AddOn[] addOns; // secondary heading, rebate and coupon add-ons (hardcoded here)
    private Date date;
    private int index = -1;

    public ReceiptFactory() throws FileNotFoundException { // constructor
        // 1. Populates array of TaxComputationMethod objects and array of AddOn objects (as if downloaded from the BestBuy web site).
        taxComputationsObjs = new TaxComputationMethod[3];
        taxComputationsObjs[0] = new MDTaxComputation();
        taxComputationsObjs[1] = new CATaxComputation();
        taxComputationsObjs[2] = new MATaxComputation();

        addOns = new AddOn[4];
        addOns[0] = new HolidayGreeting();
        addOns[1] = new SummerSales();
        addOns[2] = new Rebate1406();
        addOns[3] = new Coupon100Get10Percent();

        // 2. Reads config file to create and save StoreHeader object (store_num, street_addr, etc.) to be used on all receipts
        String input = "";

        File file = new File("C:\\Users\\Elias\\Documents\\NetBeansProjects\\716Assignment5\\src\\config.txt");
        //file order: address, state code, zip code, store #, phone #
        Scanner scanner = new Scanner(file);
        String street_addr = scanner.nextLine();
        String state_code = scanner.nextLine();
        String zip_code = scanner.nextLine();
        String store_num = scanner.nextLine();
        String phone_num = scanner.nextLine();

        store_header = new StoreHeader(street_addr, zip_code, state_code, phone_num, store_num);
        // 3. Based on the state code (e.g., “MD”) creates and stores appropriate StateComputation object to be used on all receipts
        switch (state_code) {
            case "MD":
                index = 0;
                taxComputationObj = taxComputationsObjs[index];
                break;
            case "CA":
                index = 1;
                taxComputationObj = taxComputationsObjs[index];
                break;
            case "MA":
                index = 2;
                taxComputationObj = taxComputationsObjs[index];
                break;
            default:
                System.out.println("Invalid state");
        }

    }

    public Receipt getReceipt(PurchasedItems items, Date date) {
        // 1. Sets the current date of the BasicReceipt.
        Receipt receipt = new BasicReceipt(items, date);

        // 2. Sets StoreHeader object of the BasicReceipt (by call to SetStoreHeader of BasicReceipt)
        ((BasicReceipt) receipt).setStoreHeader(store_header);

        // 3. Sets the TaxComputationMethod object of the BasicReceipt (by call to the setTaxComputationMethod of BasicReceipt).
        ((BasicReceipt) receipt).setTaxComputationMethod(taxComputationObj);
        // 4. Traverses over all AddOn objects, calling the applies method of each. If an AddOn object applies, 
        //then determines if the AddOn is of type SecondaryHeader, Rebate, or Coupon. If of type SecondaryHeader, 
        //then creates a PreDecorator for othe AddOn {}. If of type Rebate or Coupon, then creates a PostDecorator.

        for (int i = 1; i < addOns.length; i++) {
            if (addOns[i].applies(items)) {
                // 5. Links in the decorator object based on the Decorator design pattern.
                if (addOns[i] instanceof SecondaryHeading) {
                    receipt = new PreDecorator(receipt, addOns[i]);
                } else if (addOns[i] instanceof Rebate || addOns[i] instanceof Coupon) {
                    receipt = new PostDecorator(receipt, addOns[i]);
                }
            }
        }

        //Receipt newReceipt = preDecorator(basicReceipt);
        // 6. Returns decorated BasicReceipt object as type Receipt.
        return receipt;
    }

}
