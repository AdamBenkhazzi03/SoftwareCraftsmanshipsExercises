package be.ucll.craftsmanship.Ps5Controller;

public class CrouchCommand implements Command{
  
  @Override
  public void execute() {
    System.out.println("crouch");
  }

  @Override
  public String toString() {
      return "Crouch";
  }
}
