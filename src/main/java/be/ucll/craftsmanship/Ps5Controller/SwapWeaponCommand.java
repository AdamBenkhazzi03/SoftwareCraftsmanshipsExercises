package be.ucll.craftsmanship.Ps5Controller;

public class SwapWeaponCommand implements Command{
  
  @Override
  public void execute() {
    System.out.println("Swap Weapon");
  }

  @Override
  public String toString() {
      return "Swap Weapon";
  }
}
