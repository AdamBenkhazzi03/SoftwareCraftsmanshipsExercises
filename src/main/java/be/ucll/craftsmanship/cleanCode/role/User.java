package be.ucll.craftsmanship.cleanCode.role;

public class User {
    private final String id;
    private final String name;
    private final String email;
    private final Role role;

    public User(String id, String name, String email, Role role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public Role getRole() { return role; }

    public boolean hasPermission(String permission) {
        return switch (permission) {
            case "place_order" -> role.canPlaceOrder();
            case "manage_inventory" -> role.canManageInventory();
            case "view_reports" -> role.canViewReports();
            default -> false;
        };
    }
}
