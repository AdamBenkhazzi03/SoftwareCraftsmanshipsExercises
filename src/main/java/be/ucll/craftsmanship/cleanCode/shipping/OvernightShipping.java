package be.ucll.craftsmanship.cleanCode.shipping;

public class OvernightShipping implements ShippingStrategy {
    private static final double FLAT_RATE = 50.0;

    @Override
    public double calculateCost(String city) {
        return FLAT_RATE;
    }

    @Override
    public String getShippingType() {
        return "Overnight";
    }
}
