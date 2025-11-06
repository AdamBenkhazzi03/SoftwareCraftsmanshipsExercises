package be.ucll.craftsmanship.Ps5Controller;

public class JumpCommand implements Command{
  
  @Override
  public void execute() {
    System.out.println("Jump");
  }

  @Override
  public String toString() {
      return "Jump";
  }
}
