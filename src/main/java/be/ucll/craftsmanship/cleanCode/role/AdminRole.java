package be.ucll.craftsmanship.cleanCode.role;

public class AdminRole implements Role {
    @Override
    public String getRoleName() { 
        return "Admin"; 
    }

    @Override
    public boolean canPlaceOrder() { 
        return true; 
    }

    @Override
    public boolean canManageInventory() { 
        return true; 
    }

    @Override
    public boolean canViewReports() { 
        return true; 
    }
}
