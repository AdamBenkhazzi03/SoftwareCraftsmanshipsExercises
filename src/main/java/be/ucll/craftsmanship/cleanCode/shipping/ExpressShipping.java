package be.ucll.craftsmanship.cleanCode.shipping;

public class ExpressShipping implements ShippingStrategy{
    private static final double BASE_RATE = 25.0;
    private static final double DISTANCE_RATE = 5.0;

    @Override
    public double calculateCost(String city) {
        return switch (city.toLowerCase()) {
            case "new york" -> BASE_RATE;
            case "los angeles" -> BASE_RATE + DISTANCE_RATE;
            default -> BASE_RATE + (DISTANCE_RATE * 2);
        };
    }

    @Override
    public String getShippingType() {
        return "Express";
    }
}
