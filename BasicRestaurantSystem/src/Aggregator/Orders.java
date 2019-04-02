
package Aggregator;

/**
 *
 * @author dierbach
 */
public class Orders {
    private OrderItem[] order_items;
    private int current;
    
    public Orders() {
        order_items = new OrderItem[10];
        initOrders();
    }
    
    public Orders(Orders otherOrders) {
        order_items = new OrderItem[10];
        System.arraycopy( otherOrders.order_items, 0, order_items, 0, order_items.length);
    }
    
    public String addItem(OrderItem item) {
        order_items[findAvailIndex()] = item;
        return "Order added";
    }
    
    public boolean hasNext(){
        if(current == order_items.length - 1)
            return false;
        
        return order_items[current] != null;
    }
    
    public OrderItem getNextItem(){
        return order_items[current++];
    }
    
    public int length() {
        return order_items.length;
    }
    
    public void reset(){
        current = 0;
    }
    //private methods
    
    private void initOrders() {
        for (int i = 0; i < order_items.length; i++)
            order_items[i] = null;
    }
    
    private int findAvailIndex(){
        int i = 0;
        while (order_items[i] != null) {
            i++;
        }
        return i;
    }
}
