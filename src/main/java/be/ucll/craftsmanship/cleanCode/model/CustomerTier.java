package be.ucll.craftsmanship.cleanCode.model;

public enum CustomerTier {
    REGULAR(0.0),
    SILVER(0.10),
    GOLD(0.15);

    private final double discountRate;

    CustomerTier(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }
}
