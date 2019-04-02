/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicrestaurantsystem;

import SystemInterface.SystemInterface;
import java.util.Scanner;

/**
 *
 * @author dierbach
 */
public class BasicRestaurantSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);
        int input;

        do {
            System.out.println("Enter 1 to see all menu items");
            System.out.println("Enter 2 to add an item to your order");
            System.out.println("Enter 3 to display your tab");
            System.out.println("Enter 0 to exit");
            input = scan.nextInt();
            switch (input) {

                case 1:
                    System.out.println("");
                    for (int i = 0; i < SystemInterface.getMenu().length; i++) {
                        System.out.println(SystemInterface.getMenu()[i]);
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("");
                    System.out.println("What item would you like to order? Please enter a number.");
                    int orderNumber = scan.nextInt();
                    SystemInterface.placeOrder(orderNumber);
                    System.out.println("");
                    System.out.println("Items Ordered");
                    for (int i = 0; i < SystemInterface.getOrders().length; i++) {
                        System.out.println(SystemInterface.getOrders()[i]);
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Tab: ");
                    for (int i = 0; i < SystemInterface.getTab().length; i++) {
                        System.out.println(SystemInterface.getTab()[i]);
                    }
                    System.out.println("");
                    break;
            }
        } while (input != 0);

    }
}
