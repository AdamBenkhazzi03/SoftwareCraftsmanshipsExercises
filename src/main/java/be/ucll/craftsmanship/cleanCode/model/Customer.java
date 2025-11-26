package be.ucll.craftsmanship.cleanCode.model;

public class Customer {
    private final String id;
    private final String name;
    private final String email;
    private final Address address;
    private final CustomerTier tier;

    public Customer(String id, String name, String email, Address address,
                    CustomerTier tier) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.tier = tier;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public CustomerTier getTier() { return tier; }

    // Law of Demeter: Provide what's needed, hide structure
    public String getCity() {
        return address.getCity();
    }

    public String getShippingAddress() {
        return address.getFullAddress();
    }
}
