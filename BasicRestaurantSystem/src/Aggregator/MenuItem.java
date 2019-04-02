
package Aggregator;

/**
 *
 * @author dierbach
 */
public class MenuItem {
    private int item_num;
    private String description;
    private double price;
    
    public MenuItem(int item_num, String descript, double price){
        this.item_num = item_num;
        description = descript;
        this.price = price;
    }
    
    public int getItemNum(){
        return item_num;
    }
    
    public String getDescription(){
        return description;
    }
    
    public double getPrice(){
        return price;
    }
    
    public String toString(){
        return "Item Num: " + item_num + " " + description + " $" + price;
    }
}
