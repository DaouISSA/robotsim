package robotsim;

import java.util.*;
public class Factory {
	
	private String name;
	private ArrayList<Robot> robots;
	
	public Factory(String name, ArrayList<Robot> robots) {
		this.name=name;
		this.robots=robots; 	
	}
	
	@Override
	public String toString() {
		return "Factory [name=" + name + ", robots=" + robots + "]";
	}

	public boolean checkRobotName(String name) {
		if(this.robots==null) {
			return true;
		}
		for(int i=0;i<this.robots.size();i++) {
			if (this.robots.get(i).getName()==name){
				return false;}
		}
		return true;
	}
	
	public boolean addRobot(String name) {
		if ((checkRobotName(name)==true)){
			Robot r = new Robot(name,0.0);
			if (this.robots==null) {
				
				this.robots= new ArrayList<>();
				this.robots.add(r);
			}
			else{this.robots.add(r);}
			return true;
		} else {return false;} 
		
	}
	
	
	
	}
	
	
	


