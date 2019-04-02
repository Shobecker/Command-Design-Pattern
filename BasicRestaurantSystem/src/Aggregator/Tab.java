/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aggregator;

/**
 *
 * @author Elias
 */
public class Tab {

    private MenuItem[] tab_items;
    private int current;
    private double amount = 0;
    private OrderItem order_item;

    public Tab(Menu menu, Orders orders) {
        tab_items = new MenuItem[20];
        initTab(menu, orders);
    }

    public Tab(Tab otherTab) {
        tab_items = new MenuItem[20];
        System.arraycopy(otherTab.tab_items, 0, tab_items, 0, tab_items.length);
    }

    public void addItem(MenuItem item) {
        tab_items[findAvailIndex()] = item;
        amount += item.getPrice();
    }

    public void reset() {
        current = 0;
    }

    public boolean hasNext() {
        if (current == tab_items.length - 1) {
            return false;
        }
        return tab_items[current] != null;
    }

    public MenuItem getNextItem() {
        return tab_items[current++];
    }

    public double getPrice() {
        return amount;
    }

    // --- private methods
    private void initTab(Menu menu, Orders orders) {
        for (int i = 0; i < tab_items.length; i++) {
            tab_items[i] = null;
        }
        /*
        while (orders.hasNext()) {
            order_item = orders.getNextItem();
            int compare = order_item.getItemNum();
            addItem(menu.getItem(compare - 1));
        }
         */
    }

    private int findAvailIndex() {
        int i = 0;
        while (tab_items[i] != null) {
            i++;
        }
        return i;
    }
}
