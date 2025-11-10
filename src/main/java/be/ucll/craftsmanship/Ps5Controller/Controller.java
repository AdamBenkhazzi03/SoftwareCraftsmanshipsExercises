package be.ucll.craftsmanship.Ps5Controller;

public class Controller{

  Command crossButtonCommand;
  Command squareButtonCommand;
  Command triangleButtonCommand;
  Command circleButtonCommand;

  public Controller(Command crossButtonCommand, Command squareButtonCommand, Command triangleButtonCommand, Command circleButtonCommand){
    setButtonTriangle(triangleButtonCommand);  
    setButtonSquare(squareButtonCommand);
    setButtonCircle(circleButtonCommand);
    setButtonCross(crossButtonCommand);
  }

  public void pressCross() { crossButtonCommand.execute(); }
  public void pressSquare() { squareButtonCommand.execute(); }
  public void pressTriangle() { triangleButtonCommand.execute(); }
  public void pressCircle() { circleButtonCommand.execute(); }

  public void setButtonCross(Command command) {
    System.out.println("Mapped Cross to " + command.toString());
    this.crossButtonCommand = command;
  }

  public void setButtonCircle(Command command) {
    System.out.println("Mapped Circle to " + command.toString());
    this.circleButtonCommand = command;
  }

  public void setButtonSquare(Command command) {
    System.out.println("Mapped Square to " + command.toString());
    this.squareButtonCommand = command;
  }

  public void setButtonTriangle(Command command) {
    System.out.println("Mapped triangle to " + command.toString());
    this.triangleButtonCommand = command;
  }
}
