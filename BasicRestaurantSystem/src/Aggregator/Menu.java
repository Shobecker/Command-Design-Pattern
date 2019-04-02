
package Aggregator;

/**
 *
 * @author dierbach
 */
public class Menu {
    private MenuItem[] menu_items;
    private int current;
    
    public Menu(){
        menu_items = new MenuItem[10];
        initMenu();
    }
    
    public Menu(Menu otherMenu){   // copy constructor
        menu_items = new MenuItem[10];
        System.arraycopy(otherMenu.menu_items, 0, menu_items, 0, 
                         menu_items.length);
    }
    
    public void addItem(MenuItem item){
        menu_items[findAvailIndex()] = item;
    }
    
    public void reset(){
        current = 0;
    }
    
    public boolean hasNext(){
        if(current == menu_items.length - 1)
            return false;
        
        return menu_items[current] != null;
    }
    
    public MenuItem getNextItem(){
        return menu_items[current++];
    }
    
    public MenuItem getItem(int index) {
        return menu_items[index];
    }
    
    // --- private methods
    
    private void initMenu(){
        for(int i = 0; i < menu_items.length; i++)
            menu_items[i] = null;
    }
    
    private int findAvailIndex(){
        int i = 0;
        while(menu_items[i] != null)
            i++;
        
        return i;
    }
    
}
