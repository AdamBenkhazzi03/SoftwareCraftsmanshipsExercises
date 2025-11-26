package be.ucll.craftsmanship.cleanCode.repository;

import java.util.List;

import be.ucll.craftsmanship.cleanCode.model.Order;

public interface OrderRepository {
    void save(Order order);
    Order findById(String id);
    List<Order> findByCustomerId(String customerId);
}
