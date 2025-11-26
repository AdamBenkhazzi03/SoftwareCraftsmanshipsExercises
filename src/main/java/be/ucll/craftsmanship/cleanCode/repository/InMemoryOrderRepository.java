package be.ucll.craftsmanship.cleanCode.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import be.ucll.craftsmanship.cleanCode.model.Order;

public class InMemoryOrderRepository implements OrderRepository {
    private final Map<String, Order> orders = new HashMap<>();

    @Override
    public void save(Order order) {
        orders.put(order.getId(), order);
        System.out.println("Order saved: " + order.getId());
    }

    @Override
    public Order findById(String id) {
        return orders.get(id);
    }

    @Override
    public List<Order> findByCustomerId(String customerId) {
        return orders.values().stream()
                .filter(o -> o.getCustomer().getId().equals(customerId))
                .collect(Collectors.toList());
    }
}
