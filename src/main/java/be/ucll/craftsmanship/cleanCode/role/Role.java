package be.ucll.craftsmanship.cleanCode.role;

public interface Role {
    String getRoleName();
    boolean canPlaceOrder();
    boolean canManageInventory();
    boolean canViewReports();
}
