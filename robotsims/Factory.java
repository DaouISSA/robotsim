package robotsims;

import java.util.ArrayList;

public class Factory {
	private String name; 
	private ArrayList<Robot> robots;
	
	public Factory(String name, ArrayList<Robot> robots ) {
		this.name=name;
		this.robots=robots;
	}
	
	private boolean checkRobotName (String name) {
		for (int i=0;i<robots.size();i++) {
			if (robots.get(i).getName()==name) {
				return false; 
				
			}	
		}
		return true; 
		
	}
	public boolean addRobot(String name) {
		if(this.checkRobotName(name)==true) {
			robots.add( name);
			
		}
	}
	
	

}
