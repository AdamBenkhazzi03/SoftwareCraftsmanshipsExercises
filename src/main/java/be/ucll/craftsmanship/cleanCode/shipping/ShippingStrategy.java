package be.ucll.craftsmanship.cleanCode.shipping;

public interface ShippingStrategy {
    double calculateCost(String city);
    String getShippingType();
}
