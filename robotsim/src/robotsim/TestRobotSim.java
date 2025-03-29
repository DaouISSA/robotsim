package robotsim;

import java.util.ArrayList;

import fr.tp.robotsim.model.*; 


public class TestRobotSim {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		/*
		Robot myRobot= new Robot("Robot 1", 5);
		Robot r2= new Robot("Robot 2", 10);
		Factory f= new Factory("monUsine",new ArrayList<Robot>());
		f.addRobot("r1"); f.addRobot("r3");
		f.printToConsole();
		*/
		ArrayList<Component> compo= new ArrayList<>();
		
		Room r = new Room(compo,new Point(5,5),40,40,"room1",1);
		Door d= new Door(true,new Point(2,2),30,30,"porte1",2);
		r.addComponent(d);
		Engine e = new Engine(new Point(3,3),10,10,"machine1",3);
		Factory f= new Factory(compo,new Point(5,5),40,40,"usine1",6);
		f.addComponent(e);
		r.addComponent(e);
		r.removeComponent(e);
		r.toConsole();
		
	}

}