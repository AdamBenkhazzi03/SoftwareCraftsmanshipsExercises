package be.ucll.craftsmanship.Ps5Controller;

public class UseWeaponCommand implements Command{
  
  @Override
  public void execute() {
    System.out.println("Use Weapon");
  }

  @Override
  public String toString() {
      return "Use Weapon";
  }
}
