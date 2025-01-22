package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveTrain;

/** */
public class DecrementDriveScaling extends InstantCommand {

  private final DriveTrain m_driveTrain;

  public DecrementDriveScaling(RobotContainer container) {
    m_driveTrain = container.m_driveTrain;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_driveTrain.setDriveScaling(Math.max(m_driveTrain.getDriveScaling() - 0.1, 0.1));
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}
}
