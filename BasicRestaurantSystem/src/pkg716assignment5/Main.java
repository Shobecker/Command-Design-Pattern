/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg716assignment5;

import Receipt.ReceiptFactory;
import Receipt.Receipt;
import Items.*;
import java.awt.BorderLayout;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Elias
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        int input = 0;
        String inputString = "";
        String inputDate = "";
        Date date = null;

        Scanner scanner = new Scanner(System.in);
        // 1. Creates a Data object (either from Java API or date entered by user)
        // get receipt date
        // (prompt user for current date)
        System.out.println("Enter the Date (dd/mm/yyyy): ");
        inputDate = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            date = dateFormat.parse(inputDate);
            System.out.println(date);
            System.out.println(dateFormat.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // 2. Creates a PurchasedItems object (selections made by user)
        PurchasedItems items = new PurchasedItems();
        // 3. Constructs a ReceiptFactory object.
        ReceiptFactory receiptFactory = new ReceiptFactory();
        // 3. Prompts user for items to purchase, storing each in PurchasedItems.
        do {
            System.out.println("********************************************************");
            System.out.println("Enter 1: Enter Items to Purchase");
            System.out.println("Enter 2: Display Receipt");
            System.out.println("Enter 0 to exit");
            System.out.println("********************************************************");
            input = scanner.nextInt();
            switch (input) {

                case 1:
                    // display all available store items to user(to be  implemented)
                    allItems();
                    input = scanner.nextInt();
                    populateStoreItems(input, items);
                    break;
                case 2:
                    System.out.println("");
                    // get all user selections(to be implemented)
                    // 4. Calls the getReceipt method of the factory to obtain constructed receipt.
                    Receipt receipt = receiptFactory.getReceipt(items, date);
                    // 5. Prints receipt by call to method prtReceipt.
                    receipt.prtReceipt();
                    System.out.println("");
                    break;
            }
        } while (input != 0);
    }

    private static void populateStoreItems(int input, PurchasedItems items) {
        //StoreItem(String code, String descript, double price);
        switch (input) {
            case 1:
                items.addItem(new StoreItem("1406", "Laptop", 1400));
                break;
            case 2:
                items.addItem(new StoreItem("1111", "Monitor", 250));
                break;
            case 3:
                items.addItem(new StoreItem("1020", "Candy", 2));
                break;
            case 4:
                items.addItem(new StoreItem("4212", "Keyboard", 80));
                break;
            case 5:
                items.addItem(new StoreItem("9745", "Dog", 2000));
                break;
            case 6:
                items.addItem(new StoreItem("5643", "Beer", 12));
                break;
            case 7:
                items.addItem(new StoreItem("7789", "Mouse", 42));
                break;
            default:
                System.out.println("item not found");
        }
    }

    private static void allItems() {
        System.out.println("********************************************************");
        System.out.println("1 - Laptop: 1406 / $1400");
        System.out.println("2 - Monitor: 1111 / $250");
        System.out.println("3 - Candy: 1020 / $2");
        System.out.println("4 - Keyboard: 4212 / $80");
        System.out.println("5 - Dog: 9745 / $2000");
        System.out.println("6 - Beer: 5643 / $12");
        System.out.println("7 - Mouse: 7789 / $42");
        System.out.println("********************************************************");
        System.out.println("Enter Item number to purchase ");
    }
}
