package SystemInterface;

import Aggregator.*;
import Commands.Invoker;
import java.util.ArrayList;

/**
 *
 * @author dierbach
 */
public class SystemInterface {

    public static String[] getMenu() {
        Menu menu = Invoker.getMenu();

        ArrayList<String> displayLines = new ArrayList<>();

        menu.reset();
        while (menu.hasNext()) {
            displayLines.add(menu.getNextItem().toString());
        }

        // convert ArrayList<String> to array of Strings
        String[] stringArray = new String[displayLines.size()];
        stringArray = displayLines.toArray(stringArray);

        return stringArray;
    }

    public static String[] placeOrder(int orderNumber) {
        //Invoker.placeOrder(orderNumber);
        //return "Order Placed on item " + itemOrdered;
        
        Orders order = Invoker.placeOrder(orderNumber);

        ArrayList<String> displayLines = new ArrayList<>();

        while (order.hasNext()) {
            displayLines.add(order.getNextItem().toString());
        }

        // convert ArrayList<String> to array of Strings
        String[] stringArray = new String[displayLines.size()];
        stringArray = displayLines.toArray(stringArray);

        return stringArray;
    }
    
    public static String[] getOrders() {
        Orders order = Invoker.getOrders();

        ArrayList<String> displayLines = new ArrayList<>();

        while (order.hasNext()) {
            displayLines.add(order.getNextItem().toString());
        }

        // convert ArrayList<String> to array of Strings
        String[] stringArray = new String[displayLines.size()];
        stringArray = displayLines.toArray(stringArray);

        return stringArray;
    }
    
    public static String[] getTab() {
        Tab tab = Invoker.getTab();

        ArrayList<String> displayLines = new ArrayList<>();

        while (tab.hasNext()) {
            displayLines.add(tab.getNextItem().toString());
        }
        //displayLines.add("Total: $" + Double.toString(tab.getPrice()));

        // convert ArrayList<String> to array of Strings
        String[] stringArray = new String[displayLines.size()];
        stringArray = displayLines.toArray(stringArray);

        return stringArray;
    }
}
