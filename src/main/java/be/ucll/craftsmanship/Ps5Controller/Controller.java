package be.ucll.craftsmanship.Ps5Controller;

public class Controller{

  Command crossCommand;
  Command squareCommand;
  Command triangleCommand;
  Command circleCommand;

  public Controller(Command crossCommand, Command squareCommand, Command triangleCommand, Command circleCommand){
    setButtonTriangle(triangleCommand);  
    setButtonSquare(squareCommand);
    setButtonCircle(circleCommand);
    setButtonCross(crossCommand);
  }

  public void pressCross() { crossCommand.execute(); }
  public void pressSquare() { squareCommand.execute(); }
  public void pressTriangle() { triangleCommand.execute(); }
  public void pressCircle() { circleCommand.execute(); }

  public void setButtonCross(Command command) {
    System.out.println("Mapped Cross to " + command.toString());
    this.crossCommand = command;
  }

  public void setButtonCircle(Command command) {
    System.out.println("Mapped Circle to " + command.toString());
    this.circleCommand = command;
  }

  public void setButtonSquare(Command command) {
    System.out.println("Mapped Square to " + command.toString());
    this.squareCommand = command;
  }

  public void setButtonTriangle(Command command) {
    System.out.println("Mapped triangle to " + command.toString());
    this.triangleCommand = command;
  }
}
