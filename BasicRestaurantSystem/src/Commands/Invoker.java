
package Commands;

import Aggregator.*;

/**
 *
 * @author dierbach
 */
public class Invoker {
    private static Aggregator agg = new Aggregator();
    
    public static Menu getMenu(){
        return (Menu) new CMDGetMenu(agg).execute();
    }
    
    public static Orders placeOrder(int orderNumber){
        return (Orders) new CMDPlaceOrder(agg, orderNumber).execute();
    }
    
    public static Orders getOrders(){
        return (Orders) new CMDGetOrders(agg).execute();
    }

    public static Tab getTab(){
        return (Tab) new CMDGetTab(agg).execute();
    }
}
