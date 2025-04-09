package fr.tp.robotsim.model;


import java.util.ArrayList;
import java.util.Collection;

import fr.tp.inf112.projects.canvas.model.Figure;

public class Factory extends Component implements fr.tp.inf112.projects.canvas.model.Canvas {
 
	private ArrayList<Component> components;
	
	
	public Factory( Vertex vertex, Shape shape,String id, String name, Style style ) {
		super(name,shape,id,vertex,style);
		components= new ArrayList<>();
	}
	
	public boolean checkComponentName(String name) {
		for(Component component: components ) {
			if(component.getName()==name) {
				return true;
			}
		}
		return false;
		
	}
	public boolean addComponent(String name) {
		if(this.checkComponentName(name)==false) {
			components.add(new Component(name, new Shape(),"0", new Vertex(0,0), new Style(new Color(0,0,0), new Stroke(new Color(0,0,0),0,new float[3])) ) );
			return true;	
		}
		return false;
		
	}
	
	public String getId() {
		return super.getId();	
	}
	
	public int getHeight() {
		Shape s= (Shape) this.getShape();
		if(s instanceof RectangleShape) {
			return ((RectangleShape) s).getHeight();
			
		}
		else {
			return 0;
		}
		
		
	}
	public int getWidth() {
		
		Shape s= (Shape) this.getShape();
		if(s instanceof RectangleShape) {
			return ((RectangleShape) s).getHeight();
			
		}
		else {
			return 0;
		}
	}
	
	public String getName() {
		return this.getName();
	}
	public Style getStyle() {
		return this.getStyle();
	}
	public void setId(String id) {
		this.setId(id);
		}
	
	public Collection<Figure> getFigures() {
		return (Collection) components;
	}
	
	
	
	
	public void toConsole() {
		for(Component mycomponent : components) {
			System.out.println(mycomponent.getName());
		}
	}
	
	
	

}