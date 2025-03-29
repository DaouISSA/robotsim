package fr.tp.robotsim.model;

import java.util.ArrayList;

public class Room extends Component {
	
	private ArrayList<Component> components;
	
	public Room (ArrayList<Component> components,Point position, double length,double width,String name,int id) {
		super(position, length,width,name, id);
		this.components= components;
	}
	
	public boolean checkComponentId(Component compo) {
		for(Component component: components ) {
			if(component.getId()==compo.getId()) {
				return true;
			}
		}
		return false;
		
	}
	public boolean addComponent(Component compo) {
		if(this.checkComponentId(compo)==false) {
			components.add(compo);
			return true;	
		}
		return false;
		
	}
	
	public boolean removeComponent(Component compo) {
		if(this.checkComponentId(compo)) {
			components.remove(components.indexOf(compo));
			return true;
		}
		return false;
			
	}
	
	public void toConsole() {
		for(Component mycomponent : components) {
			System.out.println(mycomponent.getName());
		}
	}
	
	
	

}
