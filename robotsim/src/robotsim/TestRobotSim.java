package robotsim;

import java.util.ArrayList;

import fr.tp.robotsim.model.Factory;
import fr.tp.robotsim.model.Robot;

public class TestRobotSim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot myRobot= new Robot("Robot 1", 5);
		Robot r2= new Robot("Robot 2", 10);
		Factory f= new Factory("monUsine",new ArrayList<Robot>());
		f.addRobot("r1"); f.addRobot("r3");
		f.printToConsole();
	}

}