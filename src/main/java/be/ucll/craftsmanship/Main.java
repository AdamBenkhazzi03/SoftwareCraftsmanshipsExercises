package be.ucll.craftsmanship;

import java.io.File;

import be.ucll.craftsmanship.DataProcessingPipeline.CSVProcessor;
import be.ucll.craftsmanship.DataProcessingPipeline.DataProcessor;
import be.ucll.craftsmanship.DataProcessingPipeline.JSONProcessor;
import be.ucll.craftsmanship.Ps5Controller.Command;
import be.ucll.craftsmanship.Ps5Controller.Controller;
import be.ucll.craftsmanship.Ps5Controller.CrouchCommand;
import be.ucll.craftsmanship.Ps5Controller.JumpCommand;
import be.ucll.craftsmanship.Ps5Controller.SwapWeaponCommand;
import be.ucll.craftsmanship.Ps5Controller.UseWeaponCommand;

public class Main {

  public static void main(String[] args) {
    exercise1();
    exercise2();
  } 

  static void exercise1(){
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

  static void exercise2(){

    String baseDir = "src/main/java/be/ucll/craftsmanship/";

    System.out.println("=== CSV Processing ===");
    DataProcessor csvProcessor = new CSVProcessor(baseDir+"data/input.csv", baseDir+"data/output.csv");
    csvProcessor.process();

    System.out.println("\n=== JSON Processing ===");
    DataProcessor jsonProcessor = new JSONProcessor(baseDir+"data/input.json", baseDir+"data/output.json");
    jsonProcessor.process();
  }
}
