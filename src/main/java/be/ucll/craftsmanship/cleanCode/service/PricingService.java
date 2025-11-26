package be.ucll.craftsmanship.cleanCode.service;

import java.util.List;

import be.ucll.craftsmanship.cleanCode.model.CustomerTier;
import be.ucll.craftsmanship.cleanCode.model.OrderItem;

public class PricingService{
    public double calculateDiscount(double subtotal, CustomerTier tier) {
        return subtotal * tier.getDiscountRate();
    }

    public double calculateOrderTotal(List<OrderItem> items, CustomerTier tier,
                                      double shippingCost) {
        double subtotal = items.stream()
                .mapToDouble(OrderItem::getSubtotal)
                .sum();

        double discount = calculateDiscount(subtotal, tier);

        return subtotal - discount + shippingCost;
    }
}
