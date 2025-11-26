package be.ucll.craftsmanship;

import be.ucll.craftsmanship.DataProcessingPipeline.*;
import be.ucll.craftsmanship.Ps5Controller.*;
import be.ucll.craftsmanship.cleanCode.*;

public class Main {

  public static void main(String[] args) {
    controllerEx();
    textProcessingEx();
  } 

  static void controllerEx(){
      Command jump = new JumpCommand();
      Command crouch = new CrouchCommand();
      Command swapWeapon = new SwapWeaponCommand();
      Command useWeapon = new UseWeaponCommand();

      Controller controller = new Controller(jump, useWeapon, swapWeapon, crouch);

      controller.pressCross();
      controller.pressCircle();

      controller.setButtonCross(crouch);
      controller.setButtonCircle(jump);

      controller.pressCross();
      controller.pressCircle();
  }

  static void textProcessingEx(){

    String baseDir = "src/main/java/be/ucll/craftsmanship/";

    System.out.println("=== CSV Processing ===");
    DataProcessor csvProcessor = new CSVProcessor(baseDir+"data/input.csv", baseDir+"data/output.csv");
    csvProcessor.process();

    System.out.println("\n=== JSON Processing ===");
    DataProcessor jsonProcessor = new JSONProcessor(baseDir+"data/input.json", baseDir+"data/output.json");
    jsonProcessor.process();
  }
}
