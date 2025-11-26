package be.ucll.craftsmanship.cleanCode.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final String id;
    private final Customer customer;
    private final List<OrderItem> items;
    private OrderStatus status;
    private final double total;

    public Order(String id, Customer customer, List<OrderItem> items, double total) {
        this.id = id;
        this.customer = customer;
        this.items = new ArrayList<>(items);
        this.status = OrderStatus.PENDING;
        this.total = total;
    }

    public String getId() { return id; }
    public Customer getCustomer() { return customer; }
    public List<OrderItem> getItems() { return new ArrayList<>(items); }
    public OrderStatus getStatus() { return status; }
    public double getTotal() { return total; }

    public void updateStatus(OrderStatus newStatus) {
        this.status = newStatus;
    }
}
