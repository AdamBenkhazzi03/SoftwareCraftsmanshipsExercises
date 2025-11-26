package be.ucll.craftsmanship.cleanCode.role;

public class CustomerRole implements Role {
    @Override
    public String getRoleName() {
        return "Customer";
    }

    @Override
    public boolean canPlaceOrder() {
        return true;
    }

    @Override
    public boolean canManageInventory() {
        return false;
    }

    @Override
    public boolean canViewReports() {
        return false;
    }
}
