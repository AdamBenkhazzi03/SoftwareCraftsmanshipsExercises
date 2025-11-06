package be.ucll.craftsmanship;

import be.ucll.craftsmanship.Ps5Controller.Command;
import be.ucll.craftsmanship.Ps5Controller.Controller;
import be.ucll.craftsmanship.Ps5Controller.CrouchCommand;
import be.ucll.craftsmanship.Ps5Controller.JumpCommand;
import be.ucll.craftsmanship.Ps5Controller.SwapWeaponCommand;
import be.ucll.craftsmanship.Ps5Controller.UseWeaponCommand;

public class Main {

  public static void main(String[] args) {

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
}
