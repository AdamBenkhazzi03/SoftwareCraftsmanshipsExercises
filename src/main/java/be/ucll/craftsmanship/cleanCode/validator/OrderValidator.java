package be.ucll.craftsmanship.cleanCode.validator;

import be.ucll.craftsmanship.cleanCode.model.Order;

public class OrderValidator {
    public void validate(Order order) {
        if (order.getItems().isEmpty()) {
            throw new IllegalArgumentException("Order must contain at least one item");
        }
        if (order.getTotal() < 0) {
            throw new IllegalArgumentException("Order total cannot be negative");
        }
    }
}
