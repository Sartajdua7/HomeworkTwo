package homework2;

/**
 *
 */

	public class MoveForwardHomework extends Command {
		private double startingTime;
		private double speed;
		private double time;
		public MoveForwardHomework(double speed, double time) {
			this.speed = speed;
			this.time = time;
		}

	    // Called just before this Command runs the first time
	    protected void initialize() {
	    		startingTime = System.currentTimeMillis();
	    		double leftSpeed = speed;
	    		double rightSpeed = speed;
	    		if(RobotMap.gyro.getAngle() > 0) {
	    			rightSpeed += 0.05;
	    			leftSpeed -= 0.05;
	    		}
	    		else if(RobotMap.gyro.getAngle() < 0) {
	    			leftSpeed += 0.05;
	    			rightSpeed -= 0.05;
	    		}
	    		Robot.drivetrain.setLeft(leftSpeed);
	    		Robot.drivetrain.setRight(rightSpeed);
	    }

	    // Called repeatedly when this Command is scheduled to run
	    protected void execute() {
	    }

	    // Make this return true when this Command no longer needs to run execute()
	    protected boolean isFinished() {
	    		return System.currentTimeMillis() - startingTime >= time;
	    }

	    // Called once after isFinished returns true
	    protected void end() {
	    	Robot.drivetrain.setLeft(0);
	    	Robot.drivetrain.setRight(0);
	    }

	    // Called when another command which requires one or more of the same
	    // subsystems is scheduled to run
	    protected void interrupted() {
	    }
}

}
