package fr.tp.robotsim.model;


import java.util.ArrayList;

public class Factory {
	private String name; 
	private ArrayList<Robot> robots;
	
	public Factory(String name, ArrayList<Robot> robots ) {
		this.name=name;
		this.robots=robots;
	}
	
	private boolean checkRobotName (String name) {
		for (Robot myRobot: robots) {
			if (myRobot.getName().equals(name)) {
				return false; 	
			}	
		}
		return true; 
		
	}
	public boolean addRobot(String name) {
		if(this.checkRobotName(name)==true) {
			Robot r= new Robot(name,0.0);
			robots.add(r);
			return true;
		}else {return false;}
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Robot> getRobots() {
		return robots;
	}

	public void setRobots(ArrayList<Robot> robots) {
		this.robots = robots;
	}

	public void printToConsole() {
		System.out.println(name);
		for(Robot r : robots) {
			System.out.println(r.getName());
		}
	}

	
	

}