package Aggregator;

/**
 *
 * @author dierbach
 */
public class Aggregator {

    private Menu menu;
    private Orders orders;
    private Tab tab;

    public Aggregator() {
        menu = new Menu();
        populateMenu();
        orders = new Orders();
        tab = new Tab(getMenu(), getOrders());
    }

    public OrderItem placeOrder(int orderNumber) {
        orders.addItem(new OrderItem(orderNumber));
        populateTab(orderNumber);
        return new OrderItem(orderNumber);
    }

    public Menu getMenu() {
        return menu;
    }

    public Orders getOrders() {
        return orders;
    }

    public Tab getTab(Menu menu, Orders orders) {
        return tab;
    }

    // --- private methods
    private void populateMenu() {
        menu.addItem(new MenuItem(1, "Roast Beef", 12.50));
        menu.addItem(new MenuItem(2, "Turkey Dinner", 9.50));
        menu.addItem(new MenuItem(3, "Burger", 11.50));
        menu.addItem(new MenuItem(4, "Banana Pudding", 5.50));
        menu.addItem(new MenuItem(5, "Nachos", 7.00));
        menu.addItem(new MenuItem(6, "Oats", 5.00));
        // etc.
    }

    private void populateTab(int order) {
        tab.addItem(menu.getItem(order - 1));
    }
}
