package be.ucll.craftsmanship.cleanCode.service;

import java.util.List;

import be.ucll.craftsmanship.cleanCode.model.Customer;
import be.ucll.craftsmanship.cleanCode.model.Order;
import be.ucll.craftsmanship.cleanCode.model.OrderItem;
import be.ucll.craftsmanship.cleanCode.notification.NotificationService;
import be.ucll.craftsmanship.cleanCode.repository.OrderRepository;
import be.ucll.craftsmanship.cleanCode.shipping.ShippingStrategy;
import be.ucll.craftsmanship.cleanCode.validator.OrderValidator;

public class OrderService {
    private final OrderRepository orderRepository;
    private final OrderValidator orderValidator;
    private final NotificationService notificationService;
    private final PricingService pricingService;

    public OrderService(OrderRepository orderRepository,
                        OrderValidator orderValidator,
                        NotificationService notificationService,
                        PricingService pricingService) {
        this.orderRepository = orderRepository;
        this.orderValidator = orderValidator;
        this.notificationService = notificationService;
        this.pricingService = pricingService;
    }

    public Order createOrder(Customer customer, List<OrderItem> items,
                             ShippingStrategy shippingStrategy) {
        // Law of Demeter: customer provides city directly
        double shippingCost = shippingStrategy.calculateCost(customer.getCity());

        // Calculate total
        double total = pricingService.calculateOrderTotal(
                items, customer.getTier(), shippingCost
        );

        // Create order
        String orderId = generateOrderId();
        Order order = new Order(orderId, customer, items, total);

        // Validate
        orderValidator.validate(order);

        // Save
        orderRepository.save(order);

        // Notify
        notificationService.sendOrderConfirmation(order);

        return order;
    }

    private String generateOrderId() {
        return "ORD-" + System.currentTimeMillis();
    }
}
