// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.RobotMap;

public class BallDelivery extends SubsystemBase {
  /** Creates a new BallDelivery. This Creates the Variables*/
private Victor leftMotor = new Victor(RobotMap.LEFT_MOTOR);
// to import RobotMap hit control period 

private Victor rightMotor = new Victor(RobotMap.RIGHT_MOTOR);
// Motors are used to bring in game piece and deposit game piece.
//private DoubleSolenoidToggler Pistons =(RobotMap.pistons);
//public void power(double speed) {
  
 /* if(speed >1) speed = 1;
  if (speed <-1) speed=-1;
  
  if (Math.abs(speed) > 0.1){
  leftMotor.set (speed);
  rightMotor.set(-speed); */

//}
//else{
 // stop(); 


public void stop(){
  leftMotor.set(0);
  rightMotor.set(0); 
}

public double getSpeed(){
  return leftMotor.get();
}


 // public BallDelivery() {}

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public CommandBase exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
