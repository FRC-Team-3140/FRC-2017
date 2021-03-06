package main.commands.drivetrain;

import edu.wpi.first.wpilibj.command.Command;
import main.Constants;
import main.Robot;

public class TurnToAngleBangBang extends Command implements Constants {
	private boolean done = false;
	private double heading, tolerance;
	
	public TurnToAngleBangBang(double heading, double tolerance) {
		Robot.dt.resetGyro();
		this.heading = heading;
		this.tolerance = tolerance;
	}


    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.dt.resetGyro();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.dt.setPIDCanRun(true);
    	done = Robot.dt.turnToAngleBangBang(heading, tolerance);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
       	return done;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.dt.setPIDCanRun(false);
    	Robot.dt.resetGyro();
    	done = false;
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}