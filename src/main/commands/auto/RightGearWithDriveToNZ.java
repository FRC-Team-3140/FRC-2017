package main.commands.auto;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import main.Constants;
import main.commands.drivetrain.DriveDistance;
import main.commands.drivetrain.TimedDrive;
import main.commands.drivetrain.TimedTurnToAngleBangBang;
import main.commands.drivetrain.TurnToAngle;
import main.commands.gearmech.GearDown;
import main.commands.gearmech.GearUp;

public class RightGearWithDriveToNZ extends CommandGroup implements Constants {
	public RightGearWithDriveToNZ() {
		addSequential(new GearUp());
		addSequential(new DriveDistance(-5.38));
		addSequential(new WaitCommand(0.5));
		addSequential(new TurnToAngle(-57));
		addSequential(new WaitCommand(0.5));
		addSequential(new TimedDrive(-0.75, 1.4));
		addSequential(new TimedDrive(-0.35, 0.5));
		addSequential(new WaitCommand(0.35));
		addSequential(new GearDown());
		addSequential(new WaitCommand(0.5));
		addSequential(new TimedDrive(0.75, 1));
		addSequential(new GearUp());
		addSequential(new TimedTurnToAngleBangBang(57, kToleranceDegreesDefault, 2));
		addSequential(new TimedDrive(-0.75, 2.2));
		addSequential(new TimedTurnToAngleBangBang(-45, kToleranceDegreesDefault, 1.1));
		addSequential(new TimedDrive(-0.75, 3.0));
		addSequential(new TimedTurnToAngleBangBang(48, kToleranceDegreesDefault, 1.1));
		

		//addSequential(new TimedDrive(0.0, kMinVoltageTurnBigAngle/10, 0.5));
		//addSequential(new TimedDrive(-0.75, 2.0));
	}

}
