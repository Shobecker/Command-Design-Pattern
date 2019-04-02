
package Aggregator;

/**
 *
 * @author dierbach
 */
public class OrderItem {
    
    private int item_num;
    
    public OrderItem(int item_num){
        this.item_num = item_num;
    }
    
    public int getItemNum(){
        return item_num;
    }
    
    public String toString(){
        return "Item Num: " + item_num;
    }
    
}
